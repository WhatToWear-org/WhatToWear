package wtw.wtw.components.core.store

class StoreOutfit(private val outfitStoreId: Int) {
    private var name: String = ""
    private var description: String = ""

    private var price: Double = 0.0
    private var stock: Int = 0
    private var sizes: Array<Float> = arrayOf()

    fun getOutfitStoreId(): Int {
        return outfitStoreId
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getDescription(): String {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun getPrice(): Double {
        return price
    }

    fun setPrice(price: Double) {
        this.price = price
    }

    fun getStock(): Int {
        return stock
    }

    fun setStock(stock: Int) {
        this.stock = stock
    }

    fun getSizes(): Array<Float> {
        return sizes
    }

    fun setSizes(sizes: Array<Float>) {
        this.sizes = sizes
    }
}
