package com.bytedance.android.livesdk.gift.panel.widget;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.bytedance.android.livesdk.gift.panel.widget.ad */
final class C8222ad {
    /* renamed from: a */
    static void m25248a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
