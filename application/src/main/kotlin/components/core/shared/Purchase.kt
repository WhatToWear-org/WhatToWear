package wtw.wtw.components.core.shared

import wtw.wtw.components.core.user.User
import wtw.wtw.components.core.store.StoreOutfit
import wtw.wtw.lib.Status

class Purchase(private val id: Int, private val user: User, private val outfit: StoreOutfit) {
    fun getId(): Int {
        return id
    }

    fun getUser(): User {
        return user
    }

    fun getOutfit(): StoreOutfit {
        return outfit
    }

    fun makePurchase(): Status {
        return Status.OK
    }
}
