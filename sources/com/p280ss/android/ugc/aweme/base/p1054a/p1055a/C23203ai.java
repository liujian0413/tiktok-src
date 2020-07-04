package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.setting.C37556ai;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ai */
final class C23203ai implements C37556ai {

    /* renamed from: a */
    private Context f61181a;

    /* renamed from: b */
    private SharedPreferences f61182b = C7285c.m22838a(this.f61181a, "Player", 0);

    /* renamed from: a */
    public final int mo60385a() {
        return this.f61182b.getInt("testPlayerType", 0);
    }

    public C23203ai(Context context) {
        this.f61181a = context;
    }

    /* renamed from: a */
    public final void mo60386a(int i) {
        Editor edit = this.f61182b.edit();
        edit.putInt("testPlayerType", i);
        edit.apply();
    }
}
