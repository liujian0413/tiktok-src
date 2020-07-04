package com.p280ss.android.ugc.aweme.base.p308ui.session;

import android.arch.lifecycle.C0043i;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.base.ui.session.a */
public final class C23468a<T> {

    /* renamed from: a */
    private ArrayList<C23469a<T>> f61933a = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.base.ui.session.a$a */
    public interface C23469a<T> {
        /* renamed from: a */
        void mo59227a(T t);
    }

    /* renamed from: b */
    private void m77043b() {
        this.f61933a.clear();
    }

    /* renamed from: a */
    public final void mo61080a() {
        m77043b();
        C23470b.m77051a().mo61085a(this);
    }

    /* renamed from: a */
    public final void mo61082a(C23469a<T> aVar) {
        this.f61933a.remove(aVar);
    }

    /* renamed from: b */
    private void m77044b(C23469a<T> aVar) {
        if (!this.f61933a.contains(aVar)) {
            this.f61933a.add(aVar);
        }
    }

    /* renamed from: a */
    public final C23468a<T> mo61079a(C0043i iVar) {
        iVar.getLifecycle().mo55a(new Session$2(this));
        return this;
    }

    /* renamed from: a */
    public final void mo61083a(T t) {
        Iterator it = this.f61933a.iterator();
        while (it.hasNext()) {
            ((C23469a) it.next()).mo59227a(t);
        }
        mo61080a();
    }

    /* renamed from: a */
    public final void mo61081a(C0043i iVar, C23469a aVar) {
        m77044b(aVar);
        iVar.getLifecycle().mo55a(new Session$1(this, aVar));
    }
}
