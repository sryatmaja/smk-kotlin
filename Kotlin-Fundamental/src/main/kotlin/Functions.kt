fun main() {
    val user = setUser("Maja", "Gaming", 16)
    println(user)
}
fun setUser(name: String, hobby: String, age: Int) = "My name is $name, I like $hobby, and I'm $age years old"
