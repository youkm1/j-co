class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;

        // 1. 지갑의 작은 값과 큰 값 구하기
        int small_wallet = Math.min(wallet[0], wallet[1]);
        int big_wallet = Math.max(wallet[0], wallet[1]);

        // 2. 지폐의 현재 가로와 세로 길이
        int width = bill[0];
        int height = bill[1];

        // 3. 지폐가 지갑에 들어갈 때까지 반복
        while (!(width <= big_wallet && height <= small_wallet) &&
               !(height <= big_wallet && width <= small_wallet)) {
            // 긴 쪽을 접음
            if (width > height) {
                width /= 2; // 가로를 반으로 접음
            } else {
                height /= 2; // 세로를 반으로 접음
            }
            answer++; // 접기 횟수 증가
        }

        return answer; // 총 접기 횟수 반환
    }
}
