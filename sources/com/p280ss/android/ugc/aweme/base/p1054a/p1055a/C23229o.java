package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.commercialize.loft.C24863e;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.o */
final class C23229o implements C24863e {

    /* renamed from: a */
    private Context f61222a;

    /* renamed from: b */
    private SharedPreferences f61223b = C7285c.m22838a(this.f61222a, "LoftSp", 0);

    /* renamed from: a */
    public final boolean mo60425a(boolean z) {
        return this.f61223b.getBoolean("hasShowGuide", false);
    }

    /* renamed from: b */
    public final void mo60426b(boolean z) {
        Editor edit = this.f61223b.edit();
        edit.putBoolean("hasShowGuide", true);
        edit.apply();
    }

    public C23229o(Context context) {
        this.f61222a = context;
    }
}
