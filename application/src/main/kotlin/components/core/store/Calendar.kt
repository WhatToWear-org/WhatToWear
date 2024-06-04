package wtw.wtw.components.core.store

class Calendar {
    private var events: Array<Event> = arrayOf()

    fun addEvent(event: Event) {
        events += event
    }

    fun getEvents(): Array<Event> {
        return events
    }

    fun removeEvent(event: Event) {
        events = events.filter { it != event }.toTypedArray()
    }

    fun clearEvents() {
        events = arrayOf()
    }
}
