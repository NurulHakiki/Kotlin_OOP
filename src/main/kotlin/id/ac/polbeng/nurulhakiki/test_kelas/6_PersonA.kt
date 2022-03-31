package id.ac.polbeng.nurulhakiki.test_kelas

class PersonA (_firstName: String, _lastName: String, _age: Int) {
    var firstName:String
    var lastName:String
    var age: Int
    init {
        firstName = _firstName
        lastName = _lastName
        age = _age
    }
}

fun main(){
    val budi = PersonA("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}
/*
Parameter dari konstruktor utama dapat digunakan dalam blok inisialisasi.
 Ia juga dapat digunakan untuk menginisialisasi property yang
 dideklarasikan dalam tubuh kelas.
 */