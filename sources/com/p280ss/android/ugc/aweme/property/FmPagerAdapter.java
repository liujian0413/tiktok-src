package com.p280ss.android.ugc.aweme.property;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.app.FragmentPagerAdapter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.property.FmPagerAdapter */
public final class FmPagerAdapter extends FragmentPagerAdapter {

    /* renamed from: a */
    private final FragmentActivity f96808a;

    public final int getCount() {
        return 2;
    }

    /* renamed from: a */
    public final Fragment mo2423a(int i) {
        if (i == 0) {
            ItemPage itemPage = new ItemPage();
            C0063u a = C0069x.m159a(this.f96808a).mo147a(ABAndSettingViewModel.class);
            C7573i.m23582a((Object) a, "ViewModelProviders.of(ou…ingViewModel::class.java)");
            itemPage.mo93350a((C36979n) new C36983r(new C36959e((ABAndSettingViewModel) a)));
            return itemPage;
        }
        ItemPage itemPage2 = new ItemPage();
        C0063u a2 = C0069x.m159a(this.f96808a).mo147a(ABAndSettingViewModel.class);
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(ou…ingViewModel::class.java)");
        itemPage2.mo93350a((C36979n) new C36983r(new C36991v((ABAndSettingViewModel) a2)));
        return itemPage2;
    }

    public FmPagerAdapter(C0608j jVar, FragmentActivity fragmentActivity) {
        C7573i.m23587b(jVar, "fm");
        C7573i.m23587b(fragmentActivity, "outActivity");
        super(jVar);
        this.f96808a = fragmentActivity;
    }
}
