package com.example.roomlearning

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

open class BaseViewModel<S>(state: S) : ViewModel() {

    private val _state = MutableStateFlow(state)
    val state = _state.asStateFlow()

    protected fun updateState(reducer: (S) -> S) {
        _state.update(reducer)
    }
}