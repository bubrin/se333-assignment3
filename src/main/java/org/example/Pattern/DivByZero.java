package org.example.Pattern;
import org.example.Util.ModelUtil;
import spoon.reflect.CtModel;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.reflect.code.CtBinaryOperator;

import java.util.HashSet;
import java.util.Set;

public class DivByZero extends AbstractPattern {
    String logMessage = "Division by Zero";
    CtModel model;

    public DivByZero(ModelUtil model) {
        this.model = model.getModel();
    }

    @Override
    public void process() {
        // Step 1: Collect variables assigned to 0
        Set<String> zeroVars = new HashSet<>();

        // Local variable declarations with initializer = 0
        for (CtLocalVariable<?> localVar : model.getElements(new TypeFilter<>(CtLocalVariable.class))) {
            if (localVar.getDefaultExpression() != null &&
                    localVar.getDefaultExpression().toString().equals("0")) {
                zeroVars.add(localVar.getSimpleName());
            }
        }

        // Assignments of 0 to existing variables
        for (CtAssignment<?, ?> assign : model.getElements(new TypeFilter<>(CtAssignment.class))) {
            if (assign.getAssignment().toString().equals("0")) {
                zeroVars.add(assign.getAssigned().toString());
            }
        }

        // Step 2: Check all division operations
        for (CtBinaryOperator<?> bin : model.getElements(new TypeFilter<>(CtBinaryOperator.class))) {
            if (bin.getKind() == BinaryOperatorKind.DIV) {
                String rhs = bin.getRightHandOperand().toString();
                if (rhs.equals("0") || zeroVars.contains(rhs)) {
                    elements.add(new elementSchema(
                            logMessage,
                            bin.getPosition().getFile().getName(),
                            bin.getPosition().getLine(),
                            bin.getPosition().getEndLine(),
                            bin.toString()
                    ));
                }

            }
        }
    }
}

