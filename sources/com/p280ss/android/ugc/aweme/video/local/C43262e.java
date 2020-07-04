package com.p280ss.android.ugc.aweme.video.local;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.video.local.e */
final /* synthetic */ class C43262e implements Callable {

    /* renamed from: a */
    private final String f111993a;

    /* renamed from: b */
    private final String f111994b;

    C43262e(String str, String str2) {
        this.f111993a = str;
        this.f111994b = str2;
    }

    public final Object call() {
        return LocalVideoPlayerManager.m137199a(this.f111993a, this.f111994b);
    }
}
