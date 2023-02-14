class Solution {
    public int solution(int[] array) {
        int answer = 0;
        java.util.Arrays.sort(array);
        for(int i = 0; i < array.length; i++) {
            int a = (array.length / 2);
            answer = array[a];
        }
        return answer;
    }
}