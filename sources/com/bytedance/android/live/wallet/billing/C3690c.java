package com.bytedance.android.live.wallet.billing;

import com.bytedance.android.live.wallet.billing.BillingManager.C3674a;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.wallet.billing.c */
public final class C3690c {

    /* renamed from: a */
    private final C3669a f10995a;

    /* renamed from: b */
    private final BillingManager f10996b;

    /* renamed from: c */
    private final C3674a f10997c;

    /* renamed from: d */
    private boolean f10998d;

    /* renamed from: d */
    private void m13330d() {
        this.f10998d = false;
        this.f10995a.mo11116c();
    }

    /* renamed from: b */
    public final void mo11145b() {
        this.f10998d = false;
        this.f10996b.mo11126a(this.f10997c);
    }

    /* renamed from: c */
    public final void mo11146c() {
        if (this.f10998d) {
            m13330d();
        }
    }

    /* renamed from: a */
    public final void mo11144a() {
        if (!this.f10998d) {
            this.f10998d = true;
            this.f10995a.mo11111a((int) R.string.fa6);
            this.f10996b.mo11129b(this.f10997c);
        }
    }
}
