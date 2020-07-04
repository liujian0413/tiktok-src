package com.p280ss.android.ugc.gamora.bottomtab;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.gamora.bottomtab.a */
public final class C43865a {

    /* renamed from: a */
    public final C43864Op f113637a;

    /* renamed from: b */
    public final int f113638b;

    /* renamed from: c */
    public final C43867c f113639c;

    /* renamed from: d */
    public final int f113640d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C43865a) {
                C43865a aVar = (C43865a) obj;
                if (C7573i.m23585a((Object) this.f113637a, (Object) aVar.f113637a)) {
                    if ((this.f113638b == aVar.f113638b) && C7573i.m23585a((Object) this.f113639c, (Object) aVar.f113639c)) {
                        if (this.f113640d == aVar.f113640d) {
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
        C43864Op op = this.f113637a;
        int i = 0;
        int hashCode = (((op != null ? op.hashCode() : 0) * 31) + this.f113638b) * 31;
        C43867c cVar = this.f113639c;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return ((hashCode + i) * 31) + this.f113640d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomTabChange(op=");
        sb.append(this.f113637a);
        sb.append(", index=");
        sb.append(this.f113638b);
        sb.append(", bottomTabModule=");
        sb.append(this.f113639c);
        sb.append(", endIndex=");
        sb.append(this.f113640d);
        sb.append(")");
        return sb.toString();
    }

    private C43865a(C43864Op op, int i, C43867c cVar, int i2) {
        C7573i.m23587b(op, "op");
        C7573i.m23587b(cVar, "bottomTabModule");
        this.f113637a = op;
        this.f113638b = i;
        this.f113639c = cVar;
        this.f113640d = i2;
    }

    public /* synthetic */ C43865a(C43864Op op, int i, C43867c cVar, int i2, int i3, C7571f fVar) {
        this(op, i, cVar, 0);
    }
}
