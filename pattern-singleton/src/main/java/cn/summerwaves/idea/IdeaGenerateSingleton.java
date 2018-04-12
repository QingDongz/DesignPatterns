package cn.summerwaves.idea;

/**
 * @author zqd
 */
public class IdeaGenerateSingleton {
    private static IdeaGenerateSingleton ourInstance = new IdeaGenerateSingleton();

    public static IdeaGenerateSingleton getInstance() {
        return ourInstance;
    }

    private IdeaGenerateSingleton() {
    }
}
