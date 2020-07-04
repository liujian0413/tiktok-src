package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.web.p582a.C11087a;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25834c;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.aa */
public final class C38070aa implements C38389f {

    /* renamed from: a */
    private final C25834c f99121a;

    /* renamed from: b */
    private final C11087a f99122b;

    public C38070aa() {
        this(null, null, 3, null);
    }

    public C38070aa(C25834c cVar) {
        this(cVar, null, 2, null);
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.atw;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "refresh";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.ddx;
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

    public C38070aa(C25834c cVar, C11087a aVar) {
        this.f99121a = cVar;
        this.f99122b = aVar;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
        if (this.f99121a != null) {
            this.f99121a.mo65878g();
            return;
        }
        C11087a aVar = this.f99122b;
        if (aVar != null) {
            WebView webView = aVar.f30155d;
            if (webView != null) {
                webView.reload();
            }
        }
    }

    private /* synthetic */ C38070aa(C25834c cVar, C11087a aVar, int i, C7571f fVar) {
        if ((i & 1) != 0) {
            cVar = null;
        }
        this(cVar, null);
    }
}
