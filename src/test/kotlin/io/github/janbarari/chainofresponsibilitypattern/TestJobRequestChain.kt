package io.github.janbarari.chainofresponsibilitypattern

import io.github.janbarari.chainofresposibilitypattern.CeoHandler
import io.github.janbarari.chainofresposibilitypattern.HumanResourceHandler
import io.github.janbarari.chainofresposibilitypattern.JobRequest
import io.github.janbarari.chainofresposibilitypattern.TechnicalLeaderHandler
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestJobRequestChain {

    lateinit var jobRequest: JobRequest
    lateinit var humanResourceHandler: HumanResourceHandler
    lateinit var technicalLeaderHandler: TechnicalLeaderHandler
    lateinit var ceoHandler: CeoHandler

    @BeforeAll
    fun setup() {
        jobRequest = JobRequest(
                24,
                "Mehdi",
                192,
                29
        )
        humanResourceHandler = HumanResourceHandler()
        technicalLeaderHandler = TechnicalLeaderHandler()
        ceoHandler = CeoHandler()

        humanResourceHandler.setNextChain(technicalLeaderHandler)
        technicalLeaderHandler.setNextChain(ceoHandler)

    }

    @Test
    fun testHumanResource() {
        Assertions.assertEquals(true, humanResourceHandler.process(jobRequest))
    }

    @Test
    fun testTechnicalLeader() {
        Assertions.assertEquals(true, technicalLeaderHandler.process(jobRequest))
    }

    @Test
    fun testCeo() {
        Assertions.assertEquals(true, ceoHandler.process(jobRequest))
    }

}