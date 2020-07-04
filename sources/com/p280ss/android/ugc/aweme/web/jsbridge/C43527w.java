package com.p280ss.android.ugc.aweme.web.jsbridge;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.w */
public final class C43527w {

    /* renamed from: e */
    public static final C43528a f112691e = new C43528a(null);

    /* renamed from: a */
    public final String f112692a;

    /* renamed from: b */
    public final int f112693b;

    /* renamed from: c */
    public final long f112694c;

    /* renamed from: d */
    public final String f112695d;

    /* renamed from: com.ss.android.ugc.aweme.web.jsbridge.w$a */
    public static final class C43528a {
        private C43528a() {
        }

        public /* synthetic */ C43528a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43527w) {
                C43527w wVar = (C43527w) obj;
                if (C7573i.m23585a((Object) this.f112692a, (Object) wVar.f112692a)) {
                    if (this.f112693b == wVar.f112693b) {
                        if (!(this.f112694c == wVar.f112694c) || !C7573i.m23585a((Object) this.f112695d, (Object) wVar.f112695d)) {
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
        String str = this.f112692a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.f112693b)) * 31) + Long.hashCode(this.f112694c)) * 31;
        String str2 = this.f112695d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongVideoStatusEvent(sessionId=");
        sb.append(this.f112692a);
        sb.append(", status=");
        sb.append(this.f112693b);
        sb.append(", currentTime=");
        sb.append(this.f112694c);
        sb.append(", currentId=");
        sb.append(this.f112695d);
        sb.append(")");
        return sb.toString();
    }

    public C43527w(String str, int i, long j, String str2) {
        C7573i.m23587b(str, "sessionId");
        C7573i.m23587b(str2, "currentId");
        this.f112692a = str;
        this.f112693b = i;
        this.f112694c = j;
        this.f112695d = str2;
    }
}
