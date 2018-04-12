package cn.summerwaves;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void getInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        //断言相等
        Assert.assertEquals(singleton1,singleton2);
    }
}