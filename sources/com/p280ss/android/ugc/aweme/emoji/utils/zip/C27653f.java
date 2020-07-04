package com.p280ss.android.ugc.aweme.emoji.utils.zip;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.zip.f */
public final class C27653f implements Cloneable {

    /* renamed from: a */
    public boolean f72853a;

    /* renamed from: b */
    public boolean f72854b;

    /* renamed from: c */
    public boolean f72855c;

    /* renamed from: d */
    private boolean f72856d;

    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("GeneralPurposeBit is not Cloneable?", e);
        }
    }

    public final int hashCode() {
        return (((((((this.f72855c ? 1 : 0) * true) + (this.f72856d ? 1 : 0)) * 13) + (this.f72853a ? 1 : 0)) * 7) + (this.f72854b ? 1 : 0)) * 3;
    }

    /* renamed from: a */
    private void m90663a(boolean z) {
        this.f72856d = z;
        if (z) {
            this.f72855c = true;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C27653f)) {
            return false;
        }
        C27653f fVar = (C27653f) obj;
        if (fVar.f72855c == this.f72855c && fVar.f72856d == this.f72856d && fVar.f72853a == this.f72853a && fVar.f72854b == this.f72854b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C27653f m90664b(byte[] bArr, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int a = C27679w.m90805a(bArr, 4);
        C27653f fVar = new C27653f();
        boolean z4 = false;
        if ((a & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        fVar.f72854b = z;
        if ((a & 2048) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        fVar.f72853a = z2;
        if ((a & 64) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        fVar.m90663a(z3);
        if ((a & 1) != 0) {
            z4 = true;
        }
        fVar.f72855c = z4;
        return fVar;
    }

    /* renamed from: a */
    public final void mo71056a(byte[] bArr, int i) {
        char c;
        char c2;
        char c3 = 0;
        if (this.f72854b) {
            c = 8;
        } else {
            c = 0;
        }
        if (this.f72853a) {
            c2 = 2048;
        } else {
            c2 = 0;
        }
        boolean z = c | c2 | this.f72855c;
        if (this.f72856d) {
            c3 = '@';
        }
        C27679w.m90806a(z | c3 ? 1 : 0, bArr, 8);
    }
}
