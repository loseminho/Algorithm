class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int check = 0;  // 연속 붕대 감은 시간
        int maxHealth = health; // 최대 체력
        int attackIndex = 0; // 공격 배열에서 현재 공격을 확인할 인덱스

        for (int i = 1; i <= attacks[attacks.length - 1][0]; i++) {
            // 현재 공격이 있는지 확인
            if (attackIndex < attacks.length && attacks[attackIndex][0] == i) {
                // 공격 시간에 도달하면 체력 감소
                health -= attacks[attackIndex][1];
                attackIndex++; // 다음 공격으로 이동
                check = 0; // 붕대 감기 시간 초기화
            } else {
                // 붕대 감기 진행
                health += bandage[1]; // 1초당 회복량 추가
                check++;

                // t초 연속 성공하면 추가 회복량 적용
                if (check == bandage[0]) {
                    health += bandage[2];
                    check = 0;
                }

                // 체력이 최대 체력을 초과하지 않도록 조정
                if (health > maxHealth) {
                    health = maxHealth;
                }
            }

            // 체력이 0 이하이면 즉시 종료
            if (health <= 0) {
                return -1;
            }
        }

        return health;
    }
}