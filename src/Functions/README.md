# Functions
Functions makes code more organized and reusable. In kotlin fun keyword is used for defining a function.
```kotlin
fun foo() {
}
```

Functions can take parameters. A function uses parameters. A caller passes it arguements.
```kotlin
fun foo(param: Int) {
    print(param)
}
foo(5)
//You can call this method only Int type variable
```

Functions can return a value. Also functioncan not return a value. For this situtation Unit type is used. 
```kotlin
fun max(a: Int, b: Int): Int {
    val maxValue = if (a > b) a else b
    return maxValue
}
```

Functions can have single-expression bodies
```kotlin
fun max(a: Int, b: Int): Int  = if (a > b) a else b
```

