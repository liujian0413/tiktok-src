package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import bolts.C1606i;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.dq */
final /* synthetic */ class C41345dq implements Callable {

    /* renamed from: a */
    private final String f107616a;

    /* renamed from: b */
    private final Context f107617b;

    /* renamed from: c */
    private final C1606i f107618c;

    C41345dq(String str, Context context, C1606i iVar) {
        this.f107616a = str;
        this.f107617b = context;
        this.f107618c = iVar;
    }

    public final Object call() {
        return VideoRecordPermissionActivity.m131757a(this.f107616a, this.f107617b, this.f107618c);
    }
}
