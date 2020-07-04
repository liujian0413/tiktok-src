package com.p280ss.android.ugc.aweme.main;

import android.arch.lifecycle.C0053p;
import com.p280ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;

/* renamed from: com.ss.android.ugc.aweme.main.bq */
final /* synthetic */ class C32912bq implements C0053p {

    /* renamed from: a */
    private final MainPageFragment f85850a;

    /* renamed from: b */
    private final HomePageDataViewModel f85851b;

    C32912bq(MainPageFragment mainPageFragment, HomePageDataViewModel homePageDataViewModel) {
        this.f85850a = mainPageFragment;
        this.f85851b = homePageDataViewModel;
    }

    public final void onChanged(Object obj) {
        this.f85850a.mo84496a(this.f85851b, (Integer) obj);
    }
}
