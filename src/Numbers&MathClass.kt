import java.text.DecimalFormat

fun main(){
    val twoDigits = DecimalFormat("$###,###.00")
    println("Enter the cost of each and all of your items. When you are finished, enter 0.")
    var tax = 00.025
    var tip = 00.175
    var userInput = readLine()!!.toDouble()
    var totalNoTaxFormat = twoDigits.format(userInput)

    var taxOfTotal = (userInput * tax)
    var taxOfTotalFormat = twoDigits.format(taxOfTotal)

    var totalWTax = (userInput + taxOfTotal)
    var totalTaxFormat = twoDigits.format(totalWTax)

    var tipTotal = (totalWTax * tip)
    var tipFormat = (twoDigits.format(tipTotal))

    println("Total without Taxes: $totalNoTaxFormat")
    println("Tax: $taxOfTotalFormat")
    println("Total with Taxes: $totalTaxFormat")
    println("Recommended Tip: $tipFormat")
}