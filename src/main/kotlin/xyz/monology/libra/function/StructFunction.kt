package xyz.monology.libra.function

abstract class StructFunction(
    parameters: List<String>
) : Function(listOf("this") + parameters)