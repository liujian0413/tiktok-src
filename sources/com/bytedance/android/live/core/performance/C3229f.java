package com.bytedance.android.live.core.performance;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.performance.f */
final /* synthetic */ class C3229f implements Runnable {

    /* renamed from: a */
    private final C32253 f9939a;

    /* renamed from: b */
    private final ArrayList f9940b;

    /* renamed from: c */
    private final String f9941c;

    /* renamed from: d */
    private final HashMap f9942d;

    C3229f(C32253 r1, ArrayList arrayList, String str, HashMap hashMap) {
        this.f9939a = r1;
        this.f9940b = arrayList;
        this.f9941c = str;
        this.f9942d = hashMap;
    }

    public final void run() {
        this.f9939a.mo10151a(this.f9940b, this.f9941c, this.f9942d);
    }
}
