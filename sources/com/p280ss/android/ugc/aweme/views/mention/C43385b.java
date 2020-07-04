package com.p280ss.android.ugc.aweme.views.mention;

/* renamed from: com.ss.android.ugc.aweme.views.mention.b */
public final class C43385b {

    /* renamed from: a */
    public int f112372a;

    /* renamed from: b */
    public int f112373b;

    /* renamed from: a */
    public final int mo105290a(int i) {
        if ((i - this.f112372a) - (this.f112373b - i) >= 0) {
            return this.f112373b;
        }
        return this.f112372a;
    }

    public C43385b(int i, int i2) {
        this.f112372a = i;
        this.f112373b = i2;
    }

    /* renamed from: b */
    public final boolean mo105292b(int i, int i2) {
        if (this.f112372a > i || this.f112373b < i2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo105291a(int i, int i2) {
        if ((i <= this.f112372a || i >= this.f112373b) && (i2 <= this.f112372a || i2 >= this.f112373b)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo105293c(int i, int i2) {
        if ((this.f112372a == i && this.f112373b == i2) || (this.f112372a == i2 && this.f112373b == i)) {
            return true;
        }
        return false;
    }
}
