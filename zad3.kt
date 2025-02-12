fun main(){
    try {
        println("Введите ваш возраст")
        var year = readln().toInt()
        when (year) {
            in 0..2 -> println("Младенец")
            in 3..13 -> println("Ребенок")
            in 14..19 -> println("подросток")
            in 20..50 -> println("Взрослый")
            in 51..120 -> println("Старик")
            else -> println("Не верный возраст")
        }
    }catch (e:Exception){
        println("Нев верный формат")
    }
}