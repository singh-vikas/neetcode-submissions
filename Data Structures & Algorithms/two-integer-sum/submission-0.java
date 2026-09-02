class Solution {
    public int[] twoSum(int[] nums, int target) {

     Map<Integer, Integer> visited = new HashMap<Integer, Integer>();

     for (int i=0 ; i < nums.length; i++) {

         int c = target - nums[i];

          if(visited.containsKey(c))
             return new int[]{visited.get(c), i}; 
         
         visited.put(nums[i], i);    
     }
  
     return new int[]{-1,-1};
    }
}


// 3+4=7
//  7 - 3 -> 4

//n2 and no extra storage
//



