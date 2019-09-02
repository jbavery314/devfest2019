package nullability.kotlin

fun main() {
    val cat = CatPool.getCatFromPool()
    cat?.fur?.scatter()
    cat?.human?.feedCat()
    cat?.eat()
}