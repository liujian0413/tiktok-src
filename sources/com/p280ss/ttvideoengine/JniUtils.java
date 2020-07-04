package com.p280ss.ttvideoengine;

/* renamed from: com.ss.ttvideoengine.JniUtils */
public class JniUtils {

    /* renamed from: a */
    public static volatile boolean f117552a = false;

    /* renamed from: b */
    public static volatile String f117553b = "";

    public static native String getEncryptionKey(byte[] bArr);

    /* renamed from: a */
    public static String m144206a(byte[] bArr) throws Exception {
        String str;
        String str2;
        if (!f117552a) {
            StringBuilder sb = new StringBuilder("library not load suc exception:");
            if (f117553b == null) {
                str2 = "exception is null";
            } else {
                str2 = f117553b;
            }
            sb.append(str2);
            throw new Exception(sb.toString());
        }
        try {
            return getEncryptionKey(bArr);
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("getEncryptionKey exception:");
            if (th.toString() == null) {
                str = "exception is null";
            } else {
                str = th.toString();
            }
            sb2.append(str);
            throw new Exception(sb2.toString());
        }
    }
}
