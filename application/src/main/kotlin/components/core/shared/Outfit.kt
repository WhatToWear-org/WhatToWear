package wtw.wtw.components.core.shared

import java.awt.Image
import wtw.wtw.lib.Tag

abstract class Outfit(private val id: Int) {
    private var tags: Array<Tag> = arrayOf()

    private var photos: Array<Image> = arrayOf()

    fun getID(): Int {
        return id
    }

    fun getTags(): Array<Tag> {
        return tags
    }

    fun setTags(tags: Array<Tag>) {
        this.tags = tags
    }

    fun getPhotos(): Array<Image> {
        return photos
    }

    fun setPhotos(photos: Array<Image>) {
        this.photos = photos
    }
}
