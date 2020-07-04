package com.p280ss.android.ugc.aweme.filter;

import android.animation.ObjectAnimator;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.filter.ae */
final class C29200ae extends C1293v {

    /* renamed from: a */
    private ImageView f77100a;

    /* renamed from: b */
    private ObjectAnimator f77101b;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74797a() {
        m95833b();
    }

    /* renamed from: b */
    private void m95833b() {
        this.f77101b = ObjectAnimator.ofFloat(this.f77100a, "rotation", new float[]{0.0f, 360.0f});
        this.f77101b.setDuration(800);
        this.f77101b.setRepeatMode(1);
        this.f77101b.setRepeatCount(-1);
        this.f77101b.start();
    }

    C29200ae(View view) {
        super(view);
        View findViewById = view.findViewById(R.id.cwi);
        LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C9738o.m28691a(view.getContext());
            findViewById.setLayoutParams(layoutParams);
        }
        this.f77100a = (ImageView) view.findViewById(R.id.btc);
    }
}
