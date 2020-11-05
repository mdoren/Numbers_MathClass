import java.text.DecimalFormat

fun main(){
    val tax = .07
    val cost = 100000

    val twoDigits = DecimalFormat("###,###,###.00")

    var totalCost = (cost * tax)
    var ourTestVar = twoDigits.format(totalCost)

    println("Result: $ourTestVar")
}