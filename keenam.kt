fun main(args:Array<String>){
    //Logika When
   /* print("Masukan Angka : ")
    var nilai:Int = readLine()!!.toInt()

    when(nilai){

        1,2,3 -> print("Anda mencetak angka or 1 2 3")
        in 4..10 -> print("Anda mencetak angka range - betwen 4 - 10")
        !in 10..20 -> print("Anda mencetak angka not range 10 - 20")
        else -> print("Anda mencetak else > 20")

    }

    print("Masukan Angka : ")
    var nilai:Int = readLine()!!.toInt()
    var cetak:String = if(nilai > 100) "Angka yang anda masukan lebih dari 100 yaitu $nilai"
    else "Angka yang anda masukan kurang dari 100 yaitu $nilai"

    if (nilai > 100){
        cetak = "Angka yang anda masukan lebih dari 100"
    }else{
        cetak = "Angka yang anda masukan kurang dari 100"
    }
    */
    print("Masukan Angka : ")
    var nilai:Int = readLine()!!.toInt()
    var cetak:String = when (nilai){
        in 50..100 -> "Nilai Anda A" else -> "Nilai Anda B"
    }
/*
    when (nilai){
        in 50..100 -> {
            cetak = "Nilai Anda A"
        }else -> {
        cetak = "Nilai Anda B"
    }
    }*/
    println(cetak)
}