class Base62
  KEYS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".freeze
  BASE = KEYS.length

  # Encodes base10 (decimal) number to base62 string.
  def self.encode(num)
    return "0" if num == 0
    return nil if num < 0

    str = ""
    while num > 0
      # prepend base62 charaters
      str = KEYS[num % BASE] + str
      num = num / BASE
    end
    str
  end
end
