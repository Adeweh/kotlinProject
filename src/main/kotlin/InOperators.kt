fun main(args: Array<String>){
    val numbers = intArrayOf(1, 4, 42, -3)
    if(4 in numbers){
        println("numbers array contains 4.")
    }

    val names = arrayOf("Dorcas", "Priest", "Abigail", "Jummy")
    if("Priest" in names){
        println("names array contains Priest.")
    }
}