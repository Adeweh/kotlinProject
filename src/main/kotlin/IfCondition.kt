fun main(){

        val brand = "Ferrari"
        val brand2 = "Honda"
        val max = if (brand <= brand2){
            println("a is larger than b.")
            brand

        }else{
            println("b is larger than a.")
            brand2

        }
        println("max = $max")

}