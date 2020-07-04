package com.p280ss.android.ugc.aweme.p313im.sdk.arch.adpater;

import android.support.p029v7.widget.RecyclerView.C1262a;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.arch.adpater.DifferListUpdateCallback */
public final class DifferListUpdateCallback<T extends C1262a<?>> implements ExtendedListUpdateCallback {

    /* renamed from: a */
    private final T f80290a;

    /* renamed from: b */
    private final C7562b<Integer, Integer> f80291b;

    /* renamed from: a */
    public final void mo80348a() {
        this.f80290a.notifyDataSetChanged();
    }

    public DifferListUpdateCallback(T t, C7562b<? super Integer, Integer> bVar) {
        C7573i.m23587b(t, "adapter");
        C7573i.m23587b(bVar, "positionMapper");
        this.f80290a = t;
        this.f80291b = bVar;
    }

    /* renamed from: a */
    public final void mo253a(int i, int i2) {
        if (i2 != 0) {
            this.f80290a.notifyItemRangeInserted(((Number) this.f80291b.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    /* renamed from: b */
    public final void mo255b(int i, int i2) {
        if (i2 != 0) {
            if (i == 0 && i2 == this.f80290a.getItemCount()) {
                this.f80290a.notifyDataSetChanged();
            }
            this.f80290a.notifyItemRangeRemoved(((Number) this.f80291b.invoke(Integer.valueOf(i))).intValue(), i2);
        }
    }

    /* renamed from: c */
    public final void mo256c(int i, int i2) {
        this.f80290a.notifyItemMoved(((Number) this.f80291b.invoke(Integer.valueOf(i))).intValue(), ((Number) this.f80291b.invoke(Integer.valueOf(i2))).intValue());
    }

    /* renamed from: a */
    public final void mo254a(int i, int i2, Object obj) {
        this.f80290a.notifyItemRangeChanged(((Number) this.f80291b.invoke(Integer.valueOf(i))).intValue(), i2, obj);
    }
}
