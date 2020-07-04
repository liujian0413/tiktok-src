package com.p280ss.android.ugc.aweme.discover.helper;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.e */
public final class C26657e {

    /* renamed from: a */
    public final int f70283a;

    /* renamed from: b */
    public final int f70284b;

    /* renamed from: c */
    public final int f70285c;

    /* renamed from: d */
    public final C26665m f70286d;

    public C26657e() {
        this(0, 0, 0, null, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26657e) {
                C26657e eVar = (C26657e) obj;
                if (this.f70283a == eVar.f70283a) {
                    if (this.f70284b == eVar.f70284b) {
                        if (!(this.f70285c == eVar.f70285c) || !C7573i.m23585a((Object) this.f70286d, (Object) eVar.f70286d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.f70283a * 31) + this.f70284b) * 31) + this.f70285c) * 31;
        C26665m mVar = this.f70286d;
        return i + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicDownloadStatus(status=");
        sb.append(this.f70283a);
        sb.append(", percent=");
        sb.append(this.f70284b);
        sb.append(", errorMsg=");
        sb.append(this.f70285c);
        sb.append(", toVideoProgress=");
        sb.append(this.f70286d);
        sb.append(")");
        return sb.toString();
    }

    public C26657e(int i, int i2, int i3, C26665m mVar) {
        this.f70283a = i;
        this.f70284b = i2;
        this.f70285c = i3;
        this.f70286d = mVar;
    }

    public /* synthetic */ C26657e(int i, int i2, int i3, C26665m mVar, int i4, C7571f fVar) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        this(i, i2, i3, null);
    }
}
