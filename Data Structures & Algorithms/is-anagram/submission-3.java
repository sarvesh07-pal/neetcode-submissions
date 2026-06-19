class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        char[] sortt = s.toCharArray();
        char[] sorttt = t.toCharArray();
        Arrays.sort(sortt);
        Arrays.sort(sorttt);
        return Arrays.equals(sortt, sorttt);

    }
}
