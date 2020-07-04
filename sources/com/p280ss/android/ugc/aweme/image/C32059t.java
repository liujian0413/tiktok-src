package com.p280ss.android.ugc.aweme.image;

import com.bytedance.lighten.core.C12124e;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12534t;

/* renamed from: com.ss.android.ugc.aweme.image.t */
final /* synthetic */ class C32059t implements Runnable {

    /* renamed from: a */
    private final C320571 f83851a;

    /* renamed from: b */
    private final C12124e f83852b;

    /* renamed from: c */
    private final C12534t f83853c;

    /* renamed from: d */
    private final long f83854d;

    /* renamed from: e */
    private final C12466b f83855e;

    C32059t(C320571 r1, C12124e eVar, C12534t tVar, long j, C12466b bVar) {
        this.f83851a = r1;
        this.f83852b = eVar;
        this.f83853c = tVar;
        this.f83854d = j;
        this.f83855e = bVar;
    }

    public final void run() {
        this.f83851a.mo83025a(this.f83852b, this.f83853c, this.f83854d, this.f83855e);
    }
}
