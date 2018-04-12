package cn.summerwaves;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TheLastSingletonTest {

    @Test
    public void getInstance() {
        TheLastSingleton theLastSingleton1 = TheLastSingleton.getInstance();
        TheLastSingleton theLastSingleton2 = TheLastSingleton.getInstance();
        //断言相等
        Assert.assertEquals(theLastSingleton1, theLastSingleton2);
    }
}