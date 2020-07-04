package com.p280ss.android.ugc.asve.recorder.camera.p925c;

import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.ugc.asve.sandbox.C20996d;
import com.p280ss.android.ugc.asve.sandbox.C21050o;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20844b;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c.C20912a;
import java.lang.reflect.Proxy;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.e */
public final class C20720e implements C20719d {

    /* renamed from: a */
    private final C21050o f55957a;

    /* renamed from: b */
    private final C21050o f55958b;

    /* renamed from: a */
    public final void mo56022a(boolean z) {
    }

    /* renamed from: c */
    public final int mo56026c() {
        return this.f55957a.mo56731d();
    }

    /* renamed from: d */
    public final int mo56028d() {
        return this.f55957a.mo56732e();
    }

    /* renamed from: e */
    public final boolean mo56029e() {
        return this.f55957a.mo56733f();
    }

    /* renamed from: f */
    public final boolean mo56030f() {
        return this.f55957a.mo56724a();
    }

    /* renamed from: g */
    public final boolean mo56031g() {
        return this.f55957a.mo56734g();
    }

    /* renamed from: a */
    public final int mo56019a() {
        return this.f55957a.mo56727b();
    }

    /* renamed from: b */
    public final boolean mo56024b() {
        return this.f55957a.mo56729c();
    }

    /* renamed from: c */
    public final boolean mo56027c(boolean z) {
        return this.f55957a.mo56730c(z);
    }

    /* renamed from: a */
    public final void mo56020a(int i) {
        this.f55957a.mo56722a(i);
    }

    /* renamed from: b */
    public final boolean mo56025b(boolean z) {
        return this.f55957a.mo56725a(z);
    }

    public C20720e(C21050o oVar) {
        C7573i.m23587b(oVar, "remoteWideCameraComponent");
        this.f55958b = oVar;
        Object newProxyInstance = Proxy.newProxyInstance(C21050o.class.getClassLoader(), new Class[]{C21050o.class}, new C20996d(this.f55958b));
        if (newProxyInstance != null) {
            this.f55957a = (C21050o) newProxyInstance;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.sandbox.IWideCameraComponent");
    }

    /* renamed from: a */
    public final void mo56021a(C19662d dVar) {
        C20912a aVar;
        C21050o oVar = this.f55957a;
        if (dVar != null) {
            aVar = C20844b.m69819a(dVar);
        } else {
            aVar = null;
        }
        oVar.mo56723a((C20911c) aVar);
    }

    /* renamed from: a */
    public final float mo56018a(float f, int i) {
        return this.f55957a.mo56721a(f, i);
    }

    /* renamed from: b */
    public final float mo56023b(float f, int i) {
        return this.f55957a.mo56726b(f, i);
    }
}
