package com.p280ss.android.ugc.aweme.poi.event;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.event.e */
public final class C35082e {

    /* renamed from: a */
    public final String f91743a;

    /* renamed from: b */
    public final String f91744b;

    /* renamed from: c */
    public final String f91745c;

    /* renamed from: d */
    public final int f91746d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35082e) {
                C35082e eVar = (C35082e) obj;
                if (C7573i.m23585a((Object) this.f91743a, (Object) eVar.f91743a) && C7573i.m23585a((Object) this.f91744b, (Object) eVar.f91744b) && C7573i.m23585a((Object) this.f91745c, (Object) eVar.f91745c)) {
                    if (this.f91746d == eVar.f91746d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f91743a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f91744b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f91745c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f91746d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateQA(poiId=");
        sb.append(this.f91743a);
        sb.append(", questionId=");
        sb.append(this.f91744b);
        sb.append(", answerId=");
        sb.append(this.f91745c);
        sb.append(", action=");
        sb.append(this.f91746d);
        sb.append(")");
        return sb.toString();
    }

    public C35082e(String str, String str2, String str3, int i) {
        C7573i.m23587b(str, "poiId");
        C7573i.m23587b(str2, "questionId");
        C7573i.m23587b(str3, "answerId");
        this.f91743a = str;
        this.f91744b = str2;
        this.f91745c = str3;
        this.f91746d = i;
    }
}
