class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            answer[i] = -1;  // 기본값은 -1 로 고정하며 들어감

            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    answer[i] = i - j;  // 가장 가까운 거 찾으면 바로 break
                    break;
                }
            }
        }

        return answer;
    }
}