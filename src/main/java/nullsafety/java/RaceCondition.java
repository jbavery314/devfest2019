package nullsafety.java;

public class RaceCondition {
    public void badCode() {
        Cat cat = CatPool.getCat();

        if (cat != null) {
            // shave the cat
            cat.setFur(null);
        }
    }
}
