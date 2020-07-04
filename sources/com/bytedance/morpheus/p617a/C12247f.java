package com.bytedance.morpheus.p617a;

import android.content.SharedPreferences;
import com.bytedance.morpheus.C12249c;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.bytedance.morpheus.a.f */
class C12247f {

    /* renamed from: a */
    private static volatile C12247f f32560a;

    /* renamed from: b */
    private SharedPreferences f32561b = C7285c.m22838a(C12249c.m35630a(), "app_bundle_session_ids", 0);

    /* renamed from: a */
    public static C12247f m35624a() {
        if (f32560a == null) {
            synchronized (C12247f.class) {
                if (f32560a == null) {
                    f32560a = new C12247f();
                }
            }
        }
        return f32560a;
    }

    private C12247f() {
        if (C12249c.m35634b().mo29994b() != this.f32561b.getInt("app_version_code", -1)) {
            this.f32561b.edit().clear().apply();
        }
    }

    /* renamed from: a */
    public final int mo30007a(String str) {
        return this.f32561b.getInt(str, -1);
    }

    /* renamed from: a */
    public final void mo30008a(String str, int i) {
        this.f32561b.edit().putInt(str, i).apply();
    }
}
