class temperatureConvertor {
    companion object {

        fun celsiusToFahrenheit(celsius: Double): Double {
            return celsius * 9 / 5 + 32
        }

        fun fahrenheitToCelsius(fahrenheit: Double): Double {
            return (fahrenheit - 32) * 5 / 9
        }
    }
}

 fun main() {
    var celsiusTemp = 33.3
    var fahrenheitTemp = temperatureConvertor.celsiusToFahrenheit(celsiusTemp)
    celsiusTemp = temperatureConvertor.fahrenheitToCelsius(fahrenheitTemp)


    println("$celsiusTemp degrees celsius is $fahrenheitTemp degrees in fahrehiet")
    println("$fahrenheitTemp degrees celsius is $celsiusTemp degrees in fahrehiet")


    
}