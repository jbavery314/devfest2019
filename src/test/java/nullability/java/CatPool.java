package nullability.java;

public class CatPool {
    private static Cat cat = new Cat();

    public static synchronized Cat getCat() {
        return cat;
    }
}
