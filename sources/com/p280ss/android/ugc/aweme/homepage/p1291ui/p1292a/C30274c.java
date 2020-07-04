package com.p280ss.android.ugc.aweme.homepage.p1291ui.p1292a;

import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.antiaddic.lock.C22594b;
import com.p280ss.android.ugc.aweme.base.p308ui.ScrollableViewPager.C23434a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28478a;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.C30241a;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.main.C32904bi;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.a.c */
public final class C30274c implements C23434a {

    /* renamed from: a */
    private final FragmentActivity f79636a;

    public C30274c(FragmentActivity fragmentActivity) {
        C7573i.m23587b(fragmentActivity, "activity");
        this.f79636a = fragmentActivity;
    }

    /* renamed from: a */
    private static boolean m99020a(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m99021b(int i) {
        if (TextUtils.equals("HOME", C30246a.m98970a(this.f79636a).f79583b) && i == -1) {
            C22594b c = C6903bc.m21484c();
            C7573i.m23582a((Object) c, "LegacyServiceUtils.getTimeLockRulerService()");
            if (c.mo59240a() || C32904bi.m106499d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private final boolean m99022b(Aweme aweme) {
        if (!C30246a.m98970a(this.f79636a).mo79723b("page_feed") || !C28478a.m93588c(aweme) || C6903bc.m21478S().mo57884b() != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo61031a(int i) {
        if (i == -1 && C30246a.m98970a(this.f79636a).mo79723b("page_feed") && m99020a(C30241a.m98909a(this.f79636a).f79570i)) {
            return false;
        }
        if ((i != -1 || !C30246a.m98970a(this.f79636a).mo79723b("page_feed") || !m99022b(C30241a.m98909a(this.f79636a).f79570i)) && !m99021b(i)) {
            return true;
        }
        return false;
    }
}
