package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.decorator.internal.C11693h.C11694a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.d */
public abstract class C11689d implements C11693h {

    /* renamed from: a */
    private boolean f31409a;

    /* renamed from: b */
    private View f31410b;

    /* renamed from: c */
    private C1293v f31411c;

    /* renamed from: d */
    private C7562b<? super ViewGroup, ? extends C1293v> f31412d;

    /* renamed from: b */
    public final C1293v mo29247b() {
        return this.f31411c;
    }

    /* renamed from: c */
    public final C7562b<ViewGroup, C1293v> mo29248c() {
        return this.f31412d;
    }

    /* renamed from: e */
    public final void mo29250e() {
        C11694a.m34286b(this);
    }

    /* renamed from: d */
    public int mo29249d() {
        return C11694a.m34285a(this);
    }

    /* renamed from: a */
    public final boolean mo29246a() {
        return this.f31409a;
    }

    /* renamed from: a */
    private void m34259a(View view) {
        this.f31410b = view;
    }

    /* renamed from: a */
    public final void mo29245a(boolean z) {
        this.f31409a = true;
    }

    /* renamed from: a */
    public final void mo29244a(C1293v vVar) {
        View view;
        this.f31411c = vVar;
        if (vVar != null) {
            view = vVar.itemView;
        } else {
            view = null;
        }
        m34259a(view);
    }
}
