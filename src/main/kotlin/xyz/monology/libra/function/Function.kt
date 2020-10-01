package xyz.monology.libra.function

import xyz.monology.libra.ExecutionContext
import xyz.monology.libra.data.Scope
import xyz.monology.libra.data.Value

abstract class Function(
    val parameters: List<String>,
) {
    abstract fun ExecutionContext.execute(localScope: Scope) : Value
}