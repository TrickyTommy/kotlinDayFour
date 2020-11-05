fun main() {
    val lyric = "Aku ingin begini\n" +
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
            "Aku sayang sekali"

    var a = countWords(lyric)
    print(a)
}

fun countWords(text: String): Map<String, Int>{
    val words = listOf("aku", "ingin", "la...")
    val count = mutableMapOf<String, Int>()

    for (i in words){
        count.put(i, findWord(i, text))
    }
    return count
}

fun findWord(word: String, text: String): Int {
    var from = 0
    var count = 0
    while(text.toLowerCase().indexOf(word, from) > -1){
        from = text.toLowerCase().indexOf(word, from)
        ++count
        from++
    }
    return count
}
