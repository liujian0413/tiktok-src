package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.share.C37981am;
import com.p280ss.android.ugc.aweme.share.experiment.VideoReportEnhanceExperiment;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ac */
public final class C38073ac implements C38389f {

    /* renamed from: a */
    private final Aweme f99125a;

    /* renamed from: b */
    private final C28343z<C28318an> f99126b;

    /* renamed from: c */
    private final String f99127c;

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
        if (m121500f()) {
            return R.drawable.atz;
        }
        return R.drawable.aty;
    }

    /* renamed from: f */
    private static boolean m121500f() {
        if (!C6399b.m19944t() || !C6384b.m19835a().mo15292a(VideoReportEnhanceExperiment.class, true, "enable_enhance_report", C6384b.m19835a().mo15295d().enable_enhance_report, false)) {
            return false;
        }
        return true;
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
        C6907h.m21524a("report", (Map) new C22984d().mo59973a("author_id", this.f99125a.getAuthorUid()).mo59973a("enter_from", this.f99127c).mo59973a("group_id", C33230ac.m107238m(this.f99125a)).mo59973a("log_pb", C28199ae.m92689a().mo71791a(C33230ac.m107219c(this.f99125a))).f60753a);
        if (C37981am.m121296a(this.f99125a)) {
            if (C28482e.m93606a(this.f99125a)) {
                C38082aj.m121567a(context, this.f99125a, this.f99126b);
                return;
            }
            C28343z<C28318an> zVar = this.f99126b;
            if (zVar != null) {
                zVar.mo64929a(new C28318an(1, this.f99125a));
            }
        }
    }

    public C38073ac(Aweme aweme, C28343z<C28318an> zVar, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "enterFrom");
        this.f99125a = aweme;
        this.f99126b = zVar;
        this.f99127c = str;
    }
}
