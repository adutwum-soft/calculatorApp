package com.example.calculatorapp

/**
 * Created by Patrick Adutwum on 21/11/2022.
 */
sealed class CalculatorAction{
	data class Number(val number: Int): CalculatorAction()
	object Clear: CalculatorAction()
	object Delete: CalculatorAction()
	object Decimal: CalculatorAction()
	object Calculate: CalculatorAction()

	data class Operation(val operation: CalculatorOperation): CalculatorAction()

}
