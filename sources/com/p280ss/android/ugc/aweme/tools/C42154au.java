package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.au */
public class C42154au implements C42155av {

    /* renamed from: a */
    public boolean f109685a;

    /* renamed from: a */
    public static C42154au m134111a() {
        return new C42154au(true);
    }

    /* renamed from: b */
    public static C42154au m134112b() {
        return new C42154au(false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SwitchZoomStateEvent{toWide=");
        sb.append(this.f109685a);
        sb.append('}');
        return sb.toString();
    }

    private C42154au(boolean z) {
        this.f109685a = z;
    }
}
