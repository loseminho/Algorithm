class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0; // 칠 한 횟수 초기화
        int newStart = 0; // 현재까지 칠한 마지막 위치 초기화
        
        for(int start : section){
            if(start > newStart){ // 현재까지 칠한 위치가 칠해야하는 구역 내에 존재한다면
                count++; // 칠하고 횟수를 증가한다.
                newStart = start + m -1; // 칠한 마지막 위치를 그 숫자에서 롤러의 길이 -1 만큼 더해준다
            }
        }
        
        return count;
    }
}