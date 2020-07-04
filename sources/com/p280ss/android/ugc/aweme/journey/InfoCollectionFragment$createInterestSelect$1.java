package com.p280ss.android.ugc.aweme.journey;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.IntRef;

/* renamed from: com.ss.android.ugc.aweme.journey.InfoCollectionFragment$createInterestSelect$1 */
public final class InfoCollectionFragment$createInterestSelect$1 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ InfoCollectionFragment f84125a;

    /* renamed from: b */
    final /* synthetic */ IntRef f84126b;

    /* renamed from: c */
    final /* synthetic */ IntRef f84127c;

    InfoCollectionFragment$createInterestSelect$1(InfoCollectionFragment infoCollectionFragment, IntRef intRef, IntRef intRef2) {
        this.f84125a = infoCollectionFragment;
        this.f84126b = intRef;
        this.f84127c = intRef2;
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int i3;
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        this.f84126b.element += i2;
        if (i2 != 0 && this.f84125a.isViewValid()) {
            if (this.f84127c.element != -1) {
                i3 = this.f84127c.element;
            } else {
                this.f84127c.element = this.f84125a.mo83337a().computeVerticalScrollRange();
                i3 = this.f84127c.element;
            }
            int height = this.f84125a.mo83337a().getHeight();
            int i4 = this.f84126b.element;
            int i5 = i3 - height;
            View a = this.f84125a.mo83338a((int) R.id.cze);
            C7573i.m23582a((Object) a, "scroll_bar");
            float height2 = (((((float) i4) * 1.0f) / ((float) i5)) * ((float) (height - a.getHeight()))) + ((float) this.f84125a.mo83337a().getTop());
            View a2 = this.f84125a.mo83338a((int) R.id.cze);
            C7573i.m23582a((Object) a2, "scroll_bar");
            a2.setY(height2);
        }
    }
}
