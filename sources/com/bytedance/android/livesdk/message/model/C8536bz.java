package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C6311g;
import com.google.gson.p276a.C6593c;

/* renamed from: com.bytedance.android.livesdk.message.model.bz */
public class C8536bz {
    @C6593c(mo15949a = "red_packet_group_id")

    /* renamed from: a */
    public long f23473a;
    @C6593c(mo15949a = "bonus_type")

    /* renamed from: b */
    public long f23474b;
    @C6593c(mo15949a = "combo_count")

    /* renamed from: c */
    public long f23475c;
    @C6593c(mo15949a = "bonus_count")

    /* renamed from: d */
    public long f23476d;
    @C6593c(mo15949a = "count_down")

    /* renamed from: e */
    public long f23477e;
    @C6593c(mo15949a = "rush_time")

    /* renamed from: f */
    public long f23478f;
    @C6593c(mo15949a = "icon_url")

    /* renamed from: g */
    public String f23479g;
    @C6593c(mo15949a = "disappear_time")

    /* renamed from: h */
    public long f23480h;
    @C6593c(mo15949a = "owner")

    /* renamed from: i */
    public C8537a f23481i;
    @C6593c(mo15949a = "total_count_down")

    /* renamed from: j */
    public long f23482j;
    @C6593c(mo15949a = "red_packet_source")

    /* renamed from: k */
    public String f23483k;

    /* renamed from: com.bytedance.android.livesdk.message.model.bz$a */
    public static class C8537a {
        @C6593c(mo15949a = "id")

        /* renamed from: a */
        public long f23484a;
        @C6593c(mo15949a = "nickname")

        /* renamed from: b */
        public String f23485b;

        /* renamed from: c */
        public transient String f23486c;

        /* renamed from: d */
        ImageModel f23487d;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo21669a() {
            if (this.f23487d != null && !C6311g.m19573a(this.f23487d.mUrls)) {
                this.f23486c = (String) this.f23487d.mUrls.get(0);
            }
        }
    }
}
