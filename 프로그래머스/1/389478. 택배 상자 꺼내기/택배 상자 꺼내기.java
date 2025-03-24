class Solution {
    public int solution(int n, int w, int num) {
        int answer = 0;
        int col = (num-1)/w; //꺼내려는 상자의 층
        int row = w-1; //꺼내려는 상자의 행 초기화
        
        if(col%2==0){
            //0,2,4,6(홀수층)
            row = (num-1)%w;//꺼내려는 상자의 행
        }else{
            //1,3,5,7(짝수층)
            row = w-1 - (num-1)%w;//꺼내려는 상자의 행
        }
        
        for(int i=num; i<=n; i++){
            int max_col = (i-1)/w;
            if(max_col%2==0 && row==(i-1)%w){
                answer++;
            }else if(max_col%2!=0 && row==(w-1 - (i-1)%w)){
                answer++;
            }
        }
       
        
        
        return answer;
    }
}