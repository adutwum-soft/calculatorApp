package com.example.calculatorapp

/**
 * Created by Patrick Adutwum on 21/11/2022.
 */
sealed class CalculatorOperation(val symbol: String){
	 object Add: CalculatorOperation("+")
	 object Subtract: CalculatorOperation("-")
	 object Multiply: CalculatorOperation("x")
	 object Divide: CalculatorOperation("/")
}
