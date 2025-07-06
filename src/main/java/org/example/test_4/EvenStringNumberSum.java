package org.example.test_4;

public class EvenStringNumberSum {
    public int solution(String[] strArr) {
        int sum = 0;

        for (int i = 0; i < strArr.length; i++) {
            try {
                int num = Integer.parseInt(strArr[i]);

                if (num % 2 == 0) {
                    sum += num;
                }

            } catch (NumberFormatException e) {
                // 숫자가 아닌 경우는 무시
            }
        }

        return sum;
    }
}
