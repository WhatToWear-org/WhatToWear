package wtw.wtw.components.core.store

class Team {
    private var category: String = ""

    private var employees: Array<StoreUser> = arrayOf()

    fun setCategory(category: String) {
        this.category = category
    }

    fun getCategory(): String {
        return this.category
    }

    fun setEmployees(employees: Array<StoreUser>) {
        this.employees = employees
    }

    fun getEmployees(): Array<StoreUser> {
        return this.employees
    }
}
