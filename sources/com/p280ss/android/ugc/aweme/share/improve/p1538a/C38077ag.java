package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.setting.model.RestrictAwemeModel;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37637c;
import com.p280ss.android.ugc.aweme.setting.p1520h.C37640f;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38156a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.ag */
public final class C38077ag implements C37637c, C38389f {

    /* renamed from: a */
    public final C37640f f99131a = new C37640f(new RestrictAwemeModel(), this);

    /* renamed from: b */
    public final Aweme f99132b;

    /* renamed from: c */
    private final String f99133c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ag$a */
    static final class C38078a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C38077ag f99134a;

        C38078a(C38077ag agVar) {
            this.f99134a = agVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f99134a.f99131a.mo94935a(this.f99134a.f99132b.getAid());
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.ag$b */
    static final class C38079b implements OnClickListener {

        /* renamed from: a */
        public static final C38079b f99135a = new C38079b();

        C38079b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.agv;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "restrict";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.dgq;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: h */
    public final void mo71987h() {
        C9738o.m28693a(C6399b.m19921a(), (int) R.string.dgt);
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
    public final void mo71985a(Exception exc) {
        C22814a.m75244a(C6399b.m19921a(), (Throwable) exc);
    }

    public C38077ag(Aweme aweme, String str) {
        C7573i.m23587b(aweme, "aweme");
        C7573i.m23587b(str, "eventType");
        this.f99132b = aweme;
        this.f99133c = str;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (C38156a.m121902a(this, context, this.f99132b, this.f99133c)) {
            new C10741a(context).mo25649a((int) R.string.dgo).mo25650a((int) R.string.dgm, (OnClickListener) new C38078a(this)).mo25658b((int) R.string.w_, (OnClickListener) C38079b.f99135a).mo25656a().mo25637a();
        }
    }
}
