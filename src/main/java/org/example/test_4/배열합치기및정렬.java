package org.example.test_4;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 배열합치기및정렬 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> setA = new TreeSet<>(); // TreeSet : 중복 제거, 자동 정렬, 빠른 탐색
        for (int i = 0; i < n; i++) {
            setA.add(sc.nextInt());
        }

        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            setA.add(sc.nextInt());
        }

        int x = sc.nextInt();

        //hasNext()로 데이터가 남았는지 확인하고, next()로 데이터를 순차적으로 가져옴.
        Iterator<Integer> it = setA.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num < x) {
                System.out.print(num);
            }
        }

    }
}








