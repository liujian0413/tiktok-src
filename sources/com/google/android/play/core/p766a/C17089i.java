package com.google.android.play.core.p766a;

import android.os.RemoteException;
import com.google.android.play.core.internal.C17107aw;
import com.google.android.play.core.internal.C17113bd;
import com.google.android.play.core.tasks.C17157l;

/* renamed from: com.google.android.play.core.a.i */
final class C17089i extends C17113bd {

    /* renamed from: b */
    private final /* synthetic */ String f47791b;

    /* renamed from: c */
    private final /* synthetic */ C17157l f47792c;

    /* renamed from: d */
    private final /* synthetic */ C17087g f47793d;

    C17089i(C17087g gVar, C17157l lVar, String str, C17157l lVar2) {
        this.f47793d = gVar;
        this.f47791b = str;
        this.f47792c = lVar2;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo44331a() {
        try {
            ((C17107aw) this.f47793d.f47785a.f47815a).mo44384a(this.f47793d.f47786d, this.f47793d.m56677c(this.f47791b), new C17092l(this.f47793d, this.f47792c, this.f47791b));
        } catch (RemoteException e) {
            C17087g.f47783b.mo15890a((Throwable) e, "requestUpdateInfo(%s)", this.f47791b);
            this.f47792c.mo44428a((Exception) new RuntimeException(e));
        }
    }
}
