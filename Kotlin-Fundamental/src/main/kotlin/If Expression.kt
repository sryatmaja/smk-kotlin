fun main() {
    val kkm = 75
    val now = 99
    val nilai: String
    nilai = if (now > kkm) {
        "Nilai kamu $now, selamat ya!"
    } else if (now == kkm) {
        "Nilai kamu $now, silakan ikuti remidial."
    } else {
        " "
    }
    print(nilai)
}