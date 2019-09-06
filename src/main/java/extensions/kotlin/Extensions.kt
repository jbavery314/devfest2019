package extensions.kotlin

import java.lang.StringBuilder

fun Int.even() = this % 2 == 0

fun String.alternateCase(): String {
    val destination = StringBuilder()
    for (i in 0 until length) {
        val element = get(i)
        if (i.even()) {
            destination.append(element.toUpperCase())
        } else {
            destination.append(element.toLowerCase())
        }
    }
    return destination.toString()
}