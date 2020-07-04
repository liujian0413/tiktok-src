package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7077s;
import com.p280ss.android.ugc.aweme.p313im.service.C7103h;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C32013b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.a */
public final class C31511a extends C7102a {

    /* renamed from: a */
    public int f82509a;

    /* renamed from: b */
    public final int mo18115b() {
        return 17;
    }

    public final String bf_() {
        return "flip_chat_helper_session";
    }

    /* renamed from: a */
    public final C32013b mo18114a() {
        return new C32013b() {
            /* renamed from: a */
            public final void mo18117a(Context context, C7102a aVar, int i) {
                if (i == 1 || i == 2) {
                    C7103h f = C6956a.m21632a().mo18009f();
                    if (f != null) {
                        f.openFFSdkSchema("sslocal://fusion_fuel/main");
                        C31858ad.m103406a();
                        C31858ad.m103441a(f.isFFSDKBind());
                    }
                    return;
                }
                if (i == 0) {
                    C25712a aVar2 = new C25712a(context);
                    aVar2.mo66614a((CharSequence[]) new String[]{context.getString(R.string.bik)}, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            if (i == 0) {
                                C7103h f = C6956a.m21632a().mo18009f();
                                if (f != null && f.isFFSDKBind()) {
                                    C7077s.m22146a(1);
                                }
                                C7076p.m22077a().mo18303b(true);
                                C6978j.m21717a().mo18059j();
                            }
                        }
                    });
                    aVar2.mo66615b();
                }
            }
        };
    }

    /* renamed from: d */
    public final void mo18120d() {
        this.f19943g = C6399b.m19921a().getString(R.string.bpq);
        this.f19942f = AppImageUri.m76615a((int) R.drawable.b6g);
    }
}
