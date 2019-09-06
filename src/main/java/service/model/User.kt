package service.model

data class User (
        val userid: Int,
        val firstName: String,
        val lastName: String,
        val address: String,
        val age: Int,
        val phoneNumber: String
) {
    val fullname by lazy { "$firstName $lastName"}
}