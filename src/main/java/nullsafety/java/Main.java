package nullsafety.java;

public class Main {
    public static void main(String[] args) {
        Cat cat = CatPool.getCat();

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
