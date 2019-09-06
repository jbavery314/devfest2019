package defaultparams.kotlin

import defaultparams.java.Justification

fun main() {
    println(Paragraph())

    println(Paragraph(fontSize = 5))

    println(Paragraph(fontSize = 5, strikeThrough = true))

    println(Paragraph(justification = Justification.RIGHT, fontWeight = "Normal"))
}