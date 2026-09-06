class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Left product
        // formula -> lp[i] = lp[i-1] * num[i-1]
        int len =nums.length;

        int[] ans = new int[len];

        ans[0] = 1;
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
            // 1, 1, 2, 8
        }

        // right product
        // formula -> rp = suffixRightProduct * lp[i]

        int suffix = 1;
        for (int i = len - 1; i >= 0; i--) {
            ans[i] = suffix * ans[i];
            suffix = suffix * nums[i];
        }

        return ans;
    }
}
