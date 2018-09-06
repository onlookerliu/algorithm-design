object Conditionals {

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val N = stdin.readLine.trim.toInt
    var res: String = ""
    if (N % 2 == 1) {
      res = "Weird"
    } else {
      if (N < 6) {
        res = "Not Weird"
      } else if (N <= 20) {
        res = "Weird"
      } else {
        res = "Not Weird"
      }
    }

    println(res)
  }
}

