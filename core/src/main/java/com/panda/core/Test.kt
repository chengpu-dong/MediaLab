package com.panda.core

/**
 *
 * @author: dongchengpu
 * @date: 2023/2/7
 * @desc: //TODO
 * @version:1.0
 */
object Test {
    fun init(){
        System.loadLibrary("core")
    }

    external fun getString():String

    external fun getFFmpegInfo():String
}