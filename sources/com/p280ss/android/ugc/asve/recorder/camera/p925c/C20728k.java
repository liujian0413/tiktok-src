package com.p280ss.android.ugc.asve.recorder.camera.p925c;

import android.content.Context;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.k */
public final class C20728k extends C20714a {

    /* renamed from: e */
    private C20707b f55972e;

    /* renamed from: b */
    public final boolean mo56016b(boolean z) {
        return !z;
    }

    /* renamed from: c */
    public final boolean mo56017c() {
        return true;
    }

    /* renamed from: a */
    public final int mo56011a() {
        if (this.f55950c) {
            return 2;
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo56013a(boolean z) {
        this.f55949b = true;
        this.f55950c = z;
    }

    public C20728k(C20707b bVar, C20726i iVar) {
        super(iVar);
        this.f55972e = bVar;
    }

    /* renamed from: a */
    public final void mo56012a(Context context, final C19662d dVar) {
        int i;
        C20707b bVar = this.f55972e;
        if (this.f55950c) {
            i = 0;
        } else {
            i = 2;
        }
        bVar.mo55931a(i, (C19662d) new C19662d() {
            /* renamed from: a */
            public final void mo52271a(int i) {
                if (dVar != null) {
                    dVar.mo52271a(i);
                }
                C20728k.this.f55950c = !C20728k.this.f55950c;
                C20728k.this.f55948a.mo56022a(C20728k.this.f55950c);
            }

            /* renamed from: a */
            public final void mo52272a(int i, int i2, String str) {
                if (dVar != null) {
                    dVar.mo52272a(i, i2, str);
                }
            }
        });
    }
}
