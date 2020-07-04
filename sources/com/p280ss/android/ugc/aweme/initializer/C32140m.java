package com.p280ss.android.ugc.aweme.initializer;

import android.content.Intent;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.initializer.m */
final /* synthetic */ class C32140m implements Runnable {

    /* renamed from: a */
    private final Aweme f83947a;

    /* renamed from: b */
    private final FragmentActivity f83948b;

    /* renamed from: c */
    private final Intent f83949c;

    C32140m(Aweme aweme, FragmentActivity fragmentActivity, Intent intent) {
        this.f83947a = aweme;
        this.f83948b = fragmentActivity;
        this.f83949c = intent;
    }

    public final void run() {
        C32138l.m104368a(this.f83947a, this.f83948b, this.f83949c);
    }
}
