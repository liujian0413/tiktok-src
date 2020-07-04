package com.p280ss.android.ugc.aweme.shortvideo.cover;

import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c.C38633a;
import com.p280ss.android.vesdk.VEListener.C45220p;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.j */
final /* synthetic */ class C38640j implements C45220p {

    /* renamed from: a */
    private final VEVideoCoverGeneratorImpl f100377a;

    /* renamed from: b */
    private final C38633a f100378b;

    /* renamed from: c */
    private final AtomicInteger f100379c;

    C38640j(VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl, C38633a aVar, AtomicInteger atomicInteger) {
        this.f100377a = vEVideoCoverGeneratorImpl;
        this.f100378b = aVar;
        this.f100379c = atomicInteger;
    }

    /* renamed from: a */
    public final int mo96655a(byte[] bArr, int i, int i2, int i3, float f) {
        return this.f100377a.mo96646a(this.f100378b, this.f100379c, bArr, i, i2, i3, f);
    }
}
