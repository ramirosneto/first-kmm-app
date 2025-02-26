package br.com.ramirosneto.kmm.app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform