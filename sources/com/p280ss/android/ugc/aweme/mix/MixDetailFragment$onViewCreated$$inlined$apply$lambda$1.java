package com.p280ss.android.ugc.aweme.mix;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import com.p280ss.android.ugc.aweme.detail.DetailViewModel;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28506u;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.mix.MixDetailFragment$onViewCreated$$inlined$apply$lambda$1 */
public final class MixDetailFragment$onViewCreated$$inlined$apply$lambda$1 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ MixDetailFragment f87518a;

    MixDetailFragment$onViewCreated$$inlined$apply$lambda$1(MixDetailFragment mixDetailFragment) {
        this.f87518a = mixDetailFragment;
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 1) {
            this.f87518a.mo85835v();
            return;
        }
        if (i == 0) {
            C28506u.m93702a(this.f87518a.f87456h, "compilation_detail", this.f87518a.f87466r);
        }
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        String str;
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        DetailViewModel detailViewModel = this.f87518a.f87468t;
        if (detailViewModel != null) {
            detailViewModel.mo67567a();
        }
        this.f87518a.f87465q += i2;
        this.f87518a.mo85834u();
        MixDetailFragment mixDetailFragment = this.f87518a;
        if (i2 > 0) {
            str = "up";
        } else {
            str = "down";
        }
        mixDetailFragment.f87466r = str;
    }
}
