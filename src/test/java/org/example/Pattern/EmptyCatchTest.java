package org.example.Pattern;
import org.example.Util.ModelUtil;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import spoon.reflect.declaration.CtElement;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.as;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class EmptyCatchTest {

    @Test
   // @Disabled
    @DisplayName("Empty Catch")
    public void emptyCatchTest(){

       // Define the path to the Java file to be analyzed
        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "java","org","example","Resource",
                "BuggyFile.java");
        // Initialize the ModelUtil instance with the specified Java file
        ModelUtil model = new ModelUtil(path);

        // Create a custom static analysis rule (EmptyCatch in this case)
        final EmptyCatch rule = new EmptyCatch(model);
        // Apply the rule to the parsed Java file
        rule.process();
        //
        List<AbstractPattern.elementSchema> res = rule.getDetection();

        //TODO - write your test here.
        assertThat(res).isNotEmpty();

    }
}