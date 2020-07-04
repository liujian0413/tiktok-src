package com.p280ss.android.ugc.aweme.shortvideo.cut.model;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.model.e */
public final class C38786e {

    /* renamed from: a */
    public boolean f100799a;

    /* renamed from: b */
    public final int f100800b;

    /* renamed from: c */
    public final int f100801c;

    /* renamed from: d */
    public final int f100802d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38786e) {
                C38786e eVar = (C38786e) obj;
                if (this.f100800b == eVar.f100800b) {
                    if (this.f100801c == eVar.f100801c) {
                        if (this.f100802d == eVar.f100802d) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f100800b * 31) + this.f100801c) * 31) + this.f100802d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SwapStateWrapper(state=");
        sb.append(this.f100800b);
        sb.append(", from=");
        sb.append(this.f100801c);
        sb.append(", to=");
        sb.append(this.f100802d);
        sb.append(")");
        return sb.toString();
    }

    public C38786e(int i, int i2, int i3) {
        this.f100800b = i;
        this.f100801c = i2;
        this.f100802d = i3;
    }
}
