package com.p280ss.android.ugc.asve.recorder.camera.p925c;

import android.content.Context;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.f */
public final class C20721f extends C20714a {

    /* renamed from: e */
    public C20707b f55959e;

    /* renamed from: f */
    private final float f55960f = 14.874f;

    /* renamed from: b */
    public final boolean mo56015b() {
        return true;
    }

    /* renamed from: b */
    public final boolean mo56016b(boolean z) {
        return z;
    }

    /* renamed from: c */
    public final boolean mo56017c() {
        return true;
    }

    /* renamed from: a */
    public final void mo56013a(final boolean z) {
        this.f55950c = z;
        this.f55951d = new C19662d() {
            /* renamed from: a */
            public final void mo52272a(int i, int i2, String str) {
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo56032a(boolean z) {
                float f;
                C20707b bVar = C20721f.this.f55959e;
                if (z) {
                    f = 0.0f;
                } else {
                    f = 14.874f;
                }
                bVar.mo55942a(f);
            }

            /* renamed from: a */
            public final void mo52271a(int i) {
                if (C20721f.this.f55959e.mo55955d() == 1) {
                    C20721f.this.f55959e.mo55932a((C19629a) new C20723g(this, z));
                } else {
                    C20721f.this.f55959e.mo55932a((C19629a) null);
                }
            }
        };
    }

    public C20721f(C20707b bVar, C20726i iVar) {
        super(iVar);
        this.f55959e = bVar;
    }

    /* renamed from: a */
    public final float mo56010a(float f, int i) {
        float f2;
        if (i != 1 || !this.f55950c) {
            f2 = f;
        } else {
            f2 = 0.0f;
        }
        return Math.min(f2, f);
    }

    /* renamed from: a */
    public final void mo56012a(Context context, C19662d dVar) {
        float f;
        this.f55950c = !this.f55950c;
        C20707b bVar = this.f55959e;
        if (this.f55950c) {
            f = 0.0f;
        } else {
            f = 14.874f;
        }
        bVar.mo55942a(f);
        this.f55948a.mo56022a(this.f55950c);
    }

    /* renamed from: b */
    public final float mo56014b(float f, int i) {
        float f2;
        if (i != 1) {
            f2 = f;
        } else if (this.f55950c) {
            f2 = 0.0f;
        } else {
            f2 = 14.874f;
        }
        return Math.max(f2, f);
    }
}
