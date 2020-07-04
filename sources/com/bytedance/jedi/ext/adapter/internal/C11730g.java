package com.bytedance.jedi.ext.adapter.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.ext.adapter.internal.g */
public final class C11730g {

    /* renamed from: a */
    private final List<JediViewHolderProxy> f31515a = new ArrayList();

    /* renamed from: b */
    private final C11724d f31516b;

    /* renamed from: a */
    public final void mo29303a() {
        if (this.f31515a.size() != 0) {
            for (JediViewHolderProxy jediViewHolderProxy : this.f31515a) {
                if (jediViewHolderProxy != null) {
                    this.f31516b.mo29297b(jediViewHolderProxy);
                }
            }
            this.f31515a.clear();
        }
    }

    /* renamed from: c */
    private final void m34389c(int i) {
        this.f31515a.add(i, null);
    }

    public C11730g(C11724d dVar) {
        C7573i.m23587b(dVar, "manager");
        this.f31516b = dVar;
    }

    /* renamed from: a */
    public final JediViewHolderProxy mo29302a(int i) {
        if (i < 0 || i >= this.f31515a.size()) {
            return null;
        }
        return (JediViewHolderProxy) this.f31515a.get(i);
    }

    /* renamed from: b */
    public final void mo29306b(int i) {
        if (i < this.f31515a.size()) {
            JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) this.f31515a.remove(i);
            if (jediViewHolderProxy != null) {
                this.f31516b.mo29297b(jediViewHolderProxy);
            }
        }
    }

    /* renamed from: b */
    private final void m34388b(int i, JediViewHolderProxy jediViewHolderProxy) {
        if (i < this.f31515a.size()) {
            this.f31515a.set(i, jediViewHolderProxy);
        } else {
            this.f31515a.add(i, jediViewHolderProxy);
        }
    }

    /* renamed from: a */
    public final void mo29304a(int i, int i2) {
        List<JediViewHolderProxy> list = this.f31515a;
        if (i < list.size() && i2 < list.size()) {
            JediViewHolderProxy jediViewHolderProxy = (JediViewHolderProxy) list.get(i);
            list.set(i, list.get(i2));
            list.set(i2, jediViewHolderProxy);
        }
    }

    /* renamed from: a */
    public final void mo29305a(int i, JediViewHolderProxy jediViewHolderProxy) {
        if (i >= 0 && i <= this.f31515a.size()) {
            if (jediViewHolderProxy != null) {
                m34388b(i, jediViewHolderProxy);
            } else {
                m34389c(i);
            }
        }
    }
}
