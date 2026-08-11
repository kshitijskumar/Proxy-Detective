package org.example.project.proxydetective

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform