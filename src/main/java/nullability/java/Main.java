package nullability.java;

public class Main {
    public static void main(String[] args) {
        Cat cat = CatPool.getCatFromPool();

        if (cat != null) {
            if (cat.getFur() != null) {
                cat.getFur().scatter();
            }
            if (cat.getHuman() != null) {
                cat.getHuman().feedCat();
            }
        }
//<more code>

        if (cat != null) {
            cat.eat();
        }

    }
}
