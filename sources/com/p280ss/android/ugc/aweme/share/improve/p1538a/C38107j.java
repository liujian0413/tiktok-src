package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.share.C37981am;
import com.p280ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.j */
public final class C38107j implements C38389f {

    /* renamed from: a */
    private final WeakReference<C28343z<C28318an>> f99185a;

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.asz;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "delete";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.anl;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    public C38107j(C28343z<C28318an> zVar) {
        C7573i.m23587b(zVar, "listener");
        this.f99185a = new WeakReference<>(zVar);
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
        SharePackage sharePackage2;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (!(sharePackage instanceof AwemeSharePackage)) {
            sharePackage2 = null;
        } else {
            sharePackage2 = sharePackage;
        }
        if (((AwemeSharePackage) sharePackage2) != null) {
            Aweme aweme = ((AwemeSharePackage) sharePackage).f99302a;
            if (aweme != null) {
                if (!C37981am.m121296a(aweme) || !C28482e.m93606a(aweme)) {
                    C38082aj.m121568a(aweme);
                } else {
                    C38082aj.m121567a(context, aweme, (C28343z) this.f99185a.get());
                }
            }
        }
    }
}
