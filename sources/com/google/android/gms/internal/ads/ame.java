package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.webkit.JsPromptResult;

final class ame implements OnCancelListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f40636a;

    ame(JsPromptResult jsPromptResult) {
        this.f40636a = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f40636a.cancel();
    }
}
