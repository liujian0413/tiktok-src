package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.y */
public final class C38137y implements C38389f {

    /* renamed from: a */
    public static final C38138a f99241a = new C38138a(null);

    /* renamed from: b */
    private final String f99242b;

    /* renamed from: c */
    private final boolean f99243c;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.y$a */
    public static final class C38138a {
        private C38138a() {
        }

        public /* synthetic */ C38138a(C7571f fVar) {
            this();
        }
    }

    public C38137y() {
        this(null, false, 3, null);
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.ats;
    }

    /* renamed from: a */
    public final void mo95712a(Context context, SharePackage sharePackage) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(sharePackage, "sharePackage");
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "qr_code";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.d_x;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return this.f99243c;
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

    public C38137y(String str, boolean z) {
        C7573i.m23587b(str, "enterFrom");
        this.f99242b = str;
        this.f99243c = z;
    }

    public /* synthetic */ C38137y(String str, boolean z, int i, C7571f fVar) {
        this("", true);
    }
}
