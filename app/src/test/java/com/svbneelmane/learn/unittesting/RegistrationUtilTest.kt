package com.svbneelmane.learn.unittesting

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "",
            "valid123",
            "valid123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `valid user name and correctly repeated password returns true`() {
        val result = RegistrationUtil.validateRegistration(
            "Phillip",
            "valid123",
            "valid123"
        )

        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Cal",
            "valid123",
            "valid123"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Cal",
            "",
            ""
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `password with less than 2 digits returns false`() {
        val result = RegistrationUtil.validateRegistration(
            "Cal",
            "valid",
            "valid"
        )

        assertThat(result).isFalse()
    }

}