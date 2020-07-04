package com.bytedance.jedi.ext.adapter.multitype;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.multitype.C11743d.C11744a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public abstract class SingleTypeAdapter<T> extends MultiTypeAdapter<MultiTypeViewHolder<T>> {

    /* renamed from: com.bytedance.jedi.ext.adapter.multitype.SingleTypeAdapter$a */
    static final class C11735a extends Lambda implements C7562b<ViewGroup, MultiTypeViewHolder<T>> {

        /* renamed from: a */
        final /* synthetic */ SingleTypeAdapter f31529a;

        C11735a(SingleTypeAdapter singleTypeAdapter) {
            this.f31529a = singleTypeAdapter;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public MultiTypeViewHolder<T> invoke(ViewGroup viewGroup) {
            C7573i.m23587b(viewGroup, "it");
            return this.f31529a.mo29312a(viewGroup);
        }
    }

    /* renamed from: a */
    public abstract MultiTypeViewHolder<T> mo29312a(ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29263a(C11743d<MultiTypeViewHolder<T>> dVar) {
        C7573i.m23587b(dVar, "registry");
        C11744a.m34438a((C11743d) dVar, (C7562b) null, (C7563m) null, (C7562b) new C11735a(this), 3, (Object) null);
    }
}
