package shortener

import java.util.HashMap
import java.util.concurrent.ThreadLocalRandom

class Shortener {
    private val urls = HashMap<String, ShortenedURL>()

    fun shorten(url: String): String {
        val shortenedURL = ShortenedURL(url)
        val seed = ThreadLocalRandom.current().nextInt()
        val hash = Base62.encode(seed)
        urls.put(hash, shortenedURL)

        return hash
    }

    fun fetch(hash: String): ShortenedURL? {
        val shortenedURL = urls[hash]
        shortenedURL?.hit()
        return shortenedURL
    }
}
