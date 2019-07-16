package module.three;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

public class Module3Class {

    @Test
    @TFMetadata(key = "m3meta1")
    public void module3Method1(){
        int a = 5;
        Assertions.assertTrue(a > 2, "a is not > 2, module 3 method 1");
    }

    @Test
    @TFMetadata(key = "m3meta2", value = "junit5")
    public void module3Method2(){
        int a = 2;
        Assertions.assertTrue((a - 2) == 0, "a - 2 != 0, module 3 method 2");
    }
}
