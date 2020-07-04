package com.p280ss.android.ugc.aweme.app;

import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.p481c.C9721b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.app.k */
public final class C22999k {
    /* renamed from: a */
    public static int m75642a() {
        return C7285c.m22838a(C6399b.m19921a(), "app_setting", 0).getInt("last_version_code", 0);
    }

    /* renamed from: a */
    public static void m75643a(int i) {
        Editor edit = C7285c.m22838a(C6399b.m19921a(), "app_setting", 0).edit();
        edit.putInt("last_version_code", i);
        C9721b.m28656a(edit);
    }
}
