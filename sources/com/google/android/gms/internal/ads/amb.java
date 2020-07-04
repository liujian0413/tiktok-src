package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsResult;

final class amb implements OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f40633a;

    amb(JsResult jsResult) {
        this.f40633a = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f40633a.cancel();
    }
}
