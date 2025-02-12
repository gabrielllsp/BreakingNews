package com.gabriel.breakingnews

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform