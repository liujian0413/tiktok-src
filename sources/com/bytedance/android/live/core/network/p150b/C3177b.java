package com.bytedance.android.live.core.network.p150b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.bytedance.android.live.core.network.b.b */
final /* synthetic */ class C3177b implements OnDismissListener {

    /* renamed from: a */
    private final Runnable f9765a;

    C3177b(Runnable runnable) {
        this.f9765a = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C3176a.m12017a(this.f9765a, dialogInterface);
    }
}
