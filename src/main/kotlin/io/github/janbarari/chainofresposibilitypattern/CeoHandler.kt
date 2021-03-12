package io.github.janbarari.chainofresposibilitypattern

class CeoHandler: Chain {

    private lateinit var _nextChain: Chain

    override fun setNextChain(chain: Chain) {
        this._nextChain = chain
    }

    override fun process(request: JobRequest): Boolean {
        return if (request.minimumHourlySalary < 30) {
            println("Ceo approved, ${request.name} is hired.")
            true
        } else {
            println("Ceo rejected, ${request.name}'s minimum hourly salary is bigger than company rules.")
            return false
        }
    }
}