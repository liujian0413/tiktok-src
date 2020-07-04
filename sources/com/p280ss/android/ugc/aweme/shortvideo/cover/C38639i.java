package com.p280ss.android.ugc.aweme.shortvideo.cover;

import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c.C38633a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.i */
final /* synthetic */ class C38639i implements Callable {

    /* renamed from: a */
    private final VEVideoCoverGeneratorImpl f100371a;

    /* renamed from: b */
    private final int[] f100372b;

    /* renamed from: c */
    private final int f100373c;

    /* renamed from: d */
    private final int f100374d;

    /* renamed from: e */
    private final C38633a f100375e;

    /* renamed from: f */
    private final AtomicInteger f100376f;

    C38639i(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, int[] iArr, int i, int i2, C38633a aVar, AtomicInteger atomicInteger) {
        this.f100371a = vEVideoCoverGeneratorImpl;
        this.f100372b = iArr;
        this.f100373c = i;
        this.f100374d = i2;
        this.f100375e = aVar;
        this.f100376f = atomicInteger;
    }

    public final Object call() {
        return this.f100371a.mo96647a(this.f100372b, this.f100373c, this.f100374d, this.f100375e, this.f100376f);
    }
}
