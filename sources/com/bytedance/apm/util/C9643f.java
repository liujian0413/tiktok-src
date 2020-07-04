package com.bytedance.apm.util;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build.VERSION;
import com.bytedance.common.utility.reflect.C6322b;

/* renamed from: com.bytedance.apm.util.f */
public final class C9643f {
    /* renamed from: a */
    public static String m28533a(PendingIntent pendingIntent) {
        if (VERSION.SDK_INT > 23 || pendingIntent == null) {
            return "";
        }
        return ((Intent) C6322b.m19610a((Object) pendingIntent).mo15160b("getIntent").f18556a).toString();
    }
}
