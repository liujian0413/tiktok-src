package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.main.C32981dh;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.y */
final class C23239y implements C32981dh {

    /* renamed from: a */
    private Context f61242a;

    /* renamed from: b */
    private SharedPreferences f61243b = C7285c.m22838a(this.f61242a, "NotificationSharePreferences", 0);

    /* renamed from: a */
    public final void mo60486a(boolean z) {
        Editor edit = this.f61243b.edit();
        edit.putBoolean("noticeGuideShown", true);
        edit.apply();
    }

    /* renamed from: b */
    public final void mo60487b(boolean z) {
        Editor edit = this.f61243b.edit();
        edit.putBoolean("read_contact_denied", true);
        edit.apply();
    }

    public C23239y(Context context) {
        this.f61242a = context;
    }
}
