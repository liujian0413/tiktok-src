package com.google.android.gms.internal.ads;

public final class bki {
    /* renamed from: a */
    public static String m49066a(String str) {
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        String str2 = "Invalid mime type: ";
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
    }

    /* renamed from: b */
    public static boolean m49067b(String str) {
        return m49066a(str).equals("audio");
    }

    /* renamed from: c */
    public static boolean m49068c(String str) {
        return "audio/ac3".equals(str) || "audio/eac3".equals(str);
    }
}
