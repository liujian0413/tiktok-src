package com.p280ss.android.ugc.aweme.draft.model;

import com.google.gson.p276a.C6593c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.draft.model.g */
public final class C27320g {
    @C6593c(mo15949a = "uploadId")

    /* renamed from: a */
    public final String f72077a;
    @C6593c(mo15949a = "trackType")

    /* renamed from: b */
    public int f72078b;
    @C6593c(mo15949a = "trackIndex")

    /* renamed from: c */
    public int f72079c;
    @C6593c(mo15949a = "effectPath")

    /* renamed from: d */
    public String f72080d;
    @C6593c(mo15949a = "effectTag")

    /* renamed from: e */
    public String f72081e;
    @C6593c(mo15949a = "seqIn")

    /* renamed from: f */
    public int f72082f;
    @C6593c(mo15949a = "seqOut")

    /* renamed from: g */
    public int f72083g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftVEAudioEffectParam(uploadId=");
        sb.append(this.f72077a);
        sb.append(", trackType=");
        sb.append(this.f72078b);
        sb.append(", trackIndex=");
        sb.append(this.f72079c);
        sb.append(", effectPath=");
        sb.append(this.f72080d);
        sb.append(", effectTag=");
        sb.append(this.f72081e);
        sb.append(", seqIn=");
        sb.append(this.f72082f);
        sb.append(", seqOut=");
        sb.append(this.f72083g);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = Integer.valueOf(this.f72078b).hashCode() * 31;
        String str = this.f72077a;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (((hashCode + i) * 31) + Integer.valueOf(this.f72079c).hashCode()) * 31;
        String str2 = this.f72080d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode2 + i2) * 31;
        String str3 = this.f72081e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((((i4 + i3) * 31) + Integer.valueOf(this.f72082f).hashCode()) * 31) + Integer.valueOf(this.f72083g).hashCode();
    }

    public final boolean equals(Object obj) {
        Object obj2;
        if (this == obj) {
            return true;
        }
        Class cls = getClass();
        if (obj != null) {
            obj2 = obj.getClass();
        } else {
            obj2 = null;
        }
        if (!C7573i.m23585a((Object) cls, obj2)) {
            return false;
        }
        if (obj != null) {
            C27320g gVar = (C27320g) obj;
            if (this.f72078b == gVar.f72078b && C7573i.m23585a((Object) this.f72077a, (Object) gVar.f72077a) && this.f72079c == gVar.f72079c && C7634n.m23717a(this.f72080d, gVar.f72080d, false) && C7634n.m23717a(this.f72081e, gVar.f72081e, false) && this.f72082f == gVar.f72082f && this.f72083g == gVar.f72083g) {
                return true;
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.draft.model.DraftVEAudioEffectParam");
    }

    public C27320g(String str, int i, int i2, String str2, String str3, int i3, int i4) {
        this.f72077a = str;
        this.f72078b = i;
        this.f72079c = i2;
        this.f72080d = str2;
        this.f72081e = str3;
        this.f72082f = i3;
        this.f72083g = i4;
    }
}
