package com.example

import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noMethods

@AnalyzeClasses(
    packages = ["com.example"],
)
class MainArchitectureTest {
    @ArchTest
    val noPublicProperties = noMethods().that().haveNameMatching("get\\S+")
        .and().arePublic()
        .should().beDeclaredInClassesThat().haveSimpleNameEndingWith("Controller")
}
