// "class org.jetbrains.kotlin.idea.quickfix.AutoImportFix" "false"
// ERROR: Unresolved reference: SomeTest
// ERROR: Expression expected, but a package name found
// ACTION: Convert property initializer to getter
// ACTION: Create class 'SomeTest'
// ACTION: Replace safe access expression with 'if' expression

package testing

val x = testing?.<caret>SomeTest()
