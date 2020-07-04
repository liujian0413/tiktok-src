package com.p280ss.android.ugc.aweme.discover.mixfeed;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.b */
public final class C26750b {

    /* renamed from: a */
    public final int f70512a;

    /* renamed from: b */
    public final RecomWordFetchStage f70513b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26750b) {
                C26750b bVar = (C26750b) obj;
                if (!(this.f70512a == bVar.f70512a) || !C7573i.m23585a((Object) this.f70513b, (Object) bVar.f70513b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f70512a) * 31;
        RecomWordFetchStage recomWordFetchStage = this.f70513b;
        return hashCode + (recomWordFetchStage != null ? recomWordFetchStage.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecomWordFetchState(index=");
        sb.append(this.f70512a);
        sb.append(", stage=");
        sb.append(this.f70513b);
        sb.append(")");
        return sb.toString();
    }

    public C26750b(int i, RecomWordFetchStage recomWordFetchStage) {
        C7573i.m23587b(recomWordFetchStage, "stage");
        this.f70512a = i;
        this.f70513b = recomWordFetchStage;
    }
}
