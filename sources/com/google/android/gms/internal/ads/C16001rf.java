package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.rf */
final class C16001rf implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C15999rd f44906a;

    C16001rf(C15999rd rdVar) {
        this.f44906a = rdVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f44906a.mo41951a("Operation denied by user.");
    }
}
