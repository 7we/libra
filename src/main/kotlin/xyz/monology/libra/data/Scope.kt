package xyz.monology.libra.data

class Scope {
    private val variables = Value()
    private val parents = mutableListOf<Scope>()

    fun align(scope: Scope) {
        parents.add(scope)
    }

    fun set(name: String, value: Value) {
        if (variables.containsKey(name)) {
            return println("[Error] $name is already defined in scope.")
        }

        variables[name] = value
    }

    fun isDefined(name: String): Boolean {
        return variables.containsKey(name)
    }

    fun find(name: String) : Value {
        return variables[name]
            ?: parents.find { it.isDefined(name) }?.find(name)
            ?: error("$name is not defined in scope.")
    }
}