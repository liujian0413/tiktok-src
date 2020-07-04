package com.bytedance.android.livesdk.p410o.p413c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.bytedance.android.livesdk.o.c.b */
public final class C8724b extends C8723a {
    /* renamed from: a */
    public final boolean mo21730a() {
        return super.mo21730a();
    }

    /* renamed from: a */
    public final Intent mo21729a(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packageName", context.getPackageName());
        intent.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
        return intent;
    }
}
