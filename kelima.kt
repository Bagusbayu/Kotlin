fun main(args:Array<String>){
    //LogikaIF
    print("Masukan Nilai anda : ")
    var nilai:Int = readLine()!!.toInt()

    if (nilai >= 95 && nilai == 100){
        if (nilai >= 98){//if dalam if atau Nested If
            print("Nilai anda A+")
        }else{
            print("Nilai Anda A-")
        }
        print("Anda mendapatkan A")
    }else if(nilai >= 80 && nilai < 95){
        print("Anda mendapatkan B")
    }else if(nilai >= 65 && nilai < 80){
        print("Anda mendapatkan C")
    }else if(nilai >= 45 && nilai < 65){
        print("Anda mendapatkan D")
    }else if(nilai >= 0 && nilai < 45){
        print("Anda mendapatkan E")
    }else if(nilai > 100){
        print("Nilai yang anda input salah")
    }else {
        print("Nilai anda $nilai")
    }
}