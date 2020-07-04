package com.p280ss.android.ugc.aweme.toolsport.p1679a;

import android.os.Bundle;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.toolsport.a.c */
public final class C42603c {

    /* renamed from: g */
    public static final C42604a f110753g = new C42604a(null);

    /* renamed from: a */
    public final String f110754a;

    /* renamed from: b */
    public final int f110755b;

    /* renamed from: c */
    public final boolean f110756c;

    /* renamed from: d */
    public final Bundle f110757d;

    /* renamed from: e */
    public final String f110758e;

    /* renamed from: f */
    public final String f110759f;

    /* renamed from: com.ss.android.ugc.aweme.toolsport.a.c$a */
    public static final class C42604a {
        private C42604a() {
        }

        public /* synthetic */ C42604a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C42603c m135391a(String str, boolean z, Bundle bundle, String str2, String str3) {
            C42603c cVar = new C42603c(str, 0, false, null, str2, str3);
            return cVar;
        }

        /* renamed from: a */
        public static C42603c m135390a(String str, int i, boolean z, Bundle bundle, String str2, String str3) {
            C42603c cVar = new C42603c(str, i, z, bundle, str2, str3);
            return cVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C42603c) {
                C42603c cVar = (C42603c) obj;
                if (C7573i.m23585a((Object) this.f110754a, (Object) cVar.f110754a)) {
                    if (this.f110755b == cVar.f110755b) {
                        if (!(this.f110756c == cVar.f110756c) || !C7573i.m23585a((Object) this.f110757d, (Object) cVar.f110757d) || !C7573i.m23585a((Object) this.f110758e, (Object) cVar.f110758e) || !C7573i.m23585a((Object) this.f110759f, (Object) cVar.f110759f)) {
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
        String str = this.f110754a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f110755b) * 31;
        boolean z = this.f110756c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        Bundle bundle = this.f110757d;
        int hashCode2 = (i2 + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str2 = this.f110758e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f110759f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChooseMusicRequestBean(title=");
        sb.append(this.f110754a);
        sb.append(", musicChooseType=");
        sb.append(this.f110755b);
        sb.append(", allowClear=");
        sb.append(this.f110756c);
        sb.append(", bundle=");
        sb.append(this.f110757d);
        sb.append(", shootWay=");
        sb.append(this.f110758e);
        sb.append(", creationId=");
        sb.append(this.f110759f);
        sb.append(")");
        return sb.toString();
    }

    public C42603c(String str, int i, boolean z, Bundle bundle, String str2, String str3) {
        this.f110754a = str;
        this.f110755b = i;
        this.f110756c = z;
        this.f110757d = bundle;
        this.f110758e = str2;
        this.f110759f = str3;
    }
}
