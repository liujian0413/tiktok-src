package com.google.android.play.core.p766a;

import android.os.RemoteException;
import com.google.android.play.core.internal.C17107aw;
import com.google.android.play.core.internal.C17113bd;
import com.google.android.play.core.tasks.C17157l;

/* renamed from: com.google.android.play.core.a.h */
final class C17088h extends C17113bd {

    /* renamed from: b */
    private final /* synthetic */ C17157l f47788b;

    /* renamed from: c */
    private final /* synthetic */ String f47789c;

    /* renamed from: d */
    private final /* synthetic */ C17087g f47790d;

    C17088h(C17087g gVar, C17157l lVar, C17157l lVar2, String str) {
        this.f47790d = gVar;
        this.f47788b = lVar2;
        this.f47789c = str;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo44331a() {
        try {
            ((C17107aw) this.f47790d.f47785a.f47815a).mo44385b(this.f47790d.f47786d, C17087g.m56676c(), new C17090j(this.f47790d, this.f47788b));
        } catch (RemoteException e) {
            C17087g.f47783b.mo15890a((Throwable) e, "completeUpdate(%s)", this.f47789c);
            this.f47788b.mo44428a((Exception) new RuntimeException(e));
        }
    }
}
