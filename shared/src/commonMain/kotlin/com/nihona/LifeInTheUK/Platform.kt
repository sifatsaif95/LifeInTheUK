package com.nihona.LifeInTheUK

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform