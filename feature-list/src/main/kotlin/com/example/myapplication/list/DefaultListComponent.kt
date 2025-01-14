package com.example.myapplication.list

import com.example.myapplication.utils.AppScope
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import me.gulya.anvil.assisted.ContributesAssistedFactory

@ContributesAssistedFactory(AppScope::class, ListComponent.Factory::class)
class DefaultListComponent @AssistedInject constructor(
    dep: ListComponentDependency,
    @Assisted private val onItemSelected: (id: String) -> Unit,
) : ListComponent {

    override fun onItemClicked(id: String) {
        onItemSelected(id)
    }
}
