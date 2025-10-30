package org.example.Pattern;

import org.example.Util.ModelUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
class EmptyMethodTest {

    @Test
    @DisplayName("Empty Method")
    void emptyMethodTest() {
        // Define the path to the Java file to be analyzed
        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "java","org","example","Resource",
                "BuggyFile.java");
        // Initialize the ModelUtil instance with the specified Java file
        ModelUtil model = new ModelUtil(path);

        // Create a custom static analysis rule (EmptyCatch in this case)
        final EmptyMethod rule = new EmptyMethod(model);
        // Apply the rule to the parsed Java file
        rule.process();
        //
        List<AbstractPattern.elementSchema> res = rule.getDetection();

        //TODO - write your test here.
        assertThat(res).isNotEmpty();
    }
    @Test
    @DisplayName("No Empty Method (True Negative)")
    void noEmptyMethodTest() {
        // Path to the clean test file
        Path path = Paths.get(System.getProperty("user.dir"), "src", "test", "resources", "CleanFile.java");
        ModelUtil model = new ModelUtil(path);

        final EmptyMethod rule = new EmptyMethod(model);
        rule.process();
        List<AbstractPattern.elementSchema> res = rule.getDetection();

        // Expect NO detections for this clean file
        assertThat(res).isEmpty();
    }

}