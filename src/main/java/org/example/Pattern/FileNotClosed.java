package org.example.Pattern;
import org.example.Util.ModelUtil;
import spoon.reflect.CtModel;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.List;


public class FileNotClosed extends AbstractPattern{
    String logMessage = "File Not Closed";
    CtModel model;
    public FileNotClosed(ModelUtil model){this.model = model.getModel();}

    @Override
    public void process() {
        List<CtTry> tries = model.getElements(new TypeFilter<>(CtTry.class));

        for (CtTry t : tries) {
            // Check the try block
            scanBlockForFiles(t.getBody());

            // Check each catch block
            for (CtCatch c : t.getCatchers()) {
                scanBlockForFiles(c.getBody());
            }
        }
    }

    // Helper method to scan a block for file usage and missing close()
    private void scanBlockForFiles(CtBlock<?> block) {
        if (block.getStatements().isEmpty()) return;

        boolean fileUsed = false;
        boolean closed = false;

        for (CtStatement stmt : block.getStatements()) {
            if (stmt instanceof CtLocalVariable<?> localVar) {
                if (localVar.getType().getSimpleName().matches("File|FileReader|BufferedReader")) {
                    fileUsed = true;
                }
            }
            if (stmt instanceof CtInvocation<?> inv) {
                if (inv.getExecutable().getSimpleName().equals("close")) {
                    closed = true;
                }
            }
        }

        if (fileUsed && !closed) {
            elements.add(new elementSchema(
                    logMessage,
                    block.getPosition().getFile().getName(),
                    block.getPosition().getLine(),
                    block.getPosition().getEndLine(),
                    block.toString()
            ));
        }
    }

}

