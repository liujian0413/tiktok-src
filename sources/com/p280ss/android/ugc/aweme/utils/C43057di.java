package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.ugc.aweme.utils.di */
public final class C43057di {
    /* renamed from: a */
    public static boolean m136601a(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
