package org.example.test_1;

import java.util.Scanner;

public class 소수판별 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 한 줄 입력 받고 공백으로 나누어 배열에 저장 (예: "3 4 7 10")
        String[] inputs = sc.nextLine().split(" ");

        boolean hasPrime = false; // 소수가 하나라도 있는지 체크하는 변수

        // 입력받은 모든 숫자에 대해 반복
        for (int i = 0; i < inputs.length; i++) {
            int number = Integer.parseInt(inputs[i]); // 문자열을 숫자로 변환
            if (isPrime(number)) { // 소수인지 판별
                System.out.print(number + " "); // 소수면 출력
                hasPrime = true; // 소수 발견 체크
            }
        }

        // 소수가 하나도 없으면 메시지 출력
        if (!hasPrime) {
            System.out.println("소수가 없습니다.");
        }
    }

    // 주어진 숫자가 소수인지 판별하는 메서드
    public static boolean isPrime(int num) {
        if (num < 2) return false; // 2 미만은 소수가 아님

        // 2부터 num의 제곱근까지 나누어 떨어지는지 확인
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // 나누어 떨어지면 소수 아님
        }

        return true; // 나누어 떨어지지 않으면 소수임
    }
}
