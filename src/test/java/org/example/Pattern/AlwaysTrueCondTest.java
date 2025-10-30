package org.example.Pattern;

import org.example.Util.ModelUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AlwaysTrueCondTest {
    @Test
    @DisplayName("Always True Condition")
    public void alwaysTrueTest(){

        Path path = Paths.get(System.getProperty("user.dir"), "src", "main", "java","org","example","Resource",
                "BuggyFile.java");
        ModelUtil model = new ModelUtil(path);
        final AlwaysTrueCond rule = new AlwaysTrueCond(model);
        rule.process();
        List<AbstractPattern.elementSchema> res = rule.getDetection();
        assertThat(res).isNotEmpty().allMatch(a -> a.message.equals("Always True Condition"));
    }
    @Test
    @DisplayName("No Always True Condition (True Negative)")
    public void noAlwaysTrueTest() {
        Path path = Paths.get(System.getProperty("user.dir"), "src", "test", "resources", "CleanFile.java");
        ModelUtil model = new ModelUtil(path);
        final AlwaysTrueCond rule = new AlwaysTrueCond(model);
        rule.process();
        List<AbstractPattern.elementSchema> res = rule.getDetection();
        assertThat(res).isEmpty(); // should find nothing
    }


}