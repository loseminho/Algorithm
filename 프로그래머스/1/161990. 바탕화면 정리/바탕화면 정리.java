class Solution {
    public int[] solution(String[] wallpaper) {
        // 최소/최대 좌표를 저장할 변수 초기화
        int lux = wallpaper.length;
        int luy = wallpaper[0].length();
        int rdx = 0;
        int rdy = 0;
        
        // 바탕화면을 순회하면서 '#'의 위치를 찾음
        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    lux = Math.min(lux, i);   // 가장 위쪽 파일의 행 번호
                    luy = Math.min(luy, j);   // 가장 왼쪽 파일의 열 번호
                    rdx = Math.max(rdx, i + 1); // 가장 아래쪽 파일의 행 번호 (+1 포함)
                    rdy = Math.max(rdy, j + 1); // 가장 오른쪽 파일의 열 번호 (+1 포함)
                }
            }
        }
        
        // 드래그 영역을 나타내는 배열 반환
        return new int[]{lux, luy, rdx, rdy};
    }
}