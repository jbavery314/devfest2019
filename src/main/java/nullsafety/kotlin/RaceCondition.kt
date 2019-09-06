package nullsafety.kotlin

fun badCode() {
    val cat = CatPool.getCat()

    if (cat != null) {
        // shave the cat
        cat.fur = null;
    }
}
