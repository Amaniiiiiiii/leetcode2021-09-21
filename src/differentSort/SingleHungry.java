package differentSort;

public class SingleHungry {

    //饿汉式 ： 浪费空间，因为一加载类就会有一个对象，如果类里面有很多数据就很不好
    private SingleHungry(){

    }

    private final static SingleHungry hungry = new SingleHungry();

    public static SingleHungry getInstance(){
        return hungry;
    }
}




