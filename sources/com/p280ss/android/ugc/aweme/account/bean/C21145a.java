package com.p280ss.android.ugc.aweme.account.bean;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.bean.a */
public final class C21145a {

    /* renamed from: d */
    public static final C21146a f56808d = new C21146a(null);

    /* renamed from: a */
    public final String f56809a;

    /* renamed from: b */
    public final String f56810b;

    /* renamed from: c */
    public final boolean f56811c;

    /* renamed from: com.ss.android.ugc.aweme.account.bean.a$a */
    public static final class C21146a {
        private C21146a() {
        }

        public /* synthetic */ C21146a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C21145a) {
                C21145a aVar = (C21145a) obj;
                if (C7573i.m23585a((Object) this.f56809a, (Object) aVar.f56809a) && C7573i.m23585a((Object) this.f56810b, (Object) aVar.f56810b)) {
                    if (this.f56811c == aVar.f56811c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f56809a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f56810b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int i2 = (hashCode + i) * 31;
        boolean z = this.f56811c;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppBindRequest(platformName=");
        sb.append(this.f56809a);
        sb.append(", bindKey=");
        sb.append(this.f56810b);
        sb.append(", actionBool=");
        sb.append(this.f56811c);
        sb.append(")");
        return sb.toString();
    }
}
