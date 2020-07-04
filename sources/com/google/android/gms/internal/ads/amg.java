package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.webkit.JsPromptResult;
import android.widget.EditText;

final class amg implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ JsPromptResult f40638a;

    /* renamed from: b */
    private final /* synthetic */ EditText f40639b;

    amg(JsPromptResult jsPromptResult, EditText editText) {
        this.f40638a = jsPromptResult;
        this.f40639b = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f40638a.confirm(this.f40639b.getText().toString());
    }
}
