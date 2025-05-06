package org.example.b1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기1 {
    public static void main(String[] args) throws IOException {
        // 입력을 읽기 위한 BufferedReader를 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄의 입력을 읽어 StringTokenizer로 분리
        StringTokenizer st = new StringTokenizer(br.readLine());

        // suNo: 숫자의 개수, quizNo: 구간 합을 계산할 쿼리의 개수
        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        // 부분합 배열을 저장할 배열 S를 생성 (1-based index 사용을 위해 크기를 suNo + 1로 설정)
        long[] S = new long[suNo + 1];

        // 두 번째 줄의 입력을 읽어 각 숫자를 S 배열에 부분합으로 저장
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 각 쿼리에 대해 구간 합을 계산하여 출력
        for (int q = 0; q <= quizNo; q++) {
            // 각 쿼리의 범위 [i, j]를 읽어들임
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            // 구간 [i, j]의 합은 S[j] - S[i - 1]로 계산
            System.out.println(S[j] - S[i - 1]);

        }


    }
}
