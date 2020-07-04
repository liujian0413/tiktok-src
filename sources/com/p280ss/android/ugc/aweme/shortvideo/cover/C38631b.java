package com.p280ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c.C38633a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.b */
final /* synthetic */ class C38631b implements Runnable {

    /* renamed from: a */
    private final C38633a f100364a;

    /* renamed from: b */
    private final int f100365b;

    /* renamed from: c */
    private final Bitmap f100366c;

    C38631b(C38633a aVar, int i, Bitmap bitmap) {
        this.f100364a = aVar;
        this.f100365b = i;
        this.f100366c = bitmap;
    }

    public final void run() {
        this.f100364a.mo96651a(this.f100365b, this.f100366c);
    }
}
