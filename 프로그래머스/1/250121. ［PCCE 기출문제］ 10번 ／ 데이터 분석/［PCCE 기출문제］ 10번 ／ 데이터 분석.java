import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        int extIndex = 0;
        int sort_byIndex = 0;

        // ext 값에 따라 비교할 열 설정
        switch (ext){
            case "code": extIndex = 0; break;
            case "date": extIndex = 1; break;
            case "maximum": extIndex = 2; break;
            case "remain": extIndex = 3; break;
        }

        // sort_by 값에 따라 정렬할 열 설정
        switch (sort_by){
            case "code": sort_byIndex = 0; break;
            case "date": sort_byIndex = 1; break;
            case "maximum": sort_byIndex = 2; break;
            case "remain": sort_byIndex = 3; break;
        }

        // 필터링된 데이터를 저장할 리스트
        ArrayList<int[]> filteredList = new ArrayList<>();

        // 조건을 만족하는 데이터만 리스트에 추가 (val_ext보다 작은 값 선택)
        for (int[] row : data) {
            if (row[extIndex] < val_ext) { // 비교 연산자 변경
                filteredList.add(row);
            }
        }

        // 리스트를 배열로 변환
        int[][] result = filteredList.toArray(new int[filteredList.size()][]);

        // 정렬 수행 (sort_byIndex를 final 변수로 할당)
        final int sortIndex = sort_byIndex;
        Arrays.sort(result, Comparator.comparingInt(a -> a[sortIndex]));

        return result;
    }
}