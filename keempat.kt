import java.util.*

fun main(args:Array<String>){

    print("Masukan tahun lahir anda : ")
    var tahunlahir:Int = readLine()!!.toInt()
    var tahunsekarang = Calendar.getInstance().get(Calendar.YEAR)
    var umur:Int = tahunsekarang - tahunlahir

    print("Umur kamu sekarang adalah $umur umur")
}