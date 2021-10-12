
import java.util.*
fun main(args: Array<String>) {

// Question 1
    println(" First Namber ? ")
    var X = readLine()!!.toInt()
    println(" second number ?")
    var Y = readLine()!!.toInt()
    println("Chose One of operation (+, -, *, / , %) : ")
    var Operation: String = readLine()!!.toString()

    if (Operation == "+") {
        println("the result is =${X + Y} ")     }
    else if (Operation == "-") {
        println("the result is =${X - Y}")      }
    else if (Operation == "*") {
        println("the result is =${X * Y} ")     }
    else if (Operation == "/") {
        println("the result is =${X / Y} ")     }
    else if (Operation == "%") {
        println("the result is =${X % Y} ")     }

    // Question 2

    var condition: String = "correct";
    while (condition == "correct") {
        println("Insert employee annual salary");
        var annualSalary: Double = readLine()!!.toDouble();
        println("insert performance rating");
        var rate: Int = readLine()!!.toInt();
        var raisedSalary: Double = 1.0;
        if (rate == 1) {
            raisedSalary = annualSalary + ((annualSalary * 6) / 100)
            println("salary with raise is " + raisedSalary)
            break;
        } else if (rate == 2) {
            raisedSalary = annualSalary + ((annualSalary * 4) / 100)
            println("salary with raise is " + raisedSalary)
            break;
        } else if (rate == 3) {
            raisedSalary = annualSalary + ((annualSalary * 1.5) / 100)
            println("salary with raise is " + raisedSalary)
            break;
        } else {
            println("insert a number between 1 and 3")
            continue
        }

    }

}
