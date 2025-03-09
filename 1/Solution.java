import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int x = target - nums[i];
            if (hashMap.containsKey(x)) {
                return new int[]{hashMap.get(x), i};
            }
            hashMap.put(x, i);
        }
        return null;
    }
}