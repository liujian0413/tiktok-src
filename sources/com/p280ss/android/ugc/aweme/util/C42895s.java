package com.p280ss.android.ugc.aweme.util;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.p280ss.android.ugc.aweme.util.C42889p.C42892a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.util.s */
public class C42895s implements C42892a {

    /* renamed from: a */
    private Activity f111402a;

    /* renamed from: b */
    private C37121a f111403b;

    /* renamed from: a */
    public final void mo104592a() {
        m136194a((Context) this.f111402a);
        if (this.f111403b != null && !this.f111403b.isShowing()) {
            this.f111403b.show();
            this.f111403b.mo93590a();
        }
    }

    public C42895s(Activity activity) {
        this.f111402a = activity;
    }

    /* renamed from: a */
    private void m136194a(Context context) {
        if (this.f111403b == null && context != null) {
            this.f111403b = C37121a.m119327a(context, context.getResources().getString(R.string.dga));
            this.f111403b.setIndeterminate(false);
        }
    }

    /* renamed from: a */
    public void mo95733a(String str) {
        if (this.f111403b != null && this.f111403b.isShowing()) {
            this.f111403b.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo104593a(Throwable th) {
        C10761a.m31383a((Context) this.f111402a, (int) R.string.did).mo25750a();
        if (this.f111403b != null && this.f111403b.isShowing()) {
            this.f111403b.dismiss();
        }
    }
}
