package com.twitter.sdk.android.core;

import android.content.Context;
import android.content.Intent;

/* renamed from: com.twitter.sdk.android.core.f */
public final class C46827f {
    /* renamed from: b */
    public static boolean m146486b(Context context, Intent intent) {
        if (!m146485a(context, intent)) {
            return false;
        }
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static boolean m146485a(Context context, Intent intent) {
        if (!context.getPackageManager().queryIntentActivities(intent, 0).isEmpty()) {
            return true;
        }
        return false;
    }
}
