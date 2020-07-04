package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.main.C32922c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.w */
final class C23237w implements C32922c {

    /* renamed from: a */
    private Context f61238a;

    /* renamed from: b */
    private SharedPreferences f61239b = C7285c.m22838a(this.f61238a, "DeviceSettingSp", 0);

    /* renamed from: a */
    public final boolean mo60453a(boolean z) {
        return this.f61239b.getBoolean("support_douyidou", true);
    }

    public C23237w(Context context) {
        this.f61238a = context;
    }
}
