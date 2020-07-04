package com.p280ss.android.ugc.aweme.shortvideo.cut;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.r */
public final class C38795r<DATA> {

    /* renamed from: a */
    public final int f100816a;

    /* renamed from: b */
    public final int f100817b;

    /* renamed from: c */
    public final DATA f100818c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38795r) {
                C38795r rVar = (C38795r) obj;
                if (this.f100816a == rVar.f100816a) {
                    if (!(this.f100817b == rVar.f100817b) || !C7573i.m23585a((Object) this.f100818c, (Object) rVar.f100818c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.f100816a * 31) + this.f100817b) * 31;
        DATA data = this.f100818c;
        return i + (data != null ? data.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoFrameData(width=");
        sb.append(this.f100816a);
        sb.append(", height=");
        sb.append(this.f100817b);
        sb.append(", data=");
        sb.append(this.f100818c);
        sb.append(")");
        return sb.toString();
    }

    public C38795r(int i, int i2, DATA data) {
        this.f100816a = i;
        this.f100817b = i2;
        this.f100818c = data;
    }
}
