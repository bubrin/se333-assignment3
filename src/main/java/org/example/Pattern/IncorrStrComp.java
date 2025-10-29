package org.example.Pattern;

import org.example.Util.ModelUtil;
import spoon.reflect.CtModel;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.BinaryOperatorKind;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtExpression;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.List;

public class IncorrStrComp extends AbstractPattern {
    String logMessage = "Incorrect String Comparison";
    CtModel model;

    public IncorrStrComp(ModelUtil model){
        this.model = model.getModel();
    }

    @Override
    public void process() {
        // Get all binary operators
        List<CtBinaryOperator<?>> binaries = model.getElements(new TypeFilter<>(CtBinaryOperator.class));

        for (CtBinaryOperator<?> binOp : binaries) {
            BinaryOperatorKind kind = binOp.getKind();

            // Check for equality or inequality operator
            if (kind == BinaryOperatorKind.EQ || kind == BinaryOperatorKind.NE) {
                CtExpression<?> left = binOp.getLeftHandOperand();
                CtExpression<?> right = binOp.getRightHandOperand();

                // Detect if either side is of type String
                String leftType = left.getType() != null ? left.getType().getSimpleName() : "";
                String rightType = right.getType() != null ? right.getType().getSimpleName() : "";

                if (leftType.equals("String") && rightType.equals("String")) {
                    elements.add(new elementSchema(
                            logMessage,
                            binOp.getPosition().getFile().getName(),
                            binOp.getPosition().getLine(),
                            binOp.getPosition().getEndLine(),
                            binOp.toString()
                    ));
                }
            }
        }
    }
}
