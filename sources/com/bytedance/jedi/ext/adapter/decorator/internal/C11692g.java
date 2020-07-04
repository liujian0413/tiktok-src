package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewGroup;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.g */
public final class C11692g extends C11689d {

    /* renamed from: a */
    private int f31423a;

    /* renamed from: f */
    public final int mo29253f() {
        return this.f31423a;
    }

    /* renamed from: g */
    public final boolean mo29254g() {
        if (mo29248c() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C1293v mo29252a(ViewGroup viewGroup) {
        C7573i.m23587b(viewGroup, "parent");
        C7562b c = mo29248c();
        if (c == null) {
            C7573i.m23580a();
        }
        C1293v vVar = (C1293v) c.invoke(viewGroup);
        mo29244a(vVar);
        return vVar;
    }
}
