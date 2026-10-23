class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        for(i in 0 until nums.size){
            for(j in i+1 until nums.size){
               if(nums[j]==nums[i]){
                return true
                }
            }
        }
            return false
    }
}
