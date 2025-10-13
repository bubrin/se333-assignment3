package org.example.Pattern;

// Importing necessary classes from the Spoon library and other utility classes.
import org.example.Util.ModelUtil;
import spoon.reflect.CtModel;

import java.util.List;

/**
 * A custom static analysis rule that checks for empty method clauses in Java source code.
 * It extends Spoon's AbstractPattern to process CtMethod elements in the Abstract Syntax Tree (AST).
 */
public class EmptyMethod extends AbstractPattern {

    // Log message that will be used for the empty method blocks.
    String logMessage = "Empty Method Block";

    // The CtModel object that contains the entire abstract syntax tree of the parsed Java code.
    CtModel model;

    // Constructor that takes a ModelUtil object and initializes the CtModel field.
    public EmptyMethod(ModelUtil model){
        this.model = model.getModel(); // Retrieves the CtModel from the ModelUtil.
    }

    /**
     * Processes the CtModel to find empty method blocks and add them to the 'elements' list.
     */
    @Override
    public void process() {
        // Get all the method blocks (CtMethod) in the CtModel.
        // You need to write your relevant code here. Moreover, for each pattern, you need to create a new file.
        //TODO
    }
}
