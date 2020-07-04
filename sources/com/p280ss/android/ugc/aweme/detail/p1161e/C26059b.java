package com.p280ss.android.ugc.aweme.detail.p1161e;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager.C23434a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.e.b */
public final class C26059b implements C23434a {

    /* renamed from: a */
    private final FragmentActivity f68869a;

    /* renamed from: b */
    private final C26058a f68870b;

    /* renamed from: a */
    public final boolean mo61031a(int i) {
        if (!this.f68870b.mo61031a(i)) {
            return false;
        }
        if (i == -1) {
            return C30246a.m98970a(this.f68869a).mo79723b("page_discover");
        }
        return true;
    }

    public C26059b(FragmentActivity fragmentActivity, C26058a aVar) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(aVar, "scrollBasicChecker");
        this.f68869a = fragmentActivity;
        this.f68870b = aVar;
    }
}
