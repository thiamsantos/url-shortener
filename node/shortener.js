const base62 = require('./base62')

class Shortener {
  constructor() {
    this.urls = {}
  }

  shorten(url) {
    const hash = base62.encode(this.getRandomNumber())
    this.urls[hash] = {
      url,
      hits: 0
    }
    return hash
  }

  fetch(hash) {
    if (!this.urls[hash]) {
      return null
    }

    this.urls[hash].hits++
    return this.urls[hash]
  }

  getRandomNumber() {
    return Math.floor(Math.random() * Number.MAX_SAFE_INTEGER)
  }
}

module.exports = {Shortener}
