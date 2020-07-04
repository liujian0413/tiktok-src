package com.bytedance.jedi.ext.adapter.multitype;

import android.support.p029v7.util.C1151b;
import android.support.p029v7.widget.RecyclerView.C1262a;
import com.bytedance.jedi.ext.adapter.internal.C11721a;
import com.bytedance.jedi.ext.adapter.multitype.C11737b;
import kotlin.jvm.p357a.C7562b;

public final class FixedListUpdateCallback<T extends C1262a<?> & C11737b<?, ? extends C11738c<?>>> implements C1151b {

    /* renamed from: a */
    private final T f31520a;

    /* renamed from: b */
    private final C7562b<Integer, Integer> f31521b;

    /* renamed from: a */
    private final C11721a m34399a() {
        return ((C11737b) this.f31520a).mo29202b().f31531b;
    }

    /* renamed from: b */
    public final void mo255b(int i, int i2) {
        if (i2 != 0) {
            this.f31520a.notifyItemRangeRemoved(((Number) this.f31521b.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    /* renamed from: a */
    public final void mo253a(int i, int i2) {
        if (i2 != 0) {
            m34399a().mo29284a();
            int intValue = ((Number) this.f31521b.invoke(Integer.valueOf(i))).intValue();
            this.f31520a.notifyItemRangeInserted(intValue, i2);
            m34399a().mo29285a(intValue);
        }
    }

    /* renamed from: c */
    public final void mo256c(int i, int i2) {
        this.f31520a.notifyItemMoved(((Number) this.f31521b.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f31521b.invoke(Integer.valueOf(i2))).intValue());
    }

    /* renamed from: a */
    public final void mo254a(int i, int i2, Object obj) {
        this.f31520a.notifyItemRangeChanged(((Number) this.f31521b.invoke(Integer.valueOf(i))).intValue(), i2, obj);
    }
}
