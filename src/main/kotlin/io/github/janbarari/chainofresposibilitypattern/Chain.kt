package io.github.janbarari.chainofresposibilitypattern

interface Chain {
    fun setNextChain(chain: Chain)
    fun process(request: JobRequest): Boolean
}