package org.example.test_4;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 배열합치기및정렬 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> setA = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            setA.add(sc.nextInt());
        }

        int n1 = sc.nextInt();
        for (int i = 0; i < n1; i++) {
            setA.add(sc.nextInt());
        }

        int x = sc.nextInt();

        Iterator<Integer> it = setA.iterator();
        while (it.hasNext()) {
            int num = it.next();
            if (num < x) {
                System.out.print(num);
            }
        }

    }
}








