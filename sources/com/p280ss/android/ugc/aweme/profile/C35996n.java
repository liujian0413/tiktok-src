package com.p280ss.android.ugc.aweme.profile;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* renamed from: com.ss.android.ugc.aweme.profile.n */
final /* synthetic */ class C35996n implements C0053p {

    /* renamed from: a */
    private final ProfilePageFragment f94177a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f94178b;

    C35996n(ProfilePageFragment profilePageFragment, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f94177a = profilePageFragment;
        this.f94178b = scrollSwitchStateManager;
    }

    public final void onChanged(Object obj) {
        this.f94177a.mo90466a(this.f94178b, (Integer) obj);
    }
}
