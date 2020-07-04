package org.apache.http.protocol;

public final class HTTP {
    public static boolean isWhitespace(char c) {
        return c == ' ' || c == 9 || c == 13 || c == 10;
    }
}
