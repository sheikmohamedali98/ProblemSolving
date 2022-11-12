package String

class Frequenciesinorderofoccurrence {
    fun findFrequency(string: String){
        val  frequency = IntArray(26)
        for(i in 0 until string.length){
            frequency[string.get(i)-'a']++
        }
        for(i in 0 until string.length){
            if(frequency[string.get(i)-'a']!= 0){
                print(string.get(i))
                print("${frequency[string.get(i)-'a']}")
                frequency[string.get(i)-'a'] = 0
            }
        }
    }
}
fun main(){
    val frequenciesinorderofoccurrence =  Frequenciesinorderofoccurrence()
    frequenciesinorderofoccurrence.findFrequency("java")
}