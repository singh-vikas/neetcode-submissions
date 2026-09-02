class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Fre Map
        Map<Integer, Integer> freMap=new HashMap<>();
        for (int num: nums){
            freMap.put(num, freMap.getOrDefault(num,0) + 1); 
        }

        //  1 - 1
        //  2 - 1
     
        List<Integer>[] buckets = new List[nums.length +1];
        for ( Map.Entry<Integer, Integer> entry : freMap.entrySet()){
               int num = entry.getKey();
               int fre = entry.getValue();
               if (buckets[fre] == null){
                 buckets[fre] = new ArrayList<>();
               }
               buckets[fre].add(num);  // 0 -> null, 1 -> [1][2], 2 -> null // 
        }

        int[] res = new int[k];
        int index = 0;
        
        for(int i = buckets.length -1; i>=1 && index < k; i-- ){
           
           if(buckets[i] == null) continue;

          for(int bucket: buckets[i]){
            res[index++] = bucket;
            if(index == k) break;
          }   
        }

    return res;
    }
}


// 1 2 3 4 5
// Sorted -> Key ; Freq Map key -> Values ; We know based on the values which is top 3.

// n log n
// Map -> n 

// O k

// PQ  of size k and sort them by frequency.
// n log k

// Fre map 
// Create a new Array with frequencies linking them with the map.


