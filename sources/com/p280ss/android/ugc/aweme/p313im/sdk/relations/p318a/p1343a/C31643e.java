package com.p280ss.android.ugc.aweme.p313im.sdk.relations.p318a.p1343a;

import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.a.e */
public abstract class C31643e<R> {

    /* renamed from: h */
    protected C31641d<R> f82851h;

    /* renamed from: a */
    public abstract void mo82409a();

    /* renamed from: b */
    public abstract void mo82411b();

    /* renamed from: c */
    public abstract boolean mo82412c();

    /* renamed from: d */
    public abstract boolean mo82413d();

    /* renamed from: e */
    public void mo82414e() {
    }

    /* renamed from: j */
    public void mo82432j() {
    }

    /* renamed from: f */
    public boolean mo82415f() {
        if (this.f82851h != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82429a(C31641d<R> dVar) {
        C7573i.m23587b(dVar, "<set-?>");
        this.f82851h = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82430a(Throwable th, boolean z) {
        C7573i.m23587b(th, "t");
        if (z) {
            C31641d<R> dVar = this.f82851h;
            if (dVar == null) {
                C7573i.m23583a("loadSubscriber");
            }
            dVar.mo82402b(th);
            return;
        }
        C31641d<R> dVar2 = this.f82851h;
        if (dVar2 == null) {
            C7573i.m23583a("loadSubscriber");
        }
        dVar2.mo82399a(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82431a(List<R> list, boolean z) {
        C7573i.m23587b(list, "list");
        if (z) {
            C31641d<R> dVar = this.f82851h;
            if (dVar == null) {
                C7573i.m23583a("loadSubscriber");
            }
            dVar.mo82403b(list, mo82413d());
            return;
        }
        C31641d<R> dVar2 = this.f82851h;
        if (dVar2 == null) {
            C7573i.m23583a("loadSubscriber");
        }
        dVar2.mo82400a(list, mo82413d());
    }
}
