package com.google.android.gms.tagmanager;

import java.util.List;

/* renamed from: com.google.android.gms.tagmanager.m */
final class C17038m implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ List f47715a;

    /* renamed from: b */
    private final /* synthetic */ long f47716b;

    /* renamed from: c */
    private final /* synthetic */ C17036k f47717c;

    C17038m(C17036k kVar, List list, long j) {
        this.f47717c = kVar;
        this.f47715a = list;
        this.f47716b = j;
    }

    public final void run() {
        this.f47717c.m56552b(this.f47715a, this.f47716b);
    }
}
