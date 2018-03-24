require './shortener'

shortener = Shortener.new
puts shortener.shorten("google.com")
puts shortener.fetch(shortener.shorten("google.com")).inspect

hash = shortener.shorten("google.com")
shortener.fetch(hash)
shortener.fetch(hash)
shortener.fetch(hash)
shortener.fetch(hash)
puts shortener.fetch(hash).inspect