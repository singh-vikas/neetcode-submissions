class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString(); // <length>#<content> , 0#.  3#ABC444#ABCD
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {
            
            // find the length so you cn cut it or substring it.
            int j = i;

            while (str.charAt(j) != '#') {
              j++;
            }

            int len = Integer.parseInt(str.substring(i, j));
            String content= str.substring(j+1, j+1+len);

            decoded.add(content); 
            i = j+1+len;
        }

        return decoded;
    }
}
