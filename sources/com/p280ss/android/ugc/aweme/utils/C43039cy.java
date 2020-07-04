package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.ss.android.ugc.aweme.utils.cy */
final /* synthetic */ class C43039cy implements OnClickListener {

    /* renamed from: a */
    private final Context f111627a;

    /* renamed from: b */
    private final boolean f111628b;

    /* renamed from: c */
    private final Runnable f111629c;

    C43039cy(Context context, boolean z, Runnable runnable) {
        this.f111627a = context;
        this.f111628b = z;
        this.f111629c = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C430362.m136562a(this.f111627a, this.f111628b, this.f111629c, dialogInterface, i);
    }
}
