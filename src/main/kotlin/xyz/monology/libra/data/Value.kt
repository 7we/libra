package xyz.monology.libra.data

open class Value : MutableMap<String, Value> by mutableMapOf()