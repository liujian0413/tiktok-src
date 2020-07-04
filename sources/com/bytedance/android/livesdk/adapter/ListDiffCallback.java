package com.bytedance.android.livesdk.adapter;

import android.support.p029v7.util.C1143a.C1145a;
import java.util.List;

public class ListDiffCallback extends C1145a {

    /* renamed from: a */
    private final List<?> f11586a;

    /* renamed from: b */
    private final List<?> f11587b;

    /* renamed from: a */
    public final int mo248a() {
        if (this.f11586a != null) {
            return this.f11586a.size();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo250b() {
        if (this.f11587b != null) {
            return this.f11587b.size();
        }
        return 0;
    }

    public ListDiffCallback(List<?> list, List<?> list2) {
        this.f11586a = list;
        this.f11587b = list2;
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        if ((this.f11586a.get(i) instanceof C3881d) && (this.f11587b.get(i2) instanceof C3881d)) {
            return ((C3881d) this.f11586a.get(i)).mo11421a(this.f11587b.get(i2));
        }
        if (this.f11586a.get(i) == this.f11587b.get(i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        if (!(this.f11586a.get(i) instanceof C3881d) || !(this.f11587b.get(i2) instanceof C3881d)) {
            return false;
        }
        return ((C3881d) this.f11586a.get(i)).mo11422b(this.f11587b.get(i2));
    }
}
