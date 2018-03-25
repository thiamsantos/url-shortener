package shortener

import java.util.concurrent.atomic.AtomicInteger

class ShortenedURL(val url: String) {
    val hits: AtomicInteger = AtomicInteger()

    fun hit(): Int {
        return this.hits.incrementAndGet()
    }
}
