class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = Integer.valueOf(arr[i]);
        }
        
        int max = newArr[0];
        int min = newArr[0];
        
        for(int i : newArr) {
            max = Math.max(i, max);
            min = Math.min(i, min);
        }
        answer = min + " " + max;

        return answer;
    }
}