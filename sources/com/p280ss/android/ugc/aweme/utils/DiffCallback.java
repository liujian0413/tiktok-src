package com.p280ss.android.ugc.aweme.utils;

import android.support.p029v7.util.C1143a.C1145a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.DiffCallback */
public final class DiffCallback extends C1145a {

    /* renamed from: a */
    public final List<?> f111415a;

    /* renamed from: b */
    private final List<?> f111416b;

    /* renamed from: a */
    public final int mo248a() {
        return this.f111416b.size();
    }

    /* renamed from: b */
    public final int mo250b() {
        return this.f111415a.size();
    }

    public DiffCallback(List<?> list, List<?> list2) {
        C7573i.m23587b(list, "oldList");
        C7573i.m23587b(list2, "newList");
        this.f111416b = list;
        this.f111415a = list2;
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        return C7573i.m23585a(this.f111416b.get(i), this.f111415a.get(i2));
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        return C7573i.m23585a(this.f111416b.get(i), this.f111415a.get(i2));
    }
}
