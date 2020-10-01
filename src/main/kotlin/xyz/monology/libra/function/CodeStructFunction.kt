package xyz.monology.libra.function

import xyz.monology.libra.ExecutionContext
import xyz.monology.libra.data.Scope
import xyz.monology.libra.data.Value
import xyz.monology.libra.interpret.Interpreter

class CodeStructFunction(
    parameters: List<String>,
    private val code: String
) : StructFunction(listOf("this") + parameters) {
    override fun ExecutionContext.execute(localScope: Scope): Value {
        return Interpreter(this).interpret(code, localScope)
    }
}