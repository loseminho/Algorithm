class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul = 1;
        int squa = 0;
        
        for(int i=0; i<num_list.length; i++){
            mul = mul * num_list[i];
            squa += num_list[i];
        }
        if(mul <squa*squa){
            answer = 1;
        }
        
        
        return answer;
    }
}