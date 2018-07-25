import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object Solution {

    // Complete the angryProfessor function below.
    def angryProfessor(k: Int, a: Array[Int]): String = {
        val onTime = a.filter(_ <= 0).length
        if (onTime >= k) "NO" else "YES"
    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

        val t = stdin.readLine.trim.toInt

        for (tItr <- 1 to t) {
            val nk = stdin.readLine.split(" ")

            val n = nk(0).trim.toInt

            val k = nk(1).trim.toInt

            val a = stdin.readLine.split(" ").map(_.trim.toInt)
            val result = angryProfessor(k, a)

            printWriter.println(result)
        }

        printWriter.close()
    }
}
