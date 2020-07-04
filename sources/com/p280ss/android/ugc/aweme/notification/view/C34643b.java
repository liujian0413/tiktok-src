package com.p280ss.android.ugc.aweme.notification.view;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34320a;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34323d;
import com.p280ss.android.ugc.aweme.notification.p1436e.C34439a;
import com.p280ss.android.ugc.aweme.notification.view.NoticeView.C34640a;
import com.p280ss.android.ugc.aweme.p1355k.p1357b.C32265a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.notification.view.b */
public final class C34643b {

    /* renamed from: a */
    public NoticeView f90399a;

    /* renamed from: b */
    public Context f90400b = this.f90399a.getContext();

    /* renamed from: b */
    private void m111914b() {
        if (this.f90399a != null && this.f90400b != null) {
            this.f90399a.setOnInternalClickListener(new C34640a() {
                /* renamed from: a */
                public final void mo87935a() {
                    C34643b.this.f90399a.setVisibility(8);
                    C34643b.m111913a(C34643b.this.f90400b);
                    C6907h.m21524a("notification_setting_alert_click", (Map) C22984d.m75611a().mo59973a("enter_from", "message").f60753a);
                }

                /* renamed from: b */
                public final void mo87936b() {
                    C34643b.this.f90399a.setVisibility(8);
                    ((C34320a) C34323d.m111009a(C34320a.class)).mo60335a(System.currentTimeMillis());
                    ((C34320a) C34323d.m111009a(C34320a.class)).mo60338b(((C34320a) C34323d.m111009a(C34320a.class)).mo60341d() + 1);
                    C6907h.m21524a("notification_setting_alert_close", (Map) C22984d.m75611a().mo59973a("enter_from", "message").f60753a);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo87937a() {
        if (this.f90400b != null && this.f90399a != null && C34439a.f89873b.showNoticeGuideBanner()) {
            if (!C32265a.m104780a(this.f90400b)) {
                if (System.currentTimeMillis() - ((C34320a) C34323d.m111009a(C34320a.class)).mo60340c() <= 1296000000 || ((C34320a) C34323d.m111009a(C34320a.class)).mo60341d() > 3) {
                    this.f90399a.setVisibility(8);
                } else {
                    this.f90399a.setVisibility(0);
                    C6907h.m21524a("notification_setting_alert_show", (Map) C22984d.m75611a().mo59973a("enter_from", "message").f60753a);
                }
            } else {
                this.f90399a.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public static void m111913a(Context context) {
        SmartRouter.buildRoute(context, "aweme://push_setting_manager").open();
    }

    public C34643b(NoticeView noticeView) {
        this.f90399a = noticeView;
        this.f90399a.setVisibility(8);
        m111914b();
    }
}
