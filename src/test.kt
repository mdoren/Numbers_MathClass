import java.text.DecimalFormat

fun main(){
    val tax = .025
    val tip = .20
    println("Enter the amounts of your purchased items. When done, enter 0.")
    var total = 1.00
    while (total != 0.00)
    {
        println("Enter your total:")
        total = readLine()!!.toDouble()
        println(total)
        val twoDigits = DecimalFormat("$##00.00")
        var totaltip = tip * total
        var totaltax = tax * total
        var Formattedtip = twoDigits.format(totaltip)
        var Formattedtotal = twoDigits.format(totaltax)
        var totalbill = total + totaltax + totaltip
        var Formattedbill = twoDigits.format(totalbill)
        println("Tax: $Formattedtotal")
        println("Tip: $Formattedtip")
        println("Total Bill: $Formattedbill")
    }

//    val twoDigits = DecimalFormat("$####.00")
//    var totaltax = tax * total
//    var Formattedtotal = twoDigits.format(totaltax)
//    println("Result: $Formattedtotal")
}
