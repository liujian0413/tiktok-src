package com.bytedance.android.livesdk.p410o;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.content.C0692f;
import android.support.p022v4.util.C0904k;

/* renamed from: com.bytedance.android.livesdk.o.c */
final class C8722c {

    /* renamed from: a */
    private static final C0904k<String, Integer> f23735a;

    static {
        C0904k<String, Integer> kVar = new C0904k<>(8);
        f23735a = kVar;
        kVar.put("com.android.voicemail.permission.ADD_VOICEMAIL", Integer.valueOf(14));
        f23735a.put("android.permission.BODY_SENSORS", Integer.valueOf(20));
        f23735a.put("android.permission.READ_CALL_LOG", Integer.valueOf(16));
        f23735a.put("android.permission.READ_EXTERNAL_STORAGE", Integer.valueOf(16));
        f23735a.put("android.permission.USE_SIP", Integer.valueOf(9));
        f23735a.put("android.permission.WRITE_CALL_LOG", Integer.valueOf(16));
        f23735a.put("android.permission.SYSTEM_ALERT_WINDOW", Integer.valueOf(23));
        f23735a.put("android.permission.WRITE_SETTINGS", Integer.valueOf(23));
    }

    /* renamed from: a */
    private static boolean m26071a(String str) {
        Integer num = (Integer) f23735a.get(str);
        if (num == null || VERSION.SDK_INT >= num.intValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m26069a(Context context, String str) {
        try {
            if (C0692f.m2946a(context, str) == 0) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m26068a(Activity activity, String... strArr) {
        for (String a : strArr) {
            if (ActivityCompat.m2242a(activity, a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m26070a(Context context, String... strArr) {
        for (String str : strArr) {
            if (m26071a(str) && !m26069a(context, str)) {
                return false;
            }
        }
        return true;
    }
}
