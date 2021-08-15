//Value
fun main() {
    val ranges = 1..5 step 2
    /*juga bisa -> 1.rangeTo(5)
    bisa dilewati per angka dengan -> step 3
     */
    for (i in ranges){
    /*
    #2
    ranges.forEach { value ->
     */
        println("value is $i!")
        }
    }

/*Index
fun main() {
    val ranges = 1.rangeTo(10) step 3
    #1
    for ((index, value) in ranges.withIndex()) {
    println("value $value with index $index")
    }
    #2
    ranges.forEachIndexed { index, _ ->
    println("index $index")
}
 */
