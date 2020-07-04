package com.p280ss.android.ugc.aweme.detail.p1167ui;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.main.C32990dl;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.p */
final /* synthetic */ class C26205p implements C0053p {

    /* renamed from: a */
    private final DetailPageFragment f69099a;

    /* renamed from: b */
    private final ScrollSwitchStateManager f69100b;

    /* renamed from: c */
    private final C32990dl f69101c;

    /* renamed from: d */
    private final HomePageDataViewModel f69102d;

    C26205p(DetailPageFragment detailPageFragment, ScrollSwitchStateManager scrollSwitchStateManager, C32990dl dlVar, HomePageDataViewModel homePageDataViewModel) {
        this.f69099a = detailPageFragment;
        this.f69100b = scrollSwitchStateManager;
        this.f69101c = dlVar;
        this.f69102d = homePageDataViewModel;
    }

    public final void onChanged(Object obj) {
        this.f69099a.mo67735a(this.f69100b, this.f69101c, this.f69102d, (Integer) obj);
    }
}
