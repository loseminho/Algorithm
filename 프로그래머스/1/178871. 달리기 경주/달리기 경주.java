import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        
        Map<String, Integer> indexMap = new HashMap<>();
        // 선수 이름을 HashMap에 저장
        for (int i = 0; i < players.length; i++) {
            indexMap.put(players[i], i);
        }

        // callings를 하나씩 확인하면서 자리 변환
        for (String calling : callings) {
            int curIndex = indexMap.get(calling); // O(1)
            
            if (curIndex > 0) { // 맨 앞이 아니라면,
                int prevIndex = curIndex - 1;

                // players 배열에서 자리 바꾸기
                String temp = players[prevIndex];
                players[prevIndex] = players[curIndex];
                players[curIndex] = temp;

                //자리 바꾼 선수들의 위치를 새로 바꿔주며 indexMap도 갱신
                indexMap.put(players[prevIndex], prevIndex);
                indexMap.put(players[curIndex], curIndex);
            }
        }
        
        return players;
    }
}