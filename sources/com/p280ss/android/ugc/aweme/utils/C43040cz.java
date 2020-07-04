package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.utils.cz */
final /* synthetic */ class C43040cz implements OnClickListener {

    /* renamed from: a */
    private final boolean f111630a;

    /* renamed from: b */
    private final Context f111631b;

    /* renamed from: c */
    private final Runnable f111632c;

    C43040cz(boolean z, Context context, Runnable runnable) {
        this.f111630a = z;
        this.f111631b = context;
        this.f111632c = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C430362.m136564a(this.f111630a, this.f111631b, this.f111632c, dialogInterface, i);
    }
}
