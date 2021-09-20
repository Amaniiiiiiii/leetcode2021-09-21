package differentSort;

public class SingleInner {

    //静态内部类实现单例模式
    private static class SingletonClassInstance{
        private static final SingleInner instance = new SingleInner();
    }

    private SingleInner(){

    }

    public static SingleInner getInstance(){
        return SingletonClassInstance.instance;
    }
}
