package xyz.monology.libra.library

import xyz.monology.libra.function.Function
import xyz.monology.libra.Struct

open class Library(
    val structs: List<Struct>,
    val functions: List<Function>
)