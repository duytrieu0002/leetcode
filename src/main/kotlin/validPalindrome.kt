package org.example

fun validPalindrome(): Boolean {
    val s = ".,"

    var l = 0
    var r = s.length - 1

    if (s.length == 1) return true

    while (l < r) {
        while (l < r && !s[l].isLetterOrDigit()) {
            l++
        }

        while (l < r && !s[r].isLetterOrDigit()) {
            r--
        }



        if (s[l].lowercaseChar() != s[r].lowercaseChar()) return false
        l++
        r--
    }
    return true
}
