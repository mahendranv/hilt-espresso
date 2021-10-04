package com.ex2.hiltespresso.sample

import javax.inject.Inject

class Engine @Inject constructor() {

    fun start() {
        println("Engine.start")
    }

    fun stop() {
        println("Engine.stop")
    }
}