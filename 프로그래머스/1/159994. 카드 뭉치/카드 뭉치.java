class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int cards1Count = 0;
        int cards2Count = 0;
        
        for(int i=0; i<goal.length; i++){
            if(cards1Count < cards1.length && goal[i].equals(cards1[cards1Count])){
                cards1Count++;
                continue;
            }else if(cards2Count < cards2.length && goal[i].equals(cards2[cards2Count])){
                cards2Count++;
                continue;
            }else{
                answer ="No";
                break;
            }
        }

        return answer;
    }
}