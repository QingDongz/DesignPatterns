package cn.summerwaves;

import cn.summerwaves.idea.IdeaGenerateSingleton;
import org.junit.Assert;
import org.junit.Test;

public class IdeaGenerateSingletonTest {

    @Test
    public void getInstance() {
        IdeaGenerateSingleton ideaGenerateSingleton1 = IdeaGenerateSingleton.getInstance();
        IdeaGenerateSingleton ideaGenerateSingleton2 = IdeaGenerateSingleton.getInstance();
        //断言相等
        Assert.assertEquals(ideaGenerateSingleton1,ideaGenerateSingleton2);
    }
}