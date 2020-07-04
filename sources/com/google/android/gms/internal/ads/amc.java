package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class amc implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f40634a;

    amc(JsResult jsResult) {
        this.f40634a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40634a.cancel();
    }
}
