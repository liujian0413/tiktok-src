package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.t */
public class C42584t implements C42155av {

    /* renamed from: a */
    public float f110734a;

    /* renamed from: b */
    public float f110735b;

    /* renamed from: c */
    public int f110736c;

    private C42584t() {
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FilterStateEvent{velocity=");
        sb.append(this.f110734a);
        sb.append(", fraction=");
        sb.append(this.f110735b);
        sb.append(", type=");
        sb.append(this.f110736c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C42584t m135304a(float f) {
        C42584t tVar = new C42584t();
        tVar.f110734a = -1.0f;
        tVar.f110735b = f;
        tVar.f110736c = 2;
        return tVar;
    }

    /* renamed from: a */
    public static C42584t m135305a(float f, float f2) {
        C42584t tVar = new C42584t();
        tVar.f110734a = f;
        tVar.f110735b = f2;
        tVar.f110736c = 1;
        return tVar;
    }
}
