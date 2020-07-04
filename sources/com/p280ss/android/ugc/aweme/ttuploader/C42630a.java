package com.p280ss.android.ugc.aweme.ttuploader;

import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.ttuploader.a */
public final class C42630a {

    /* renamed from: a */
    public final int f110796a;

    public C42630a() {
        this(0, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42630a) {
                if (this.f110796a == ((C42630a) obj).f110796a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f110796a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthKeyRequestParam(awemeType=");
        sb.append(this.f110796a);
        sb.append(")");
        return sb.toString();
    }

    public C42630a(int i) {
        this.f110796a = i;
    }

    private /* synthetic */ C42630a(int i, int i2, C7571f fVar) {
        this(-1);
    }
}
