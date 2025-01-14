package com.example.myapplication.test

fun main(args: Array<String>) {
    val component = DaggerAppDaggerComponent.create()
    val instance = component.listComponentFactory({  })
}