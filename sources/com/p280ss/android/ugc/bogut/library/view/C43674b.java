package com.p280ss.android.ugc.bogut.library.view;

import android.os.Bundle;
import com.p280ss.android.ugc.bogut.library.factory.C43672c;
import com.p280ss.android.ugc.bogut.library.factory.PresenterStorage;
import com.p280ss.android.ugc.bogut.library.p1721a.C43668a;

/* renamed from: com.ss.android.ugc.bogut.library.view.b */
public final class C43674b<P extends C43668a> {

    /* renamed from: a */
    public C43672c<P> f113027a;

    /* renamed from: b */
    private P f113028b;

    /* renamed from: c */
    private Bundle f113029c;

    /* renamed from: d */
    private boolean f113030d;

    /* renamed from: c */
    public final void mo105651c() {
        if (this.f113028b != null && this.f113030d) {
            this.f113028b.mo105634b();
            this.f113030d = false;
        }
    }

    /* renamed from: b */
    public final Bundle mo105650b() {
        Bundle bundle = new Bundle();
        mo105646a();
        if (this.f113028b != null) {
            bundle.putBundle("presenter", new Bundle());
            bundle.putString("presenter_id", PresenterStorage.INSTANCE.getId(this.f113028b));
        }
        return bundle;
    }

    /* renamed from: a */
    public final P mo105646a() {
        if (this.f113027a != null) {
            if (this.f113028b == null && this.f113029c != null) {
                this.f113028b = (C43668a) PresenterStorage.INSTANCE.getPresenter(this.f113029c.getString("presenter_id"));
            }
            if (this.f113028b == null) {
                this.f113028b = this.f113027a.mo105640a();
                PresenterStorage.INSTANCE.add(this.f113028b);
                if (this.f113029c != null) {
                    this.f113029c.getBundle("presenter");
                }
            }
            this.f113029c = null;
        }
        return this.f113028b;
    }

    public C43674b(C43672c<P> cVar) {
        this.f113027a = cVar;
    }

    /* renamed from: a */
    public final void mo105649a(boolean z) {
        if (this.f113028b != null && z) {
            this.f113028b.mo105631a();
            this.f113028b = null;
        }
    }

    /* renamed from: a */
    public final void mo105647a(Bundle bundle) {
        if (this.f113028b == null) {
            this.f113029c = (Bundle) C43673a.m138357a(C43673a.m138358a((Object) bundle));
            return;
        }
        throw new IllegalArgumentException("onRestoreInstanceState() should be called before onResume()");
    }

    /* renamed from: a */
    public final void mo105648a(Object obj) {
        mo105646a();
        if (this.f113028b != null && !this.f113030d) {
            this.f113028b.mo105633a(obj);
            this.f113030d = true;
        }
    }
}
