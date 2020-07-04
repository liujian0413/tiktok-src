package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.t */
public final class C38129t implements C38389f {

    /* renamed from: a */
    private final Handler f99226a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.t$a */
    static final class C38130a<V> implements Callable<Object> {

        /* renamed from: a */
        public static final C38130a f99227a = new C38130a();

        C38130a() {
        }

        public final Object call() {
            return new Object();
        }
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.atk;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "message";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.dm0;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    public C38129t(Handler handler) {
        C7573i.m23587b(handler, "handler");
        this.f99226a = handler;
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
        C23397p.m76735a().mo60807a(this.f99226a, C38130a.f99227a, 53);
    }
}
