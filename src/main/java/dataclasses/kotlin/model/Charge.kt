package dataclasses.kotlin.model

import java.time.LocalDate

data class Charge (
        var chargeType: Int,
        var severity: String,
        var filingDate: LocalDate,
        var status: String
)