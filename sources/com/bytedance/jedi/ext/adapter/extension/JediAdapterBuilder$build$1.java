package com.bytedance.jedi.ext.adapter.extension;

import com.bytedance.jedi.arch.C11501d;
import com.bytedance.jedi.ext.adapter.JediMultiTypeAdapter;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.multitype.C11743d;
import kotlin.Triple;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class JediAdapterBuilder$build$1 extends JediMultiTypeAdapter<T> {

    /* renamed from: b */
    final /* synthetic */ C11709d f31449b;

    /* renamed from: com.bytedance.jedi.ext.adapter.extension.JediAdapterBuilder$build$1$a */
    static final class C11702a extends Lambda implements C7562b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C7563m f31450a;

        /* renamed from: b */
        final /* synthetic */ JediAdapterBuilder$build$1 f31451b;

        /* renamed from: c */
        final /* synthetic */ C11743d f31452c;

        C11702a(C7563m mVar, JediAdapterBuilder$build$1 jediAdapterBuilder$build$1, C11743d dVar) {
            this.f31450a = mVar;
            this.f31451b = jediAdapterBuilder$build$1;
            this.f31452c = dVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m34311a(((Number) obj).intValue()));
        }

        /* renamed from: a */
        private boolean m34311a(int i) {
            return ((Boolean) this.f31450a.invoke(Integer.valueOf(i), this.f31451b.mo29203b(i, false))).booleanValue();
        }
    }

    /* renamed from: a */
    public final void mo29263a(C11743d<JediViewHolder<? extends C11501d, T>> dVar) {
        C7573i.m23587b(dVar, "registry");
        for (Triple triple : this.f31449b.f31457a) {
            C7562b bVar = (C7562b) triple.component1();
            C7563m mVar = (C7563m) triple.component2();
            dVar.mo29315a((C7562b<? super Integer, Boolean>) new C11702a<Object,Boolean>(mVar, this, dVar), (C7563m) triple.component3(), bVar);
        }
    }
}
