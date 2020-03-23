package ru.blazhko.printer;

class Printer {
    static String printerError(String s) {
        int x = s.length();
        char[] abc = s.toCharArray();
        int count = 0;

        char c = 'n';
        while (c <= 'z') {
            for (int i = 0; i < x; i++) if (abc[i] == c) count++;
            ++c;
        }

        return count + "/" + x;
    }
}