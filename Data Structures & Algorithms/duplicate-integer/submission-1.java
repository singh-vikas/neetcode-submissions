class Solution {
    public boolean hasDuplicate(int[] nums) {
       
       if( nums.length == 0 || nums.length == 1)
          return false;

      Set<Integer> dic = new HashSet<>();

      for (int num: nums){
            if(dic.contains(num)) 
                return true;
            dic.add(num);
      } 

    return false;
    }
}