package com.p280ss.android.ugc.aweme.sec.p1509a;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.sec.a.a */
public final class C37398a {

    /* renamed from: a */
    public String f97673a;

    /* renamed from: b */
    public int f97674b;

    /* renamed from: c */
    public String f97675c;

    /* renamed from: d */
    public String f97676d;

    /* renamed from: e */
    public String f97677e;

    /* renamed from: f */
    public String f97678f;

    /* renamed from: g */
    public String f97679g;

    /* renamed from: h */
    public int f97680h;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C37398a) {
                C37398a aVar = (C37398a) obj;
                if (C7573i.m23585a((Object) this.f97673a, (Object) aVar.f97673a)) {
                    if ((this.f97674b == aVar.f97674b) && C7573i.m23585a((Object) this.f97675c, (Object) aVar.f97675c) && C7573i.m23585a((Object) this.f97676d, (Object) aVar.f97676d) && C7573i.m23585a((Object) this.f97677e, (Object) aVar.f97677e) && C7573i.m23585a((Object) this.f97678f, (Object) aVar.f97678f) && C7573i.m23585a((Object) this.f97679g, (Object) aVar.f97679g)) {
                        if (this.f97680h == aVar.f97680h) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f97673a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f97674b) * 31;
        String str2 = this.f97675c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f97676d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f97677e;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f97678f;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.f97679g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return ((hashCode5 + i) * 31) + this.f97680h;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CaptchaParams(language=");
        sb.append(this.f97673a);
        sb.append(", aid=");
        sb.append(this.f97674b);
        sb.append(", appName=");
        sb.append(this.f97675c);
        sb.append(", iid=");
        sb.append(this.f97676d);
        sb.append(", did=");
        sb.append(this.f97677e);
        sb.append(", channel=");
        sb.append(this.f97678f);
        sb.append(", session=");
        sb.append(this.f97679g);
        sb.append(", errorCode=");
        sb.append(this.f97680h);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo94159a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f97676d = str;
    }

    /* renamed from: b */
    public final void mo94160b(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f97677e = str;
    }

    private C37398a(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2) {
        C7573i.m23587b(str, "language");
        C7573i.m23587b(str2, "appName");
        C7573i.m23587b(str3, "iid");
        C7573i.m23587b(str4, "did");
        C7573i.m23587b(str5, "channel");
        C7573i.m23587b(str6, "session");
        this.f97673a = str;
        this.f97674b = i;
        this.f97675c = str2;
        this.f97676d = str3;
        this.f97677e = str4;
        this.f97678f = str5;
        this.f97679g = str6;
        this.f97680h = i2;
    }

    public /* synthetic */ C37398a(String str, int i, String str2, String str3, String str4, String str5, String str6, int i2, int i3, C7571f fVar) {
        this(str, i, str2, str3, str4, str5, str6, 3058);
    }
}
