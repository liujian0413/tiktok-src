package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.content.C0683b;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView;
import com.p280ss.android.ugc.aweme.discover.p1185ui.NoticeView.C26926a;
import com.p280ss.android.ugc.aweme.p962f.C21703c;
import com.p280ss.android.ugc.aweme.p962f.p963a.C21695a;
import com.p280ss.android.ugc.aweme.p962f.p963a.C21698b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.b */
public final class C36663b {

    /* renamed from: b */
    private static boolean f96280b;

    /* renamed from: a */
    public Context f96281a;

    /* renamed from: c */
    private NoticeView f96282c;

    /* renamed from: b */
    public final void mo93012b() {
        this.f96282c.setVisibility(8);
    }

    /* renamed from: a */
    public static void m118308a() {
        if (!f96280b) {
            C21695a.m72595a().mo57966b(true);
            f96280b = true;
        }
        C21703c.m72613a("personal_home");
    }

    /* renamed from: c */
    private void m118309c() {
        C21698b b = C21695a.m72595a().mo57965b();
        if (!C21695a.m72595a().mo57964a(true) || b == null) {
            this.f96282c.setVisibility(8);
            return;
        }
        this.f96282c.setVisibility(0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(b.f58111b);
        spannableStringBuilder.append(" ");
        SpannableString spannableString = new SpannableString(this.f96281a.getString(R.string.s3));
        spannableString.setSpan(new ForegroundColorSpan(C0683b.m2912c(this.f96281a, R.color.a4r)), 0, spannableString.length(), 33);
        spannableStringBuilder.append(spannableString);
        this.f96282c.setTitleText((CharSequence) spannableStringBuilder);
        this.f96282c.setOnInternalClickListener(new C26926a() {
            /* renamed from: b */
            public final void mo69647b() {
                C36663b.this.mo93012b();
            }

            /* renamed from: a */
            public final void mo69646a() {
                if (C36663b.this.f96281a != null) {
                    C21703c.m72614b("personal_home");
                    C6861a.m21335d().bindMobile((Activity) C36663b.this.f96281a, "personal_home", null, null);
                    C36663b.this.mo93012b();
                }
            }
        });
    }

    public C36663b(NoticeView noticeView, Context context) {
        this.f96282c = noticeView;
        this.f96281a = context;
        m118309c();
    }
}
