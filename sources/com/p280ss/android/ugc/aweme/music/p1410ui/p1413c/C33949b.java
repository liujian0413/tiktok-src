package com.p280ss.android.ugc.aweme.music.p1410ui.p1413c;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.c.b */
public final class C33949b {

    /* renamed from: a */
    public final String f88580a;

    /* renamed from: b */
    public final long f88581b;

    /* renamed from: c */
    public final int f88582c;

    /* renamed from: d */
    public final int f88583d;

    public C33949b() {
        this(null, 0, 0, 0, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33949b) {
                C33949b bVar = (C33949b) obj;
                if (C7573i.m23585a((Object) this.f88580a, (Object) bVar.f88580a)) {
                    if (this.f88581b == bVar.f88581b) {
                        if (this.f88582c == bVar.f88582c) {
                            if (this.f88583d == bVar.f88583d) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f88580a;
        return ((((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.f88581b)) * 31) + Integer.hashCode(this.f88582c)) * 31) + Integer.hashCode(this.f88583d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimilarMusicListRequestParams(musicId=");
        sb.append(this.f88580a);
        sb.append(", cursor=");
        sb.append(this.f88581b);
        sb.append(", count=");
        sb.append(this.f88582c);
        sb.append(", enter_from=");
        sb.append(this.f88583d);
        sb.append(")");
        return sb.toString();
    }

    public C33949b(String str, long j, int i, int i2) {
        this.f88580a = str;
        this.f88581b = j;
        this.f88582c = i;
        this.f88583d = i2;
    }

    private /* synthetic */ C33949b(String str, long j, int i, int i2, int i3, C7571f fVar) {
        this(null, 0, 10, 1);
    }
}
