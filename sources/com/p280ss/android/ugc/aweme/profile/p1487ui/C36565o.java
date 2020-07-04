package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.o */
final /* synthetic */ class C36565o implements C0053p {

    /* renamed from: a */
    private final BaseDTProfileFragment f95958a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f95959b;

    C36565o(BaseDTProfileFragment baseDTProfileFragment, ScrollSwitchStateManager scrollSwitchStateManager) {
        this.f95958a = baseDTProfileFragment;
        this.f95959b = scrollSwitchStateManager;
    }

    public final void onChanged(Object obj) {
        this.f95958a.mo91922a(this.f95959b, (Integer) obj);
    }
}
