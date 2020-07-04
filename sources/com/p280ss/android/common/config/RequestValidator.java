package com.p280ss.android.common.config;

import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.C6319n;

/* renamed from: com.ss.android.common.config.RequestValidator */
public class RequestValidator {
    public static boolean checkSSSign(String str, String str2, String str3) {
        String str4;
        if (C6319n.m19593a(str) || C6319n.m19593a(str3) || C6319n.m19593a(str2)) {
            return false;
        }
        String a = C6306c.m19561a(str3);
        StringBuilder sb = new StringBuilder("ByteDance");
        sb.append(a);
        String a2 = C6306c.m19561a(sb.toString());
        if (C6319n.m19593a(a2) || a2.length() != 32) {
            return true;
        }
        try {
            str4 = RSADecoder.decodeSign(str2);
        } catch (Throwable unused) {
            str4 = "";
        }
        return a2.equals(str4);
    }
}
