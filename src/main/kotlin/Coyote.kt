class Coyote : Canis() {

    override fun vocalize() {
        println("Yip yip!")
    }

    override fun hunt() {
        println("The coyote is chasing a roadrunner.")
    }

    companion object {

        fun describe() {
            println("Coyote")
        }
    }
}