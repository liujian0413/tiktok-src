package com.p280ss.android.ugc.gamora.bottomtab;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.bottomtab.b */
public final class C43866b {

    /* renamed from: a */
    public int f113641a;

    /* renamed from: b */
    public final String f113642b;

    /* renamed from: c */
    public final String f113643c;

    /* renamed from: d */
    public final String f113644d;

    /* renamed from: e */
    public final boolean f113645e;

    /* renamed from: f */
    public final C43870f f113646f;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43866b) {
                C43866b bVar = (C43866b) obj;
                if (C7573i.m23585a((Object) this.f113642b, (Object) bVar.f113642b) && C7573i.m23585a((Object) this.f113643c, (Object) bVar.f113643c) && C7573i.m23585a((Object) this.f113644d, (Object) bVar.f113644d)) {
                    if (!(this.f113645e == bVar.f113645e) || !C7573i.m23585a((Object) this.f113646f, (Object) bVar.f113646f)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f113642b;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f113643c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f113644d;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.f113645e;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        C43870f fVar = this.f113646f;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomTabInfo(text=");
        sb.append(this.f113642b);
        sb.append(", tag=");
        sb.append(this.f113643c);
        sb.append(", shootMode=");
        sb.append(this.f113644d);
        sb.append(", defaultSelected=");
        sb.append(this.f113645e);
        sb.append(", listener=");
        sb.append(this.f113646f);
        sb.append(")");
        return sb.toString();
    }

    public C43866b(String str, String str2, String str3, boolean z, C43870f fVar) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "tag");
        C7573i.m23587b(str3, "shootMode");
        this.f113642b = str;
        this.f113643c = str2;
        this.f113644d = str3;
        this.f113645e = z;
        this.f113646f = fVar;
    }
}
