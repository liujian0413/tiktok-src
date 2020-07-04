package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.antiaddic.lock.entity.C22601c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.l */
final class C23226l implements C22601c {

    /* renamed from: a */
    private Context f61215a;

    /* renamed from: b */
    private SharedPreferences f61216b = C7285c.m22838a(this.f61215a, "TeenageModeSetting", 0);

    /* renamed from: a */
    public final String mo59296a() {
        return this.f61216b.getString("teenage_mode_setting", "");
    }

    public C23226l(Context context) {
        this.f61215a = context;
    }

    /* renamed from: a */
    public final void mo59297a(String str) {
        Editor edit = this.f61216b.edit();
        edit.putString("teenage_mode_setting", str);
        edit.apply();
    }
}
