class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int aIndex = -1, bIndex = -1, cIndex = -1;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                aIndex = i;
            }
            else if(s.charAt(i) == 'b'){
                bIndex = i;
            }
            else {
                cIndex = i;
            }

            if(i >1){
                count += Math.min(Math.min(aIndex, bIndex), cIndex) + 1;
            }
        }
        return count;
    }
}
