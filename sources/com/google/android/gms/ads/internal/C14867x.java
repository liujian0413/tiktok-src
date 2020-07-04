package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C15742hq;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.ami;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.x */
final class C14867x implements C15742hq<ami> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f38487a;

    C14867x(CountDownLatch countDownLatch) {
        this.f38487a = countDownLatch;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        acd.m45783e("Adapter returned an ad, but assets substitution failed");
        this.f38487a.countDown();
        ami.destroy();
    }
}
