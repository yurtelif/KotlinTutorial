# Classes and Objects

Classes are templates that allow you to create your own types ob objects.

* Properties: the things each object knows about itself
* Functions: the things each object can do

A funciton that's defined inside a class is called a member funciton. It's sometimes called a method.

You can create a Dog object and access properties and functions. 
```kotlin
var myDog = Dog("Fido", 70, "Mixed")
myDog.name
myDog.bark()
```

Every class contains a constructor that's need to initialize an object. A constructor runs when you instantiate an object. It's used to define properties and initalize them.

Primary constructor example.
```kotlin
class Dog(val name: String,var weight_param: Int, breed_param: String) 
```