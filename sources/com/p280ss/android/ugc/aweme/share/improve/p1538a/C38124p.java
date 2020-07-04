package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.share.gif.C38044a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.p */
public final class C38124p implements C38389f {

    /* renamed from: a */
    private final Aweme f99219a;

    /* renamed from: b */
    private final String f99220b;

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.at8;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "gif";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.ds4;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        if (!C6903bc.m21487f().mo84747b(this.f99219a) && this.f99219a.getDownloadStatus() == 0) {
            return true;
        }
        return false;
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

    public C38124p(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        this.f99219a = aweme;
        this.f99220b = str;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (C24671f.m80862l().mo65866a(this.f99219a) || C24671f.m80862l().mo65867b(this.f99219a)) {
            C10761a.m31409e(context, (int) R.string.e3).mo25750a();
        } else if (this.f99219a.getDownloadStatus() != 0) {
            C10761a.m31399c(context, (int) R.string.b9n).mo25750a();
        } else if (C6903bc.m21487f().mo84747b(this.f99219a)) {
            C10761a.m31399c(context, (int) R.string.bb_).mo25750a();
        } else {
            Activity a = C38157b.m121903a(context);
            Aweme aweme = this.f99219a;
            String str = this.f99220b;
            String a2 = C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f99219a));
            C7573i.m23582a((Object) a2, "LogPbManager.getInstance…tils.getRequestId(aweme))");
            C38044a.m121414a(a, aweme, str, a2);
        }
    }
}
