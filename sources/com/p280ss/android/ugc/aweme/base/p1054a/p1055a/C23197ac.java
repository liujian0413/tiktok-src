package com.p280ss.android.ugc.aweme.base.p1054a.p1055a;

import android.content.Context;
import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.notice.api.p1429sp.C34321b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.base.a.a.ac */
final class C23197ac implements C34321b {

    /* renamed from: a */
    private Context f61169a;

    /* renamed from: b */
    private SharedPreferences f61170b = C7285c.m22838a(this.f61169a, "default_config", 0);

    /* renamed from: a */
    public final boolean mo60346a() {
        return this.f61170b.getBoolean("star_atlas_notice_enable", false);
    }

    public C23197ac(Context context) {
        this.f61169a = context;
    }
}
