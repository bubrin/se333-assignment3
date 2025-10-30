package org.example.Pattern;

import org.example.Util.ModelUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;


class DivByZeroTest {
    @Test
    @DisplayName("Division by Zero")
    void divByZeroTest(){
        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "java","org","example","Resource",
                "BuggyFile.java");
        ModelUtil model = new ModelUtil(path);
        final DivByZero rule = new DivByZero(model);
        rule.process();
        List<AbstractPattern.elementSchema> res = rule.getDetection();
        assertThat(res).isNotEmpty().allMatch(e -> e.message.equals("Division by Zero"));
    }

    @Test
    @DisplayName("Not Division by Zero")
    void notDivByZeroTest(){
        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "java","org","example","Resource",
                "BuggyFile.java");
        ModelUtil model = new ModelUtil(path);
        final DivByZero rule = new DivByZero(model);
        rule.process();
        List<AbstractPattern.elementSchema> res = rule.getDetection();
        assertThat(res).isEmpty();
    }
}