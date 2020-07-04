package com.p280ss.ttvideoengine.p1816i;

import android.util.Base64;
import java.util.Random;

/* renamed from: com.ss.ttvideoengine.i.e */
public final class C46119e {
    /* renamed from: a */
    public static String m144517a(String str) {
        String str2 = new String();
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            str2 = sb.toString();
        }
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(random.nextInt());
        String sb3 = sb2.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(sb3);
        sb4.append(System.currentTimeMillis());
        return Base64.encodeToString(sb4.toString().getBytes(), 2);
    }
}
