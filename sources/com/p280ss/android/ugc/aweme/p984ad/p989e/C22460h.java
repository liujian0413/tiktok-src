package com.p280ss.android.ugc.aweme.p984ad.p989e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* renamed from: com.ss.android.ugc.aweme.ad.e.h */
public final class C22460h {
    /* renamed from: a */
    public static Activity m74332a(Context context) {
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
}
