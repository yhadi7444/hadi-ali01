package com.example.pc10

interface Destinations {
    val Route:String
}
object Home: Destinations {
    override val Route = "Home"
}
object Second: Destinations {
    override val Route = "Second/{username}"
}