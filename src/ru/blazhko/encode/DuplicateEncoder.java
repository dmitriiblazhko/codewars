package ru.blazhko.encode;

class DuplicateEncoder {
    static String encode(String word) {
        String s = word.toLowerCase();
        char[] newstr = s.toCharArray();
        for (int i = 0; i < newstr.length; i++) {
            if (s.indexOf(newstr[i]) != s.lastIndexOf(newstr[i])) {
                newstr[i] = ')';
            }
            else newstr[i] = '(';

            word = new String(newstr);
        }
        return word;
    }
}

