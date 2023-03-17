class Solution {
    public int solution(String message) {
        int answer = 0;
        for(int i = 1; i <= message.length(); i++) {
            answer += 2;
        }
        return answer;
    }
}