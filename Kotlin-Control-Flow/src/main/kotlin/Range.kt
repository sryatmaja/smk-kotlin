fun main() {
    //#1
    val rangeInt = 1..10
    /*#2
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    output: 1 3 5 7 9 2
     =================
    rangeTo() = ..
    downTo() nilai menurun 9,8,7,6...
    =======================
    Memeriksa nilai ada atau tidaknya pada range
    val tenToOne = 10.downTo(1)
    #1
    if (7 in tenToOne)
    #2
    if (1 <= 7 && 7 <= 10)
    #3 dengan !in
    if (11 !in tenToOne)
    {
        println("Value 7 available")
    }
     */

    print(rangeInt.step)
}

