package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsResult;

final class amd implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsResult f40635a;

    amd(JsResult jsResult) {
        this.f40635a = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40635a.confirm();
    }
}
