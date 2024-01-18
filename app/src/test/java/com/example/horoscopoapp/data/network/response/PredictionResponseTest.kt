package com.example.horoscopoapp.data.network.response

import com.example.horoscopoapp.motherObject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Test

class PredictionResponseTest {
    @Test
    fun `toDomain should return correct PredictionModel`() {
        //Given
        val horscopeResponse = anyResponse

        //When
        val predictionModel = horscopeResponse.toDomain()

        //Then
        predictionModel.sign shouldBe horscopeResponse.sign
        predictionModel.horoscope shouldBe horscopeResponse.horoscope
    }
}