package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.metrics.C33228ab;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38156a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.c */
public final class C38089c implements C38389f {

    /* renamed from: a */
    private final Aweme f99150a;

    /* renamed from: b */
    private final String f99151b;

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.aw4;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "ad_plan";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.c81;
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

    public C38089c(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        this.f99150a = aweme;
        this.f99151b = str;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (C38156a.m121902a(this, context, this.f99150a, this.f99151b)) {
            C33228ab.m107200a("promote_layer_show").mo85057b("enter_from", this.f99151b).mo85057b(C38347c.f99553h, "promote_plan").mo85057b("group_id", this.f99150a.getAid()).mo85252e();
            new C10741a(context).mo25649a((int) R.string.c7z).mo25660b(this.f99150a.getAdSchedule()).mo25650a((int) R.string.afn, (OnClickListener) null).mo25656a().mo25638b();
        }
    }
}
