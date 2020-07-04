package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.setting.p1521i.C37652b;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.al */
final class C23206al implements C37652b {

    /* renamed from: a */
    private Context f61187a;

    /* renamed from: b */
    private SharedPreferences f61188b = C7285c.m22838a(this.f61187a, "referral_code", 0);

    /* renamed from: a */
    public final boolean mo60391a(boolean z) {
        return this.f61188b.getBoolean("referral_code_badge", false);
    }

    /* renamed from: b */
    public final void mo60392b(boolean z) {
        Editor edit = this.f61188b.edit();
        edit.putBoolean("referral_code_badge", true);
        edit.apply();
    }

    public C23206al(Context context) {
        this.f61187a = context;
    }
}
