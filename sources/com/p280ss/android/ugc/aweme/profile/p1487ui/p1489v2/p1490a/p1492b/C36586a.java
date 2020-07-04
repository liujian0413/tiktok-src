package com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.p1490a.p1492b;

import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C30246a;
import com.p280ss.android.ugc.aweme.profile.p1487ui.p1489v2.MyProfileV2Fragment;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.a.b.a */
public final class C36586a extends C36587b {

    /* renamed from: b */
    private ScrollSwitchStateManager f95995b;

    /* renamed from: a */
    public final int mo92798a() {
        return R.layout.pe;
    }

    /* renamed from: c */
    public final void mo92809c() {
        C6907h.onEvent(MobClick.obtain().setEventName("click_more_setting").setLabelName("personal_homepage"));
        ScrollSwitchStateManager scrollSwitchStateManager = this.f95995b;
        if (scrollSwitchStateManager != null) {
            scrollSwitchStateManager.mo79736f("page_setting");
        }
    }

    public C36586a(MyProfileV2Fragment myProfileV2Fragment) {
        C7573i.m23587b(myProfileV2Fragment, "owner");
        super(myProfileV2Fragment);
    }

    /* renamed from: a */
    public final void mo92800a(FragmentActivity fragmentActivity) {
        super.mo92800a(fragmentActivity);
        if (fragmentActivity != null) {
            this.f95995b = C30246a.m98970a(fragmentActivity);
        }
    }
}
