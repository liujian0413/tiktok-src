package com.p280ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0044j;
import android.arch.lifecycle.Lifecycle.State;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.main.bd */
public final class C32899bd extends C0044j {

    /* renamed from: a */
    Handler f85836a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public final State mo54a() {
        return super.mo54a();
    }

    /* renamed from: b */
    private static boolean m106489b() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo84625c(C0042h hVar) {
        super.mo56b(hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo84626d(C0042h hVar) {
        super.mo55a(hVar);
    }

    /* renamed from: a */
    static final /* synthetic */ void m106487a(IllegalAccessError illegalAccessError) {
        throw illegalAccessError;
    }

    public C32899bd(C0043i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public final void mo55a(C0042h hVar) {
        m106488a((Runnable) new C32900be(this, hVar));
    }

    /* renamed from: b */
    public final void mo56b(C0042h hVar) {
        m106488a((Runnable) new C32902bg(this, hVar));
    }

    /* renamed from: a */
    private void m106488a(Runnable runnable) {
        if (m106489b()) {
            runnable.run();
            return;
        }
        this.f85836a.post(runnable);
        IllegalAccessError illegalAccessError = new IllegalAccessError("should be in main thread");
        if (C7163a.m22363a()) {
            this.f85836a.post(new C32901bf(illegalAccessError));
        } else {
            C2077a.m9161a((Throwable) illegalAccessError, "should call in main thread");
        }
    }
}
