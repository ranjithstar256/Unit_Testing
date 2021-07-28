package com.svbneelmane.learn.unittesting

import android.content.Context
import android.util.Log
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class ResourceComparerTest {

    private lateinit var resourceComparer: ResourceComparer

    /**
     * Run before each test
     */
    @Before
    fun setup() {
        resourceComparer = ResourceComparer()
    }

    @Test
    fun validateResourceString_returnTrue() {
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceComparer.isEqual(context, R.string.app_name, "Unit Testing")
        assertThat(result).isTrue()
    }

    @Test
    fun validateResourceString_returnFalse() {
        val context = ApplicationProvider.getApplicationContext<Context>()

        val result = resourceComparer.isEqual(context, R.string.app_name, "Unit")
        assertThat(result).isFalse()
    }

    /**
     *
     */
    @After
    fun done() {
        Log.d("D/ResourceComparerTest","Done..")
    }
}