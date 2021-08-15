fun main() {
    var value = 'Z'
    println("Value " + value--)
    println("Value " + value--)
    println("Value " + value++)
    println("Value " + value--.minus(6))
    println("Value " + value++.minus(6))
    println("Value " + value--.minus(6))
    println("Value " + value++)
    println("Value " + value++)
    println("Value " + value++)
}

/*
R S T U V W X Y Z
9 8 7 6 5 4 3 2 1
<-             +>
Huruf Z --
Huruf Y --
Huruf X --
Huruf S ??
Huruf R ??
Huruf S ??
Huruf X ++
Huruf Y ++
Huruf Z ++
 */