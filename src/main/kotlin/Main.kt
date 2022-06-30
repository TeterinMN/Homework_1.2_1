/**
 * Что нужно сделать: напишите небольшую программу, в которой в переменной amount хранится сумма перевода в копейках.
 * Ваше приложение должно высчитывать комиссию, которую заплатит пользователь при переводе — комиссия также должна быть
 * в копейках.
 * За переводы с любых карт комиссия 0.75%, минимум 35 рублей
 */

fun main(){
    val amount = 108_000
    val amountRub = amount / 60
    val percentMin = 2_100
    val percentMinRub = percentMin / 60
    val result = amount * 0.75 / 100
    val resultRub = result / 60
    println()
    println("Сумма перевода составляет $amount копеек ($amountRub рублей)")
    if (result <= percentMin) {
        println("Взята минимальная комиссия  $percentMin копеек ($percentMinRub рублей) ")
    } else {
        println("Процент от суммы перевода составил $result копеек ($resultRub рублей)")
    }
}