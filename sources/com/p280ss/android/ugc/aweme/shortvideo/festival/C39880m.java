package com.p280ss.android.ugc.aweme.shortvideo.festival;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.festival.m */
public final class C39880m {

    /* renamed from: a */
    public final int f103623a;

    /* renamed from: b */
    public final String f103624b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39880m) {
                C39880m mVar = (C39880m) obj;
                if (!(this.f103623a == mVar.f103623a) || !C7573i.m23585a((Object) this.f103624b, (Object) mVar.f103624b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f103623a * 31;
        String str = this.f103624b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WaterFile(index=");
        sb.append(this.f103623a);
        sb.append(", path=");
        sb.append(this.f103624b);
        sb.append(")");
        return sb.toString();
    }

    public C39880m(int i, String str) {
        C7573i.m23587b(str, "path");
        this.f103623a = i;
        this.f103624b = str;
    }
}
