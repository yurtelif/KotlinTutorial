In order to create variable, the compiler needs to know 3 things
* What the variable's name is
* Whether or not the variable can be reused(val or var)
* What type of variable it is

# Integers 

1. Byte 8 bits
2. Short 16 bits
3. Int 32 bits
4. 64bits 

> binary number : x = 0b10
> hexadecimal number : y = 0xAB
> octal numbers aren't supported

# Floating points

Float can gols 32 bits, Doubles can hold 64 bits

```kotlin
var x = 123.4
var xFloat = 123.4F
```

# Booleans

Can be true or false
```kotlin
var isSelected = true
var isPremium = false
```

# Characters and Strings 

* Char variables are for single characters
* String variables are used to hold multiple characters

```kotlin
var letter = 'A'
var string = "String"
```

# Explicitly declare a variable
```kotlin
var age: Int = 15
```

In kotlin numbers are not primitives, they are objects so variables holds a reference to the object. Also char is not primitives as numbers, Chars in Kotlin are characters.

