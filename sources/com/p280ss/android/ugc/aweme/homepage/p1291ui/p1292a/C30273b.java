package com.p280ss.android.ugc.aweme.homepage.p1291ui.p1292a;

import android.support.p022v4.app.FragmentActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.a.b */
public final class C30273b {
    /* renamed from: a */
    public static final void m99019a(FragmentActivity fragmentActivity) {
        boolean z;
        C7573i.m23587b(fragmentActivity, "activity");
        ScrollSwitchStateManager a = C30246a.m98970a(fragmentActivity);
        boolean z2 = true;
        if (!a.mo79723b("page_feed") || a.mo79729d("page_feed") == null) {
            z = false;
        } else {
            z = true;
        }
        if (!a.mo79723b("page_feed") || a.mo79725c() == null || !C7573i.m23585a((Object) a.f79583b, (Object) "USER")) {
            z2 = false;
        }
        if (!C6399b.m19946v() && z) {
            if (z2 && !a.mo79734e("page_setting")) {
                a.mo79740h("page_setting");
            } else if (!z2 && a.mo79734e("page_setting")) {
                a.mo79740h("page_profile");
            }
        }
    }
}
