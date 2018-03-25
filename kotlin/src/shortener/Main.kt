package shortener

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val shortener = Shortener()
        System.out.println(shortener.shorten("google.com"))
        System.out.println(shortener.fetch(shortener.shorten("google.com"))?.url)

        val hash = shortener.shorten("google.com")
        shortener.fetch(hash)
        shortener.fetch(hash)
        shortener.fetch(hash)
        shortener.fetch(hash)

        val result = shortener.fetch(hash)
        System.out.println(result?.url)
        System.out.println(result?.hits)
    }
}
