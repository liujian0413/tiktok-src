package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.aweme.wiki.AddWikiActivity.C43558a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.r */
public final class C38127r implements C38389f {

    /* renamed from: a */
    private final Aweme f99223a;

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.atc;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "insight";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.bub;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    public C38127r(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f99223a = aweme;
    }

    /* renamed from: a */
    public final void mo95711a(Context context) {
        C7573i.m23587b(context, "context");
        C38390a.m122628a((C38389f) this, context);
    }

    /* renamed from: a */
    public final void mo95713a(ImageView imageView) {
        C7573i.m23587b(imageView, "iconView");
        C38390a.m122629a((C38389f) this, imageView);
    }

    /* renamed from: a */
    public final void mo95714a(TextView textView) {
        C7573i.m23587b(textView, "textView");
        C38390a.m122630a((C38389f) this, textView);
    }

    /* renamed from: a */
    private static void m121744a(String str, Context context) {
        Map hashMap = new HashMap();
        hashMap.put("anchor_type", "analytics");
        C43558a.m138079a(context, str, hashMap);
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        boolean z;
        String str;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        CharSequence aid = this.f99223a.getAid();
        if (aid == null || aid.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (C6399b.m19946v()) {
                StringBuilder sb = new StringBuilder("https://m.tiktok.com/insight/?hide_nav_bar=1&full_screen=1&status_bar_height=");
                sb.append(C43098ej.m136708a(44));
                sb.append("#/video/");
                Aweme aweme = this.f99223a;
                if (aweme == null) {
                    C7573i.m23580a();
                }
                sb.append(aweme.getAid());
                str = sb.toString();
            } else if (C6399b.m19947w()) {
                StringBuilder sb2 = new StringBuilder("https://www.tiktok.com/insight/?target=t&hide_nav_bar=1&full_screen=1&status_bar_height=");
                sb2.append(C43098ej.m136708a(44));
                sb2.append("#/video/");
                Aweme aweme2 = this.f99223a;
                if (aweme2 == null) {
                    C7573i.m23580a();
                }
                sb2.append(aweme2.getAid());
                str = sb2.toString();
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C6907h.m21524a("click_insight", (Map) C22984d.m75611a().mo59973a("enter_from", "video_more").f60753a);
                C6907h.m21524a("enter_insight_detail", (Map) C22984d.m75611a().mo59973a("enter_from", "video_more").f60753a);
                if (str == null) {
                    C7573i.m23580a();
                }
                m121744a(str, context);
            }
        }
    }
}
