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

    // Complete the solve function below.
    def solve(meal_cost: Double, tip_percent: Int, tax_percent: Int) {
        val cost = meal_cost * (1 + (tip_percent + tax_percent) / 100.0)
        val totalCost = Math.round(cost)
        println("The total meal cost is " + totalCost + " dollars.")

    }

    def main(args: Array[String]) {
        val stdin = scala.io.StdIn

        val meal_cost = stdin.readLine.trim.toDouble

        val tip_percent = stdin.readLine.trim.toInt

        val tax_percent = stdin.readLine.trim.toInt

        solve(meal_cost, tip_percent, tax_percent)
    }
}
