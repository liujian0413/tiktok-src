package com.p280ss.android.ugc.aweme.p1685ug.recycle;

import android.support.p029v7.widget.RecyclerView.C1282n;
import android.support.p029v7.widget.RecyclerView.C1293v;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.ug.recycle.GlobalRVPool */
public class GlobalRVPool extends C1282n {

    /* renamed from: b */
    public int f111049b;

    /* renamed from: c */
    public int f111050c;

    /* renamed from: d */
    private Set<Integer> f111051d;

    /* renamed from: com.ss.android.ugc.aweme.ug.recycle.GlobalRVPool$a */
    static class C42739a {

        /* renamed from: a */
        public static final GlobalRVPool f111052a = new GlobalRVPool();
    }

    /* renamed from: d */
    public static GlobalRVPool m135664d() {
        return C42739a.f111052a;
    }

    /* renamed from: e */
    public final void mo104349e() {
        for (Integer intValue : this.f111051d) {
            m135665d(intValue.intValue());
        }
    }

    private GlobalRVPool() {
        this.f111051d = new HashSet();
        this.f111049b = 15;
        this.f111050c = 0;
        mo5821a(0, m135663c(0));
        mo5821a(Integer.MIN_VALUE, m135663c(Integer.MIN_VALUE));
    }

    /* renamed from: b */
    public final C1293v mo5826b(int i) {
        return super.mo5826b(i);
    }

    /* renamed from: c */
    private int m135663c(int i) {
        if (i == Integer.MIN_VALUE) {
            return this.f111050c;
        }
        if (i != 0) {
            return 5;
        }
        return this.f111049b;
    }

    /* renamed from: a */
    public final void mo5824a(C1293v vVar) {
        super.mo5824a(vVar);
        this.f111051d.add(Integer.valueOf(vVar.mItemViewType));
    }

    /* renamed from: d */
    private void m135665d(int i) {
        if (this.f111051d.contains(Integer.valueOf(i))) {
            int a = mo5819a(i);
            for (int i2 = 0; i2 < a; i2++) {
                mo5826b(i);
            }
        }
    }
}
