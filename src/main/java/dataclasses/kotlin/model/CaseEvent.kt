package dataclasses.kotlin.model

import java.time.LocalDate

data class CaseEvent (
        var eventId: Long,
        var eventName: String,
        var eventDate: LocalDate,
        var eventDescription: String
)