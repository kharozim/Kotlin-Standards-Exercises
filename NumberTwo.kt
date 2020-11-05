package dayfour

import java.awt.SystemColor
import java.awt.SystemColor.text

fun main() {
    val lyric: String = "Aku ingin begini\n" +
            "Aku ingin begitu\n" +
            "Ingin ini itu banyak sekali\n\n" +
            "Semua semua semua\n" +
            "Dapat dikabulkan\n" +
            "Dapat dikabulkan\n" +
            "Dengan kantong ajaib\n\n" +
            "Aku ingin terbang bebas\n" +
            "Di angkasa\n" +
            "Hei… baling baling bambu\n\n" +
            "La... la... la...\n" +
            "Aku sayang sekali\n" +
            "Doraemon\n\n" +
            "La... la... la...\n" +
            "Aku sayang sekali";

    val a = hitungKata(lyric)
    println(a)

}

fun hitungKata(s: String): List<Int> {
    val kata = listOf("aku", "ingin", "la...")
    val jumlah = mutableListOf<Int>()
//    kata.forEach { jumlah.add(carikata(it, s)) }
    for (i in kata) {
        jumlah.add(carikata(i, s))
    }
    return jumlah
}

fun carikata(word: String, text: String): Int {
    var from = 0
    var count = 0
    while (text.toLowerCase().indexOf(word, from) > -1) {
        from = text.toLowerCase().indexOf(word, from)
        ++count
        from++
    }
    return count
}