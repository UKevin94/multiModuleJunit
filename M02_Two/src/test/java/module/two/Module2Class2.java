package module.two;

import org.junit.Assert;
import org.junit.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

public class Module2Class2 {

    @Test
    @TFMetadata(key = "otherClass", value = "otherClassValue")
    public void module2Other(){
        String input = "user";
        Assert.assertTrue("User input is different from expected, module 2 other class", input.equals("user"));
    }
}
