package org.example.PCCE;

public class 문자열반복 {
    public String repeatString(String my_string, int k) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            sb.append(my_string);
        }
        return sb.toString();
    }
}
