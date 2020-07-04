package com.google.gson.internal;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: com.google.gson.internal.g */
public final class C6698g {
    /* renamed from: a */
    private static String m20719a(int i) {
        switch (i) {
            case 0:
                return "EEEE, MMMM d, yyyy";
            case 1:
                return "MMMM d, yyyy";
            case 2:
                return "MMM d, yyyy";
            case 3:
                return "M/d/yy";
            default:
                StringBuilder sb = new StringBuilder("Unknown DateFormat style: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: b */
    private static String m20721b(int i) {
        switch (i) {
            case 0:
            case 1:
                return "h:mm:ss a z";
            case 2:
                return "h:mm:ss a";
            case 3:
                return "h:mm a";
            default:
                StringBuilder sb = new StringBuilder("Unknown DateFormat style: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public static DateFormat m20720a(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(m20719a(i));
        sb.append(" ");
        sb.append(m20721b(i2));
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }
}
