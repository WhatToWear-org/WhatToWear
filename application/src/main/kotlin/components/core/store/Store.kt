package wtw.wtw.components.core.store

class Store(private val id: Int) {
    private var name: String = ""

    private var personel: Array<StoreUser> = arrayOf()

    private var calendar: Calendar = Calendar()

    private var toDoList: Array<ToDo> = arrayOf()

    private var products: Array<StoreOutfit> = arrayOf()

    fun getId(): Int {
        return id
    }

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getPersonel(): Array<StoreUser> {
        return personel
    }

    fun setPersonel(personel: Array<StoreUser>) {
        this.personel = personel
    }

    fun getCalendar(): Calendar {
        return calendar
    }

    fun setCalendar(calendar: Calendar) {
        this.calendar = calendar
    }

    fun getToDoList(): Array<ToDo> {
        return toDoList
    }

    fun setToDoList(toDoList: Array<ToDo>) {
        this.toDoList = toDoList
    }

    fun getProducts(): Array<StoreOutfit> {
        return products
    }

    fun setProducts(products: Array<StoreOutfit>) {
        this.products = products
    }

    fun checkOutfitAvailability(outfitStoreId: Int): Boolean {
        for (product in products) {
            if (product.getOutfitStoreId() == outfitStoreId) {
                return product.getStock() > 0
            }
        }

        return false
    }

    fun checkOutfitSizeAvailability(outfitStoreId: Int, size: Float): Boolean {
        for (product in products) {
            if (product.getOutfitStoreId() == outfitStoreId) {
                return product.getStock() > 0 && product.getSizes().contains(size)
            }
        }

        return false
    }
}
