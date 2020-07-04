package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.s */
final class C30172s {
    /* renamed from: a */
    static void m98800a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
