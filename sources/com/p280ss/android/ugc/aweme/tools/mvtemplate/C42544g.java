package com.p280ss.android.ugc.aweme.tools.mvtemplate;

import android.content.SharedPreferences.Editor;
import com.bytedance.common.utility.p481c.C9721b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.g */
public final class C42544g {
    /* renamed from: a */
    public static final boolean m135197a(String str) {
        C7573i.m23587b(str, "key");
        return C7285c.m22838a(C35563c.f93238a, "mv_template", 0).getBoolean(str, false);
    }

    /* renamed from: a */
    public static final void m135196a(String str, boolean z) {
        C7573i.m23587b(str, "key");
        Editor edit = C7285c.m22838a(C35563c.f93238a, "mv_template", 0).edit();
        edit.putBoolean(str, true);
        C9721b.m28656a(edit);
    }
}
