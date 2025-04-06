import java.util.ArrayList;
import java.util.List;

class Solution {
    // n의 길이 값을 몰라도 처리 할 수 있도록 list 사용
    // 재귀 구조에 맞춰 .add로 편하게 값을 넣어주기 위해
    // 인덱스 관리를 따로 해주지 않아도 되기 떄문에 리스트 사용
    List<int[]> swap = new ArrayList<>();


    public int[][] solution(int n) {
        hanoi(n, 1, 3, 2); // n, from. to, via

        // 재귀 메서드를 돌고온 리스트를 배열로 변환
        int[][] answer = new int[swap.size()][2];
        for(int i=0; i<swap.size(); i++){
            answer[i] = swap.get(i);
        }
        
        return answer;
    }

    // 하노이 재귀 메서드
    private void hanoi(int n, int from, int to, int via){
        if(n == 1){
            //원판의 개수가 1개라면 목표기둥으로
            swap.add(new int[]{from, to});
            return;
        }

        //각각의 칸은(여기에서, 여기로, 여긴 보조기둥)의 이미와 같다
        hanoi(n-1, from, via, to); // 작은 원판 n-1개를 2번(보조) 기둥으로 옴겨준다.
        swap.add(new int[]{from, to}); // 옴겨야하는 원판 중 큰 원판을 3번(목표) 기둥으로
        hanoi(n-1, via, to, from); // 2번(보조) 기둥에 있는 원판을 3번(목표)기둥으로
    }

}