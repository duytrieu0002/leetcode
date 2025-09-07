package org.example

fun maximumAverageSubArray() {
    //Fixed size sliding window
    val nums = arrayOf(1,12,-5,-6,50,3)
    val k = 4

    var max = 0.0f
    var sum = 0.0f
    for (i in 0..k - 1) {
        sum += nums[i]
    }

    max = sum/k

    for (j in k .. nums.size - 1) {
        sum += nums[j] - nums[j-k]
        if (sum/k > max) {
            max = sum/k
        }
    }

    println(max)
}