package cn.summerwaves;

public class TheLastSingleton {
    private volatile static TheLastSingleton theLastSingleton;

    private TheLastSingleton() {
    }

    public static TheLastSingleton getInstance() {
        if (null == theLastSingleton) {
            synchronized (TheLastSingleton.class) {
                if (null == theLastSingleton) {
                    theLastSingleton = new TheLastSingleton();
                }
            }
        }
        return theLastSingleton;
    }
}
