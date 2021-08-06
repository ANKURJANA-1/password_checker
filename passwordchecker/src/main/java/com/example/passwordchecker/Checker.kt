package com.example.passwordchecker

class Checker(
    private val typedPassword: String,
    private val currentPassword: String
) {
    private lateinit var current: String
    private lateinit var previous: String

    private val CAPITAL_LETTER="[ A-Za-z] "

    init {
        if (typedPassword.isNotBlank()
            && typedPassword.isNotEmpty()
            && currentPassword.isNotEmpty()
            && currentPassword.isNotBlank()
        ){
            current = currentPassword
            previous = typedPassword
        }
    }

    fun isCorrect(): Boolean {
        if (current.length != previous.length) {
            return false
        }
        return typedPassword == currentPassword
    }


    // password must be at least 6 char
    // at least Capital letter ,
    // one small letter,
    // a number and
    // a special character.

    fun isValied():Boolean{
        if(current.length<6){
            return false
        }

    }

}