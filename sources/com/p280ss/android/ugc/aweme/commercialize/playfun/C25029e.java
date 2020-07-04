package com.p280ss.android.ugc.aweme.commercialize.playfun;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.playfun.e */
public abstract class C25029e {

    /* renamed from: a */
    public Runnable f66018a;

    /* renamed from: b */
    public final C25030f f66019b;

    /* renamed from: a */
    public static void m82393a(String str) {
        C7573i.m23587b(str, "msg");
    }

    /* renamed from: a */
    public abstract void mo65461a();

    /* renamed from: b */
    public void mo65463b() {
    }

    /* renamed from: c */
    public void mo65464c() {
    }

    /* renamed from: e */
    public boolean mo65468e() {
        return false;
    }

    /* renamed from: f */
    public final void mo65486f() {
        this.f66019b.mo65489a(0);
    }

    /* renamed from: g */
    public final void mo65487g() {
        this.f66019b.mo65489a(1);
    }

    /* renamed from: d */
    public void mo65465d() {
        Runnable runnable = this.f66018a;
        if (runnable != null) {
            this.f66019b.f66026g.removeCallbacks(runnable);
        }
        this.f66018a = null;
    }

    public C25029e(C25030f fVar) {
        C7573i.m23587b(fVar, "stateContext");
        this.f66019b = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo65485a(Runnable runnable) {
        C7573i.m23587b(runnable, "runnable");
        this.f66018a = runnable;
        this.f66019b.f66026g.post(runnable);
    }
}
