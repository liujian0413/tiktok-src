package com.bytedance.android.live.broadcast.preview.p139a.p140a;

import android.content.Context;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.bytedance.android.live.user.C3592a;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.C9402f;
import com.bytedance.android.livesdkapi.C9402f.C9403a;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.broadcast.preview.a.a.a */
public final class C2849a implements C9402f {
    /* renamed from: a */
    public final void mo9615a(C9403a aVar) {
        Context context = aVar.mo9614b().f25878a;
        if (!C2850b.m11362a(context)) {
            C3517a.m12960a(context, (int) R.string.efr);
        } else if (NetworkUtils.m19550d(context) == NetworkType.MOBILE_2G) {
            C3517a.m12960a(context, (int) R.string.f8e);
        } else if (((C3592a) C3596c.m13172a(C3592a.class)).user().mo22165a().childrenManagerForbidCreateLiveRoom()) {
            C3517a.m12960a(context, (int) R.string.ede);
        } else {
            aVar.mo9613a();
        }
    }
}
