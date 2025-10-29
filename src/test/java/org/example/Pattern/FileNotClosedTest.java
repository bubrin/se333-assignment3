package org.example.Pattern;

import org.example.Util.ModelUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FileNotClosedTest {
    @Test
    @DisplayName("File Not Closed")
    void fileNotClosedTest(){
        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "java","org","example","Resource",
                "BuggyFile.java");
        ModelUtil model = new ModelUtil(path);
        final FileNotClosed rule = new FileNotClosed(model);
        rule.process();
        List<AbstractPattern.elementSchema> res = rule.getDetection();
        assertThat(res).isNotEmpty().allMatch(f -> f.message.equals("File Not Closed"));
    }

}