package com.p280ss.android.ugc.aweme.p313im.sdk.relations.select;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.IndexView;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.SearchHeadListView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.BaseSelectFragment$initViews$$inlined$apply$lambda$1 */
public final class BaseSelectFragment$initViews$$inlined$apply$lambda$1 extends FrescoRecycleViewScrollListener {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f83174a;

    /* renamed from: b */
    final /* synthetic */ BaseSelectFragment f83175b;

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int j = ((LinearLayoutManager) layoutManager).mo5445j();
            if (j >= this.f83175b.mo82597s().mo80347j()) {
                ((IndexView) this.f83175b.mo81750a((int) R.id.b0o)).setRecycleViewPos(j - this.f83175b.mo82597s().mo80347j());
            } else {
                ((IndexView) this.f83175b.mo81750a((int) R.id.b0o)).setCurrentIndex(-1);
            }
            ((SearchHeadListView) this.f83175b.mo81750a((int) R.id.d0z)).mo82385b();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    BaseSelectFragment$initViews$$inlined$apply$lambda$1(RecyclerView recyclerView, Context context, BaseSelectFragment baseSelectFragment) {
        this.f83174a = recyclerView;
        this.f83175b = baseSelectFragment;
        super(context);
    }
}
