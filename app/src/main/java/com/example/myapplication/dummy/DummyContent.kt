package com.example.myapplication.dummy

import android.content.res.Resources
import android.util.Log
import com.example.myapplication.R
import java.util.ArrayList
import java.util.HashMap


object DummyContent {

    val ITEMS: MutableList<DummyItem> = ArrayList()
    val ITEM_MAP: MutableMap<String, DummyItem> = HashMap()

    private val COUNT = 25


    init {
        // Add some sample items.
        addItem(DummyItem("0", "Apple", "An apple is an edible fruit produced by an apple tree." +
                "Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus." +
                "The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today."))
        addItem(DummyItem("1", "Orange", "The orange is the fruit of various citrus species in the family Rutaceae; it primarily refers to" +
                "        Citrus × sinensis, which is also called sweet orange, to distinguish it from the related Citrus × aurantium, referred" +
                "        to as bitter orange. The sweet orange reproduces asexually; varieties of sweet orange arise through mutations."))
        addItem(DummyItem("2", "Avocado", "The avocado, a tree likely originating from southcentral Mexico, is classified as a member of" +
                "        the flowering plant family Lauraceae. The fruit of the plant, also called an avocado, is botanically a large berry " +
                "        containing a single large seed"))
        addItem(DummyItem("3", "Guava", R.string.Guava.toString()))

    }

    private fun addItem(item: DummyItem) {
        ITEMS.add(item)
        ITEM_MAP.put(item.id, item)
    }

    private fun createDummyItem(position: Int): DummyItem {
        return DummyItem(position.toString(), "Item " + position, makeDetails(position))
    }

    private fun makeDetails(position: Int): String {
        val builder = StringBuilder()
        builder.append("Details about Item: ").append(position)
        for (i in 0..position - 1) {
            builder.append("\nMore details information here.")
        }
        return builder.toString()
    }

    /**
     * A dummy item representing a piece of content.
     */
    data class DummyItem(val id: String, val content: String, val details: String) {
        override fun toString(): String = content
    }
}