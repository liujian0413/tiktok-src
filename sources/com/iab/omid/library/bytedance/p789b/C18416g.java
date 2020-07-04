package com.iab.omid.library.bytedance.p789b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance.adsession.C18403g;
import com.iab.omid.library.bytedance.p788a.C18393b;
import com.iab.omid.library.bytedance.p788a.C18394c;
import com.iab.omid.library.bytedance.p788a.C18395d;
import com.iab.omid.library.bytedance.p788a.C18396e;
import com.iab.omid.library.bytedance.p789b.C18408b.C18410a;
import com.iab.omid.library.bytedance.walking.C18435a;

/* renamed from: com.iab.omid.library.bytedance.b.g */
public final class C18416g implements C18394c, C18410a {

    /* renamed from: b */
    private static C18416g f49954b;

    /* renamed from: a */
    public float f49955a;

    /* renamed from: c */
    private final C18396e f49956c;

    /* renamed from: d */
    private final C18393b f49957d;

    /* renamed from: e */
    private C18395d f49958e;

    /* renamed from: f */
    private C18407a f49959f;

    private C18416g(C18396e eVar, C18393b bVar) {
        this.f49956c = eVar;
        this.f49957d = bVar;
    }

    /* renamed from: a */
    public static C18416g m60629a() {
        if (f49954b == null) {
            f49954b = new C18416g(new C18396e(), new C18393b());
        }
        return f49954b;
    }

    /* renamed from: d */
    private C18407a m60630d() {
        if (this.f49959f == null) {
            this.f49959f = C18407a.m60593a();
        }
        return this.f49959f;
    }

    /* renamed from: a */
    public final void mo47794a(float f) {
        this.f49955a = f;
        for (C18403g d : m60630d().mo47835c()) {
            d.mo47811d().mo47861a(f);
        }
    }

    /* renamed from: a */
    public final void mo47854a(Context context) {
        this.f49958e = C18396e.m60543a(new Handler(), context, C18393b.m60536a(), this);
    }

    /* renamed from: a */
    public final void mo47842a(boolean z) {
        if (z) {
            C18435a.m60702a().mo47875b();
        } else {
            C18435a.m60702a().mo47877d();
        }
    }

    /* renamed from: b */
    public final void mo47855b() {
        C18408b.m60600a().f49942a = this;
        C18408b.m60600a().mo47838b();
        if (C18408b.m60600a().mo47840d()) {
            C18435a.m60702a().mo47875b();
        }
        this.f49958e.mo47795a();
    }

    /* renamed from: c */
    public final void mo47856c() {
        C18435a.m60702a().mo47876c();
        C18408b.m60600a().mo47839c();
        this.f49958e.mo47796b();
    }
}
