package com.bytedance.widget.ext.list;

import android.support.p029v7.util.C1151b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import com.bytedance.widget.ext.list.C13044f;
import kotlin.jvm.p357a.C7562b;

public final class ItemWidgetListUpdateCallback<T extends C1262a<?> & C13044f<?>> implements C1151b {

    /* renamed from: a */
    private final T f34491a;

    /* renamed from: b */
    private final C7562b<Integer, Integer> f34492b;

    /* renamed from: a */
    public final void mo254a(int i, int i2, Object obj) {
    }

    /* renamed from: a */
    private final C13042d m38048a() {
        return ((C13044f) this.f34491a).mo31617a().f34499a.f34496a;
    }

    /* renamed from: a */
    public final void mo253a(int i, int i2) {
        if (i2 != 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                m38048a().mo31615a(i + i3, null);
            }
            this.f34491a.notifyItemRangeInserted(((Number) this.f34492b.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    /* renamed from: b */
    public final void mo255b(int i, int i2) {
        if (i2 != 0) {
            C13042d a = m38048a();
            if (i != 0 || i2 < a.mo31612a()) {
                for (int i3 = 0; i3 < i2; i3++) {
                    a.mo31613a(i);
                }
                this.f34491a.notifyItemRangeRemoved(((Number) this.f34492b.invoke(Integer.valueOf(i))).intValue(), i2);
                return;
            }
            a.mo31616b();
            this.f34491a.notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    public final void mo256c(int i, int i2) {
        m38048a().mo31614a(i, i2);
        this.f34491a.notifyItemMoved(((Number) this.f34492b.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f34492b.invoke(Integer.valueOf(i2))).intValue());
    }
}
