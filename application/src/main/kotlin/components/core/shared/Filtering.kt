package wtw.wtw.components.core.shared

import wtw.wtw.lib.Status
import wtw.wtw.lib.Tag

class Filtering {
    private var parameters: Array<Tag> = arrayOf()
    private var filterResults: FilterResults = FilterResults()

    fun getParameters(): Array<Tag> {
        return parameters
    }

    fun setParameters(parameters: Array<Tag>) {
        this.parameters = parameters
    }

    fun getFilterResults(): FilterResults {
        return filterResults
    }

    fun setFilterResults(filterResults: FilterResults) {
        this.filterResults = filterResults
    }

    fun requestFilteredOutfits(): Status {
        return Status.OK
    }
}
