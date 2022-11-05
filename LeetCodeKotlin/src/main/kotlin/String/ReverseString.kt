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
        println(Arrays.toString(charArray))
        var word:String = charArray.toString()

        print(word)
        return word

    }
}

fun main(){
    val reverseString = ReverseString()
    print("${reverseString.reverse("Hello")}")
}