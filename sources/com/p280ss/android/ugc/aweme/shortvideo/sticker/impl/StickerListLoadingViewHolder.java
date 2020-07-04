package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.animation.ObjectAnimator;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerListLoadingViewHolder */
public class StickerListLoadingViewHolder extends C1293v {

    /* renamed from: a */
    private ImageView f105602a;

    /* renamed from: b */
    private ObjectAnimator f105603b;

    /* renamed from: a */
    public final void mo100737a() {
        m129909b();
    }

    /* renamed from: b */
    private void m129909b() {
        this.f105603b = ObjectAnimator.ofFloat(this.f105602a, "rotation", new float[]{0.0f, 360.0f});
        this.f105603b.setDuration(800);
        this.f105603b.setRepeatMode(1);
        this.f105603b.setRepeatCount(-1);
        this.f105603b.start();
    }

    public StickerListLoadingViewHolder(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.cwi);
        LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C9738o.m28691a(view.getContext());
            findViewById.setLayoutParams(layoutParams);
        }
        this.f105602a = (ImageView) view.findViewById(R.id.btc);
    }
}
