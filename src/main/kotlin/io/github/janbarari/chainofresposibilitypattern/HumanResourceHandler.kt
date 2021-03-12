package io.github.janbarari.chainofresposibilitypattern

class HumanResourceHandler: Chain {

    private lateinit var _nextChain: Chain

    override fun setNextChain(chain: Chain) {
        this._nextChain = chain
    }

    override fun process(request: JobRequest): Boolean {
        return if (request.age > 22) {
            println("Human resource approved, job request moves to next unit.")
            _nextChain.process(request)
            true
        } else {
            println("Human resource rejected, ${request.name}'s age is smaller than rules of the company.")
            false
        }
    }

}