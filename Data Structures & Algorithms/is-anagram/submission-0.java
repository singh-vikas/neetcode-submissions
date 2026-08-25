class Solution {
    public boolean isAnagram(String s, String t) {

if (s.length() != t.length()) {
    return false;
}
        //Frquency 
        int[] chars = new int[26];

       // Build Frquency of first
      for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            chars[c - 'a']++;
        } 

       // Deduce with second
        for(int i = 0 ; i < t.length(); i++){
            char c = t.charAt(i);
            chars[c - 'a']--;
        }

        // check if any distinct.
        for (int count : chars) {
            if( count != 0) 
                return false ;
        } 
            
    return true;
    }
}


//Angrams Only 2 strings

// 1. Storage is constraint: Sorting -> n log n and no extra space.
// 2. Execution : HashSet with one string and check if other string has all the chars in has set adnd remove it . Set size will be 0. then anagram.
// 3. Fixed 26 letter array. and mark letters as 1 and remoev them. At the end Array will have all Zero then Anagram.  