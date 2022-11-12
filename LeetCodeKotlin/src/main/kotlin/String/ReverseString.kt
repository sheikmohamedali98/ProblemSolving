package String

import java.util.*

class ReverseString {
    fun reverse(string:String):String{

        var start = 0
         var end = string.length - 1
        var charArray = string.toCharArray()
        while(start<end){

            var temp:Char =  charArray[start]
            charArray[start] = charArray[end]
            charArray[end] = temp
            start++
            end--

        }
        println(charArray.contentToString())
        var word:String = charArray.toString()

//        print(word)
        return word

    }


    fun reverseString(string: String){
        val stack = Stack<Char>()
        var str:String = ""
        for(i in 0 until  string.length){
            stack.push(string.get(i))
        }
        while (!stack.empty()){
//            str += stack.pop().toString()

            print("${stack.pop()}")
        }
//        println(str)
    }
}

fun main(){
    val reverseString = ReverseString()
    reverseString.reverse("Hello")
println()
    reverseString.reverseString("java")
}