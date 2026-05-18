package einfuehrung_01.aufgabe_3

// Teil A: Imperativ
class ShoppingCartA {
    private val items = mutableListOf<String>()
    private var hasBook = false

    fun addItem(item: String) {
        items.add(item)
        if (item == "Buch") hasBook = true
    }

    fun removeItem(item: String) {
        items.remove(item)
        hasBook = items.contains("Buch")
    }

    fun getItems(): List<String> = items.toList()

    fun getDiscount(): Double = if (hasBook) 0.05 else 0.0
}


//  Teil B: Funktional
class ShoppingCartB {
    private val items = mutableListOf<String>()

    fun addItem(item: String) { items.add(item) }
    fun removeItem(item: String) { items.remove(item) }

    fun getItems(): List<String> = items.toList()

    fun getDiscount(): Double = if (items.any { it == "Buch" }) 0.05 else 0.0
}


//  Teil C: Immutable

data class ShoppingCartC(val items: List<String> = emptyList()) {

    fun addItem(item: String): ShoppingCartC = copy(items = items + item)

    fun removeItem(item: String): ShoppingCartC =
        copy(items = items - item)

    val discount: Double
        get() = if (items.any { it == "Buch" }) 0.05 else 0.0
}