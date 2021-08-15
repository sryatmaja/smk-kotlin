fun main() {
    val now =  60
    val nilai: String
    val nilaiC = now < 70
    val nilaiE = now >= 60
    nilai = if (now > 90 && now <= now) {
        "A"
    } else if (now > 80 || now > 80) {
        "B"
    } else if (!nilaiC) {
        "C"
    } else if (now >= 60 || now >= 60) {
        "D"
    } else if (!nilaiE){
        "E"
    } else{
        ""
    }
    println(nilai)
}

/*
>90 = A
>80 = B
>70 = C
>60 = D
>50 = ??
<=50 = E
*/
