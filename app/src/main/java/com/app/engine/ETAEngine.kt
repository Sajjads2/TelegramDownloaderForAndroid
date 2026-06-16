package com.app.engine

object ETAEngine {

    fun estimate(remaining: Long, speed: Long): String {
        if (speed <= 0) return "--"
        val sec = remaining / speed
        return "${sec / 3600}h ${(sec % 3600) / 60}m"
    }
}
