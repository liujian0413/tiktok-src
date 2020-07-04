package com.p280ss.android.ugc.aweme.dynamicfeature;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.dynamicfeature.a */
final /* synthetic */ class C27323a implements Runnable {

    /* renamed from: a */
    private final DfDummyInitTask f72086a;

    /* renamed from: b */
    private final Context f72087b;

    C27323a(DfDummyInitTask dfDummyInitTask, Context context) {
        this.f72086a = dfDummyInitTask;
        this.f72087b = context;
    }

    public final void run() {
        this.f72086a.lambda$initDfDummy$0$DfDummyInitTask(this.f72087b);
    }
}
