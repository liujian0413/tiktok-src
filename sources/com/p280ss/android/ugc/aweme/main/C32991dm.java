package com.p280ss.android.ugc.aweme.main;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.main.dm */
final /* synthetic */ class C32991dm implements Callable {

    /* renamed from: a */
    private final TabChangeManager f85957a;

    /* renamed from: b */
    private final Class f85958b;

    /* renamed from: c */
    private final String f85959c;

    /* renamed from: d */
    private final Bundle f85960d;

    C32991dm(TabChangeManager tabChangeManager, Class cls, String str, Bundle bundle) {
        this.f85957a = tabChangeManager;
        this.f85958b = cls;
        this.f85959c = str;
        this.f85960d = bundle;
    }

    public final Object call() {
        return this.f85957a.mo84578b(this.f85958b, this.f85959c, this.f85960d);
    }
}
