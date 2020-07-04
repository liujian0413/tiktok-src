package com.p280ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.p280ss.android.ugc.aweme.poi.services.POIService;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.f */
public final class C26734f {

    /* renamed from: a */
    public final String f70447a;

    /* renamed from: b */
    public final int f70448b;

    /* renamed from: c */
    public final String f70449c;

    /* renamed from: d */
    public final int f70450d;

    /* renamed from: e */
    public final int f70451e;

    /* renamed from: f */
    public String f70452f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26734f) {
                C26734f fVar = (C26734f) obj;
                if (C7573i.m23585a((Object) this.f70447a, (Object) fVar.f70447a)) {
                    if ((this.f70448b == fVar.f70448b) && C7573i.m23585a((Object) this.f70449c, (Object) fVar.f70449c)) {
                        if (this.f70450d == fVar.f70450d) {
                            if (!(this.f70451e == fVar.f70451e) || !C7573i.m23585a((Object) this.f70452f, (Object) fVar.f70452f)) {
                                return false;
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
        String str = this.f70447a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f70448b) * 31;
        String str2 = this.f70449c;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f70450d) * 31) + this.f70451e) * 31;
        String str3 = this.f70452f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchRequestParam(keyword=");
        sb.append(this.f70447a);
        sb.append(", refreshType=");
        sb.append(this.f70448b);
        sb.append(", searchSource=");
        sb.append(this.f70449c);
        sb.append(", hotSearch=");
        sb.append(this.f70450d);
        sb.append(", correctType=");
        sb.append(this.f70451e);
        sb.append(", searchId=");
        sb.append(this.f70452f);
        sb.append(")");
        return sb.toString();
    }

    private C26734f(String str, int i, String str2, int i2, int i3, String str3) {
        C7573i.m23587b(str, POIService.KEY_KEYWORD);
        this.f70447a = str;
        this.f70448b = i;
        this.f70449c = str2;
        this.f70450d = i2;
        this.f70451e = i3;
        this.f70452f = str3;
    }

    public /* synthetic */ C26734f(String str, int i, String str2, int i2, int i3, String str3, int i4, C7571f fVar) {
        int i5;
        int i6;
        int i7;
        if ((i4 & 2) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        if ((i4 & 4) != 0) {
            str2 = null;
        }
        String str4 = str2;
        if ((i4 & 8) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 16) != 0) {
            i7 = 0;
        } else {
            i7 = i3;
        }
        this(str, i5, str4, i6, i7, null);
    }
}
