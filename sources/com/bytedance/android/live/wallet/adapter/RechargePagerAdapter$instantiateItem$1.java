package com.bytedance.android.live.wallet.adapter;

import android.support.p029v7.widget.GridLayoutManager.C1241a;

public final class RechargePagerAdapter$instantiateItem$1 extends C1241a {

    /* renamed from: c */
    final /* synthetic */ ReChargeListAdapter f10852c;

    RechargePagerAdapter$instantiateItem$1(ReChargeListAdapter reChargeListAdapter) {
        this.f10852c = reChargeListAdapter;
    }

    /* renamed from: a */
    public final int mo5386a(int i) {
        if (this.f10852c.getItemViewType(i) == 1) {
            return 3;
        }
        return 1;
    }
}
