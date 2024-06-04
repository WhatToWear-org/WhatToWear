package wtw.wtw.components.core.store.stats

abstract class Diagram {
    private var data: Array<Array<Double>> = arrayOf()

    abstract fun plot()

    fun getData(): Array<Array<Double>> {
        return data
    }

    fun setData(data: Array<Array<Double>>) {
        this.data = data
    }

    fun filterByTimeRange(): Array<Array<Double>> {
        return arrayOf()
    }
}
