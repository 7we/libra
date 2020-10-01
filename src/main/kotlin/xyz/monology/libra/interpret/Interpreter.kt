package xyz.monology.libra.interpret

import xyz.monology.libra.ExecutionContext
import xyz.monology.libra.data.Scope
import xyz.monology.libra.data.Value

inline class Interpreter(val context: ExecutionContext) {
    fun interpret(code: String, localScope: Scope): Value {

    }
}