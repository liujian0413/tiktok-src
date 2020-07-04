package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.support.p029v7.util.C1143a.C1145a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.DiffCallback */
public class DiffCallback extends C1145a {

    /* renamed from: a */
    private final List f83317a;

    /* renamed from: b */
    private final List f83318b;

    /* renamed from: a */
    public final int mo248a() {
        return this.f83317a.size();
    }

    /* renamed from: b */
    public final int mo250b() {
        return this.f83318b.size();
    }

    public DiffCallback(List list, List list2) {
        this.f83317a = list;
        this.f83318b = list2;
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        return this.f83317a.get(i).equals(this.f83318b.get(i2));
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        return this.f83317a.get(i).equals(this.f83318b.get(i2));
    }
}
