fun main(){
    println("Digite sua Altura:")
    var altura: Float = readLine()!!.toFloat()

    println("Digite seu peso:")
    var peso:Int = readLine()!!.toInt()
    var IMC = peso/ (altura * altura)

    println("Seu IMC e:$IMC")

}