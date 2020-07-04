package com.p280ss.android.ugc.aweme.shortvideo;

import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import java.math.BigDecimal;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cx */
public final class C39318cx {

    /* renamed from: a */
    private final int f102129a;

    /* renamed from: b */
    private final int f102130b;

    /* renamed from: c */
    private final float f102131c;

    /* renamed from: d */
    private final float f102132d;

    /* renamed from: e */
    private final boolean f102133e;

    /* renamed from: a */
    public final void mo97879a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f102129a);
        sb.append("*");
        sb.append(this.f102130b);
        C6893q.m21447a("aweme_video_record_info", C6869c.m21381a().mo16887a("resolution", sb.toString()).mo16886a("bitrate", Long.valueOf(new BigDecimal((double) this.f102131c).longValue())).mo16886a("frame_rate", Long.valueOf(new BigDecimal((double) this.f102132d).longValue())).mo16882a("is_hardcode", Boolean.valueOf(this.f102133e)).mo16888b());
    }

    private C39318cx(int i, int i2, float f, float f2, boolean z) {
        this.f102129a = i;
        this.f102130b = i2;
        this.f102131c = f;
        this.f102132d = f2;
        this.f102133e = z;
    }

    /* renamed from: a */
    public static C39318cx m125643a(int i, int i2, float f, float f2, boolean z) {
        C39318cx cxVar = new C39318cx(i, i2, f, 0.0f, z);
        return cxVar;
    }
}
