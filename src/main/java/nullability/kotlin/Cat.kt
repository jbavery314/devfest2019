package nullability.kotlin

data class Cat(
        val age: Int = 5,
        val fur: Fur? = Fur(),
        val human: Human? = Human()
) {
    fun eat() = println("Cat is eating")
}