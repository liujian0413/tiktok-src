package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.m */
public final class C32593m implements C32586g {

    /* renamed from: a */
    private AtomicInteger f84979a;

    public C32593m() {
        this(0);
    }

    /* renamed from: a */
    public final int mo83895a() {
        return this.f84979a.getAndIncrement();
    }

    /* renamed from: b */
    public final int mo83896b() {
        return this.f84979a.getAndDecrement();
    }

    public C32593m(int i) {
        this.f84979a = new AtomicInteger(0);
    }
}
