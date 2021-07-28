package com.svbneelmane.learn.unittesting

/**
 * Resource Comparer class created for unit test
 * Uses android application's context for getting the string resource
 * @author Shivaprasad Bhat
 */
import android.content.Context

class ResourceComparer {
    /**
     * Method that compares the sting and a resource from the context
     */

    fun isEqual(context: Context, resId: Int, string: String): Boolean {
        return context.getString(resId) == string
    }

}