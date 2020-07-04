package com.p280ss.android.ugc.aweme.favorites.p1213d;

/* renamed from: com.ss.android.ugc.aweme.favorites.d.a */
public final class C27749a {

    /* renamed from: a */
    public final int f73183a;

    /* renamed from: b */
    public final int f73184b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C27749a) {
                C27749a aVar = (C27749a) obj;
                if (this.f73183a == aVar.f73183a) {
                    if (this.f73184b == aVar.f73184b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.f73183a) * 31) + Integer.hashCode(this.f73184b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectListRequestParams(cursor=");
        sb.append(this.f73183a);
        sb.append(", count=");
        sb.append(this.f73184b);
        sb.append(")");
        return sb.toString();
    }

    public C27749a(int i, int i2) {
        this.f73183a = i;
        this.f73184b = i2;
    }
}
