package com.bytedance.android.live.base.model.feed;

import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.banner.C2338b;
import com.bytedance.android.live.base.model.banner.C2339c;
import com.google.gson.C6711m;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.live.base.model.feed.a */
public class C2344a extends Extra {
    @C6593c(mo15949a = "cost")

    /* renamed from: a */
    public long f7694a;
    @C6593c(mo15949a = "rank_round_banner")

    /* renamed from: b */
    public C2339c f7695b;
    @C6593c(mo15949a = "unread_extra")

    /* renamed from: c */
    public String f7696c;

    /* renamed from: d */
    transient C2345a f7697d;
    @C6593c(mo15949a = "max_time")

    /* renamed from: e */
    public long f7698e;
    @C6593c(mo15949a = "min_time")

    /* renamed from: f */
    public long f7699f;
    @C6593c(mo15949a = "req_id")

    /* renamed from: g */
    public String f7700g;
    @C6593c(mo15949a = "banner")

    /* renamed from: h */
    public C2338b f7701h;
    @C6593c(mo15949a = "total")

    /* renamed from: i */
    public int f7702i;
    @C6593c(mo15949a = "style")

    /* renamed from: j */
    public int f7703j;
    @C6593c(mo15949a = "log_pb")

    /* renamed from: k */
    private C6711m f7704k;

    /* renamed from: com.bytedance.android.live.base.model.feed.a$a */
    public static final class C2345a {
        @C6593c(mo15949a = "impr_id")

        /* renamed from: a */
        public String f7705a;
    }

    /* renamed from: a */
    public final C6711m mo8249a() {
        if (this.f7697d == null) {
            return this.f7704k;
        }
        this.f7704k = C2317a.m9932a().mo15963a((Object) this.f7697d).mo16136m();
        this.f7697d = null;
        return this.f7704k;
    }
}
