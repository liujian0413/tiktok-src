package com.p280ss.android.ugc.aweme.discover.mixfeed;

import com.p280ss.android.ugc.aweme.discover.api.p1174a.C26568a;
import com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder.TrendingSource;
import com.p280ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.a */
public final class C26740a {

    /* renamed from: a */
    public final int f70476a;

    /* renamed from: b */
    public final String f70477b;

    /* renamed from: c */
    public final String f70478c;

    /* renamed from: d */
    public final TrendingSource f70479d;

    /* renamed from: e */
    public final C26568a<TypeWords> f70480e;

    public C26740a() {
        this(0, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26740a) {
                C26740a aVar = (C26740a) obj;
                if (!(this.f70476a == aVar.f70476a) || !C7573i.m23585a((Object) this.f70477b, (Object) aVar.f70477b) || !C7573i.m23585a((Object) this.f70478c, (Object) aVar.f70478c) || !C7573i.m23585a((Object) this.f70479d, (Object) aVar.f70479d) || !C7573i.m23585a((Object) this.f70480e, (Object) aVar.f70480e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f70476a) * 31;
        String str = this.f70477b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f70478c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        TrendingSource trendingSource = this.f70479d;
        int hashCode4 = (hashCode3 + (trendingSource != null ? trendingSource.hashCode() : 0)) * 31;
        C26568a<TypeWords> aVar = this.f70480e;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecomWordData(displayingIndex=");
        sb.append(this.f70476a);
        sb.append(", gid=");
        sb.append(this.f70477b);
        sb.append(", query=");
        sb.append(this.f70478c);
        sb.append(", trendingSource=");
        sb.append(this.f70479d);
        sb.append(", result=");
        sb.append(this.f70480e);
        sb.append(")");
        return sb.toString();
    }

    public C26740a(int i, String str, String str2, TrendingSource trendingSource, C26568a<TypeWords> aVar) {
        C7573i.m23587b(trendingSource, "trendingSource");
        this.f70476a = i;
        this.f70477b = str;
        this.f70478c = str2;
        this.f70479d = trendingSource;
        this.f70480e = aVar;
    }

    private /* synthetic */ C26740a(int i, String str, String str2, TrendingSource trendingSource, C26568a aVar, int i2, C7571f fVar) {
        this(-1, null, null, TrendingSource.CLICK_VIDEO_BACK, null);
    }
}
