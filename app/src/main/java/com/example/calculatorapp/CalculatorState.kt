package com.example.calculatorapp

/**
 * Created by Patrick Adutwum on 21/11/2022.
 */
data class CalculatorState(
    val number1: String = "",
    val number2: String = "",
    val operation: CalculatorOperation? = null
)
