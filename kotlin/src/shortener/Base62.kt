package shortener

object Base62 {
    private val ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    private val BASE = ALPHABET.length

    fun encode(num: Int): String {
        var i = num
        val sb = StringBuilder("")
        if (i == 0) {
            return "a"
        }
        while (i > 0) {
            val rem = i % BASE
            sb.append(ALPHABET[rem])
            i /= BASE
        }
        return sb.reverse().toString()
    }
}
