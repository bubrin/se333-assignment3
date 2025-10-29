package org.example.Pattern;

import org.example.Util.ModelUtil;
import spoon.reflect.CtModel;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NullPointerException extends AbstractPattern {
    String logMessage = "NullPointer Exception";
    CtModel model;

    public NullPointerException(ModelUtil model) {
        this.model = model.getModel();
    }

    @Override
    public void process() {
        // Look at all methods
        List<CtMethod<?>> methods = model.getElements(new TypeFilter<>(CtMethod.class));

        for (CtMethod<?> method : methods) {
            Set<String> nullVars = new HashSet<>();

            // Find local variables explicitly assigned null
            for (CtLocalVariable<?> local : method.getElements(new TypeFilter<>(CtLocalVariable.class))) {
                if (local.getDefaultExpression() != null && local.getDefaultExpression().toString().equals("null")) {
                    nullVars.add(local.getSimpleName());
                }
            }

            // Look for invocations or field access on these null variables
            for (CtInvocation<?> inv : method.getElements(new TypeFilter<>(CtInvocation.class))) {
                if (inv.getTarget() != null && nullVars.contains(inv.getTarget().toString())) {
                    elements.add(new elementSchema(
                            logMessage,
                            method.getPosition().getFile().getName(),
                            inv.getPosition().getLine(),
                            inv.getPosition().getEndLine(),
                            inv.toString()
                    ));
                }
            }

            for (CtFieldAccess<?> fa : method.getElements(new TypeFilter<>(CtFieldAccess.class))) {
                if (fa.getTarget() != null && nullVars.contains(fa.getTarget().toString())) {
                    elements.add(new elementSchema(
                            logMessage,
                            method.getPosition().getFile().getName(),
                            fa.getPosition().getLine(),
                            fa.getPosition().getEndLine(),
                            fa.toString()
                    ));
                }
            }
        }
    }
}
