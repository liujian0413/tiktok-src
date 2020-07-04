package com.p280ss.android.ugc.aweme.p984ad.p989e;

import android.content.Context;
import android.os.Build.VERSION;

/* renamed from: com.ss.android.ugc.aweme.ad.e.g */
public final class C22459g {
    /* renamed from: a */
    public static boolean m74331a(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }
}
