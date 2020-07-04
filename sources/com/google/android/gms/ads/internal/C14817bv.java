package com.google.android.gms.ads.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.aag;
import com.google.android.gms.internal.ads.acl;
import com.google.android.gms.internal.ads.zzaxk;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.bv */
public final class C14817bv {

    /* renamed from: a */
    private final Context f38332a;

    /* renamed from: b */
    private boolean f38333b;

    /* renamed from: c */
    private aag f38334c;

    /* renamed from: d */
    private zzaxk f38335d;

    public C14817bv(Context context, aag aag, zzaxk zzaxk) {
        this.f38332a = context;
        this.f38334c = aag;
        this.f38335d = zzaxk;
        if (this.f38335d == null) {
            this.f38335d = new zzaxk();
        }
    }

    /* renamed from: c */
    private final boolean m43013c() {
        return (this.f38334c != null && this.f38334c.mo39027a().f45674f) || this.f38335d.f45650a;
    }

    /* renamed from: a */
    public final void mo37759a() {
        this.f38333b = true;
    }

    /* renamed from: b */
    public final boolean mo37761b() {
        return !m43013c() || this.f38333b;
    }

    /* renamed from: a */
    public final void mo37760a(String str) {
        if (m43013c()) {
            if (str == null) {
                str = "";
            }
            if (this.f38334c != null) {
                this.f38334c.mo39030a(str, null, 3);
                return;
            }
            if (this.f38335d.f45650a && this.f38335d.f45651b != null) {
                for (String str2 : this.f38335d.f45651b) {
                    if (!TextUtils.isEmpty(str2)) {
                        acl.m45528a(this.f38332a, "", str2.replace("{NAVIGATION_URL}", Uri.encode(str)));
                    }
                }
            }
        }
    }
}
