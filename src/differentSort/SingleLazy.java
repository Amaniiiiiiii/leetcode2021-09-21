package differentSort;

public class SingleLazy {

    //懒汉式：单线程下是没问题的
    private SingleLazy(){

    }

    private static SingleLazy lazyMan;

    public static SingleLazy getInstance(){
        if(lazyMan==null) {
            lazyMan = new SingleLazy();
        }
        return lazyMan;
    }
}
