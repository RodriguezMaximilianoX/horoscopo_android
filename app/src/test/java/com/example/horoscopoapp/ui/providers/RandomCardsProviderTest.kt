package com.example.horoscopoapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardsProviderTest {

    @Test
    fun `getRandomCard should return a random card`(){
        //Given
        val randomCardsProvider = RandomCardsProvider()

        //When
        val randomCard = randomCardsProvider.getLucky()

        //Then
        assertNotNull(randomCard)
    }

}