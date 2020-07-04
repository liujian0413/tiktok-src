package com.p280ss.android.p817ad.p818a.p822c;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.provider.Settings.System;
import android.text.TextUtils;
import com.p280ss.android.p817ad.p818a.C18929c;

/* renamed from: com.ss.android.ad.a.c.g */
public final class C18940g {
    /* renamed from: a */
    public static boolean m61810a() {
        if (System.getInt(C18929c.m61791i().getContentResolver(), "airplane_mode_on", 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static Activity m61808a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: a */
    public static void m61809a(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                StringBuilder sb = new StringBuilder("tel:");
                sb.append(Uri.encode(str));
                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(sb.toString()));
                if (!(context instanceof Activity)) {
                    intent.setFlags(268435456);
                }
                context.startActivity(intent);
            } catch (Exception unused) {
            }
        }
    }
}
