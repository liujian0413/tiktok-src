package com.p280ss.android.ugc.aweme.recommend.viewholder;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.recommend.C37137e;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.recommend.viewholder.a */
final class C37164a {

    /* renamed from: a */
    public long f97253a;

    /* renamed from: b */
    public boolean f97254b;

    /* renamed from: c */
    public boolean f97255c;

    /* renamed from: d */
    private long f97256d;

    /* renamed from: e */
    private boolean f97257e;

    /* renamed from: b */
    public final void mo93649b() {
        if (!this.f97255c) {
            this.f97255c = true;
            this.f97256d = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo93648a() {
        if (!this.f97255c) {
            this.f97255c = true;
            this.f97253a = 0;
            this.f97256d = System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo93650c() {
        if (this.f97255c) {
            this.f97255c = false;
            this.f97253a += System.currentTimeMillis() - this.f97256d;
        }
    }

    /* renamed from: e */
    private final void m119463e() {
        C6907h.m21524a("follow_card_slide_up", (Map) C22984d.m75611a().mo59973a("enter_from", "homepage_hot").mo59973a("event_type", "slide_up").mo59971a("duration", this.f97253a).f60753a);
    }

    /* renamed from: d */
    public final void mo93651d() {
        if (this.f97255c) {
            this.f97255c = false;
            this.f97253a += System.currentTimeMillis() - this.f97256d;
            m119463e();
            if (!this.f97257e) {
                this.f97257e = true;
                C37137e.m119381b();
                if (this.f97254b || this.f97253a > 4000) {
                    C37137e.m119382c();
                } else {
                    C37137e.m119383d();
                }
            }
        }
    }
}
