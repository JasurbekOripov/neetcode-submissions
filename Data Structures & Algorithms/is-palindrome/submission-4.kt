class Solution {
    fun isPalindrome(s: String): Boolean {
        val cleaned = s.lowercase().filter{ it.isLetterOrDigit()}
       return cleaned == cleaned.reversed()
    }
}
