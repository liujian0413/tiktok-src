package com.p280ss.android.ugc.aweme.feed.preload;

import com.p280ss.android.ugc.networkspeed.C44905e;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.d */
final /* synthetic */ class C28658d implements Callable {

    /* renamed from: a */
    private final C44905e[] f75506a;

    /* renamed from: b */
    private final String f75507b;

    /* renamed from: c */
    private final int f75508c;

    /* renamed from: d */
    private final String f75509d;

    /* renamed from: e */
    private final int f75510e;

    C28658d(C44905e[] eVarArr, String str, int i, String str2, int i2) {
        this.f75506a = eVarArr;
        this.f75507b = str;
        this.f75508c = i;
        this.f75509d = str2;
        this.f75510e = i2;
    }

    public final Object call() {
        return C28656b.m94285a(this.f75506a, this.f75507b, this.f75508c, this.f75509d, this.f75510e);
    }
}
