import java.util.Scanner
var scn = Scanner(System.`in`)
var input = scn.nextInt()

fun fact(a:Int) : Int{
    var fact = 1
    if(a <= input){
        fact = a * fact(a +1)
    }
    return fact
}
fun main(){
    print("Enter an input: ")
    println("${fact(1)}")
}

