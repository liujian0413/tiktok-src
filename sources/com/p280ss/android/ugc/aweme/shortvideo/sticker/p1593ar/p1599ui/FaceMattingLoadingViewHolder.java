package com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.p1599ui;

import android.animation.ObjectAnimator;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.widget.ImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.ar.ui.FaceMattingLoadingViewHolder */
public class FaceMattingLoadingViewHolder extends C1293v {

    /* renamed from: a */
    private ObjectAnimator f105187a;

    /* renamed from: b */
    private ImageView f105188b;

    /* renamed from: a */
    public final void mo100509a() {
        m129387b();
    }

    /* renamed from: b */
    private void m129387b() {
        this.f105187a = ObjectAnimator.ofFloat(this.f105188b, "rotation", new float[]{0.0f, 360.0f});
        this.f105187a.setDuration(800);
        this.f105187a.setRepeatMode(1);
        this.f105187a.setRepeatCount(-1);
        this.f105187a.start();
    }

    public FaceMattingLoadingViewHolder(View view) {
        super(view);
        this.f105188b = (ImageView) view.findViewById(R.id.b_w);
    }
}
