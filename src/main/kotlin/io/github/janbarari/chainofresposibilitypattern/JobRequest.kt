package io.github.janbarari.chainofresposibilitypattern

data class JobRequest(
        val age: Int,
        val name: String,
        val totalHoursSpendOnCoding: Int,
        val minimumHourlySalary: Int
)