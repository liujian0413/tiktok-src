package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import kotlin.Triple;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.n */
final /* synthetic */ class C26203n implements C0053p {

    /* renamed from: a */
    private final DetailPageFragment f69095a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f69096b;

    /* renamed from: c */
    private final int f69097c;

    C26203n(DetailPageFragment detailPageFragment, ScrollSwitchStateManager scrollSwitchStateManager, int i) {
        this.f69095a = detailPageFragment;
        this.f69096b = scrollSwitchStateManager;
        this.f69097c = i;
    }

    public final void onChanged(Object obj) {
        this.f69095a.mo67734a(this.f69096b, this.f69097c, (Triple) obj);
    }
}
