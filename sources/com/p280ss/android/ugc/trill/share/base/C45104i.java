package com.p280ss.android.ugc.trill.share.base;

import com.bytedance.common.utility.C6306c;
import com.p280ss.android.common.applog.TeaAgent;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.C28687a;
import com.p280ss.android.ugc.aweme.share.libra.MTEndWatermarkExperiment;
import com.p280ss.android.ugc.aweme.shortvideo.festival.C39874g;
import java.util.Map;

/* renamed from: com.ss.android.ugc.trill.share.base.i */
public final class C45104i {

    /* renamed from: a */
    private C45105a f115932a;

    /* renamed from: com.ss.android.ugc.trill.share.base.i$a */
    public static class C45105a {

        /* renamed from: a */
        long f115933a;

        /* renamed from: b */
        int f115934b;

        /* renamed from: c */
        String f115935c;

        /* renamed from: d */
        String f115936d;

        /* renamed from: e */
        int f115937e;

        /* renamed from: f */
        boolean f115938f;

        /* renamed from: g */
        Aweme f115939g;

        /* renamed from: a */
        public final C45104i mo107668a() {
            return new C45104i(this);
        }

        /* renamed from: a */
        public final C45105a mo107667a(boolean z) {
            this.f115938f = z;
            return this;
        }

        /* renamed from: c */
        public final C45105a mo107670c(boolean z) {
            this.f115934b = 1;
            return this;
        }

        /* renamed from: b */
        public final C45105a mo107669b(boolean z) {
            this.f115936d = m142248d(z);
            return this;
        }

        /* renamed from: a */
        private static String m142247a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(TeaAgent.getServerDeviceId());
            sb.append(System.currentTimeMillis());
            return C6306c.m19561a(sb.toString());
        }

        /* renamed from: d */
        private static String m142248d(boolean z) {
            StringBuilder sb = new StringBuilder();
            if (z) {
                sb.append("ins_special");
            } else {
                sb.append("topleft");
            }
            if (!C39874g.m127612b() && z && MTEndWatermarkExperiment.INSTANCE.enable()) {
                sb.append(",ins_ending");
            }
            return sb.toString();
        }

        public C45105a(Aweme aweme, String str) {
            this.f115939g = aweme;
            this.f115937e = C28687a.m94363a(aweme) ? 1 : 0;
            this.f115935c = m142247a(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107665a() {
        this.f115932a.f115933a = System.currentTimeMillis();
        C6907h.m21524a("client_watermark_start", (Map) new C22984d().mo59971a("start_watermark", this.f115932a.f115933a).mo59973a("watermark_id", this.f115932a.f115935c).mo59970a("watermark_sdk", this.f115932a.f115934b).mo59973a("watermark_type", this.f115932a.f115936d).mo59970a("is_self_video", this.f115932a.f115937e).f60753a);
    }

    public C45104i(C45105a aVar) {
        this.f115932a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107666a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        C6907h.m21524a("client_watermark_end", (Map) new C22984d().mo59971a("end_watermark", currentTimeMillis).mo59973a("watermark_id", this.f115932a.f115935c).mo59971a("duration", currentTimeMillis - this.f115932a.f115933a).mo59970a("watermark_sdk", this.f115932a.f115934b).mo59973a("watermark_type", this.f115932a.f115936d).mo59970a("is_self_video", this.f115932a.f115937e).mo59970a("is_composer_watermark_success", i).f60753a);
    }
}
