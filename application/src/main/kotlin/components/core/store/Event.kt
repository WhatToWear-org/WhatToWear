package wtw.wtw.components.core.store

import java.util.Date

class Event {
    private var title: String = ""
    private var description: String = ""

    private var startDate: Date = Date()
    private var endDate: Date = Date()

    private var participants: Array<StoreUser> = arrayOf()

    fun getTitle(): String {
        return title
    }

    fun setTitle(title: String) {
        this.title = title
    }

    fun getDescription(): String {
        return description
    }

    fun setDescription(description: String) {
        this.description = description
    }

    fun getStartDate(): Date {
        return startDate
    }

    fun setStartDate(startDate: Date) {
        this.startDate = startDate
    }

    fun getEndDate(): Date {
        return endDate
    }

    fun setEndDate(endDate: Date) {
        this.endDate = endDate
    }

    fun getParticipants(): Array<StoreUser> {
        return participants
    }

    fun setParticipants(participants: Array<StoreUser>) {
        this.participants = participants
    }
}
