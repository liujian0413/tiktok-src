package com.p280ss.android.ugc.aweme.filter;

import android.support.p029v7.util.C1143a.C1145a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.EffectFilterDiff */
public class EffectFilterDiff extends C1145a {

    /* renamed from: a */
    private List<C29296g> f76927a;

    /* renamed from: b */
    private List<C29296g> f76928b;

    /* renamed from: a */
    public final int mo248a() {
        return this.f76927a.size();
    }

    /* renamed from: b */
    public final int mo250b() {
        return this.f76928b.size();
    }

    public EffectFilterDiff(List<C29296g> list, List<C29296g> list2) {
        this.f76927a = list;
        this.f76928b = list2;
    }

    /* renamed from: b */
    public final boolean mo251b(int i, int i2) {
        if (i == i2 || ((C29296g) this.f76927a.get(i)).f77266a == ((C29296g) this.f76928b.get(i2)).f77266a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo252c(int i, int i2) {
        return ((C29296g) this.f76927a.get(i)).equals(this.f76928b.get(i2));
    }
}
