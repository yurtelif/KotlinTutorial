package ClassesAndObjects

class Dog(val name: String,var weight_param: Int, breed_param: String) {

    init {
        println("Dog $name has been created")
    }

    var acitivities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("Breed is $breed")
    }

    fun bark() {
        println(if (weight_param < 20) "Yip" else "Woof")
    }

    var weight = weight_param
        set(value) {
            if(value>0) field = value
        }

    val weightInKgs: Double get() = weight_param / 2.2



}