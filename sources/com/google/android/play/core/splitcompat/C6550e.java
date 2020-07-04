package com.google.android.play.core.splitcompat;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.e */
final class C6550e implements C6554i {

    /* renamed from: a */
    final /* synthetic */ Set f18852a;

    /* renamed from: b */
    final /* synthetic */ AtomicBoolean f18853b;

    /* renamed from: c */
    private final /* synthetic */ C6562q f18854c;

    /* renamed from: d */
    private final /* synthetic */ C6551f f18855d;

    C6550e(C6551f fVar, C6562q qVar, Set set, AtomicBoolean atomicBoolean) {
        this.f18855d = fVar;
        this.f18854c = qVar;
        this.f18852a = set;
        this.f18853b = atomicBoolean;
    }

    /* renamed from: a */
    public final void mo15917a(ZipFile zipFile, Set<C6556k> set) throws IOException {
        this.f18855d.m20372a(this.f18854c, set, (C6557l) new C6553h(this));
    }
}
