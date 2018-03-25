from shortener import Shortener

if __name__ == '__main__':
    shortener = Shortener()

    print(shortener.shorten("google.com"))
    print(shortener.fetch(shortener.shorten("google.com")))

    hash = shortener.shorten("google.com")
    shortener.fetch(hash)
    shortener.fetch(hash)
    shortener.fetch(hash)
    shortener.fetch(hash)
    print(shortener.fetch(hash))
