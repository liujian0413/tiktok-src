package com.p280ss.android.ugc.aweme.share.p1536f;

import android.content.Context;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.share.f.b */
public final class C38038b {

    /* renamed from: a */
    public static final C38038b f99024a = new C38038b();

    private C38038b() {
    }

    /* renamed from: a */
    public static void m121405a(Context context, String str) {
        if (context != null && context.getApplicationContext() != null) {
            C7285c.m22838a(context.getApplicationContext(), "share_command", 0).edit().putString("command", str).apply();
        }
    }
}
