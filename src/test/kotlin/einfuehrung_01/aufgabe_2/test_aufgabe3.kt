package einfuehrung_01.aufgabe_3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ShoppingCartATest {

    @Test
    fun `addItem und removeItem funktionieren`() {
        val cart = ShoppingCartA()
        cart.addItem("Apfel")
        assertEquals(listOf("Apfel"), cart.getItems())
        cart.removeItem("Apfel")
        assertTrue(cart.getItems().isEmpty())
    }

    @Test
    fun `Rabatt 5 Prozent nur wenn Buch enthalten`() {
        val cart = ShoppingCartA()
        assertEquals(0.0, cart.getDiscount())
        cart.addItem("Buch")
        assertEquals(0.05, cart.getDiscount())
        cart.removeItem("Buch")
        assertEquals(0.0, cart.getDiscount())
    }
}

class ShoppingCartBTest {

    @Test
    fun `addItem und removeItem funktionieren`() {
        val cart = ShoppingCartB()
        cart.addItem("Apfel")
        assertEquals(listOf("Apfel"), cart.getItems())
        cart.removeItem("Apfel")
        assertTrue(cart.getItems().isEmpty())
    }

    @Test
    fun `Rabatt 5 Prozent nur wenn Buch enthalten`() {
        val cart = ShoppingCartB()
        assertEquals(0.0, cart.getDiscount())
        cart.addItem("Buch")
        assertEquals(0.05, cart.getDiscount())
    }
}

class ShoppingCartCTest {

    @Test
    fun `addItem und removeItem geben neue Instanz zurueck`() {
        val cart = ShoppingCartC()
        val withItem = cart.addItem("Apfel")
        assertEquals(listOf("Apfel"), withItem.items)
        assertTrue(cart.items.isEmpty())
        val removed = withItem.removeItem("Apfel")
        assertTrue(removed.items.isEmpty())
    }

    @Test
    fun `Rabatt 5 Prozent nur wenn Buch enthalten`() {
        assertEquals(0.0, ShoppingCartC().discount)
        assertEquals(0.05, ShoppingCartC(listOf("Buch")).discount)
    }
}