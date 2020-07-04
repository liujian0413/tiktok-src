package com.p280ss.android.ugc.aweme.p931a;

import android.view.View;
import com.p280ss.android.ugc.aweme.p931a.C21085a.C21089c;

/* renamed from: com.ss.android.ugc.aweme.a.d */
final /* synthetic */ class C21093d implements Runnable {

    /* renamed from: a */
    private final View f56649a;

    /* renamed from: b */
    private final int f56650b;

    /* renamed from: c */
    private final View f56651c;

    /* renamed from: d */
    private final View f56652d;

    /* renamed from: e */
    private final C21089c f56653e;

    C21093d(View view, int i, View view2, View view3, C21089c cVar) {
        this.f56649a = view;
        this.f56650b = i;
        this.f56651c = view2;
        this.f56652d = view3;
        this.f56653e = cVar;
    }

    public final void run() {
        C21085a.m71121a(this.f56649a, this.f56650b, this.f56651c, this.f56652d, this.f56653e);
    }
}
