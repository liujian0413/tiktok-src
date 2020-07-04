package com.p280ss.android.ugc.aweme.qrcode.p1496b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25371n;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.qrcode.ScanResultActivity;
import com.p280ss.android.ugc.aweme.qrcode.model.C37082c;
import com.p280ss.android.ugc.aweme.qrcode.model.C37083d;
import com.p280ss.android.ugc.aweme.qrcode.p1498d.C37072b;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.d */
public final class C37028d {

    /* renamed from: a */
    C37044l f96965a;

    /* renamed from: b */
    private C37030a f96966b;

    /* renamed from: com.ss.android.ugc.aweme.qrcode.b.d$a */
    public interface C37030a {
        /* renamed from: b */
        void mo93472b();
    }

    /* renamed from: a */
    public final void mo93469a() {
        if (this.f96966b != null) {
            this.f96966b.mo93472b();
        }
    }

    /* renamed from: b */
    public final void mo93471b() {
        if (this.f96965a != null) {
            this.f96965a.mo86692c();
        }
        this.f96966b = null;
    }

    public C37028d(C37030a aVar) {
        this.f96966b = aVar;
    }

    /* renamed from: a */
    public final void mo93470a(final Context context, final String str, final int i) {
        if (!TextUtils.isEmpty(str)) {
            if (this.f96965a != null) {
                this.f96965a.mo86692c();
                this.f96965a = null;
            }
            this.f96965a = new C37044l(new C37083d(), new C37023b() {
                /* renamed from: a */
                public final void mo93460a(Exception exc) {
                    C37028d.m119072a(context, str, true, i);
                    C37028d.this.mo93469a();
                }

                /* renamed from: a */
                public final void mo93459a(C37082c cVar) {
                    int i = cVar.f97037a;
                    if (i == 0) {
                        C37028d.m119072a(context, str, true, i);
                    } else if (i == 3 || i == 5 || i == 9) {
                        C37028d.m119072a(context, C37072b.m119199a(str, cVar.f97038b, "qrcode"), true, i);
                    } else if (i != 11) {
                        C37028d.m119072a(context, str, true, i);
                    } else {
                        ScanResultActivity.m119026a(context, str);
                    }
                    C37028d.this.mo93469a();
                }
            });
            this.f96965a.mo93488a(str);
        }
    }

    /* renamed from: a */
    public static void m119072a(Context context, String str, boolean z, int i) {
        if (context != null && (!C7163a.m22363a() || !C25371n.m83455a(context, str, i))) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_load_dialog", true);
            bundle.putBoolean("show_not_official_content_warning", false);
            bundle.putBoolean("hide_nav_bar", false);
            bundle.putBoolean("use_webview_title", true);
            intent.putExtra("hide_more", false);
            intent.putExtra("enter_from", "qr_code");
            intent.putExtras(bundle);
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        }
    }
}
