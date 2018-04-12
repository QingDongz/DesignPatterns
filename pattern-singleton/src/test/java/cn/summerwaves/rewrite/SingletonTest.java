package cn.summerwaves.rewrite;

import org.junit.Assert;
import org.junit.Test;
import cn.summerwaves.rewrite.Singleton;

import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void getInstance() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Assert.assertEquals(singleton1, singleton2);
    }
}