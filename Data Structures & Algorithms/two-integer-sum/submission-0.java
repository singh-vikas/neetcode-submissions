class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length == 2)
            return new int[] {0, 1};

        // Dic Remainder and index
        Map<Integer, Integer> dic = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

             int value = nums[i]; // 3
             int rem = target - value; //4
             
            if (dic.containsKey(rem))
                return new int[] {dic.get(rem), i};  //4 and 3index

            dic.put(value, i);  // 4 and 3 index
        }

        return new int[] {-1};
    }
}
