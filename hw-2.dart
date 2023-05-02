void main() {
  var star = '*';
  var j = 2;

  for (var i = 0; i < 8; i++) {
    if (i <= 4) {
      print(star * i);
    } else {
      print(star * (i - j));
      j += 2;
    }
  }
}