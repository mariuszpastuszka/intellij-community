// "class org.jetbrains.kotlin.idea.quickfix.AutoImportFix" "false"
// ACTION: Convert property initializer to getter
// ACTION: Create class 'ExcludedClass'
// ACTION: Create function 'ExcludedClass'
// ERROR: Unresolved reference: ExcludedClass

val x = <caret>ExcludedClass()