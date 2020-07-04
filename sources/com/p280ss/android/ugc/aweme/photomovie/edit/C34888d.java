package com.p280ss.android.ugc.aweme.photomovie.edit;

import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34857d;
import com.p280ss.android.ugc.aweme.photomovie.p1454a.C34859f;

/* renamed from: com.ss.android.ugc.aweme.photomovie.edit.d */
public final class C34888d implements C34870b {

    /* renamed from: a */
    private boolean f90991a;

    /* renamed from: b */
    private C34857d f90992b;

    /* renamed from: c */
    private C34866a f90993c;

    /* renamed from: a */
    public final boolean mo88398a() {
        return this.f90991a;
    }

    /* renamed from: a */
    public final void mo88397a(C34859f fVar) {
        if (this.f90993c.mo88313a()) {
            this.f90991a = true;
            fVar.mo88388a().mo74845a(this.f90992b.mo88387c());
        }
    }

    /* renamed from: b */
    public final void mo88399b(C34859f fVar) {
        this.f90991a = false;
        fVar.mo88388a().mo74849b(this.f90992b.mo88387c());
    }

    public C34888d(C34857d dVar, C34866a aVar) {
        this.f90992b = dVar;
        this.f90993c = aVar;
    }
}
