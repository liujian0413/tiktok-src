package com.p280ss.android.ugc.aweme.challenge;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.utils.C43052dd;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import java.util.regex.Matcher;

/* renamed from: com.ss.android.ugc.aweme.challenge.b */
public final class C23666b extends C23657a {

    /* renamed from: b */
    public boolean f62413b;

    /* renamed from: c */
    private String f62414c;

    /* renamed from: d */
    private String f62415d;

    /* renamed from: e */
    private boolean f62416e = true;

    /* renamed from: a */
    public final SpannableString mo61574a(SpannableString spannableString) {
        int i;
        int i2;
        String spannableString2 = spannableString.toString();
        Matcher matcher = C43052dd.f111649a.matcher(spannableString2);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            final String charSequence = spannableString2.subSequence(start, end).toString();
            if (C19929d.m65759a(charSequence)) {
                this.f62413b = true;
                spannableString.setSpan(new StyleSpan(0), start, end, 17);
                if (C6399b.m19946v()) {
                    i = R.color.w4;
                } else {
                    i = R.color.a71;
                }
                int a = C23481i.m77088a(i);
                if (C6399b.m19946v()) {
                    i2 = R.color.y3;
                } else {
                    i2 = R.color.abr;
                }
                spannableString.setSpan(new C22367e(a, C23481i.m77088a(i2)) {
                    public final void onClick(View view) {
                        C23666b.this.mo61594a(charSequence);
                    }
                }, start, end, 17);
            }
        }
        if (this.f62416e) {
            return this.f62373a.mo61574a(spannableString);
        }
        return spannableString;
    }

    /* renamed from: a */
    public final void mo61594a(String str) {
        C6907h.m21524a("click_tag_link", (Map) C22984d.m75611a().mo59973a("tag_id", this.f62414c).f60753a);
        Activity g = C6405d.m19984g();
        if (g != null) {
            StringBuilder sb = new StringBuilder("#");
            sb.append(this.f62415d);
            SmartRouter.buildRoute((Context) g, "aweme://ame/webview/").withParam(Uri.parse(str)).withParam("show_load_dialog", false).withParam("hide_nav_bar", false).withParam("title", sb.toString()).open();
        }
    }

    public C23666b(String str, String str2, boolean z) {
        this.f62415d = str2;
        this.f62414c = str;
    }
}
