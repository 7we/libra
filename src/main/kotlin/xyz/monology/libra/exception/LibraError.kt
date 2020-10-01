package xyz.monology.libra.exception

class LibraError(

) {
    val string by lazy {
        """
            
        """.trimIndent()
    }

    fun send() {
        System.err.println()
    }
}