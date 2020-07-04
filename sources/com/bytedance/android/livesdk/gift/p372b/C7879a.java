package com.bytedance.android.livesdk.gift.p372b;

import android.content.Context;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.C3434d;
import com.bytedance.android.live.gift.p162a.p163a.C3426a.C3427a;
import com.bytedance.android.live.gift.p162a.p163a.C3428b;
import com.bytedance.android.livesdk.gift.model.C8145b;
import com.bytedance.android.livesdk.gift.model.C8145b.C8146a;
import com.bytedance.android.livesdk.gift.panel.widget.GiftDialogViewModel;
import com.bytedance.ies.sdk.widgets.DataCenter;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.gift.b.a */
public final class C7879a {

    /* renamed from: a */
    public C7321c f21276a;

    /* renamed from: b */
    public long f21277b;

    /* renamed from: c */
    public long f21278c;

    /* renamed from: d */
    public long f21279d;

    /* renamed from: e */
    public GiftDialogViewModel f21280e;

    /* renamed from: f */
    private User f21281f;

    /* renamed from: g */
    private DataCenter f21282g;

    /* renamed from: h */
    private Context f21283h;

    /* renamed from: i */
    private C3428b f21284i = new C3428b() {
    };

    /* renamed from: a */
    public final void mo20668a() {
        C3434d.m12739a();
        if (this.f21276a != null && !this.f21276a.isDisposed()) {
            this.f21276a.dispose();
        }
    }

    /* renamed from: a */
    private void m24146a(C8146a aVar) {
        if (aVar != null && C3434d.m12739a().f10251a != null) {
            C8145b.m24987a(aVar);
        }
    }

    /* renamed from: a */
    public static void m24145a(long j, C3427a aVar) {
        if (C3434d.m12739a().f10251a == null) {
            aVar.mo10393a(false);
        }
    }

    public C7879a(long j, long j2, Context context) {
        this.f21277b = j;
        this.f21278c = j2;
        this.f21283h = context;
    }

    /* renamed from: a */
    public final void mo20669a(C8145b bVar, long j, User user, DataCenter dataCenter) {
        if (bVar != null && bVar.f22208a != null) {
            this.f21279d = j;
            this.f21281f = user;
            this.f21282g = dataCenter;
            m24146a(bVar.f22208a);
        }
    }
}
