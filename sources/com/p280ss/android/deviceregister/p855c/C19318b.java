package com.p280ss.android.deviceregister.p855c;

/* renamed from: com.ss.android.deviceregister.c.b */
public final class C19318b {
    /* renamed from: a */
    public static boolean m63341a(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length < 13 || length > 160) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && ((charAt < 'A' || charAt > 'F') && charAt != '-'))) {
                return false;
            }
        }
        return true;
    }
}
