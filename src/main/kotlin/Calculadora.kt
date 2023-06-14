class Calculadora:Calculavel {

    override fun somar(vararg numbers: Double):Double {
        var resultado:Double= 0.0
        for(number in numbers){
            resultado+=number
        }
        return resultado
    }

    override fun subtrair(firstNumber:Double, vararg numbers: Double): Double {
        var resultado=firstNumber
        for(number in numbers){
            resultado-=number
        }
        return resultado
    }

    override fun multiplicar(firstNumber:Double, vararg numbers: Double): Double {
        var resultado=firstNumber
        for(number in numbers){
            resultado*=number
        }
        return resultado
    }

    override fun dividir(firstNumber:Double, vararg numbers: Double): Double {
        var resultado=firstNumber
        for(number in numbers){
            resultado/=number
        }
        return resultado
    }

}