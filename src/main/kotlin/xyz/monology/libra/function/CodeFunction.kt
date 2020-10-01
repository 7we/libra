package xyz.monology.libra.function

import xyz.monology.libra.ExecutionContext
import xyz.monology.libra.data.Scope
import xyz.monology.libra.data.Value

open class CodeFunction(parameters: List<String>) : Function(parameters) {
    override fun ExecutionContext.execute(localScope: Scope): Value {
        return null!!
    }
}