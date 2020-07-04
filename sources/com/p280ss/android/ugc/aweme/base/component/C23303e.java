package com.p280ss.android.ugc.aweme.base.component;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;

/* renamed from: com.ss.android.ugc.aweme.base.component.e */
final /* synthetic */ class C23303e implements OnDismissListener {

    /* renamed from: a */
    private final Runnable f61360a;

    C23303e(Runnable runnable) {
        this.f61360a = runnable;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f61360a.run();
    }
}
