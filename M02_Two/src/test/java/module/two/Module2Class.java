package module.two;

import org.junit.Assert;
import org.junit.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

public class Module2Class {

    @Test
    @TFMetadata(key = "m2meta1multiline", value = {"one", "two", "three"})
    public void module2Method1(){

        String strToAnalyze = "brlbrl";
        Assert.assertTrue("Le char en index 2 n'est pas égal à l, module 2 method 1", Character.toString(strToAnalyze.charAt(2)).equals("l"));
    }

    @Test
    @TFMetadata(key = "m2meta2")
    public void module2Method2(){
        int a = 2;
        int b = 3;
        Assert.assertTrue("b - a != 1, module 2 method 2", (b - a) == 1);
    }
}
