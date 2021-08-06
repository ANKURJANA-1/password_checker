package com.example.passwordchecker

class Checker(
    private val typedPassword: String,
    private val currentPassword: String
) {
    private lateinit var current: String
    private lateinit var previous: String

    private val CAPITAL_LETTER = "[ A-Za-z] "

    init {
        if (typedPassword.isNotBlank()
            && typedPassword.isNotEmpty()
            && currentPassword.isNotEmpty()
            && currentPassword.isNotBlank()
        ) {
            current = currentPassword
            previous = typedPassword
        }
    }

    fun isCorrect(): Boolean {
        if (current.length != previous.length) {
            return false
        }
        if(!isValied()){
            return false
        }
        return typedPassword == currentPassword
    }


    // password must be at least 6 char
    // at least Capital letter ,
    // one small letter,
    // a number and
    // a special character.

    fun isValied(): Boolean {
        if (current.length < 6) {
            return false
        }

        var count = 0;
        for (letter in current) {
            if ((letter >= 'a' && letter <= 'z')
                || (letter >= 'A' && letter <= 'Z')
                || (letter >= '0' && letter <= '9')
                || (letter >= '!' && letter <= '&')
            ) {
                count += 1
            }
        }

        return count==4
    }

}