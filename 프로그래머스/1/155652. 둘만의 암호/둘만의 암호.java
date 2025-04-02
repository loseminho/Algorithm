class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            char shiftedChar = c;
            int count = 0;
            while (count < index) {
                shiftedChar = (char) ('a' + (shiftedChar - 'a' + 1) % 26);
                if (!skip.contains(String.valueOf(shiftedChar))) {
                    count++;
                }
            }
            answer.append(shiftedChar);
        }
        
        return answer.toString();
    }
}