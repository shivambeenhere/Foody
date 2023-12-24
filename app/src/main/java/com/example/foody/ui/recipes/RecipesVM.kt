package com.example.foody.ui.recipes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RecipesVM : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is recipes Fragment"
    }
    val text: LiveData<String> = _text
}