class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        double db1 = num1;
        double db2 = num2;
        answer = (int)(db1/db2*1000);
        return answer;
    }
}