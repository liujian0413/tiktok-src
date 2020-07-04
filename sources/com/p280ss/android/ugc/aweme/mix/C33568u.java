package com.p280ss.android.ugc.aweme.mix;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.u */
public final class C33568u {

    /* renamed from: a */
    public final String f87664a;

    /* renamed from: b */
    public final long f87665b;

    /* renamed from: c */
    public final int f87666c;

    /* renamed from: d */
    public final int f87667d;

    public C33568u() {
        this(null, 0, 0, 0, 15, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C33568u) {
                C33568u uVar = (C33568u) obj;
                if (C7573i.m23585a((Object) this.f87664a, (Object) uVar.f87664a)) {
                    if (this.f87665b == uVar.f87665b) {
                        if (this.f87666c == uVar.f87666c) {
                            if (this.f87667d == uVar.f87667d) {
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
        String str = this.f87664a;
        return ((((((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.f87665b)) * 31) + Integer.hashCode(this.f87666c)) * 31) + Integer.hashCode(this.f87667d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MixListRequestParams(mixId=");
        sb.append(this.f87664a);
        sb.append(", cursor=");
        sb.append(this.f87665b);
        sb.append(", count=");
        sb.append(this.f87666c);
        sb.append(", pullType=");
        sb.append(this.f87667d);
        sb.append(")");
        return sb.toString();
    }

    public C33568u(String str, long j, int i, int i2) {
        this.f87664a = str;
        this.f87665b = j;
        this.f87666c = i;
        this.f87667d = i2;
    }

    private /* synthetic */ C33568u(String str, long j, int i, int i2, int i3, C7571f fVar) {
        this(null, 0, 15, 2);
    }
}
