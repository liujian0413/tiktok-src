package com.bytedance.android.livesdk.browser.jsbridge;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.GeolocationPermissions.Callback;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.c */
final /* synthetic */ class C4040c implements OnClickListener {

    /* renamed from: a */
    private final Callback f12023a;

    /* renamed from: b */
    private final String f12024b;

    C4040c(Callback callback, String str) {
        this.f12023a = callback;
        this.f12024b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C4037b.m14095a(this.f12023a, this.f12024b, dialogInterface, i);
    }
}
