package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.discover.hitrank.C26681f;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.p */
final class C23230p implements C26681f {

    /* renamed from: a */
    private Context f61224a;

    /* renamed from: b */
    private SharedPreferences f61225b = C7285c.m22838a(this.f61224a, "RankSp", 0);

    /* renamed from: a */
    public final boolean mo60428a() {
        return this.f61225b.getBoolean("hasShowToast", false);
    }

    /* renamed from: a */
    public final void mo60427a(boolean z) {
        Editor edit = this.f61225b.edit();
        edit.putBoolean("hasShowToast", true);
        edit.apply();
    }

    public C23230p(Context context) {
        this.f61224a = context;
    }
}
