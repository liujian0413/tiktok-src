package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.p280ss.android.ugc.aweme.p313im.service.p322a.C7092b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bn */
final /* synthetic */ class C31903bn implements OnClickListener {

    /* renamed from: a */
    private final int f83382a;

    /* renamed from: b */
    private final C7092b f83383b;

    /* renamed from: c */
    private final Runnable f83384c;

    C31903bn(int i, C7092b bVar, Runnable runnable) {
        this.f83382a = i;
        this.f83383b = bVar;
        this.f83384c = runnable;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C7063bg.m22027a(this.f83382a, this.f83383b, this.f83384c, dialogInterface, i);
    }
}
