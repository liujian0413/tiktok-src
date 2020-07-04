package com.p280ss.android.ugc.aweme.newfollow.p1423ui;

import android.content.Context;
import android.content.Intent;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView.C26926a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.NotificationPushGuide */
public final class NotificationPushGuide {

    /* renamed from: d */
    private static int f89056d = 3;

    /* renamed from: e */
    private static int f89057e = 15;

    /* renamed from: a */
    public NoticeView f89058a;

    /* renamed from: b */
    public Context f89059b;

    /* renamed from: c */
    public EnterFrom f89060c = EnterFrom.Message;

    /* renamed from: f */
    private C34161a f89061f;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.NotificationPushGuide$EnterFrom */
    public enum EnterFrom {
        Message,
        Follow
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.NotificationPushGuide$a */
    public interface C34161a {
        /* renamed from: a */
        void mo75676a(Context context);

        /* renamed from: b */
        boolean mo75677b(Context context);
    }

    /* renamed from: e */
    private long m110136e() {
        return C6887b.m21436b().mo16910c(this.f89059b, "key_cross_push_notification_guide");
    }

    /* renamed from: c */
    public final long mo86885c() {
        return C6887b.m21436b().mo16910c(this.f89059b, "key_times_push_notification_guide");
    }

    /* renamed from: d */
    private void m110135d() {
        if (this.f89058a != null && this.f89059b != null) {
            this.f89058a.setOnInternalClickListener(new C26926a() {
                /* renamed from: a */
                public final void mo69646a() {
                    NotificationPushGuide.this.f89058a.setVisibility(8);
                    NotificationPushGuide.this.mo86881a(NotificationPushGuide.this.f89059b);
                    if (NotificationPushGuide.this.f89060c == EnterFrom.Follow) {
                        C6907h.m21524a("notification_setting_alert_click", (Map) C22984d.m75611a().mo59973a("enter_from", "follow").f60753a);
                    } else {
                        C6907h.m21524a("notification_setting_alert_click", (Map) C22984d.m75611a().mo59973a("enter_from", "message").f60753a);
                    }
                }

                /* renamed from: b */
                public final void mo69647b() {
                    NotificationPushGuide.this.f89058a.setVisibility(8);
                    NotificationPushGuide.this.mo86882a(Long.valueOf(System.currentTimeMillis()));
                    NotificationPushGuide.this.mo86884b(Long.valueOf(NotificationPushGuide.this.mo86885c() + 1));
                    if (NotificationPushGuide.this.f89060c == EnterFrom.Follow) {
                        C6907h.m21524a("notification_setting_alert_close", (Map) C22984d.m75611a().mo59973a("enter_from", "follow").f60753a);
                    } else {
                        C6907h.m21524a("notification_setting_alert_close", (Map) C22984d.m75611a().mo59973a("enter_from", "message").f60753a);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo86883b() {
        if (this.f89059b != null && this.f89058a != null && this.f89061f != null) {
            if (System.currentTimeMillis() - m110136e() <= ((long) f89057e) * 86400000 || mo86885c() >= ((long) f89056d)) {
                this.f89058a.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo86880a() {
        if (this.f89059b != null && this.f89058a != null && this.f89061f != null) {
            if (!this.f89061f.mo75677b(this.f89059b)) {
                if (System.currentTimeMillis() - m110136e() <= ((long) f89057e) * 86400000 || mo86885c() >= ((long) f89056d)) {
                    this.f89058a.setVisibility(8);
                    return;
                }
                this.f89058a.setVisibility(0);
                if (this.f89060c == EnterFrom.Follow) {
                    C6907h.m21524a("notification_setting_alert_show", (Map) C22984d.m75611a().mo59973a("enter_from", "follow").f60753a);
                } else {
                    C6907h.m21524a("notification_setting_alert_show", (Map) C22984d.m75611a().mo59973a("enter_from", "message").f60753a);
                }
            } else {
                this.f89058a.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo86882a(Long l) {
        C6887b.m21436b().mo16899a(this.f89059b, "key_cross_push_notification_guide", l.longValue());
    }

    /* renamed from: b */
    public final void mo86884b(Long l) {
        C6887b.m21436b().mo16899a(this.f89059b, "key_times_push_notification_guide", l.longValue());
    }

    /* renamed from: a */
    public final void mo86881a(Context context) {
        if (this.f89061f != null) {
            try {
                this.f89061f.mo75676a(this.f89059b);
            } catch (Exception unused) {
                this.f89059b.startActivity(new Intent("android.settings.SETTINGS"));
            }
        }
    }

    public NotificationPushGuide(NoticeView noticeView, C34161a aVar) {
        this.f89058a = noticeView;
        this.f89058a.setVisibility(8);
        this.f89061f = aVar;
        if (!(this.f89058a == null || this.f89061f == null)) {
            this.f89059b = this.f89058a.getContext();
            m110135d();
        }
        try {
            f89056d = C30199h.m98861a().getPushGuideInfo().getCloseCountLimit().intValue();
            f89057e = C30199h.m98861a().getPushGuideInfo().getShowupInterval().intValue();
        } catch (Exception unused) {
            f89056d = 3;
            f89057e = 15;
        }
    }
}
