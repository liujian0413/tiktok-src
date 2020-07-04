package com.p280ss.android.ugc.aweme.profile;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* renamed from: com.ss.android.ugc.aweme.profile.m */
final /* synthetic */ class C35994m implements C0053p {

    /* renamed from: a */
    private final ProfilePageFragment f94174a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f94175b;

    C35994m(ProfilePageFragment profilePageFragment, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f94174a = profilePageFragment;
        this.f94175b = scrollSwitchStateManager;
    }

    public final void onChanged(Object obj) {
        this.f94174a.mo90468b(this.f94175b, (Integer) obj);
    }
}
