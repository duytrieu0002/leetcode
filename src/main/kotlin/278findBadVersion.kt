package org.example

fun findBadVersion() {
    val n = 100
    var left = 1
    var right = n
    var answer = -1

    while (left <= right) {
        //(left+right)/2 = (left + left + right - left)/2 = left + (right - left)/2 -> no overflow

        var mid = left + (right - left)/2
        if (isBadVersion(mid)) {
            answer = mid
            right = mid - 1
        } else {
            left = mid + 1
        }
    }

    println(answer)
}

fun isBadVersion(n: Int): Boolean {return true}