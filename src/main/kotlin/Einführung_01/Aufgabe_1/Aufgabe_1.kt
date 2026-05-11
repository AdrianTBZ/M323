package Einführung_01.Aufgabe_1

// Imperativ
fun calculateScore(word: String): Int {
    var score = 0
    for (c in word) {
        if (c != 'a') {
            score++
        }
    }
    return score
}


// Declaration
fun wordScore(word: String): Int {
    return word.count { it != 'a' }
}