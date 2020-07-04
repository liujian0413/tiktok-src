package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.t */
public class C9383t {
    @C6593c(mo15949a = "ngb_push_url")

    /* renamed from: a */
    public String f25777a = "";
    @C6593c(mo15949a = "ngb_push_url_postfix")

    /* renamed from: b */
    public String f25778b = "";
    @C6593c(mo15949a = "height")

    /* renamed from: c */
    public int f25779c = 640;
    @C6593c(mo15949a = "width")

    /* renamed from: d */
    public int f25780d = 360;
    @C6593c(mo15949a = "min_bitrate")

    /* renamed from: e */
    public int f25781e = C34943c.f91127w;
    @C6593c(mo15949a = "default_bitrate")

    /* renamed from: f */
    public int f25782f = VETransitionFilterParam.TransitionDuration_DEFAULT;
    @C6593c(mo15949a = "max_bitrate")

    /* renamed from: g */
    public int f25783g = 800;
    @C6593c(mo15949a = "video_profile")

    /* renamed from: h */
    public int f25784h = 1;
    @C6593c(mo15949a = "hardware_encode")

    /* renamed from: i */
    public boolean f25785i;
    @C6593c(mo15949a = "bitrate_adapt_strategy")

    /* renamed from: j */
    public int f25786j;
    @C6593c(mo15949a = "fps")

    /* renamed from: k */
    public int f25787k = 15;
    @C6593c(mo15949a = "anchor_interact_profile")

    /* renamed from: l */
    public int f25788l;
    @C6593c(mo15949a = "audience_interact_profile")

    /* renamed from: m */
    public int f25789m;
    @C6593c(mo15949a = "super_resolution")

    /* renamed from: n */
    public C9384a f25790n;
    @C6593c(mo15949a = "h265_enable")

    /* renamed from: o */
    public boolean f25791o;
    @C6593c(mo15949a = "gop_sec")

    /* renamed from: p */
    public float f25792p = 2.0f;
    @C6593c(mo15949a = "bframe_enable")

    /* renamed from: q */
    public boolean f25793q = true;
    @C6593c(mo15949a = "roi")

    /* renamed from: r */
    public boolean f25794r;
    @C6593c(mo15949a = "sw_roi")

    /* renamed from: s */
    public boolean f25795s;

    /* renamed from: t */
    private int f25796t;

    /* renamed from: u */
    private int f25797u;

    /* renamed from: com.bytedance.android.livesdkapi.depend.model.live.t$a */
    public static class C9384a {
        @C6593c(mo15949a = "enable")

        /* renamed from: a */
        public boolean f25798a;
        @C6593c(mo15949a = "antialiasing")

        /* renamed from: b */
        public boolean f25799b;
        @C6593c(mo15949a = "strength")

        /* renamed from: c */
        public int f25800c;

        public C9384a() {
            this(false, false, 0);
        }

        public C9384a(boolean z, boolean z2, int i) {
            this.f25798a = z;
            this.f25799b = z2;
            this.f25800c = i;
        }
    }

    /* renamed from: a */
    public final int mo23061a() {
        if (this.f25779c == 0) {
            this.f25779c = 640;
        }
        return this.f25779c;
    }

    /* renamed from: b */
    public final int mo23062b() {
        if (this.f25780d == 0) {
            this.f25780d = 360;
        }
        return this.f25780d;
    }

    /* renamed from: c */
    public final int mo23063c() {
        if (this.f25781e == 0) {
            this.f25781e = C34943c.f91127w;
        }
        return this.f25781e;
    }

    /* renamed from: d */
    public final int mo23064d() {
        if (this.f25782f == 0) {
            this.f25782f = VETransitionFilterParam.TransitionDuration_DEFAULT;
        }
        return this.f25782f;
    }

    /* renamed from: f */
    public final int mo23066f() {
        if (this.f25787k == 0) {
            this.f25787k = 15;
        }
        return this.f25787k;
    }

    /* renamed from: g */
    public final int mo23067g() {
        if (this.f25796t == 0) {
            return 720;
        }
        return this.f25796t;
    }

    /* renamed from: h */
    public final int mo23068h() {
        if (this.f25797u == 0) {
            return 1280;
        }
        return this.f25797u;
    }

    /* renamed from: e */
    public final int mo23065e() {
        if (this.f25783g == 0) {
            this.f25783g = (mo23064d() * 2) - mo23063c();
        }
        return this.f25783g;
    }
}
