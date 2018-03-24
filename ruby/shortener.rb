require './base62'
require './shortened_url'

class Shortener
  MAX_NUM = (2**(0.size * 8 -2) -1)
  private_constant :MAX_NUM

  def initialize
    @urls = Hash.new
  end

  def shorten(url)
    hash = Base62.encode(rand(MAX_NUM))
    @urls[hash] = ShortenedURL.new(url)
    hash
  end

  def fetch(shortened_url)
    return nil unless @urls.has_key?(shortened_url) 

    url = @urls.fetch(shortened_url)
    url.hit
    url
  end
end
