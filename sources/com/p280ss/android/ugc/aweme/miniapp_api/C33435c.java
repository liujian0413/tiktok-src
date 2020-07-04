package com.p280ss.android.ugc.aweme.miniapp_api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.morpheus.core.C12250a;
import com.bytedance.morpheus.p617a.C12236a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.p1168df.base.C26220a;
import com.p280ss.android.ugc.aweme.p1168df.base.p1169a.C26223b;
import com.p280ss.android.ugc.aweme.p1168df.base.p1170ui.C26235a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.c */
public final class C33435c extends C26220a {

    /* renamed from: e */
    private C26235a f87278e;

    /* renamed from: f */
    private boolean f87279f;

    /* renamed from: b */
    public final void mo59955b(Context context) {
    }

    /* renamed from: d */
    public final void mo59957d(Context context) {
    }

    /* renamed from: b */
    public final void mo59954b() {
        if (this.f69117b != null) {
            Activity activity = (Activity) this.f69117b.get();
            if (!(this.f87278e == null || activity == null || activity.isFinishing())) {
                this.f87278e.dismiss();
                this.f87278e = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo59951a() {
        if (this.f69117b != null) {
            Activity activity = (Activity) this.f69117b.get();
            if (this.f87278e == null && activity != null && !activity.isFinishing() && !this.f87279f) {
                this.f87278e = new C26235a(activity, 3);
                this.f87278e.setCancelable(true);
                this.f87278e.setIndeterminate(false);
                this.f87278e.setMax(100);
                this.f87278e.setMessage(activity.getString(R.string.c_3));
                this.f87278e.show();
                this.f87279f = true;
            }
        }
    }

    public C33435c(Activity activity) {
        super(activity, "com.ss.android.ugc.aweme.miniapp");
    }

    /* renamed from: c */
    public final void mo59956c(Context context) {
        if (context != null) {
            C10761a.m31383a(context, (int) R.string.c_1).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo59953a(Context context) {
        if (context != null) {
            C10761a.m31383a(context, (int) R.string.c9z).mo25750a();
        }
    }

    /* renamed from: a */
    public final void mo67778a(C12250a aVar) {
        if (this.f69117b != null && aVar != null) {
            Activity activity = (Activity) this.f69117b.get();
            if (activity != null) {
                try {
                    if (activity instanceof AmeSSActivity) {
                        ((AmeSSActivity) activity).setOnActivityResultListener(1001, new C33436d(this, aVar));
                    }
                    C12236a.m35599a(aVar, activity, 8);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo59952a(long j, long j2) {
        if (this.f87278e != null) {
            this.f87278e.setProgress(m86192b(j, j2));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo85675b(C12250a aVar, int i, int i2, Intent intent) {
        if (i == 8) {
            if (i2 == 0) {
                this.f69119d = -1;
                if (this.f69118c != null) {
                    this.f69118c.mo16974b();
                }
            }
            C26223b.m86220c(aVar.f32566a, i2);
        }
    }
}
