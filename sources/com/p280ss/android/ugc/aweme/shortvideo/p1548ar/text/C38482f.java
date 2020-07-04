package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.text;

import com.p280ss.android.medialib.FaceBeautyInvoker.OnARTextCountCallback;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.text.f */
final /* synthetic */ class C38482f implements OnARTextCountCallback {

    /* renamed from: a */
    private final C38480e f100062a;

    /* renamed from: b */
    private final int f100063b;

    /* renamed from: c */
    private final String f100064c;

    C38482f(C38480e eVar, int i, String str) {
        this.f100062a = eVar;
        this.f100063b = i;
        this.f100064c = str;
    }

    public final void onResult(int i) {
        this.f100062a.mo96443a(this.f100063b, this.f100064c, i);
    }
}
