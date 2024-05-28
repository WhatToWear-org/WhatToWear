package wtw.wtw.components.ui

abstract class Button(private var name: String, private var color: Color) {
    abstract fun onClick()

    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getColor(): Color {
        return color
    }

    fun setColor(color: Color) {
        this.color = color
    }
}
