package com.svbneelmane.learn.unittesting

/**
 * Singleton created to implement non UI test cases
 * @author Shivaprasad
 */
object RegistrationUtil {

    private val existingUsers = listOf("Kevin", "Paul", "James")

    /**
     * the input is not valid if
     * .. the username is empty
     * .. the password is empty
     * .. username is already taken
     * .. confirm password is not same as password
     * .. password without 1 digits at least
     */
    fun validateRegistration(
        username: String,
        password: String,
        confirmPassword: String
    ): Boolean {
        /**
         * Check for user name, password and confirm passwords
         */
        if (username.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
            return false
        }

        /**
         * Check for unique username
         */
        if (username in existingUsers) {
            return false
        }

        /**
         * Match password and confirm password
         */
        if (password != confirmPassword) {
            return false
        }


        /**
         * Check for minimum 2 digits in password
         */
        if (password.count { it.isDigit() } < 2) {
            return false
        }

        return true
    }
}