package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.trill.share.p1767a.C45078a;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.au */
final class C23215au implements C45078a {

    /* renamed from: a */
    private Context f61205a;

    /* renamed from: b */
    private SharedPreferences f61206b = C7285c.m22838a(this.f61205a, "VideoPublishManager", 0);

    /* renamed from: a */
    public final void mo60411a(boolean z) {
        Editor edit = this.f61206b.edit();
        edit.putBoolean("is_aweme_private", z);
        edit.apply();
    }

    /* renamed from: b */
    public final boolean mo60412b(boolean z) {
        return this.f61206b.getBoolean("is_aweme_private", false);
    }

    /* renamed from: c */
    public final void mo60413c(boolean z) {
        Editor edit = this.f61206b.edit();
        edit.putBoolean("bind_helo_status", z);
        edit.apply();
    }

    /* renamed from: d */
    public final void mo60414d(boolean z) {
        Editor edit = this.f61206b.edit();
        edit.putBoolean("accredit_helo_status", z);
        edit.apply();
    }

    public C23215au(Context context) {
        this.f61205a = context;
    }
}
