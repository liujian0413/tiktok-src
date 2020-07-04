package com.p280ss.android.ugc.aweme.app.p1027b;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.b.a */
public final class C22889a {

    /* renamed from: a */
    public boolean f60604a;

    /* renamed from: b */
    public long f60605b;

    /* renamed from: c */
    public String f60606c;

    public C22889a() {
        this(false, 0, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22889a) {
                C22889a aVar = (C22889a) obj;
                if (this.f60604a == aVar.f60604a) {
                    if (!(this.f60605b == aVar.f60605b) || !C7573i.m23585a((Object) this.f60606c, (Object) aVar.f60606c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f60604a;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        long j = this.f60605b;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.f60606c;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApiConfig(isBanned=");
        sb.append(this.f60604a);
        sb.append(", delayTime=");
        sb.append(this.f60605b);
        sb.append(", apiName=");
        sb.append(this.f60606c);
        sb.append(")");
        return sb.toString();
    }

    public C22889a(boolean z, long j, String str) {
        C7573i.m23587b(str, "apiName");
        this.f60604a = z;
        this.f60605b = j;
        this.f60606c = str;
    }

    public /* synthetic */ C22889a(boolean z, long j, String str, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            j = 45000;
        }
        if ((i & 4) != 0) {
            str = "default";
        }
        this(false, j, str);
    }
}
