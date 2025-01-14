package com.example.myapplication.list

import com.example.myapplication.utils.MyAnnotation

@MyAnnotation
interface ListComponent {

    fun onItemClicked(id: String)

    fun interface Factory {
        operator fun invoke(
            onItemSelected: (id: String) -> Unit,
        ): ListComponent
    }
}
