package differentSort;

public class Singleton {

    //DCL懒汉式
    private volatile static Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getUniqueInstance() {
        if(uniqueInstance == null) {
            synchronized (Singleton.class){
                if(uniqueInstance == null){
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
