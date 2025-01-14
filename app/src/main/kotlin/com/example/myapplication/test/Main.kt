package com.example.myapplication.test

fun main() {
    val component = DaggerAppDaggerComponent.create()
    val instance = component.listComponentFactory({  })
}