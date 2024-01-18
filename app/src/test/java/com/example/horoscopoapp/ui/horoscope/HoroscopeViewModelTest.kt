package com.example.horoscopoapp.ui.horoscope

import com.example.horoscopoapp.data.provider.HoroscopeProvider
import com.example.horoscopoapp.domain.model.HoroscopeInfo
import com.example.horoscopoapp.motherObject.HoroscopeMotherObject.horoscopeInfoList
import io.mockk.MockKAnnotations
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class HoroscopeViewModelTest{

    @MockK
    lateinit var horoscopeProvider: HoroscopeProvider

    private lateinit var viewModel: HoroscopeViewModel
    @Before
    fun setUp(){
        MockKAnnotations.init(this, relaxUnitFun = true)
    }

    @Test
    fun `when viewmodel is created then horoscopes are loaded`(){
        every { horoscopeProvider.getHoroscopes() } returns horoscopeInfoList
        viewModel = HoroscopeViewModel(horoscopeProvider)

        val horoscopes: List<HoroscopeInfo> = viewModel.horoscope.value

        assertTrue(horoscopes.isNotEmpty())
    }
}