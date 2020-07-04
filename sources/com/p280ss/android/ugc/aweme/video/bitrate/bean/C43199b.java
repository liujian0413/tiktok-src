package com.p280ss.android.ugc.aweme.video.bitrate.bean;

import android.util.Pair;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.lib.video.bitrate.regulator.p1746a.C44864d;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.b */
public final class C43199b implements C44864d {
    @C6593c(mo15949a = "default_gear_name")

    /* renamed from: a */
    public String f111844a;
    @C6593c(mo15949a = "gear_group")

    /* renamed from: b */
    public Set<String> f111845b;
    @C6593c(mo15949a = "default_bitrate")

    /* renamed from: c */
    private double f111846c;
    @C6593c(mo15949a = "bitrate_range")

    /* renamed from: d */
    private List<Double> f111847d;

    /* renamed from: a */
    public final String mo104863a() {
        return this.f111844a;
    }

    /* renamed from: b */
    public final Set<String> mo104864b() {
        return this.f111845b;
    }

    /* renamed from: c */
    public final double mo104865c() {
        return this.f111846c;
    }

    /* renamed from: d */
    public final Pair<Double, Double> mo104866d() {
        if (this.f111847d == null || this.f111847d.size() != 2) {
            return null;
        }
        return new Pair<>(this.f111847d.get(0), this.f111847d.get(1));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GearConfig{defaultGearName='");
        sb.append(this.f111844a);
        sb.append('\'');
        sb.append(", gearGroup=");
        sb.append(this.f111845b);
        sb.append('}');
        return sb.toString();
    }
}
