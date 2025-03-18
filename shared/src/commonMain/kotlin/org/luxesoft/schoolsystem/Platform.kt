package org.luxesoft.schoolsystem

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform