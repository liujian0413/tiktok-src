package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21718a;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21719b;
import com.p280ss.android.ugc.aweme.feed.event.C28322e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28474x;
import com.p280ss.android.ugc.aweme.feed.p1238ui.masklayer.C28927a.C28928a;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33271m;
import com.p280ss.android.ugc.aweme.share.p1531c.p1532a.C37999a;
import com.p280ss.android.ugc.aweme.share.p1531c.p1532a.C38001b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.k */
public final class C38108k implements C28474x, C38389f {

    /* renamed from: a */
    private final Aweme f99186a;

    /* renamed from: b */
    private final String f99187b;

    /* renamed from: c */
    private final String f99188c;

    /* renamed from: b */
    public final String mo95715b() {
        return "dislike";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.cmd;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: a */
    public final int mo95710a() {
        if (C28928a.m95144b()) {
            return R.drawable.at1;
        }
        return R.drawable.at0;
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
    public final void mo72208a(String str) {
        Context context;
        if (C6405d.m19984g() != null) {
            context = C6405d.m19984g();
        } else {
            context = C6399b.m19921a();
        }
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl hasLongPressDislike = inst.getHasLongPressDislike();
        C7573i.m23582a((Object) hasLongPressDislike, "SharePrefCache.inst().hasLongPressDislike");
        Object d = hasLongPressDislike.mo59877d();
        C7573i.m23582a(d, "SharePrefCache.inst().hasLongPressDislike.cache");
        if (((Boolean) d).booleanValue()) {
            C10761a.m31383a(context, (int) R.string.at2).mo25750a();
        } else {
            C10761a.m31383a(context, (int) R.string.c71).mo25750a();
        }
        C42961az.m136380a(new C28322e(this.f99186a));
    }

    public C38108k(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        this(aweme, str, "click_share_button");
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        int i;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        new C33271m().mo85286a(this.f99187b).mo85287b(C33230ac.m107238m(this.f99186a)).mo85288c(C33230ac.m107205a(this.f99186a)).mo85289d(this.f99188c).mo85290e(C33230ac.m107219c(this.f99186a)).mo85252e();
        if (TextUtils.equals(this.f99187b, "homepage_hot")) {
            Aweme aweme = this.f99186a;
            String str = "delete";
            Integer num = (Integer) C21719b.m72643a().get(this.f99186a.getAid());
            if (num != null) {
                i = num.intValue();
            } else {
                i = 0;
            }
            C21718a.m72639a(aweme, str, i);
        }
        C38001b bVar = new C38001b();
        bVar.mo66536a(new C37999a());
        bVar.mo66537a(this);
        bVar.mo56976a(this.f99186a);
    }

    public C38108k(Aweme aweme, String str, String str2) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        C7573i.m23587b(str2, "enterMethod");
        this.f99186a = aweme;
        this.f99187b = str;
        this.f99188c = str2;
    }
}
