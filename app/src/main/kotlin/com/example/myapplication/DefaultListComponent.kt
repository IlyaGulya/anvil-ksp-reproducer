package com.example.myapplication

import dagger.assisted.Assisted
import dagger.assisted.AssistedFactory
import dagger.assisted.AssistedInject

class DefaultListComponent @AssistedInject constructor(
    dep: ListComponentDependency,
    @Assisted private val onItemSelected: (id: String) -> Unit,
) : ListComponent {

    @AssistedFactory
    interface Factory {
        fun invoke(onItemSelected: (String) -> Unit): DefaultListComponent
    }
}