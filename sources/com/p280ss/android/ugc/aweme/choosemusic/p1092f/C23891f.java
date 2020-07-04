package com.p280ss.android.ugc.aweme.choosemusic.p1092f;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.f.f */
public final class C23891f {

    /* renamed from: a */
    public String f63039a;

    /* renamed from: b */
    public long f63040b;

    /* renamed from: c */
    private long f63041c;

    /* renamed from: d */
    private int f63042d;

    /* renamed from: c */
    public final int mo61989c(String str) {
        if (!C7573i.m23585a((Object) this.f63039a, (Object) str)) {
            return 0;
        }
        return this.f63042d;
    }

    /* renamed from: a */
    public final void mo61986a(String str) {
        if (!C7573i.m23585a((Object) this.f63039a, (Object) str)) {
            this.f63040b = -1;
            this.f63041c = 0;
            return;
        }
        this.f63041c = System.currentTimeMillis() - this.f63040b;
    }

    /* renamed from: b */
    public final long mo61988b(String str) {
        if (!C7573i.m23585a((Object) this.f63039a, (Object) str)) {
            return 0;
        }
        if (this.f63041c <= 0 && this.f63040b > 0) {
            this.f63041c = System.currentTimeMillis() - this.f63040b;
        }
        return this.f63041c;
    }

    /* renamed from: a */
    public final void mo61987a(String str, int i) {
        this.f63039a = str;
        this.f63041c = 0;
        this.f63040b = System.currentTimeMillis();
        this.f63042d = i;
    }
}
