package com.arjun.sdui.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.arjun.sdui.data.choiceResponse
import com.arjun.sdui.data.model.Choice
import com.google.gson.Gson
import kotlinx.coroutines.flow.MutableStateFlow

class ChoiceViewModel : ViewModel() {
    val response = MutableStateFlow(Gson().fromJson(choiceResponse, Choice::class.java))


}