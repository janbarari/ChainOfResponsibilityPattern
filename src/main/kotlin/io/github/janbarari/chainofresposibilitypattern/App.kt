package io.github.janbarari.chainofresposibilitypattern

object App {

    fun main() {
        val jobRequest = JobRequest(
                24,
                "Mehdi",
                192,
                29
        )
        val humanResourceHandler = HumanResourceHandler()
        val technicalLeaderHandler = TechnicalLeaderHandler()
        val ceoHandler = CeoHandler()
        humanResourceHandler.setNextChain(technicalLeaderHandler)
        technicalLeaderHandler.setNextChain(ceoHandler)
        humanResourceHandler.process(jobRequest)
    }

}

fun main() {
    App.main()
}