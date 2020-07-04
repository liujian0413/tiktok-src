package com.p280ss.android.ugc.aweme.beauty;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.e */
public final class C23534e {

    /* renamed from: c */
    public static final C23535a f62115c = new C23535a(null);

    /* renamed from: a */
    public final String f62116a;

    /* renamed from: b */
    public final int f62117b;

    /* renamed from: com.ss.android.ugc.aweme.beauty.e$a */
    public static final class C23535a {
        private C23535a() {
        }

        public /* synthetic */ C23535a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C23534e) {
                C23534e eVar = (C23534e) obj;
                if (C7573i.m23585a((Object) this.f62116a, (Object) eVar.f62116a)) {
                    if (this.f62117b == eVar.f62117b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f62116a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f62117b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautySequence(effectId=");
        sb.append(this.f62116a);
        sb.append(", type=");
        sb.append(this.f62117b);
        sb.append(")");
        return sb.toString();
    }

    public C23534e(String str, int i) {
        C7573i.m23587b(str, "effectId");
        this.f62116a = str;
        this.f62117b = i;
    }

    public /* synthetic */ C23534e(String str, int i, int i2, C7571f fVar) {
        this(str, 1);
    }
}
