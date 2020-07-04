package com.bytedance.android.live.core.performance;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.performance.e */
final /* synthetic */ class C3228e implements Runnable {

    /* renamed from: a */
    private final C32242 f9935a;

    /* renamed from: b */
    private final ArrayList f9936b;

    /* renamed from: c */
    private final String f9937c;

    /* renamed from: d */
    private final HashMap f9938d;

    C3228e(C32242 r1, ArrayList arrayList, String str, HashMap hashMap) {
        this.f9935a = r1;
        this.f9936b = arrayList;
        this.f9937c = str;
        this.f9938d = hashMap;
    }

    public final void run() {
        this.f9935a.mo10150a(this.f9936b, this.f9937c, this.f9938d);
    }
}
