package com.p280ss.android.ugc.aweme.feed.preload;

import android.util.SparseArray;
import com.p280ss.android.ugc.aweme.p331m.C7163a;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.h */
public final class C28662h {

    /* renamed from: a */
    private static final C28662h f75514a = new C28662h();

    /* renamed from: b */
    private SparseArray<C28653a> f75515b = new SparseArray<>();

    /* renamed from: a */
    public static C28662h m94303a() {
        return f75514a;
    }

    private C28662h() {
        m94304a(1, new C28673n());
        m94304a(2, new C28660f());
        m94304a(3, new C28661g());
        m94304a(4, new C28666j());
    }

    /* renamed from: a */
    public final C28659e mo73724a(int i) {
        C28653a aVar = (C28653a) this.f75515b.get(i);
        if (aVar != null) {
            return aVar;
        }
        if (!C7163a.m22363a()) {
            return null;
        }
        throw new IllegalStateException("Preload Command not register !");
    }

    /* renamed from: a */
    private void m94304a(int i, C28653a aVar) {
        this.f75515b.put(i, aVar);
    }
}
