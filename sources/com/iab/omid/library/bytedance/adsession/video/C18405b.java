package com.iab.omid.library.bytedance.adsession.video;

import com.iab.omid.library.bytedance.adsession.C18398b;
import com.iab.omid.library.bytedance.adsession.C18403g;
import com.iab.omid.library.bytedance.p789b.C18416g;
import com.iab.omid.library.bytedance.p791d.C18423b;
import com.iab.omid.library.bytedance.p791d.C18426d;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.adsession.video.b */
public final class C18405b {

    /* renamed from: a */
    private final C18403g f49936a;

    private C18405b(C18403g gVar) {
        this.f49936a = gVar;
    }

    /* renamed from: a */
    public static C18405b m60578a(C18398b bVar) {
        C18403g gVar = (C18403g) bVar;
        C18426d.m60669a((Object) bVar, "AdSession is null");
        C18426d.m60676g(gVar);
        C18426d.m60668a(gVar);
        C18426d.m60671b(gVar);
        C18426d.m60674e(gVar);
        C18405b bVar2 = new C18405b(gVar);
        gVar.mo47811d().f49969b = bVar2;
        return bVar2;
    }

    /* renamed from: a */
    private static void m60579a(float f) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Invalid Video duration");
        }
    }

    /* renamed from: b */
    private static void m60580b(float f) {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Video volume");
        }
    }

    /* renamed from: a */
    public final void mo47821a() {
        C18426d.m60672c(this.f49936a);
        this.f49936a.mo47811d().mo47865a("firstQuartile");
    }

    /* renamed from: a */
    public final void mo47822a(float f, float f2) {
        m60579a(f);
        m60580b(1.0f);
        C18426d.m60672c(this.f49936a);
        JSONObject jSONObject = new JSONObject();
        C18423b.m60655a(jSONObject, "duration", Float.valueOf(f));
        C18423b.m60655a(jSONObject, "videoPlayerVolume", Float.valueOf(1.0f));
        C18423b.m60655a(jSONObject, "deviceVolume", Float.valueOf(C18416g.m60629a().f49955a));
        this.f49936a.mo47811d().mo47867a("start", jSONObject);
    }

    /* renamed from: a */
    public final void mo47823a(C18404a aVar) {
        C18426d.m60669a((Object) aVar, "VastProperties is null");
        C18426d.m60671b(this.f49936a);
        this.f49936a.mo47811d().mo47867a("loaded", aVar.mo47820a());
    }

    /* renamed from: b */
    public final void mo47824b() {
        C18426d.m60672c(this.f49936a);
        this.f49936a.mo47811d().mo47865a("midpoint");
    }

    /* renamed from: c */
    public final void mo47825c() {
        C18426d.m60672c(this.f49936a);
        this.f49936a.mo47811d().mo47865a("thirdQuartile");
    }

    /* renamed from: d */
    public final void mo47826d() {
        C18426d.m60672c(this.f49936a);
        this.f49936a.mo47811d().mo47865a("complete");
    }

    /* renamed from: e */
    public final void mo47827e() {
        C18426d.m60672c(this.f49936a);
        this.f49936a.mo47811d().mo47865a("pause");
    }

    /* renamed from: f */
    public final void mo47828f() {
        C18426d.m60672c(this.f49936a);
        this.f49936a.mo47811d().mo47865a("resume");
    }

    /* renamed from: g */
    public final void mo47829g() {
        C18426d.m60672c(this.f49936a);
        this.f49936a.mo47811d().mo47865a("bufferStart");
    }

    /* renamed from: h */
    public final void mo47830h() {
        C18426d.m60672c(this.f49936a);
        this.f49936a.mo47811d().mo47865a("bufferFinish");
    }
}
