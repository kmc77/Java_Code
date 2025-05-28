package org.example.PCCE;

public class 등차수열의특정한항만더하기 {
    public int main(int a, int d, boolean[] included) {
        int result = 0;

        // included 배열의 길이만큼 반복 (각 인덱스는 등차수열의 항 번호 - 1)
        for (int i = 0; i < included.length; i++) {
            // included[i]가 true일 경우, 해당 항을 등차수열에서 더함
            if (included[i]) {
                result += a + (i * d); // i번째 항: a + (i * d)
            }
        }
        return result;
    }
}
