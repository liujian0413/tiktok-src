package com.p280ss.android.ugc.aweme.miniapp.impl;

import android.app.Activity;
import com.p280ss.android.ugc.aweme.miniapp_api.p1397a.C33431f;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.j */
final /* synthetic */ class C33404j implements Callable {

    /* renamed from: a */
    private final C33400h f87248a;

    /* renamed from: b */
    private final Activity f87249b;

    /* renamed from: c */
    private final C33431f f87250c;

    C33404j(C33400h hVar, Activity activity, C33431f fVar) {
        this.f87248a = hVar;
        this.f87249b = activity;
        this.f87250c = fVar;
    }

    public final Object call() {
        return this.f87248a.mo85630b(this.f87249b, this.f87250c);
    }
}
