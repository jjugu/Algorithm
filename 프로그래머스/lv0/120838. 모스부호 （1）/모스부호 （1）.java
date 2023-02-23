class Solution {    
    public String solution(String letter) {
    	String answer = "";
        //morseList 배열에 모스부호를 순서대로 넣어줌
        String[] morseList = {".-", "-...", "-.-.", "-..", ".", "..-.", 
                               "--.", "....", "..", ".---", "-.-", ".-..", 
                               "--", "-.", "---", ".--.", "--.-", ".-.", 
                               "...", "-", "..-", "...-", ".--", "-..-", 
                               "-.--", "--.."}; 
        String[] morse;
        
        //공백을 기준으로 편지의 모스부호를 나눠준 뒤, morse 배열에 넣어줌
        morse = letter.split(" "); 
        /*편지 해독을 위해 morse 값과 morseList 값이 일치하는 index를 찾아 'a'를 더해줌 
        (아스키 코드에 따라 97을 더해줘도 됨) */
        for(String s : morse) {
            for(int i = 0; i < morseList.length; i++) {
                if(s.equals(morseList[i])) {
                    answer += Character.toString(i + 'a');
                }
            }
        }
        return answer; //해독한 편지 return
    }
}