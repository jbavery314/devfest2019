package nullsafety.kotlin

fun main() {
    val cat = CatPool.getCat()
//    if (cat != null) {
//        if (cat.fur != null) {
//            cat.fur.scatter()
//        }
//        if (cat.human != null) {
//        }
//    }
    cat?.fur?.scatter()
    cat?.human?.feedCat()
    cat?.eat()
}