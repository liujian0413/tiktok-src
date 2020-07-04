package com.p280ss.android.ugc.aweme.beauty;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.c */
public final class C23532c {

    /* renamed from: a */
    public final BeautyCategoryGender f62108a;

    /* renamed from: b */
    public final boolean f62109b;

    /* renamed from: c */
    public final boolean f62110c;

    /* renamed from: d */
    public final boolean f62111d;

    /* renamed from: e */
    public final boolean f62112e;

    public C23532c() {
        this(null, false, false, false, false, 31, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static C23532c m77289a(BeautyCategoryGender beautyCategoryGender, boolean z, boolean z2, boolean z3, boolean z4) {
        C7573i.m23587b(beautyCategoryGender, "gender");
        C23532c cVar = new C23532c(beautyCategoryGender, z, z2, z3, z4);
        return cVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BeautyInitController(gender=");
        sb.append(this.f62108a);
        sb.append(", init=");
        sb.append(this.f62109b);
        sb.append(", forceUpdate=");
        sb.append(this.f62110c);
        sb.append(", isFaceDetect=");
        sb.append(this.f62111d);
        sb.append(", useTempData=");
        sb.append(this.f62112e);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return this.f62108a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C23532c)) {
            return false;
        }
        C23532c cVar = (C23532c) obj;
        if (cVar.f62108a == this.f62108a && cVar.f62109b == this.f62109b && cVar.f62112e == this.f62112e) {
            return true;
        }
        return false;
    }

    public C23532c(BeautyCategoryGender beautyCategoryGender, boolean z, boolean z2, boolean z3, boolean z4) {
        C7573i.m23587b(beautyCategoryGender, "gender");
        this.f62108a = beautyCategoryGender;
        this.f62109b = z;
        this.f62110c = z2;
        this.f62111d = z3;
        this.f62112e = z4;
    }

    public /* synthetic */ C23532c(BeautyCategoryGender beautyCategoryGender, boolean z, boolean z2, boolean z3, boolean z4, int i, C7571f fVar) {
        this(BeautyCategoryGender.FEMALE, false, false, false, false);
    }
}
