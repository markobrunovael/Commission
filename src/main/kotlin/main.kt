fun main(){
    val commission =  0.75
    val minCommission = 35
    val amount = 20000

    var result = amount * commission/100
    if (result<35){
        result = minCommission.toDouble()
    }
    println(result)
}
