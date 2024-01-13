package com.example.horoscopoapp.ui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LuckyModel (
   @DrawableRes val image: Int, //DrawableRes obliga a pasar una referencia de un drawable
   @StringRes val text: Int //StringRes obliga a pasar una referencia de un string
)