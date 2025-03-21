class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String str_a = String.valueOf(a);
        String str_b = String.valueOf(b);
        String str_ab = str_a+str_b;
        String str_ba = str_b+str_a;
        int ab = Integer.valueOf(str_ab);
        int ba = Integer.valueOf(str_ba);
        
        if(ab >ba){
            answer = ab;
        }else{
            answer = ba;
        }
        
        
        return answer;
    }
}