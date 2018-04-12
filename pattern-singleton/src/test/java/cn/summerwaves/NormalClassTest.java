package cn.summerwaves;

import cn.summerwaves.idea.NormalClass;
import org.junit.Assert;
import org.junit.Test;

public class NormalClassTest {

    @Test
    public void fuck() {
        NormalClass normalClass1 = new NormalClass();
        NormalClass normalClass2 = new NormalClass();
        //断言不相等
        Assert.assertNotEquals(normalClass1, normalClass2);
    }
}