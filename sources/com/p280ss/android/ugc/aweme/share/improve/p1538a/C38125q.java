package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.app.Activity;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.util.C42889p;
import com.p280ss.android.ugc.aweme.util.C42895s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.q */
public final class C38125q implements C38389f {

    /* renamed from: a */
    private final String f99221a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.q$a */
    public static final class C38126a extends C42895s {

        /* renamed from: a */
        final /* synthetic */ Context f99222a;

        /* renamed from: a */
        public final void mo95733a(String str) {
            C7573i.m23587b(str, "file");
            super.mo95733a(str);
            C10761a.m31383a(this.f99222a, (int) R.string.e2j).mo25750a();
        }

        C38126a(Context context, Activity activity) {
            this.f99222a = context;
            super(activity);
        }
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.at2;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "image_save";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.di_;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    public C38125q(String str) {
        C7573i.m23587b(str, "imageUrl");
        this.f99221a = str;
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
        new C42889p(new WeakReference(context)).mo104590a(this.f99221a, new C38126a(context, C38157b.m121903a(context)));
    }
}
