const charset = '0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ'.split(
  ''
)

function encode(integer) {
  if (integer === 0) {
    return 0
  }
  let s = []
  while (integer > 0) {
    s = [charset[integer % 62], ...s]
    integer = Math.floor(integer / 62)
  }
  return s.join('')
}

module.exports = {
  encode
}
