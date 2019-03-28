fun main(args:Array<String>){
    //Konversi Nilai

    var nilai:Int = 1
    var nilai1:Int?
    var nilai2:String = "2"

    nilai1 = nilai2.toInt()

    println(nilai1)

    //Operasi Matematika
    print("Masukan Angka : ")
    var nilai3:Float = readLine()!!.toFloat()
    print("Masukan Angka : ")
    var nilai4:Float = readLine()!!.toFloat()
    var hasil:Float?

    hasil = nilai3 * nilai4
    print("Hasilnya adalah $hasil")
}