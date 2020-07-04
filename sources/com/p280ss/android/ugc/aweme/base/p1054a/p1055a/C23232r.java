package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.effect.C27393b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.r */
final class C23232r implements C27393b {

    /* renamed from: a */
    private Context f61228a;

    /* renamed from: b */
    private SharedPreferences f61229b = C7285c.m22838a(this.f61228a, "EditEffectConfig", 0);

    /* renamed from: a */
    public final int mo60431a(int i) {
        return this.f61229b.getInt("fallback_resource_version", -1);
    }

    /* renamed from: b */
    public final void mo60432b(int i) {
        Editor edit = this.f61229b.edit();
        edit.putInt("fallback_resource_version", i);
        edit.apply();
    }

    public C23232r(Context context) {
        this.f61228a = context;
    }
}
