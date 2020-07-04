package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34322c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ad */
final class C23198ad implements C34322c {

    /* renamed from: a */
    private Context f61171a;

    /* renamed from: b */
    private SharedPreferences f61172b = C7285c.m22838a(this.f61171a, "IMPreferences", 0);

    /* renamed from: a */
    public final void mo60347a(boolean z) {
        Editor edit = this.f61172b.edit();
        edit.putBoolean("stick_game_assistant", true);
        edit.apply();
    }

    public C23198ad(Context context) {
        this.f61171a = context;
    }
}
