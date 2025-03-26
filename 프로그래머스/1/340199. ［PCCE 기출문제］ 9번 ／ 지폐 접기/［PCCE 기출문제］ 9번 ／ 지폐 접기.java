import java.util.Arrays;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        // 초기 정렬 (wallet과 bill 모두 정렬)
        Arrays.sort(wallet);
        Arrays.sort(bill);
        
        // 조건이 만족할 때까지 반복
        while (!(bill[0] <= wallet[0] && bill[1] <= wallet[1])) {
            // 큰 수를 2로 나누고 answer 증가
            bill[1] /= 2;
            answer++;

            // bill 재정렬 (큰 수가 다시 앞으로 올 수 있으니까)
            Arrays.sort(bill);
        }
        
        return answer;
    }
}