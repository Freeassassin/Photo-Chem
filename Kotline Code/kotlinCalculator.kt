val ADD : String = "+"
val SUBTRACT = "-"
val MULTIPLY = "*"
val DIVIDE = "/"

val ERROR_MESAGE = "errors have occurd cunt"

val testOperandOne = 5.0
val testOperandTwo = 4.0

fun main (args: Array<String>)
{
	val operatorSymbol = args[0]

	start(operatorSymbol)
}

fun start(operatorSymbol : String) 
{
	if (checkArguemnts(operatorSymbol)) 
	{
		displayResult(evaluateBinomial(testOperandOne, testOperandTwo, operatorSymbol))
	} 
	else
	{
		displayResult(ERROR_MESAGE)
	}

}
fun displayResult(result : String) = System.out.println(result)
fun evaluateBinomial(testOperandOne : Double, testOperandTwo: Double, sym:String) : String
{
	return when (sym)
	{
		ADD ->  (testOperandOne + testOperandTwo).toString()
		SUBTRACT ->  (testOperandOne - testOperandTwo).toString()
		MULTIPLY ->  (testOperandOne * testOperandTwo).toString()
		DIVIDE ->  (testOperandOne / testOperandTwo).toString()

		else ->  ERROR_MESAGE
	}	
}
fun checkArguemnts(operatorSymbol : String) : Boolean
{
	return when (operatorSymbol)
	{
		ADD ->  true
		SUBTRACT ->  true
		MULTIPLY ->  true
		DIVIDE ->  true

		else ->  false
	}
}