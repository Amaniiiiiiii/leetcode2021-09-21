package differentSort;

public class Hungry {
    private final static Hungry hungry = new Hungry();

    private Hungry(){

    }

    public static Hungry getInstance(){ return hungry ;}
}
