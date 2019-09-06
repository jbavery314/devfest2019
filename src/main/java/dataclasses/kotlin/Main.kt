package dataclasses.kotlin

import com.google.gson.GsonBuilder
import dataclasses.kotlin.model.*
import java.time.LocalDate

fun main() {
    val courtCase = CourtCase (
            "ADKDFSJAFDK3233223",
            "Criminal",
            "Open",
            "2018",
            mutableListOf(Charge(5, "M3", LocalDate.now(), "Open"),
                    Charge(2, "M1", LocalDate.now(), "Dismissed"),
                    Charge(5, "M3", LocalDate.now(), "Open")),
            mutableListOf(Defendant(654654, "Bob", "Smith", "Bilbo",
                    "546-565-4648")),
            mutableListOf(Attorney(5554545, "Jim The Hammer Shapiro", "546 Phony Way", LocalDate.now(), "Personal Injury")),
            mutableListOf(CaseEvent(6668688, "Arraignment", LocalDate.now(), "The arraignment for the defendant on the matter of blah blah"))
    )

    val gson = GsonBuilder().setPrettyPrinting().create()
//    println(gson.toJson(courtCase))
    
//    println("First and last charges equal: ${courtCase.charges.first() == courtCase.charges.last()}")
//
//    with(courtCase.charges) {
//        add(last().copy(severity = "F1"))
//        println(gson.toJson(this))
//
//        println("First and last charges equal: ${first() == last()}")
//    }


}