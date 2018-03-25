from sys import maxsize
from random import randint
from base62 import encode
from shortened_url import ShortenedURL

class Shortener:
    def __init__(self):
        self.urls = {}

    def shorten(self, url):
        hash = encode(randint(0, maxsize))
        self.urls[hash] = ShortenedURL(url)
        return hash

    def fetch(self, hash):
        if hash not in self.urls:
            return None

        result = self.urls[hash]
        result.hit()
        return result
