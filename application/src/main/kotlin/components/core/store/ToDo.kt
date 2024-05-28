package wtw.wtw.components.core.store

import wtw.wtw.lib.Importance

class ToDo {
    private var name: String = ""
    private var description: String = ""
    private var importance: Importance = Importance.LOW

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

    fun getImportance(): Importance {
        return importance
    }

    fun setImportance(importance: Importance) {
        this.importance = importance
    }
}
