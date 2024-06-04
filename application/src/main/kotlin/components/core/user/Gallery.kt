package wtw.wtw.components.core.user

import wtw.wtw.lib.Status

class Gallery {
    private var globalOutfits: Array<UserOutfit> = arrayOf()

    fun requestGlobalOutfits(): Status {
        return Status.OK
    }

    fun getGlobalOutfits(): Array<UserOutfit> {
        return globalOutfits
    }
}
