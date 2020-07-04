package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.report.C37196b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.af */
public final class C38076af implements C38389f {

    /* renamed from: a */
    private final User f99130a;

    /* renamed from: b */
    public final String mo95715b() {
        return "report";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.des;
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
        if (C37196b.m119569b()) {
            return R.drawable.atz;
        }
        return R.drawable.aty;
    }

    public C38076af(User user) {
        C7573i.m23587b(user, "user");
        this.f99130a = user;
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
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        C6907h.m21524a("report_user", (Map) C22984d.m75611a().mo59973a("enter_from", "others_homepage").mo59973a("to_user_id", this.f99130a.getUid()).f60753a);
        ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(C38157b.m121903a(context), "user", this.f99130a.getUid(), this.f99130a.getUid(), null);
        C37196b.m119565a("others_homepage", "user", "", this.f99130a.getUid(), this.f99130a.getUid(), "", "click_share_button");
    }
}
