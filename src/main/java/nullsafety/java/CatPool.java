package nullsafety.java;

public class CatPool {
    private static Cat kitty = new Cat();

    public static synchronized Cat getCat() {
        return kitty;
    }
}
