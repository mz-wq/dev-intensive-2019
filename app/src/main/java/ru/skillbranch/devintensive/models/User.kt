package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.utils.Utils
import java.util.*

data class User (
    val id : String,
    var firstName : String?,
    var lastName : String?,
    var avatar : String?,
    var rating : Int = 0,
    var respect : Int = 0,
    var lastVisit : Date? = Date(),
    var isOnline : Boolean = false
){
    constructor(id: String, firstName: String?, lastName: String?) : this (
        id = id,
        firstName = firstName,
        lastName = lastName,
        avatar = null
    )
    constructor(id : String) : this (id, "Jhon", "Doe")

    init {
        println("It's Alive!!!\n  Firstname: ${firstName}, Lastname: ${lastName}")
    }

    companion object Factory {
        private var lastId : Int = -1
        fun makeUser (fullname:String? ) : User {
            lastId++
            val (firstName, lastName) = Utils.parseFullName(fullname)

            return User(id="$lastId", firstName = firstName, lastName = lastName)
        }
    }

}