package ClassesAndObjects

class Dog(val name: String,var weight_param: Int, breed_param: String) {

    init {
        println("Dog $name has been created")
    }

    //flexibility property initialization
    var acitivities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    //initializer blocks are executed after objects is created, after the constructor is called.
    init {
        println("Breed is $breed")
    }

    fun bark() {
        println(if (weight_param < 20) "Yip" else "Woof")
    }

    //custom setter
    var weight = weight_param
        set(value) {
            if(value>0) field = value
        }

    //custom getter
    val weightInKgs: Double get() = weight_param / 2.2

}