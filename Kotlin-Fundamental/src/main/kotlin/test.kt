/*fun main(args: Array<String>) {
    print("Masukan Nilai: ")
    val stringInput = readLine()!!
    var now = stringInput
    val mixArray = arrayOf(90, 80, 70, 60)
    val nilaiC = now < mixArray[2]
    val nilaiE = now >= mixArray[-0].toString()
    val nilai: String

    nilai = if (now > mixArray[0].toString() && now <= now) {
        "A"
    } else if (now > mixArray[1].toString() || now > mixArray[2].toString()) {
        "B"
    } else if (!nilaiC) {
        "C"
    } else if (now > mixArray[3].toString() || now > mixArray[2].toString()) {
        "D"
    } else if (!nilaiE) {
        "E"
    } else {
        "Eror: no file found "
    }
    println(nilai)

}*//*
fun main(){
    print("Inputkan nama: ")
    val now = readLine()
    val nilai: String
    nilai = if (now > 90 && now <= now) {
        "A"
    } else if (now > 80 || now > 80) {
        "B"
    } else if (now > 70 && now <= now) {
        "C"
    } else if (now >= 60 || now >= 60) {
        "D"
    } else if (now > 50 && now <= now){
        "E"
    } else{
        ""
    }
    println(nilai)
}*/
fun namaFunction(): String {
    return "Hello " + "!"
}

fun main(args: Array<String>) {
    println(namaFunction())
}
