class Solution {
    fun isValid(s: String): Boolean {
        if(s.length % 2 != 0) return false
        var stack = Stack<Char>()

        for(i in s){
        val needed = when(i){
            ')' -> '('
            '}' -> '{'
            ']' -> '['
            else -> null
        }
        if(needed == null) {
            stack.push(i)
            }
        else {
            if(stack.removeLastOrNull() != needed) return false
        }
        }
        return stack.isEmpty()
    }
}