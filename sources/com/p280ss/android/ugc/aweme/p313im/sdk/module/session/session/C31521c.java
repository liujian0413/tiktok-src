package com.p280ss.android.ugc.aweme.p313im.sdk.module.session.session;

import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.msghelper.MessageHelperActivity;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6978j;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7076p;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C32013b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.session.c */
public final class C31521c extends C7102a {
    /* renamed from: b */
    public final int mo18115b() {
        return 10;
    }

    public final String bf_() {
        return "message_helper_session";
    }

    public final int bg_() {
        return 1;
    }

    /* renamed from: a */
    public final C32013b mo18114a() {
        return new C32013b() {
            /* renamed from: a */
            public final void mo18117a(Context context, C7102a aVar, int i) {
                String str;
                if (i == 1 || i == 2) {
                    if (aVar.f19949m == null) {
                        str = "";
                    } else {
                        str = (String) aVar.f19949m.get("position");
                    }
                    C31858ad.m103427a("message_assistant", str, aVar.f19946j, false);
                    C31521c.this.mo82230g();
                    MessageHelperActivity.m102353a(context);
                }
            }
        };
    }

    /* renamed from: f */
    public final int mo82229f() {
        return this.f19946j - C7076p.m22077a().mo18298b();
    }

    /* renamed from: d */
    public final void mo18120d() {
        this.f19943g = C6399b.m19921a().getString(R.string.bpt);
        this.f19942f = AppImageUri.m76615a((int) R.drawable.bi9);
    }

    /* renamed from: g */
    public final void mo82230g() {
        C7076p.m22077a().mo18291a(this.f19946j);
        C6978j.m21717a().mo18045a((C7102a) this);
    }
}
