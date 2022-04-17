fun main(){
    val age = 32/2
    val name = "James W"

    var yearsOld = 24
    var layers = 5
    printCakeCandles(12)
    printCakeTop(12)
    printCakeBottom(12,12)

    println("Happy birthday $name")
    println("   ,,,,    ")
    println("   ||||    ")
    println(" ========= ")
    println("@@@@@@@@@@@")
    println("~@~@~@~@~@~")
    println("@@@@@@@@@@@")
    println("")
    println("You are $age years old")
    println("$age years old is the best age to celebrate")


//    println("=-.-=-.-=")
    printBorder("=-.-=-.-=",2)
    println("Happy Birthday child!")
    printBorder("=-.-=-.-=", 3)
//    println("=-.-=-.-=")

}
fun printCakeTop(age:Int){
    repeat( age + 2){
        print("=")
    }
    println()
}
fun printCakeCandles(age: Int){
    repeat(age){
        print(",")
    }
    println()
    println(" ")
    repeat(age){
        print("|")
    }
    println()
}
fun printCakeBottom(age:Int, layers:Int) {
    repeat(layers) {
        repeat(age + 2) {
            print("@")
        }
        println()
    }
}

fun printBorder(input:String, timesToRepeat:Int){
    repeat(timesToRepeat){
        print(input)
    }
}
