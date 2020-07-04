package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.memory.C33202b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.z */
final class C23240z implements C33202b {

    /* renamed from: a */
    private Context f61244a;

    /* renamed from: b */
    private SharedPreferences f61245b = C7285c.m22838a(this.f61244a, "LeakDetectorSp", 0);

    public C23240z(Context context) {
        this.f61244a = context;
    }

    /* renamed from: a */
    public final Boolean mo60488a(Boolean bool) {
        return Boolean.valueOf(this.f61245b.getBoolean("native_memory_monitor_status", bool.booleanValue()));
    }

    /* renamed from: b */
    public final void mo60489b(Boolean bool) {
        Editor edit = this.f61245b.edit();
        edit.putBoolean("native_memory_monitor_status", bool.booleanValue());
        edit.apply();
    }
}
