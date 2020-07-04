package com.p280ss.android.ugc.aweme.notification.p1435d;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.model.AppImageUri;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25712a;
import com.p280ss.android.ugc.aweme.notice.api.bean.C34314g;
import com.p280ss.android.ugc.aweme.notification.NotificationDetailActivity;
import com.p280ss.android.ugc.aweme.p1355k.p1356a.C32263a;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C32013b;
import com.p280ss.android.ugc.aweme.p313im.service.p326f.C7102a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.d.g */
public final class C34435g extends C34427d {
    /* renamed from: b */
    public final int mo18115b() {
        return 25;
    }

    public final String bf_() {
        return "tcm_session";
    }

    public final int bg_() {
        return 1;
    }

    /* renamed from: g */
    public final int mo87750g() {
        return 62;
    }

    /* renamed from: a */
    public final C32013b mo18114a() {
        return new C32013b() {
            /* renamed from: a */
            public final void mo18117a(Context context, C7102a aVar, int i) {
                if (i == 1 || i == 2) {
                    C34435g.this.mo87749f();
                    C34435g.this.f19948l = 0;
                    C32263a.m104774a().updateNoticeSession(aVar);
                    NotificationDetailActivity.m111097a(context, 62, C34435g.this.f19946j);
                    C6907h.onEvent(MobClick.obtain().setEventName("message_click").setLabelName("official"));
                    return;
                }
                if (i == 0) {
                    C25712a aVar2 = new C25712a(context);
                    aVar2.mo66614a((CharSequence[]) new String[]{context.getResources().getString(R.string.bik)}, (OnClickListener) new OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            if (i == 0) {
                                C34435g.this.mo87749f();
                                C34435g.this.mo87752i();
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
        this.f19943g = C6399b.m19921a().getString(R.string.bpy);
        this.f19942f = AppImageUri.m76615a((int) R.drawable.bie);
    }

    /* renamed from: f */
    public final void mo87749f() {
        super.mo87749f();
        C42961az.m136380a(new C34314g(mo87750g(), -1));
    }
}
