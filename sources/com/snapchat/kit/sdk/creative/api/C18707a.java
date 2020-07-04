package com.snapchat.kit.sdk.creative.api;

import android.os.Build.VERSION;
import android.widget.Toast;
import com.p280ss.android.ugc.aweme.utils.C43112ex;

/* renamed from: com.snapchat.kit.sdk.creative.api.a */
final class C18707a {
    /* renamed from: a */
    static void m61263a(Toast toast) {
        if (VERSION.SDK_INT == 25) {
            C43112ex.m136740a(toast);
        }
        toast.show();
    }
}
