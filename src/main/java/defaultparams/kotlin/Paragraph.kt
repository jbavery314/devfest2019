package defaultparams.kotlin

import defaultparams.java.Justification

data class Paragraph (
        val fontSize: Int = 12,
        val font: String = "Verdana",
        val justification: Justification = Justification.LEFT,
        val fontWeight: String = "Bold",
        val strikeThrough: Boolean = false
)