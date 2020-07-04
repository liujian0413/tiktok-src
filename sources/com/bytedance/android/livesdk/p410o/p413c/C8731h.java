package com.bytedance.android.livesdk.p410o.p413c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.bytedance.android.livesdk.o.c.h */
public final class C8731h extends C8723a {
    /* renamed from: a */
    public final boolean mo21730a() {
        return super.mo21730a();
    }

    /* renamed from: a */
    public final Intent mo21729a(Context context) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
        intent.putExtra("extra_pkgname", context.getPackageName());
        return intent;
    }
}
