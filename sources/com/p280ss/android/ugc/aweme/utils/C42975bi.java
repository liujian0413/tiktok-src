package com.p280ss.android.ugc.aweme.utils;

/* renamed from: com.ss.android.ugc.aweme.utils.bi */
public final class C42975bi {

    /* renamed from: a */
    public int f111533a;

    public C42975bi(int i) {
        this.f111533a = i;
    }

    /* renamed from: a */
    public final C42975bi mo104682a(int i) {
        this.f111533a = i | this.f111533a;
        return this;
    }

    /* renamed from: b */
    public final C42975bi mo104683b(int i) {
        if (mo104684c(i)) {
            this.f111533a = (i ^ -1) & this.f111533a;
        }
        return this;
    }

    /* renamed from: c */
    public final boolean mo104684c(int i) {
        if ((this.f111533a & i) == i) {
            return true;
        }
        return false;
    }
}
