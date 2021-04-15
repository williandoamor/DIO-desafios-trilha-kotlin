fun main(args: Array<String>) {
    
    var input: Int = System.`in`.bufferedReader().readLine()!!.toInt()
    for (input in 1..input){
      if (calcularMod(input) > 0) {
        
        println(input)
        
      } 
    }
  }
    
    
    fun calcularMod(number: Int):Int  =  (number % 2) 
