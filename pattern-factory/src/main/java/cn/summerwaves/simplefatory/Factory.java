package cn.summerwaves.simplefatory;

/**
 * 简单工厂
 */
public class Factory {
    public static Api createApi(String type) {
        Api api = null;
        //生成相应实例
        if ("A".equals(type)) {
            api = new ImplA();
        } else if ("B".equals(type)) {
            api = new ImplB();
        }
        return api;

    }
}
