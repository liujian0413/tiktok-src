package com.p280ss.android.ugc.playerkit.videoview.p1753b;

import com.p280ss.android.ugc.aweme.player.sdk.api.C34974d;
import com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34982c;
import com.p280ss.android.ugc.aweme.player.sdk.p1459b.C34989d;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;

/* renamed from: com.ss.android.ugc.playerkit.videoview.b.d */
public final class C44941d {

    /* renamed from: a */
    private static C44941d f115605a = new C44941d();

    /* renamed from: b */
    private C34974d f115606b;

    /* renamed from: c */
    private Type f115607c;

    /* renamed from: a */
    public static C44941d m141811a() {
        return f115605a;
    }

    /* renamed from: a */
    public final synchronized C34974d mo107446a(Type type) {
        if (this.f115606b == null) {
            this.f115607c = type;
            this.f115606b = new C34982c(new C34989d(type));
        } else if (this.f115607c != null && !this.f115607c.equals(type)) {
            this.f115606b.mo88637f();
            this.f115607c = type;
            this.f115606b = new C34982c(new C34989d(type));
        }
        return this.f115606b;
    }
}
