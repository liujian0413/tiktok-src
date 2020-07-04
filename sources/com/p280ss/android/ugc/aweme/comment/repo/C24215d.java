package com.p280ss.android.ugc.aweme.comment.repo;

import com.p280ss.android.ugc.aweme.poi.services.POIService;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.comment.repo.d */
public final class C24215d {

    /* renamed from: a */
    public final String f63929a;

    /* renamed from: b */
    public final int f63930b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24215d) {
                C24215d dVar = (C24215d) obj;
                if (C7573i.m23585a((Object) this.f63929a, (Object) dVar.f63929a)) {
                    if (this.f63930b == dVar.f63930b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f63929a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f63930b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifEmojiListRequestParam(keyword=");
        sb.append(this.f63929a);
        sb.append(", cursor=");
        sb.append(this.f63930b);
        sb.append(")");
        return sb.toString();
    }

    public C24215d(String str, int i) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        this.f63929a = str;
        this.f63930b = i;
    }
}
