package id.ac.polbeng.nurulhakiki.test_kelas

class InitOrder(name: String) {
    val firstProperty = "First property: $name".also(::println)
    init {
        println("First initializer block that prints ${name}")
    }
    val secondProperty = "Second property: ${name.length}".also(::println)
    init {
        println("Second initializer block that prints ${name.length}")
    }
}

fun main(){
    val initOrder = InitOrder("RPL")
}

/*
Sebuah kelas di Kotlin dapat memiliki satu konstruktor utama (primary
constructor) dan satu atau lebih konstruktor tambahan (secondary
constructor). Konstruktor utama adalah bagian dari header suatu kelas,
 */
/*
Blok inisialisasi diawali dengan keyword init. Selama instansiasi
sebuah objek, urutan eksekusi blok inisialisasi sama dengan urutan yang
ada pada tubuh kelas, berselangkan inisialisasi property-nya.
 */