package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.google.android.gms.internal.ads.rn */
final class C16009rn implements OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ C16006rk f44936a;

    C16009rn(C16006rk rkVar) {
        this.f44936a = rkVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f44936a.mo41951a("User canceled the download.");
    }
}
