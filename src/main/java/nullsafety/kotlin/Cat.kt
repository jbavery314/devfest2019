package nullsafety.kotlin

data class Cat(
        var age: Int = 5,
        var fur: Fur? = Fur(),
        var human: Human? = Human()
) {
    fun eat() = println("Cat is eating")
}