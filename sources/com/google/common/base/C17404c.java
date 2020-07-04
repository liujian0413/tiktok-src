package com.google.common.base;

/* renamed from: com.google.common.base.c */
public final class C17404c {
    /* renamed from: b */
    private static boolean m57888b(char c) {
        return c >= 'a' && c <= 'z';
    }

    /* renamed from: c */
    private static boolean m57889c(char c) {
        return c >= 'A' && c <= 'Z';
    }

    /* renamed from: a */
    public static char m57885a(char c) {
        if (m57888b(c)) {
            return (char) (c & '_');
        }
        return c;
    }

    /* renamed from: a */
    public static String m57886a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m57889c(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m57889c(c)) {
                        charArray[i] = (char) (c ^ ' ');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }

    /* renamed from: b */
    public static String m57887b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            if (m57888b(str.charAt(i))) {
                char[] charArray = str.toCharArray();
                while (i < length) {
                    char c = charArray[i];
                    if (m57888b(c)) {
                        charArray[i] = (char) (c & '_');
                    }
                    i++;
                }
                return String.valueOf(charArray);
            }
            i++;
        }
        return str;
    }
}
