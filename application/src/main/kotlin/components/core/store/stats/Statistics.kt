package wtw.wtw.components.core.store.stats

class Statistics {
    private var info: Info = Info()

    private var diagrams: Array<Diagram> = arrayOf()

    fun getInfo(): Info {
        return info
    }

    fun setInfo(info: Info) {
        this.info = info
    }

    fun getDiagrams(): Array<Diagram> {
        return diagrams
    }

    fun setDiagrams(diagrams: Array<Diagram>) {
        this.diagrams = diagrams
    }
}
