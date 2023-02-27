import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        // 배열 오름차순으로 정렬
        Arrays.sort(numbers);
        // 정렬한 배열의 마지막 전 숫자와 마지막 숫자 곱을 구한다.
        return numbers[numbers.length - 2] * numbers[numbers.length - 1];
    }
}