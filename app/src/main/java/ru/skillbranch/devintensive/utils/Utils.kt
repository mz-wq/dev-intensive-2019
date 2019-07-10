package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullname:String?):Pair<String?, String?>{
        val parts : List<String>? = fullname?.split(" ")
        val firstName = parts?.getOrNull(0)?.trim()
        val lastName = parts?.getOrNull(1)?.trim()

        return Pair("${if(firstName=="") "null" else "$firstName"}", "${if(lastName=="") "null" else "$lastName"}")
    }

    fun transliteration(payload: String, divider:String = " "): String {
        TODO("not implemented")
        return ""
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        TODO("not implemented")
    }
}