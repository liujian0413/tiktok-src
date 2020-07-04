package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.livesdkapi.depend.share.C9389b;
import com.p280ss.android.ugc.aweme.framework.services.IReportService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.report.C37196b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.b */
public final class C38235b implements C38389f {

    /* renamed from: a */
    private final Activity f99392a;

    /* renamed from: b */
    private final C9389b f99393b;

    /* renamed from: b */
    public final String mo95715b() {
        return "report_live";
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
        return C37196b.m119556a();
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

    public C38235b(Activity activity, C9389b bVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(bVar, "params");
        this.f99392a = activity;
        this.f99393b = bVar;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (this.f99393b != null) {
            ((IReportService) ServiceManager.get().getService(IReportService.class)).showReportDialog(this.f99392a, "live", String.valueOf(this.f99393b.f25843z), String.valueOf(this.f99393b.f25814A), null);
            C37196b.m119565a("", "live", "", String.valueOf(this.f99393b.f25820c), String.valueOf(this.f99393b.f25819b), String.valueOf(this.f99393b.f25820c), "click_share_button");
        }
    }
}
