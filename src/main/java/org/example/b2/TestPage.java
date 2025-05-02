package org.example.b2;

import java.util.*;

public class TestPage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arrSum = new int[n1 + n2];

        for (int i = 0; i < n1; i++) {
            arrSum[i] = arr1[i];
        }

        for (int i = 0; i < n2; i++) {
            arrSum[n1 + i] = arr2[i];
        }

        int[] arrUni = new int[n1 + n2];
        int uniCount = 0;


        for (int i = 0; i < arrSum.length; i++) {
            boolean isUni = false;
            for (int j = 0; j < arrUni.length; j++) {
                if (arrSum[i] == arrUni[j]) {
                    isUni = true;
                }
            }
            if (!isUni) {
                arrUni[uniCount++] = arrSum[i];
            }

        }
        int[] result = Arrays.copyOf(arrUni, uniCount);
        Arrays.sort(result);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}








