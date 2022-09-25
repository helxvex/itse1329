package week03
//Florencio rueda  3.8 Bank Charges 9/22/24
fun main(){
    val baseFee= 10
    var total = 0.0
    print("Enter  number of checks:")
    val numOfChecks = Integer.valueOf(readLine())

    if(numOfChecks < 20 ){
        total = baseFee + numOfChecks * 0.10
    }else if(numOfChecks >=  20 && numOfChecks<= 39){
        total = baseFee + (numOfChecks*0.08)
    }else if (numOfChecks >= 40 && numOfChecks <= 59){
        total = baseFee + (numOfChecks*0.06)
    }else {
        total = baseFee + (numOfChecks * 0.04)
    }
        print("Service fees for the month: $$total")
    }

