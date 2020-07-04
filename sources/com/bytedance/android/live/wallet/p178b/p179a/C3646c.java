package com.bytedance.android.live.wallet.p178b.p179a;

import android.app.Activity;
import com.bytedance.android.live.wallet.api.C3628c;
import com.bytedance.android.live.wallet.billing.BillingManager;
import com.bytedance.android.live.wallet.billing.BillingManager.C3674a;
import com.bytedance.android.live.wallet.billing.BillingManager.ConnectionState;
import com.bytedance.android.live.wallet.billing.C3690c;
import com.bytedance.android.live.wallet.billing.C3691d;
import com.bytedance.android.live.wallet.p178b.p180b.C3669a;
import com.bytedance.android.livesdkapi.depend.model.ChargeDeal;
import com.bytedance.android.livesdkapi.host.PayChannel;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.wallet.b.a.c */
public final class C3646c extends C3644a<C3669a> {

    /* renamed from: a */
    public C3691d f10865a;

    /* renamed from: b */
    public C3690c f10866b;

    /* renamed from: c */
    private Activity f10867c;

    /* renamed from: d */
    private final C3628c f10868d;

    /* renamed from: e */
    private final JSONObject f10869e;

    /* renamed from: f */
    private BillingManager f10870f;

    /* renamed from: g */
    private String f10871g;

    /* renamed from: h */
    private C3674a f10872h = new C3674a() {
        /* renamed from: a */
        public final void mo11103a() {
            C3646c.this.f10865a.mo11150b();
            C3646c.this.f10866b.mo11146c();
        }
    };

    /* renamed from: a */
    public final void mo8963a() {
        if (this.f10870f != null) {
            this.f10870f.mo11126a(this.f10872h);
            this.f10870f.mo11124a((C3669a) mo9140c());
            this.f10870f = null;
        }
        super.mo8963a();
        if (this.f10865a != null) {
            this.f10865a.mo11147a();
            this.f10865a = null;
        }
        if (this.f10866b != null) {
            this.f10866b.mo11145b();
            this.f10866b = null;
        }
        this.f10867c = null;
    }

    /* renamed from: a */
    public final void mo9142a(C3669a aVar) {
        super.mo9142a(aVar);
    }

    /* renamed from: a */
    public final void mo11102a(ChargeDeal chargeDeal, PayChannel payChannel) {
        if (this.f10870f.f10935a == ConnectionState.CONNECTED) {
            this.f10870f.mo11125a((C3669a) mo9140c(), this.f10867c, chargeDeal, this.f10869e, this.f10865a.f11000b);
            return;
        }
        this.f10866b.mo11144a();
    }

    public C3646c(Activity activity, C3628c cVar, String str, String str2, int i) {
        this.f10867c = activity;
        this.f10868d = cVar;
        this.f10869e = new JSONObject();
        this.f10871g = str;
    }
}
