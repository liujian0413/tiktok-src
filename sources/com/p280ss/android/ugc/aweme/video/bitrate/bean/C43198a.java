package com.p280ss.android.ugc.aweme.video.bitrate.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44861a;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.a */
public final class C43198a implements C44861a {
    @C6593c(mo15949a = "param_a")

    /* renamed from: a */
    public double f111839a;
    @C6593c(mo15949a = "param_b")

    /* renamed from: b */
    public double f111840b;
    @C6593c(mo15949a = "param_c")

    /* renamed from: c */
    public double f111841c;
    @C6593c(mo15949a = "param_d")

    /* renamed from: d */
    public double f111842d;
    @C6593c(mo15949a = "min_bitrate")

    /* renamed from: e */
    public double f111843e;

    /* renamed from: a */
    public final double mo104857a() {
        return this.f111839a;
    }

    /* renamed from: b */
    public final double mo104858b() {
        return this.f111840b;
    }

    /* renamed from: c */
    public final double mo104859c() {
        return this.f111841c;
    }

    /* renamed from: d */
    public final double mo104860d() {
        return this.f111842d;
    }

    /* renamed from: e */
    public final double mo104861e() {
        return this.f111843e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AutoBitrateSet{firstParam=");
        sb.append(this.f111839a);
        sb.append(", secondParam=");
        sb.append(this.f111840b);
        sb.append(", thirdParam=");
        sb.append(this.f111841c);
        sb.append(", fourthParam=");
        sb.append(this.f111842d);
        sb.append(", minBitrate=");
        sb.append(this.f111843e);
        sb.append('}');
        return sb.toString();
    }
}
