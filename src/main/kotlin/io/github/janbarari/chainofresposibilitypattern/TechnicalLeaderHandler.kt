package io.github.janbarari.chainofresposibilitypattern

class TechnicalLeaderHandler: Chain {

    private lateinit var _nextChain: Chain

    override fun setNextChain(chain: Chain) {
        this._nextChain = chain
    }

    override fun process(request: JobRequest): Boolean {
        return if (request.totalHoursSpendOnCoding > 190) {
            println("Technical leader approved, job request moves to next unit.")
            _nextChain.process(request)
            true
        } else {
            println("Technical leader rejected, ${request.name}'s total time spent for coding is less than rules of the company.")
            false
        }
    }


}