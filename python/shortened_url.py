class ShortenedURL:
    def __init__(self, url):
        self.hits = 0
        self.url = url

    def __repr__(self):
        return "<ShortenedURL url:%s hits:%s>" % (self.url, self.hits)

    def hit(self):
        self.hits += 1
