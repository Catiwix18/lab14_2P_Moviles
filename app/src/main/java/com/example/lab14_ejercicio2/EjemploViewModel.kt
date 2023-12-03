package com.example.lab14_ejercicio2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class EjemploViewModel: ViewModel() {
    var mensaje by mutableStateOf("")

    fun getRadiationLevel() {
        viewModelScope.launch {
            mensaje = "Solicitando información del clima..."
            delay(10000)
            val radiationLevel = (5..10).random().toDouble()
            mensaje = "El nivel de radiación es $radiationLevel rems"
        }
    }
}