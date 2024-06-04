package wtw.wtw.components.core.store

import java.util.Date

class StoreUser(private val id: Int) {
    private var email: String = ""
    private var username: String = ""
    private var password: String = ""

    private var firstName: String = ""
    private var lastName: String = ""
    private var gender: String = ""
    private var dateOfBirth: Date = Date()

    private var phone: String = ""

    private var contacts: Array<StoreUser> = arrayOf()

    private var todoList: Array<ToDo> = arrayOf()

    private var calendar: Calendar = Calendar()

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

    fun getFirstName(): String {
        return firstName
    }

    fun setFirstName(firstName: String) {
        // Update in DB
        this.firstName = firstName
    }

    fun getLastName(): String {
        return lastName
    }

    fun setLastName(lastName: String) {
        // Update in DB
        this.lastName = lastName
    }

    fun getGender(): String {
        return gender
    }

    fun setGender(gender: String) {
        // Update in DB
        this.gender = gender
    }

    fun getDateOfBirth(): Date {
        return dateOfBirth
    }

    fun setDateOfBirth(dateOfBirth: Date) {
        // Update in DB
        this.dateOfBirth = dateOfBirth
    }

    fun getPhone(): String {
        return phone
    }

    fun setPhone(phone: String) {
        // Update in DB
        this.phone = phone
    }

    fun getContacts(): Array<StoreUser> {
        return contacts
    }

    fun setContacts(contacts: Array<StoreUser>) {
        // Update in DB
        this.contacts = contacts
    }

    fun getTodoList(): Array<ToDo> {
        return todoList
    }

    fun setTodoList(todoList: Array<ToDo>) {
        // Update in DB
        this.todoList = todoList
    }

    fun getCalendar(): Calendar {
        return calendar
    }

    fun setCalendar(calendar: Calendar) {
        // Update in DB
        this.calendar = calendar
    }
}
