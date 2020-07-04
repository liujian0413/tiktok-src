package com.p280ss.android.ugc.aweme.crossplatform.params;

import android.os.Bundle;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.params.a */
public final class C25883a {

    /* renamed from: a */
    public Integer f68428a;

    /* renamed from: b */
    public Bundle f68429b;

    /* renamed from: c */
    public String f68430c;

    /* renamed from: d */
    public boolean f68431d;

    /* renamed from: e */
    public String f68432e;

    /* renamed from: f */
    public String f68433f;

    /* renamed from: g */
    public boolean f68434g;

    /* renamed from: h */
    public boolean f68435h;

    /* renamed from: i */
    public boolean f68436i;

    /* renamed from: j */
    public String f68437j;

    /* renamed from: k */
    public boolean f68438k;

    /* renamed from: l */
    public boolean f68439l;

    /* renamed from: m */
    public String f68440m;

    public C25883a() {
        this(null, null, null, false, null, null, false, false, false, null, false, false, null, 8191, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25883a) {
                C25883a aVar = (C25883a) obj;
                if (C7573i.m23585a((Object) this.f68428a, (Object) aVar.f68428a) && C7573i.m23585a((Object) this.f68429b, (Object) aVar.f68429b) && C7573i.m23585a((Object) this.f68430c, (Object) aVar.f68430c)) {
                    if ((this.f68431d == aVar.f68431d) && C7573i.m23585a((Object) this.f68432e, (Object) aVar.f68432e) && C7573i.m23585a((Object) this.f68433f, (Object) aVar.f68433f)) {
                        if (this.f68434g == aVar.f68434g) {
                            if (this.f68435h == aVar.f68435h) {
                                if ((this.f68436i == aVar.f68436i) && C7573i.m23585a((Object) this.f68437j, (Object) aVar.f68437j)) {
                                    if (this.f68438k == aVar.f68438k) {
                                        if (!(this.f68439l == aVar.f68439l) || !C7573i.m23585a((Object) this.f68440m, (Object) aVar.f68440m)) {
                                            return false;
                                        }
                                    }
                                }
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
        Integer num = this.f68428a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Bundle bundle = this.f68429b;
        int hashCode2 = (hashCode + (bundle != null ? bundle.hashCode() : 0)) * 31;
        String str = this.f68430c;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.f68431d;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        String str2 = this.f68432e;
        int hashCode4 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f68433f;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z2 = this.f68434g;
        if (z2) {
            z2 = true;
        }
        int i3 = (hashCode5 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f68435h;
        if (z3) {
            z3 = true;
        }
        int i4 = (i3 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f68436i;
        if (z4) {
            z4 = true;
        }
        int i5 = (i4 + (z4 ? 1 : 0)) * 31;
        String str4 = this.f68437j;
        int hashCode6 = (i5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        boolean z5 = this.f68438k;
        if (z5) {
            z5 = true;
        }
        int i6 = (hashCode6 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f68439l;
        if (z6) {
            z6 = true;
        }
        int i7 = (i6 + (z6 ? 1 : 0)) * 31;
        String str5 = this.f68440m;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseInfo(platform=");
        sb.append(this.f68428a);
        sb.append(", rawBundle=");
        sb.append(this.f68429b);
        sb.append(", url=");
        sb.append(this.f68430c);
        sb.append(", safeTemplate=");
        sb.append(this.f68431d);
        sb.append(", groupId=");
        sb.append(this.f68432e);
        sb.append(", enterFrom=");
        sb.append(this.f68433f);
        sb.append(", autoPlayAudio=");
        sb.append(this.f68434g);
        sb.append(", forbidJump=");
        sb.append(this.f68435h);
        sb.append(", fromNotification=");
        sb.append(this.f68436i);
        sb.append(", awemeId=");
        sb.append(this.f68437j);
        sb.append(", controlRequestUrl=");
        sb.append(this.f68438k);
        sb.append(", noHardware=");
        sb.append(this.f68439l);
        sb.append(", ownerId=");
        sb.append(this.f68440m);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo67263a(String str) {
        C7573i.m23587b(str, "<set-?>");
        this.f68440m = str;
    }

    private C25883a(Integer num, Bundle bundle, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, String str5) {
        C7573i.m23587b(str5, "ownerId");
        this.f68428a = num;
        this.f68429b = bundle;
        this.f68430c = str;
        this.f68431d = z;
        this.f68432e = str2;
        this.f68433f = str3;
        this.f68434g = z2;
        this.f68435h = z3;
        this.f68436i = z4;
        this.f68437j = str4;
        this.f68438k = z5;
        this.f68439l = z6;
        this.f68440m = str5;
    }

    private /* synthetic */ C25883a(Integer num, Bundle bundle, String str, boolean z, String str2, String str3, boolean z2, boolean z3, boolean z4, String str4, boolean z5, boolean z6, String str5, int i, C7571f fVar) {
        this(null, null, null, false, null, null, false, false, false, null, false, false, "");
    }
}
