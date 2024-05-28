package wtw.wtw.components.core.user

import java.util.Date

class UserOutfit(private val postId: Int, private val userId: Int) {
    private var timestamp: Date = Date()

    private var likes: Likes = Likes()

    fun getPostId(): Int {
        return postId
    }

    fun getUserId(): Int {
        return userId
    }

    fun getTimestamp(): Date {
        return timestamp
    }

    fun setTimestamp(timestamp: Date) {
        this.timestamp = timestamp
    }

    fun getLikes(): Likes {
        return likes
    }

    fun setLikes(likes: Likes) {
        this.likes = likes
    }
}
