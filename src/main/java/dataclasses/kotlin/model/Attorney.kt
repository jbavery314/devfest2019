package dataclasses.kotlin.model

import java.time.LocalDate

data class Attorney (
        var attorneyID: Long,
        var name: String,
        var address: String,
        var birthday: LocalDate,
        var attorneyType: String
)