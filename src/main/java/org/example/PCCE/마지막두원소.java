package org.example.PCCE;

public class 마지막두원소 {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];

        int m = num_list[num_list.length - 1];
        int s = num_list[num_list.length - 2];


        for (int i = 0; i < answer.length; i++) {
            answer[i] = num_list[i];
        }

        if (m > s) {
            answer[num_list.length] = m - s;
        } else {
            answer[num_list.length] = m * 2;
        }

        return answer;
    }
}
