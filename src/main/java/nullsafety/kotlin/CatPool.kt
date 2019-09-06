package nullsafety.kotlin

object CatPool {
    val kitty = Cat()

    fun getCat(): Cat? = kitty
}