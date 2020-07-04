package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.widget.FrameLayout;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.CarVideoViewHolder_ViewBinding */
public final class CarVideoViewHolder_ViewBinding extends VideoViewHolder_ViewBinding {

    /* renamed from: a */
    private CarVideoViewHolder f73932a;

    public final void unbind() {
        CarVideoViewHolder carVideoViewHolder = this.f73932a;
        if (carVideoViewHolder != null) {
            this.f73932a = null;
            carVideoViewHolder.mTag = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public CarVideoViewHolder_ViewBinding(CarVideoViewHolder carVideoViewHolder, View view) {
        super(carVideoViewHolder, view);
        this.f73932a = carVideoViewHolder;
        carVideoViewHolder.mTag = (FrameLayout) Utils.findRequiredViewAsType(view, R.id.ebb, "field 'mTag'", FrameLayout.class);
    }
}
