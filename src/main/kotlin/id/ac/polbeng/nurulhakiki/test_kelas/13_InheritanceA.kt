package id.ac.polbeng.nurulhakiki.test_kelas

/*
Inheritance adalah salah satu konsep OOP. Inheritance mengizinkan
sebuah kelas untuk mewariskan fitur kelas (property dan method) ke
kelas lainnya. Kelas yang mewarisi fitur kelas lainnya dipanggil child
class atau derived class atau subclass dan kelas yang fiturnya
diwariskan dipanggil parent class atau base class atau super class
 */
open class Computer(val name: String,
                    val brand: String) {
}

// Child class (initializes the parent class)
class Laptop(name: String,
             brand: String,
             val batteryLife: Double) : Computer(name, brand) {
    fun info(){
        println("Name : $name")
        println("Brand : $brand")
        println("Battery Life : $batteryLife")
    }
}

fun main(){
    val myLaptop = Laptop("Acer Aspire 4738", "Acer", 2.5)
    println(myLaptop.info())
}

/*
 Agar dapat diwariskan ke kelas anak, kelas induk harus memiliki
 akses modifier open. Namun kelas anak memiliki tanggung jawab untuk
 menginisialisasi kelas induknya. Jika kelas anak memiliki sebuah
 primary constructor, maka ia harus menginisialisasi kelas induknya
 di bagian kanan kelas header dengan melewatkan parameter ke primary
 constructor nya.
 */