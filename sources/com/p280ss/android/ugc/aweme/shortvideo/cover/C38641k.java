package com.p280ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c.C38633a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.k */
final /* synthetic */ class C38641k implements Callable {

    /* renamed from: a */
    private final C38633a f100380a;

    /* renamed from: b */
    private final AtomicInteger f100381b;

    /* renamed from: c */
    private final Bitmap f100382c;

    C38641k(C38633a aVar, AtomicInteger atomicInteger, Bitmap bitmap) {
        this.f100380a = aVar;
        this.f100381b = atomicInteger;
        this.f100382c = bitmap;
    }

    public final Object call() {
        return VEVideoCoverGeneratorImpl.m123421a(this.f100380a, this.f100381b, this.f100382c);
    }
}
