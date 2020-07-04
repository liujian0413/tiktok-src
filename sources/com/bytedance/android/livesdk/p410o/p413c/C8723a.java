package com.bytedance.android.livesdk.p410o.p413c;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: com.bytedance.android.livesdk.o.c.a */
public class C8723a implements C8725c {
    /* renamed from: a */
    public boolean mo21730a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo21731b() {
        return true;
    }

    /* renamed from: a */
    public Intent mo21729a(Context context) {
        StringBuilder sb = new StringBuilder("package:");
        sb.append(context.getPackageName());
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse(sb.toString()));
    }
}
