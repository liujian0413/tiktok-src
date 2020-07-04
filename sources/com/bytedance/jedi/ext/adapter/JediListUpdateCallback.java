package com.bytedance.jedi.ext.adapter;

import android.support.p029v7.util.C1151b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import com.bytedance.jedi.ext.adapter.internal.C11721a;
import com.bytedance.jedi.ext.adapter.internal.C11723c;
import com.bytedance.jedi.ext.adapter.internal.C11730g;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.multitype.C11737b;
import kotlin.C7579l;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

public final class JediListUpdateCallback<T extends C1262a<?> & C11737b<?, ? extends C11713f<?>>> implements C1151b {

    /* renamed from: a */
    private final T f31366a;

    /* renamed from: b */
    private final C7562b<Integer, Integer> f31367b;

    /* renamed from: a */
    private final C11723c m34173a() {
        return ((C11713f) ((C11737b) this.f31366a).mo29202b()).f31468a.f31510a;
    }

    /* renamed from: b */
    private final C11730g m34174b() {
        return ((C11713f) ((C11737b) this.f31366a).mo29202b()).f31468a.f31511b;
    }

    /* renamed from: c */
    private final C11721a m34175c() {
        return ((C11713f) ((C11737b) this.f31366a).mo29202b()).f31531b;
    }

    public JediListUpdateCallback(T t, C7562b<? super Integer, Integer> bVar) {
        C7573i.m23587b(t, "adapter");
        C7573i.m23587b(bVar, "positionMapper");
        this.f31366a = t;
        this.f31367b = bVar;
    }

    /* renamed from: a */
    public final void mo253a(int i, int i2) {
        if (i2 != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = i + i3;
                m34173a().mo29292a(i4, false);
                m34174b().mo29305a(i4, (JediViewHolderProxy) null);
            }
            m34175c().mo29284a();
            int intValue = ((Number) this.f31367b.invoke(Integer.valueOf(i))).intValue();
            this.f31366a.notifyItemRangeInserted(intValue, i2);
            m34175c().mo29285a(intValue);
        }
    }

    /* renamed from: c */
    public final void mo256c(int i, int i2) {
        m34173a().mo29291a(i, i2);
        m34174b().mo29304a(i, i2);
        this.f31366a.notifyItemMoved(((Number) this.f31367b.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f31367b.invoke(Integer.valueOf(i2))).intValue());
    }

    /* renamed from: b */
    public final void mo255b(int i, int i2) {
        if (i2 != 0) {
            C11723c a = m34173a();
            if (i != 0 || i2 < a.mo29290a()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    a.mo29295b(i);
                    m34174b().mo29306b(i);
                }
                this.f31366a.notifyItemRangeRemoved(((Number) this.f31367b.invoke(Integer.valueOf(i))).intValue(), i2);
                return;
            }
            a.mo29294b();
            m34174b().mo29303a();
            this.f31366a.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public final void mo254a(int i, int i2, Object obj) {
        this.f31366a.notifyItemRangeChanged(((Number) this.f31367b.invoke(Integer.valueOf(i))).intValue(), i2, C7579l.m23633a(obj, C11680c.m34222a()));
    }
}
