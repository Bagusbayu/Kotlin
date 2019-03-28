fun main(args:Array<String>){
    print ("Masukan Nama Anda ? ")
    var nama = readLine()
    print ("Masukan umur anda ? ")
    var umur:Int = readLine()!!.toInt()

    println ("Nama saya adalah " + nama)
    print ("Umur saya adalah $umur umur")

}