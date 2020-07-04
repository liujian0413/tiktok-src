package com.p280ss.android.ugc.aweme.homepage.p1291ui.p1292a;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager.C23434a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.a.d */
public final class C30275d implements C23434a {

    /* renamed from: a */
    private final FragmentActivity f79637a;

    /* renamed from: b */
    private final C30274c f79638b;

    /* renamed from: a */
    private final boolean m99024a() {
        if (!C30246a.m98970a(this.f79637a).mo79723b("page_feed") || !C7573i.m23585a((Object) C30246a.m98970a(this.f79637a).f79583b, (Object) "USER")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo61031a(int i) {
        if (!this.f79638b.mo61031a(i) && !m99024a()) {
            return false;
        }
        if (i == -1) {
            if (C30246a.m98970a(this.f79637a).mo79723b("page_discover") || m99024a()) {
                return true;
            }
            return false;
        } else if (i != 1 || !m99024a()) {
            return true;
        } else {
            return false;
        }
    }

    public C30275d(FragmentActivity fragmentActivity, C30274c cVar) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(cVar, "scrollBasicChecker");
        this.f79637a = fragmentActivity;
        this.f79638b = cVar;
    }
}
