package com.aweme.storage;

/* renamed from: com.aweme.storage.m */
public final class C1934m {

    /* renamed from: a */
    public int f6958a;

    /* renamed from: b */
    public String f6959b;

    /* renamed from: c */
    public long f6960c;

    /* renamed from: d */
    public long f6961d;

    /* renamed from: e */
    public int f6962e;

    /* renamed from: a */
    public final int mo7552a(C1934m mVar) {
        long j;
        long j2 = this.f6960c;
        if (mVar == null) {
            j = 0;
        } else {
            j = mVar.f6960c;
        }
        if (j2 < j) {
            return 1;
        }
        if (j2 == j) {
            return 0;
        }
        return -1;
    }

    public C1934m(String str, long j, int i) {
        this.f6959b = str;
        this.f6961d = j;
        this.f6962e = i;
    }
}
