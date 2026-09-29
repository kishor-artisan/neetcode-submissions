class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        val seenSet = HashSet<Int>()
        for (i in nums.indices) {
            if (seenSet.contains(nums[i])) {
                return true
            } 
            seenSet.add(nums[i])
        }
        return false
    }
}
