fun main(){
    try {
    println("Введите x")
    var x = readln().toDouble()
    var F=1.2

    when{
        x<3.2 -> F = -(Math.pow(x,4.0))+9
        x>=3.2 -> F = (54*(Math.pow(x,4.0)))/(-5*(Math.pow(x,2.0))+7)
    }
    println(F)
    }catch (e:Exception){
        println("Не верный формат")
    }
}
//9 5