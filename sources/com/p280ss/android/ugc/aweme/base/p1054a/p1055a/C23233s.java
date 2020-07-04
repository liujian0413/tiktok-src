package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.festival.christmas.C29137d;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.s */
final class C23233s implements C29137d {

    /* renamed from: a */
    private Context f61230a;

    /* renamed from: b */
    private SharedPreferences f61231b = C7285c.m22838a(this.f61230a, "ShowXmaxTreeCache", 0);

    /* renamed from: a */
    public final long mo60433a() {
        return this.f61231b.getLong("lastShowTime", 0);
    }

    /* renamed from: b */
    public final long mo60435b() {
        return this.f61231b.getLong("shotLastShowTime", 0);
    }

    public C23233s(Context context) {
        this.f61230a = context;
    }

    /* renamed from: a */
    public final void mo60434a(long j) {
        Editor edit = this.f61231b.edit();
        edit.putLong("lastShowTime", j);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo60436b(long j) {
        Editor edit = this.f61231b.edit();
        edit.putLong("shotLastShowTime", j);
        edit.apply();
    }
}
