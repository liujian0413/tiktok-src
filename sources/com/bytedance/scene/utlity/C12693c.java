package com.bytedance.scene.utlity;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.scene.utlity.c */
public final class C12693c extends C12691b {

    /* renamed from: a */
    private List<C12691b> f33692a = new ArrayList();

    /* renamed from: c */
    public final C12691b mo31150c() {
        C12691b bVar = new C12691b();
        m36898a(bVar);
        return bVar;
    }

    /* renamed from: b */
    public final void mo31149b() {
        for (C12691b b : this.f33692a) {
            b.mo31149b();
        }
        super.mo31149b();
    }

    /* renamed from: a */
    private void m36898a(C12691b bVar) {
        C12699i.m36905a();
        this.f33692a.add(bVar);
    }
}
