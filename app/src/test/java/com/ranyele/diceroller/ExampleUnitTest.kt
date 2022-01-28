package com.ranyele.diceroller

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun generate_numbers() {
        val dice = Dice(sides = 6)
        val rollResult = dice.roll()
        assertTrue("Value not in range", rollResult in 1..6)
    }
}