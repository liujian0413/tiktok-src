package com.p280ss.android.ugc.aweme.utils;

import android.content.SharedPreferences;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.dh */
public final class C43056dh {

    /* renamed from: a */
    public static final C43056dh f111654a = new C43056dh();

    /* renamed from: b */
    private static final SharedPreferences f111655b;

    private C43056dh() {
    }

    static {
        SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "MainTabPreferences", 0);
        C7573i.m23582a((Object) a, "AppContextManager.getApp…    Context.MODE_PRIVATE)");
        f111655b = a;
    }

    /* renamed from: a */
    public static final boolean m136600a() {
        if (C6399b.m19944t() || !f111655b.getBoolean("shouldShowPrivacyPolicyDialog", true)) {
            return true;
        }
        return false;
    }
}
