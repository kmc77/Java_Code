package org.example.b2;

import java.util.Scanner;

public class 문자열함수모음 {
    public static void main(String[] args) {

        String str1 = "Java Programming";
        System.out.println("str1.length() = " + str1.length());

        String str2 = "heelo world";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            } else if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        System.out.println("sb = " + sb.toString());


        // 특정 문자열 포함 여부 확인
        String str3 = "I lov programming";
        String[] input = str3.split(" ");
        boolean isS = false;
        for (int i = 0; i < input.length; i++) {
            String target = "love";
            if (input[i].equals(target)) {
                isS = true;
                break;
            }
        }
        if (isS) {
            System.out.println(isS);
        } else {
            System.out.println("target 없음 ");
        }


        // 문자열 자르기 substring()
        String str4 = "Java Programming";
        // 5 이후 값 가져오기
        System.out.println("str4.substring(5) = " + str4.substring(5));


        // 문자열 공백 제거
        String str5 = "  Hello World!   ";
        String[] str5_1 = str5.split(" ");
        for (int i = 0; i < str5_1.length; i++) {
            System.out.print(str5_1[i]);
        }

        // 문자열 대체하기
        String str6 = "Java is great!";
        System.out.println("str6.replace(\"great\", \"awesome\") = " + str6.replace("great", "awesome"));


        // 문자열 탐색
        String str7 = "Programming in Java";
        System.out.println("str7.indexOf(15) = " + str7.indexOf("Java"));

        // 문자열 비교
        String str8 = "Java";
        String str9 = "java";
        System.out.println("str8 = " + str8.equals(str9));

        // 문자열 분리하기
        String str10 = "apple,banana,grape";
        String[] str11 = str10.split(",");
        for (int i = 0; i < str11.length; i++) {
            System.out.print(str11[i] + " ");
        }

        // 문자열의 끝이 특정 단어로 끝나는지 확인
        System.out.println();
        String str12 = "Hello World!";
        System.out.println(str12.endsWith("World!"));

    }


}

