class FindLeader {
    var max = 0
    fun findLeader(intArray: IntArray){
        for(i in 0 until intArray.size ){
            var j:Int =i+1
            for(j in i+1 until intArray.size){
//              max =   Math.max(intArray[i],intArray[j])
                if(intArray[i]<=intArray[j]){
                    break;
                }
            }
            println("max  $max")
            if(j==intArray.size){
               println("${intArray[i]}")
            }
        }
    }

    fun printLeaders(arr: IntArray, size: Int) {
        for (i in 0 until size) {
            var j: Int
            j = i + 1
            while (j < size) {
                if (arr[i] <= arr[j]) {
                    break
                }
                j++
            }
            if (j == size) // the loop didn't break
            {
                print("${arr[i].toString()}  ")
            }
        }
    }
}
fun main(){
    val arr = intArrayOf(16,17,4,3,5,2)
    val findLeader = FindLeader()
    findLeader.printLeaders(arr,arr.size)
}
