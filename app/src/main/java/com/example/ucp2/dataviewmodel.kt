package com.example.ucp2

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class dataviewmodel : ViewModel() {
    private val _stateUI = MutableStateFlow(dataviewmodel())
    val stateUi: StateFlow<dataviewmodel> = _stateUI.asStateFlow()

    fun datadiri(list : MutableList<String>) {
        _stateUI.update { stateSaatIni ->
            stateSaatIni.copy(
                nama = list[0],
                nim = list[1],
                konsentrasi = list[2],
                judul = list[3]
            )
        }
    }
    fun pildosen(pildosen: String) {
        _stateUI.update { stateSaatIni -> stateSaatIni.copy(dosen = pildosen) }
    }
}


