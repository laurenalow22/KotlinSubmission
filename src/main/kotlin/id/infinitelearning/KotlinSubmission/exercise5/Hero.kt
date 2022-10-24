package id.infinitelearning.KotlinSubmission.exercise5

class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0
    private var mati: Boolean = false
    private var health = 10

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    fun checkHealth() {
        if (health <= 0) {
            println("Anda telah kalah $name")
        }
    }

    fun checkNyawa(): Boolean {
       if (health <= 0) {
             mati = true
        }
        return mati
    }

    fun jalan() {
//        saya rasa penggunaan chechkhealth() disini kurang tepat karena jika misalnya karakter sudah mati
//        maka akan tercetak "anda telah mati $nama" selanjutnya juga setelah itu akan tercetak "$name sedang berjalan"
//        secara logika gk masuk akal karena karakter sudah mati tapi masih bisa berjalan
//        oleh karena itu disini saya akan memodifiskasi kodingnya dan memasukan checkhealth() kedalam if exp
//        saya akan mengecek terlebih dahulu healthnya jika masih ada baru di print "$name sedang berjalan"
        if (mati) {
            checkHealth()
        } else {
            println("$name sedang berjalan...")
            health -= 1
        }

    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    fun lari() {
        if (health <= 0) {
            // disini saya tambahkan if supaya menghindari health menjadi mines (-)
            // kalau tidak di berikan if exp maka walaupun karakter telah mati perhitungan masih akan berjalan (akan ada health: -1)
            checkHealth()
        } else {
            println("$name sedang berlari...")
            health -= 2
        }
    }

    fun makan() {
        if (health <= 0) {
            // disini saya tambahkan if supaya menghindari health menjadi mines (-)
            // kalau tidak di berikan if exp maka walaupun karakter telah mati perhitungan masih akan berjalan (akan ada health: -1)
            checkHealth()
        } else {
            println("$name sedang makan...")
            health += 2
        }
    }

    fun minum() {
        if (health <= 0) {
            // disini saya tambahkan if supaya menghindari health menjadi mines (-)
            // kalau tidak di berikan if exp maka walaupun karakter telah mati perhitungan masih akan berjalan (akan ada health: -1)
            checkHealth()
        } else {
            println("$name sedang minum...")
            health += 2
        }
    }

    fun lompat() {
        if (health <= 0) {
            // disini saya tambahkan if supaya menghindari health menjadi mines (-)
            // kalau tidak di berikan if exp maka walaupun karakter telah mati perhitungan masih akan berjalan (akan ada health: -1)
            checkHealth()
        } else {
            println("$name sedang melompat...")
            health -= 2
        }
    }

    fun duduk() {
        if (health <= 0) {
            // disini saya tambahkan if supaya menghindari health menjadi mines (-)
            // kalau tidak di berikan if exp maka walaupun karakter telah mati perhitungan masih akan berjalan (akan ada health: -1)
            checkHealth()
        } else {
            println("$name sedang duduk...")
            health += 1
        }
    }


}