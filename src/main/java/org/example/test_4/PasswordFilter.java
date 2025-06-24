package org.example.test_4;

import java.util.ArrayList;
import java.util.List;

public class PasswordFilter {
    public String[] solution(String[] passwords) {
        List<String> valid = new ArrayList<>();

        for (String pw : passwords) {
            if (pw.length() < 8) continue;
            if (pw.contains(" ")) continue;
            if (!pw.matches(".*[a-z].*")) continue;
            if (!pw.matches(".*[A-Z].*")) continue;
            if (!pw.matches(".*[0-9].*")) continue;

            valid.add(pw);
        }

        return valid.toArray(new String[0]);
    }
}
