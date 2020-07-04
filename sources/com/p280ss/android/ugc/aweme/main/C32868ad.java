package com.p280ss.android.ugc.aweme.main;

import android.os.Bundle;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.main.ad */
final /* synthetic */ class C32868ad implements Runnable {

    /* renamed from: a */
    private final Bundle f85806a;

    C32868ad(Bundle bundle) {
        this.f85806a = bundle;
    }

    public final void run() {
        C10761a.m31383a(C6399b.m19921a(), this.f85806a.getInt("switch_account_success_toast_res_id")).mo25750a();
    }
}
