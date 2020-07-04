package com.p280ss.android.ugc.aweme.effect;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.FilterEffectTabFragment$onViewCreated$3 */
public final class FilterEffectTabFragment$onViewCreated$3 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ FilterEffectTabFragment f72149a;

    FilterEffectTabFragment$onViewCreated$3(FilterEffectTabFragment filterEffectTabFragment) {
        this.f72149a = filterEffectTabFragment;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        boolean z;
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        FilterEffectTabFragment filterEffectTabFragment = this.f72149a;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        filterEffectTabFragment.f72139k = z;
        this.f72149a.mo70400a(this.f72149a.f72139k);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.f72149a.mo70400a(this.f72149a.f72139k);
    }
}
