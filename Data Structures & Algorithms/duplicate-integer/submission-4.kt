class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seenSet = HashSet<Int>()
        for (num in nums) {
            if (num in seenSet) {
                return true
            } 
            seenSet.add(num)
        }
        return false
    }
}
