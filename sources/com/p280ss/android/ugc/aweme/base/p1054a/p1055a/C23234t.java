package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.i18n.draftcompat.C30450a;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.t */
final class C23234t implements C30450a {

    /* renamed from: a */
    private Context f61232a;

    /* renamed from: b */
    private SharedPreferences f61233b = C7285c.m22838a(this.f61232a, "CleanUpPreferences", 0);

    /* renamed from: a */
    public final int mo60437a(int i) {
        return this.f61233b.getInt("compatStatus", 0);
    }

    /* renamed from: b */
    public final void mo60439b(int i) {
        Editor edit = this.f61233b.edit();
        edit.putInt("compatStatus", i);
        edit.apply();
    }

    public C23234t(Context context) {
        this.f61232a = context;
    }

    /* renamed from: a */
    public final boolean mo60438a(boolean z) {
        return this.f61233b.getBoolean("finishedCleanNoneUsedFiles", false);
    }

    /* renamed from: b */
    public final void mo60440b(boolean z) {
        Editor edit = this.f61233b.edit();
        edit.putBoolean("finishedCleanNoneUsedFiles", true);
        edit.apply();
    }
}
