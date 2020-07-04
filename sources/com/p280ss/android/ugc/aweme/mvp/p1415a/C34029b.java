package com.p280ss.android.ugc.aweme.mvp.p1415a;

import com.p280ss.android.ugc.aweme.mvp.p1415a.C34030c;
import com.p280ss.android.ugc.aweme.mvp.p1415a.C34031d;

/* renamed from: com.ss.android.ugc.aweme.mvp.a.b */
public class C34029b<M extends C34030c, V extends C34031d> {

    /* renamed from: a */
    protected final String f88764a = getClass().getSimpleName();

    /* renamed from: b */
    protected M f88765b;

    /* renamed from: c */
    protected V f88766c;

    /* renamed from: c */
    public final void mo86692c() {
        if (this.f88765b != null) {
            this.f88765b.onDestroy();
        }
        this.f88765b = null;
        this.f88766c = null;
    }

    public C34029b(M m, V v) {
        if (m == null) {
            throw new NullPointerException("Model can not null");
        } else if (v != null) {
            this.f88765b = m;
            this.f88766c = v;
        } else {
            throw new NullPointerException("View can not null");
        }
    }
}
