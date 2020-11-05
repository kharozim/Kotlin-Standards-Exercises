package dayfour

import java.lang.StringBuilder

fun palindromeCheck(inputStr: String): Boolean {
    val stringBuilder = StringBuilder(inputStr)
    val reverseStr = stringBuilder.reverse().toString()
    return inputStr.equals(reverseStr, ignoreCase = true)
}

fun main() {
    print("kata string : ")
    val input: String = readLine().toString()
    if (palindromeCheck(input)) {
        println(true)
    } else {
        println(false)
    }
}

//fun main() {
//    print("masukan kata : ")
//    val text = readLine().toString()
//    print(isPalindrome(text))
//}
//
//fun isPalindrome(text: String): Boolean = removeSymbols(text)
//    .equals(removeSymbols(text)
//        .toCharArray()
//        .reversed()
//        .joinToString(""), ignoreCase = true)
//
//fun removeSymbols(text: String): String = text
//    .toCharArray()
//    .filter { it.isLetterOrDigit() }
//    .joinToString("")