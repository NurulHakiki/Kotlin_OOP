package id.ac.polbeng.nurulhakiki.test_kelas


//Konstruktor tambahan bisa didefinisikan lebih dari satu
class PersonE {
    var firstName: String
    var lastName: String
    var age: Int = 25
    constructor(_firstName: String, _lastName: String){
        firstName = _firstName
        lastName = _lastName
    }
    constructor(_firstName: String, _lastName: String, _age: Int): this(_firstName, _lastName){
        age = _age
    }
    fun cetakInfo(){
        println("Name : ${firstName} ${lastName}")
        println("Age : ${age}")
    }
}

fun main(){
    val anton = PersonE("Frank", "Lampard")
    anton.cetakInfo()
    println()
    val budi = PersonE("Budi", "Gunawan", 21)
    budi.cetakInfo()
}

/*
Jika property kelas tidak diinisialisasi pada saat
mendeklarasikannya maka property tersebut harus di inisialisasi didalam
konstruktor tambahan atau blok inisialisasi.
 */