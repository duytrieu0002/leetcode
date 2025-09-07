package org.example

fun longestSubstringWithoutRepeatingChars() {
    val s = "abcabcbb"

    val set = mutableSetOf<Char>()
    var left = 0
    var maxLength = 0

    for (right in 0 .. s.length -1 ) {
        while (s[right] in set) {
            set.remove(s[left])
            left ++
        }
        set.add(s[right])
        if (set.size > maxLength) {
            maxLength = set.size
        }
    }
    println(maxLength)
}