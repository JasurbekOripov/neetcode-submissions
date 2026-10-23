class Solution {
    fun isPalindrome(s: String): Boolean {
        val newStr = s.filter{ it. isLetterOrDigit()}.lowercase()
        val l = newStr.length
        for (i in 0 until l/2){
            if(newStr[i]!=newStr[l-i-1]){
                return false
            }
        }
        return true
    }
}
