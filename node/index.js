const {Shortener} = require('./shortener')

const shortener = new Shortener()

console.log(shortener.shorten('google.com'))
console.log(shortener.fetch(shortener.shorten('google.com')))

const hash = shortener.shorten('google.com')
shortener.fetch(hash)
shortener.fetch(hash)
shortener.fetch(hash)
shortener.fetch(hash)
console.log(shortener.fetch(hash))
