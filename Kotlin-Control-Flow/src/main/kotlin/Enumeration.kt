fun main() {

    /*fungsi enumValues() dan fungsi enumValueOf().

    val colors: Array<Color> = enumValues()
        . colors.forEach {color ->
            println(color)
        }
        val color: Color = enumValueOf("RED")
        println("Color is $color")
        }

    output :
        RED
        GREEN
        BLUE
        Color is RED

    */

    // output : RED, GREEN, BLUE
    /*
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print(color)
    }
    */

    val color: Color = Color.GREEN
    //normal
    print(color)
    print("\n")
    //properti ordinal
    print("Position GREEN is ${color.ordinal}")
    print("\n")
    //when
    when(color){
        Color.RED -> print("Color is Red")
        Color.BLUE -> print("Color is Blue")
        Color.GREEN -> print("Color is Green")
     }
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}