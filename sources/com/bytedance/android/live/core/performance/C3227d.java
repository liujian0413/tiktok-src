package com.bytedance.android.live.core.performance;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.performance.d */
final /* synthetic */ class C3227d implements Runnable {

    /* renamed from: a */
    private final C32231 f9931a;

    /* renamed from: b */
    private final ArrayList f9932b;

    /* renamed from: c */
    private final String f9933c;

    /* renamed from: d */
    private final HashMap f9934d;

    C3227d(C32231 r1, ArrayList arrayList, String str, HashMap hashMap) {
        this.f9931a = r1;
        this.f9932b = arrayList;
        this.f9933c = str;
        this.f9934d = hashMap;
    }

    public final void run() {
        this.f9931a.mo10149a(this.f9932b, this.f9933c, this.f9934d);
    }
}
