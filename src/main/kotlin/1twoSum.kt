package org.example

fun twoSum() {
    //hashmap
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val map = HashMap<Int, Int>()


    for ((index, value) in nums.withIndex()) {
        println("$index, $value")
        //value  = 2, complement = 9-2=7
        val complement = target - value
        if (map.containsKey(complement)) {
            println(intArrayOf(index, map[complement]!!))
        }

        //add value,index in map -> map[2] = 0, map[7] = 1, map[11] = 2, map[15] = 3
        map[value] = index
    }
}