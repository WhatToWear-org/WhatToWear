package wtw.wtw.components.core.user

import wtw.wtw.lib.Status

class User(private val id: Int) {
    private var email: String = ""
    private var username: String = ""
    private var password: String = ""

    private var country: String = "US"

    private var sizes: Array<Float> = arrayOf(0.0f, 0.0f, 0.0f, 0.0f, 0.0f)

    fun getId(): Int {
        return id
    }

    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String) {
        // Update in DB
        this.email = email
    }

    fun getUsername(): String {
        return username
    }

    fun setUsername(username: String) {
        // Update in DB
        this.username = username
    }

    fun getPassword(): String {
        return password
    }

    fun setPassword(password: String) {
        // Update in DB
        this.password = password
    }

    fun getCountry(): String {
        return country
    }

    fun setCountry(country: String) {
        // Update in DB
        this.country = country
    }

    fun getSizes(): Array<Float> {
        return sizes
    }

    fun setSizes(sizes: Array<Float>) {
        // Update in DB
        this.sizes = sizes
    }

    fun requestLogin(): Status {
        return Status.OK
    }

    fun requestLogout(): Status {
        return Status.OK
    }
}
