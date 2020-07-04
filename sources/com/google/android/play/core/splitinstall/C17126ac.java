package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.internal.C17097af;
import com.google.android.play.core.internal.C17098ag;
import com.google.android.play.core.internal.C17113bd;
import com.google.android.play.core.tasks.C17157l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.google.android.play.core.splitinstall.ac */
final class C17126ac extends C17113bd {

    /* renamed from: b */
    private final /* synthetic */ Collection f47844b;

    /* renamed from: c */
    private final /* synthetic */ Collection f47845c;

    /* renamed from: d */
    private final /* synthetic */ C17157l f47846d;

    /* renamed from: e */
    private final /* synthetic */ C17125ab f47847e;

    C17126ac(C17125ab abVar, C17157l lVar, Collection collection, Collection collection2, C17157l lVar2) {
        this.f47847e = abVar;
        this.f47844b = collection;
        this.f47845c = collection2;
        this.f47846d = lVar2;
        super(lVar);
    }

    /* renamed from: a */
    public final void mo44331a() {
        ArrayList a = C17125ab.m56768d(this.f47844b);
        a.addAll(C17125ab.m56766c(this.f47845c));
        try {
            ((C17097af) this.f47847e.f47840a.f47815a).mo44338a(this.f47847e.f47842e, (List<Bundle>) a, C17125ab.m56767d(), (C17098ag) new C17140j(this.f47847e, this.f47846d));
        } catch (RemoteException e) {
            C17125ab.f47838b.mo15890a((Throwable) e, "startInstall(%s,%s)", this.f47844b, this.f47845c);
            this.f47846d.mo44428a((Exception) new RuntimeException(e));
        }
    }
}
