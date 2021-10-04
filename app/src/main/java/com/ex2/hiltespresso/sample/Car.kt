package com.ex2.hiltespresso.sample

import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine) {

    fun start() = engine.start()

    fun stop() = engine.stop()

}