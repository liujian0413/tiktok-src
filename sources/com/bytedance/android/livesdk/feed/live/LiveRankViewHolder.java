package com.bytedance.android.livesdk.feed.live;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ViewFlipper;
import com.bytedance.android.live.base.model.banner.C2339c;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.live.C2353d;
import com.bytedance.android.live.core.viewholder.BaseViewHolder;
import com.bytedance.android.livesdk.feed.banner.C5954a;
import com.bytedance.android.livesdk.feed.feed.C5991h;
import com.bytedance.common.utility.C6311g;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class LiveRankViewHolder extends BaseViewHolder<FeedItem> {

    /* renamed from: b */
    ViewFlipper f17929b;

    /* renamed from: c */
    private boolean f17930c = false;

    public LiveRankViewHolder(View view, boolean z) {
        super(view);
        this.f17929b = (ViewFlipper) view.findViewById(R.id.av4);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo10072a(FeedItem feedItem, int i) {
        int i2;
        C5954a aVar;
        C2339c cVar = ((C5991h) feedItem.item).f17764a;
        if (cVar == null || C6311g.m19573a(cVar.f7683b)) {
            this.f17929b.stopFlipping();
            this.f17929b.setVisibility(8);
            return;
        }
        int i3 = 0;
        while (i3 < cVar.f7683b.size()) {
            if (i3 >= this.f17929b.getChildCount()) {
                View inflate = LayoutInflater.from(this.itemView.getContext()).inflate(R.layout.arg, this.f17929b, false);
                this.f17929b.addView(inflate);
                aVar = new C5954a(inflate, this.f17930c);
                inflate.setTag(R.id.dpb, aVar);
            } else {
                aVar = (C5954a) this.f17929b.getChildAt(i3).getTag(R.id.dpb);
            }
            aVar.mo14600a((C2353d) cVar.f7683b.get(i3));
            i3++;
        }
        for (int childCount = this.f17929b.getChildCount() - 1; childCount >= i3; childCount--) {
            this.f17929b.removeViewAt(childCount);
        }
        this.f17929b.setVisibility(0);
        if (this.f17929b.getChildCount() <= 1) {
            this.f17929b.stopFlipping();
            return;
        }
        ViewFlipper viewFlipper = this.f17929b;
        if (cVar.f7682a <= 0) {
            i2 = 5000;
        } else {
            i2 = cVar.f7682a * 1000;
        }
        viewFlipper.setFlipInterval(i2);
        this.f17929b.startFlipping();
    }
}
