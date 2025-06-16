package org.example.test_1;

import java.util.Stack;

public class ParenthesisValidator {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c); // 여는 괄호면 스택에 추가
            } else if (c == ')') {
                // 닫는 괄호인데 스택이 비어있으면 짝이 맞지 않는 경우
                if (stack.isEmpty()) return false;
                stack.pop(); // 짝이 맞는 여는 괄호가 있으면 스택에서 제거
            }
        }
        return stack.isEmpty(); // 모든 괄호가 짝이 맞으면 true, 아니면 false 반환
    }

}
