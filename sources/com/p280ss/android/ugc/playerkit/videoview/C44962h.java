package com.p280ss.android.ugc.playerkit.videoview;

import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.playerkit.model.C44917a;

/* renamed from: com.ss.android.ugc.playerkit.videoview.h */
public final class C44962h implements C44961g {

    /* renamed from: a */
    private C44961g f115635a;

    /* renamed from: a */
    public final View mo107454a() {
        return this.f115635a.mo107454a();
    }

    /* renamed from: b */
    public final Surface mo107457b() {
        return this.f115635a.mo107457b();
    }

    /* renamed from: c */
    public final boolean mo107459c() {
        return this.f115635a.mo107459c();
    }

    /* renamed from: d */
    public final void mo107460d() {
        this.f115635a.mo107460d();
    }

    /* renamed from: e */
    public final void mo107461e() {
        this.f115635a.mo107461e();
    }

    /* renamed from: f */
    public final void mo107462f() {
        this.f115635a.mo107462f();
    }

    /* renamed from: g */
    public final int mo107463g() {
        return this.f115635a.mo107463g();
    }

    /* renamed from: h */
    public final boolean mo107464h() {
        return this.f115635a.mo107464h();
    }

    /* renamed from: i */
    public final boolean mo107476i() {
        if (mo107463g() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo107455a(C44963i iVar) {
        this.f115635a.mo107455a(iVar);
    }

    /* renamed from: b */
    public final void mo107458b(C44963i iVar) {
        this.f115635a.mo107458b(iVar);
    }

    /* renamed from: a */
    public static C44962h m141885a(KeepSurfaceTextureView keepSurfaceTextureView) {
        Object tag = keepSurfaceTextureView.getTag();
        if (tag instanceof C44962h) {
            return (C44962h) tag;
        }
        C44962h hVar = new C44962h();
        hVar.f115635a = new C44958e(keepSurfaceTextureView);
        keepSurfaceTextureView.setTag(hVar);
        return hVar;
    }

    /* renamed from: b */
    public static C44962h m141886b(ViewGroup viewGroup) {
        C44962h hVar = new C44962h();
        hVar.f115635a = new C44958e(viewGroup);
        hVar.mo107454a().setTag(hVar);
        return hVar;
    }

    /* renamed from: a */
    public static C44962h m141884a(ViewGroup viewGroup) {
        boolean f = C44917a.m141692r().mo105103f();
        C44962h hVar = new C44962h();
        if (f) {
            hVar.f115635a = new C44945d(viewGroup);
        } else {
            hVar.f115635a = new C44958e(viewGroup);
        }
        hVar.mo107454a().setTag(hVar);
        return hVar;
    }

    /* renamed from: a */
    public final void mo107456a(boolean z) {
        this.f115635a.mo107456a(z);
    }
}
