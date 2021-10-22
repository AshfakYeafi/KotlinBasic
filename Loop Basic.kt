fun main(){
    /** While loop
     *  while(condition is true){
     *      task
     *  }
     */
    println("While Loop")
    var i:Int=1
    while (i<6){
        println(i)
        i++
    }

    println("===============.............===============")

    i=1
    /**
     * do-while loop
     * do{
     *     task
     * } while(condition is true)
     */
    println("do-while loop")
    do {
        println(i)
        i++
    } while (i<6)

    println("===============.............===============")
    println("Range")
    /**
     *  a..b means a to b( b included)
     *  a until b means a to b (b excluded)
     *  (a..b step x) means a to b with x difference
     *  a downTo b means a to b inversely
     */
    /** for loop
     * for (i in something){
     *  task
     *  }
     */
    var rangeNum=1..5
    for (i in rangeNum){
        println(i)
    }
    println("\n")
    for (i in rangeNum step 2){
        println(i)
    }
    for(i in 1 until 10){
        println(i)
    }
    println("\n")
    for(i in 16 downTo 1 step 3){
        println(i)
    }
}