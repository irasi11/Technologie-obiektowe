public class Singleton {
    private static Singleton singleton;

    private Singleton(){}

    public static synchronized Singleton createInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
