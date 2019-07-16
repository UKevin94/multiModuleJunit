package module.one;

import org.junit.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

import static org.junit.Assert.assertTrue;

public class Module1Class {

    @Test
    @TFMetadata( key = "m1_meta1", value = "m1_value1")
    public void module1Method1(){
        int a = 5;
        int b = 2;
        assertTrue("a + b < 7, module 1 method 1", a + b > 6);
    }

    @Test
    @TFMetadata( key = "m1_meta2")
    public void module1Method2(){
        String sample = "blabla";
        assertTrue("The sample is not long enough, module 1 method 2", sample.length() > 5);
    }
}
