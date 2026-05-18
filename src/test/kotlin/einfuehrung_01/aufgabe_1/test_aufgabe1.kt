package einfuehrung_01.aufgabe_1

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class ScoreTest {

    @Test
    fun testCalculateScore() {
        assertEquals(9, calculateScore("imperative"))
        assertEquals(2, calculateScore("no"))
    }

    @Test
    fun testWordScore() {
        assertEquals(9, wordScore("declarative"))
        assertEquals(3, wordScore("yes"))
    }
}