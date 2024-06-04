package wtw.wtw.components.core.shared

import wtw.wtw.components.core.store.StoreOutfit

class OutfitSuggestion {
    private var results: Array<StoreOutfit> = arrayOf()

    fun getResults(): Array<StoreOutfit> {
        return results
    }

    fun setResults(results: Array<StoreOutfit>) {
        this.results = results
    }
}
