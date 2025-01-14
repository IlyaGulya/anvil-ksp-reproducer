package com.example.myapplication.test

import com.example.myapplication.list.ListComponent
import com.example.myapplication.utils.AppScope
import com.squareup.anvil.annotations.MergeComponent
import com.squareup.anvil.annotations.optional.SingleIn

@SingleIn(AppScope::class)
@MergeComponent(AppScope::class)
interface AppDaggerComponent {

    val listComponentFactory: ListComponent.Factory
}
