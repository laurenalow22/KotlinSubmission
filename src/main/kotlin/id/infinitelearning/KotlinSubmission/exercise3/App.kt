package id.infinitelearning.KotlinSubmission.exercise3

fun main() {

    /** Latihan 1
    Buatlah logika if untuk mengevaluasi nilai score dengan ketentuan:
    1. Jika nilai score lebih atau sama dengan 90
    - Isi variabel result dengan nilai: 'Selamat! Anda mendapatkan nilai A.'
    2. Jika nilai score ada di antara 80 hingga 89
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai B.'
    3. Jika nilai score ada di antara 70 hingga 79
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai C.'
    4. Jika nilai score ada di antara 60 hingga 69:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai D.'
    5. Jika nilai score di bawah 60:
    - Isi variabel result dengan nilai: 'Anda mendapatkan nilai E.'
     */
    // Buat di bawah sini

    println("Program konversi nilai angka ke nilai huruf")
    println("Masukan nilai Angka: ")
    var score: Int = Integer.valueOf(readLine())
    var result: String = ""

    if (score >= 90) result = "Selamat! Anda mendapatkan nilai A."
    if (score > 80 && score < 90 ) result = "Selamat! Anda mendapatkan nilai B."
    if (score > 70 && score < 79 ) result = "Selamat! Anda mendapatkan nilai C."
    if (score > 60 && score < 69 ) result = "Selamat! Anda mendapatkan nilai D."
    if (score <= 60 )  result = "Selamat! Anda mendapatkan nilai E."

    println(result)

}