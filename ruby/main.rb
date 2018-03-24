require './shortener'

shortner = Shortener.new
puts shortner.shorten("google.com")
puts shortner.fetch(shortner.shorten("google.com")).inspect

hash = shortner.shorten("google.com")
shortner.fetch(hash)
shortner.fetch(hash)
shortner.fetch(hash)
shortner.fetch(hash)
puts shortner.fetch(hash).inspect