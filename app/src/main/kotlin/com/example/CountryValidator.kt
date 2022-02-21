package com.example

object CountryValidator {
    fun failOnDuplicatedIso(countries: List<Country>) {
        val duplicatedIso = countries.groupingBy { it.iso }
            .fold(0) { count, _ -> count + 1 }.filterValues { it > 1 }
            .keys
        if (duplicatedIso.isNotEmpty()) {
            error("duplicates")
        }
    }
}
