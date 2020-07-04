package com.p280ss.video.rtc.engine.utils;

import android.util.Base64;
import com.C1642a;

/* renamed from: com.ss.video.rtc.engine.utils.TokenUtils */
public class TokenUtils {
    public static String buildToken(String str, String str2, String str3, String str4) {
        if (str == null || str.isEmpty()) {
            StringBuilder sb = new StringBuilder("Basic ");
            sb.append(Base64.encodeToString(C1642a.m8034a("%s:%s:%s", new Object[]{str2, str3, str4}).getBytes(), 2));
            return sb.toString();
        } else if (str.contains("Basic")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder("Bearer ");
            sb2.append(str);
            return sb2.toString();
        }
    }
}
