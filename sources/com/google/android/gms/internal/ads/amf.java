package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;

final class amf implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f40637a;

    amf(JsPromptResult jsPromptResult) {
        this.f40637a = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40637a.cancel();
    }
}
