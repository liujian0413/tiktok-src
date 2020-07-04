package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.b */
final /* synthetic */ class C38477b implements OnARTextCountCallback {

    /* renamed from: a */
    private final C38475a f100054a;

    /* renamed from: b */
    private final int f100055b;

    /* renamed from: c */
    private final String f100056c;

    C38477b(C38475a aVar, int i, String str) {
        this.f100054a = aVar;
        this.f100055b = i;
        this.f100056c = str;
    }

    public final void onResult(int i) {
        this.f100054a.mo96439a(this.f100055b, this.f100056c, i);
    }
}
