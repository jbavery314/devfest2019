package dataclasses.kotlin.model

data class Defendant (
        var defendantId: Long,
        var firstName: String,
        var lastName: String,
        var middleName: String,
        var phoneNumber: String
)