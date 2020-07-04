package com.p280ss.android.ugc.aweme.share.improve.p1538a;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f.C38390a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.a.h */
public final class C38102h implements C38389f {

    /* renamed from: a */
    public static final C38103a f99174a = new C38103a(null);

    /* renamed from: b */
    private final Aweme f99175b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.a.h$a */
    public static final class C38103a {
        private C38103a() {
        }

        public /* synthetic */ C38103a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo95710a() {
        return R.drawable.ld;
    }

    /* renamed from: b */
    public final String mo95715b() {
        return "copy_ad_data";
    }

    /* renamed from: c */
    public final int mo95716c() {
        return R.string.ahe;
    }

    /* renamed from: d */
    public final boolean mo95717d() {
        return false;
    }

    /* renamed from: e */
    public final boolean mo95718e() {
        return true;
    }

    /* renamed from: f */
    private final boolean m121648f() {
        if (this.f99175b == null || !C25329c.m83221d(this.f99175b) || !C7163a.m22363a()) {
            return false;
        }
        return true;
    }

    public C38102h(Aweme aweme) {
        C7573i.m23587b(aweme, "aweme");
        this.f99175b = aweme;
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
        if (m121648f()) {
            try {
                Object systemService = context.getSystemService("clipboard");
                if (systemService != null) {
                    ClipboardManager clipboardManager = (ClipboardManager) systemService;
                    if (clipboardManager != null) {
                        String b = new C6600e().mo15979b((Object) this.f99175b);
                        clipboardManager.setPrimaryClip(ClipData.newPlainText(b, b));
                        C10761a.m31383a(context, (int) R.string.ahf).mo25750a();
                    }
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
                }
            } catch (Exception unused) {
            }
        }
    }
}
