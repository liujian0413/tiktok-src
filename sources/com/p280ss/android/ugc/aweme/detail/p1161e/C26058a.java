package com.p280ss.android.ugc.aweme.detail.p1161e;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager.C23434a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.detail.e.a */
public final class C26058a implements C23434a {

    /* renamed from: a */
    private final FragmentActivity f68868a;

    public C26058a(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f68868a = fragmentActivity;
    }

    /* renamed from: a */
    private static boolean m85591a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo61031a(int i) {
        if (i != -1 || !C30246a.m98970a(this.f68868a).mo79723b("page_feed") || !m85591a(AwemeChangeCallBack.m106763a(this.f68868a))) {
            return true;
        }
        return false;
    }
}
