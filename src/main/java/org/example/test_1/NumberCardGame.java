package org.example.test_1;

public class NumberCardGame {
    public int solution(int[][] cards) {
        int maxOfMins = Integer.MIN_VALUE;

        for (int i = 0; i < cards.length; i++) {
            int minInRow = Integer.MAX_VALUE;

            // 행 내 원소들을 인덱스 기반 for문으로 순회
            for (int j = 0; j < cards[i].length; j++) {
                if (cards[i][j] < minInRow) {  // 더 작은 값이 있으면 최소값 갱신
                    minInRow = cards[i][j];
                }
            }

            // 현재 행의 최소값이 지금까지의 최대값보다 크면 갱신
            if (minInRow > maxOfMins) {
                maxOfMins = minInRow;
            }
        }

        return maxOfMins;
    }

}
