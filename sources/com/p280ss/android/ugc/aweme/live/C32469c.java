package com.p280ss.android.ugc.aweme.live;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

/* renamed from: com.ss.android.ugc.aweme.live.c */
final /* synthetic */ class C32469c implements OnClickListener {

    /* renamed from: a */
    private final String f84714a;

    /* renamed from: b */
    private final Bundle f84715b;

    /* renamed from: c */
    private final long f84716c;

    C32469c(String str, Bundle bundle, long j) {
        this.f84714a = str;
        this.f84715b = bundle;
        this.f84716c = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C32430a.m105061a(this.f84714a, this.f84715b, this.f84716c, dialogInterface, i);
    }
}
