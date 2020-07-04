package com.p280ss.android.ugc.aweme.tools;

/* renamed from: com.ss.android.ugc.aweme.tools.as */
public class C42152as extends C42249c {

    /* renamed from: a */
    public boolean f109679a;

    /* renamed from: b */
    public boolean f109680b;

    /* renamed from: c */
    public int f109681c = 1;

    /* renamed from: d */
    public boolean f109682d;

    /* renamed from: a */
    public final boolean mo103588a() {
        if (this.f109681c == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SwitchDurationConfigEvent{isShortMode=");
        sb.append(this.f109680b);
        sb.append("isEnabled=");
        sb.append(this.f109679a);
        sb.append('}');
        return sb.toString();
    }

    public C42152as(boolean z, boolean z2) {
        this.f109680b = z;
        this.f109679a = z2;
    }
}
