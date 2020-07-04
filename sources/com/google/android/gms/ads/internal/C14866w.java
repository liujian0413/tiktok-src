package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C15742hq;
import com.google.android.gms.internal.ads.ami;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.w */
final class C14866w implements C15742hq<ami> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f38486a;

    C14866w(CountDownLatch countDownLatch) {
        this.f38486a = countDownLatch;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        ami ami = (ami) obj;
        this.f38486a.countDown();
        ami.getView().setVisibility(0);
    }
}
