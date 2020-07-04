package com.bytedance.p524g.p525a.p529d;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.bytedance.g.a.d.b */
public final class C10274b implements C10273a {

    /* renamed from: a */
    private SharedPreferences f27901a;

    /* renamed from: b */
    private Editor f27902b = this.f27901a.edit();

    public C10274b(Context context) {
        this.f27901a = C7285c.m22838a(context, "google_play_plugin_status", 0);
    }

    /* renamed from: a */
    public final void mo24992a(String str, String str2) {
        this.f27902b.putString(str, str2);
        this.f27902b.commit();
    }
}
