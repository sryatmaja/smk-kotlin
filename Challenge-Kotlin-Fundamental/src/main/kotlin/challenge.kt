import java.util.Scanner;
import kotlin.system.exitProcess

public var input = Scanner(System.`in`);

fun main(){

    print("Nama : ");
    input.nextLine();
    print("Kelas : ")
    input.nextLine();
    print("No.Absen : ")
    input.nextLine();
    println("""==============================
Kamu ingin menghitung apa?
1. Volume Bola
2. Volume Kerucut
3. Volume Tabung
4. Volume Balok
0. Batal
==============================""")
    print("Pilihanmu : ")
    val menu = readLine()
    when (menu) {
        "1" -> {print("error")}
        "2" -> kerucut()
        "3" -> {print("error")}
        "4" -> balok()
        "0" -> exitProcess(1)
    }
}

fun kerucut(){
    print("Masukkan Jari-jari : ")
    val j = input.nextDouble()
    print("Masukkan Tinggi : ")
    val t = input.nextDouble()
    println("===========================")
    val x = ((j * j * 22 / 7 * t) / 3)
    val y = String.format("%.2f",x)
    print("Jadi Volume Kerucut = $y")

    println()
}

fun balok(){

    print("Masukkan Jari-jari : ")
    val j = input.nextDouble()
    print("Masukkan Tinggi : ")
    val t = input.nextDouble()
    println("===========================")
    val x = (j * j * 22 / 7 * t)
    val y = String.format("%.2f",x)
    print("Jadi Volume Tabung = $y")
}