package com.p280ss.android.ugc.aweme.newfollow.p1420c;

import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView.C26926a;
import com.p280ss.android.ugc.aweme.newfollow.p1419b.C34122b;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.newfollow.c.a */
public final class C34123a {

    /* renamed from: a */
    public NoticeView f88917a;

    /* renamed from: b */
    public C34122b f88918b;

    /* renamed from: c */
    private Context f88919c = this.f88917a.getContext();

    /* renamed from: a */
    public final void mo86789a() {
        C7285c.m22838a(this.f88919c, "follow_tab_info", 0).edit().putLong("last_guide_close_time", System.currentTimeMillis()).apply();
    }

    /* renamed from: b */
    private void m109891b() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(this.f88919c.getText(R.string.b72));
        spannableStringBuilder.append(" \n");
        SpannableString spannableString = new SpannableString(this.f88919c.getString(R.string.b6y));
        spannableString.setSpan(new ForegroundColorSpan(C0683b.m2912c(this.f88919c, R.color.a4r)), 0, spannableString.length(), 33);
        spannableStringBuilder.append(spannableString);
        this.f88917a.setTitleText((CharSequence) spannableStringBuilder);
    }

    /* renamed from: c */
    private boolean m109892c() {
        long j;
        if (((Long) SharePrefCache.inst().getFollowNoticeCloseTime().mo59877d()).longValue() > 0) {
            j = ((Long) SharePrefCache.inst().getFollowNoticeCloseTime().mo59877d()).longValue();
        } else {
            j = 2592000000L;
        }
        if (System.currentTimeMillis() - C7285c.m22838a(this.f88919c, "follow_tab_info", 0).getLong("last_guide_close_time", 0) > j) {
            return true;
        }
        return false;
    }

    public C34123a(NoticeView noticeView) {
        this.f88917a = noticeView;
        this.f88917a.setVisibility(8);
        m109891b();
    }

    /* renamed from: a */
    public final void mo86790a(boolean z) {
        if (!z && this.f88917a != null) {
            this.f88917a.setVisibility(8);
        } else if (this.f88919c != null && this.f88917a != null) {
            if (m109892c()) {
                this.f88917a.setVisibility(0);
                C34138b.m110005c("contact_alert_show");
            } else {
                this.f88917a.setVisibility(8);
            }
            this.f88917a.setOnInternalClickListener(new C26926a() {
                /* renamed from: b */
                public final void mo69647b() {
                    C34123a.this.mo86789a();
                    C34123a.this.f88917a.setVisibility(8);
                    C34138b.m110005c("contact_alert_close");
                }

                /* renamed from: a */
                public final void mo69646a() {
                    if (C34123a.this.f88918b != null) {
                        C34123a.this.f88918b.mo86788a();
                        C34123a.this.mo86789a();
                        C34123a.this.f88917a.setVisibility(8);
                        C34138b.m110005c("contact_alert_click");
                    }
                }
            });
        }
    }
}
