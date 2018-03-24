class ShortenedURL
  attr_reader :url, :hits

  def initialize(url, hits = 0)
    @url = url
    @hits = hits
  end

  def hit
    @hits += 1
  end
end
