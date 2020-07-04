package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.v */
public class C42586v implements C42155av {

    /* renamed from: a */
    public boolean f110738a;

    /* renamed from: b */
    public boolean f110739b = true;

    /* renamed from: a */
    public static C42586v m135306a() {
        return new C42586v(true);
    }

    /* renamed from: b */
    public static C42586v m135307b() {
        return new C42586v(false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FrontRearChangeEvent{toFront=");
        sb.append(this.f110738a);
        sb.append('}');
        return sb.toString();
    }

    private C42586v(boolean z) {
        this.f110738a = z;
    }
}
