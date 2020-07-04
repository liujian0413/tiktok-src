package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.tm */
final class C16062tm implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ AtomicInteger f45048a;

    /* renamed from: b */
    private final /* synthetic */ int f45049b;

    /* renamed from: c */
    private final /* synthetic */ agu f45050c;

    /* renamed from: d */
    private final /* synthetic */ List f45051d;

    C16062tm(AtomicInteger atomicInteger, int i, agu agu, List list) {
        this.f45048a = atomicInteger;
        this.f45049b = i;
        this.f45050c = agu;
        this.f45051d = list;
    }

    public final void run() {
        if (this.f45048a.incrementAndGet() >= this.f45049b) {
            try {
                this.f45050c.mo39333b(C16055tf.m52171b(this.f45051d));
            } catch (InterruptedException | ExecutionException e) {
                acd.m45780c("Unable to convert list of futures to a future of list", e);
            }
        }
    }
}
