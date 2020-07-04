package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.animation.ObjectAnimator;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.StickerListLoadingViewHolder */
public class StickerListLoadingViewHolder extends C1293v {

    /* renamed from: a */
    private ImageView f104829a;

    /* renamed from: b */
    private ObjectAnimator f104830b;

    /* renamed from: a */
    public final void mo100265a() {
        m128942b();
    }

    /* renamed from: b */
    private void m128942b() {
        this.f104830b = ObjectAnimator.ofFloat(this.f104829a, "rotation", new float[]{0.0f, 360.0f});
        this.f104830b.setDuration(800);
        this.f104830b.setRepeatMode(1);
        this.f104830b.setRepeatCount(-1);
        this.f104830b.start();
    }

    public StickerListLoadingViewHolder(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.cwi);
        LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C9738o.m28691a(view.getContext());
            findViewById.setLayoutParams(layoutParams);
        }
        this.f104829a = (ImageView) view.findViewById(R.id.btc);
    }
}
