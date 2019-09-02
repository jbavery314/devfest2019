package nullability.kotlin

object CatPool {
    val cat = Cat()

    fun getCatFromPool(): Cat? = cat
}