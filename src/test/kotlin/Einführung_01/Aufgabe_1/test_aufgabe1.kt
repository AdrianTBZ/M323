package Einführung_01.Aufgabe_1

import kotlin.test.Test
import kotlin.test.assertEquals

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