CHARSET = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz'
BASE = 62

def encode(n, minlen=1):
    """Encodes a given integer ``n``."""

    chs = []
    while n > 0:
        r = n % BASE
        n //= BASE

        chs.append(CHARSET[r])

    if len(chs) > 0:
        chs.reverse()
    else:
        chs.append('0')

    s = ''.join(chs)
    s = CHARSET[0] * max(minlen - len(s), 0) + s
    return s
