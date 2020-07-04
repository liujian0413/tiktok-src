package com.p280ss.android.ugc.aweme.live.p1363c;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.bytedance.android.live.base.p123sp.C2384a;
import com.bytedance.android.livesdkapi.host.C9464f;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.live.LivePlayActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.live.c.m */
public final class C32490m implements C9464f {
    /* renamed from: a */
    static final /* synthetic */ void m105278a(DialogInterface dialogInterface, int i) {
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final void mo23270a(Context context, long j, Bundle bundle) {
        if (NetworkUtils.m19548b(context) || C2384a.m10042b(context) || !(context instanceof Activity)) {
            LivePlayActivity.m105022a(context, j, bundle);
        } else {
            new C10741a(context).mo25657b((int) R.string.fol).mo25650a((int) R.string.afn, (OnClickListener) new C32491n(context, j, bundle)).mo25658b((int) R.string.w_, C32492o.f84756a).mo25656a().mo25638b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m105277a(Context context, long j, Bundle bundle, DialogInterface dialogInterface, int i) {
        C2384a.m10041a(context);
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        LivePlayActivity.m105022a(context, j, bundle);
    }
}
