package com.bytedance.ies.web.jsbridge2;

import android.text.TextUtils;

/* renamed from: com.bytedance.ies.web.jsbridge2.v */
final class C11192v {

    /* renamed from: a */
    private static boolean f30369a;

    /* renamed from: a */
    static String m32754a() {
        return "";
    }

    /* renamed from: a */
    static void m32757a(boolean z) {
        f30369a = z;
    }

    /* renamed from: a */
    static String m32756a(Throwable th) {
        int i;
        StringBuilder sb = new StringBuilder("{\"code\":");
        if (th instanceof C11177r) {
            i = ((C11177r) th).f30331a;
        } else {
            i = 0;
        }
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    static String m32755a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        String str3 = "";
        if (f30369a) {
            str3 = str.substring(1, str.length() - 1);
        }
        StringBuilder sb = new StringBuilder("{\"code\":1,\"__data\":");
        sb.append(str);
        String sb2 = sb.toString();
        if (!str3.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append(",");
            sb3.append(str3);
            sb3.append("}");
            str2 = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("}");
            str2 = sb4.toString();
        }
        return str2;
    }
}
