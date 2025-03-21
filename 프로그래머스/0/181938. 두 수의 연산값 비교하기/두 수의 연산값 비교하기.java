class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int abLong = Integer.valueOf(""+a+b);
        if(abLong >= 2*a*b){
            answer = abLong;
        }else{
            answer = 2*a*b;
        }
        
        
        
        return answer;
    }
}