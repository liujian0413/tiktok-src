package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.google.android.gms.dynamic.j */
final class C15355j implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Context f39643a;

    /* renamed from: b */
    private final /* synthetic */ Intent f39644b;

    C15355j(Context context, Intent intent) {
        this.f39643a = context;
        this.f39644b = intent;
    }

    public final void onClick(View view) {
        try {
            this.f39643a.startActivity(this.f39644b);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
