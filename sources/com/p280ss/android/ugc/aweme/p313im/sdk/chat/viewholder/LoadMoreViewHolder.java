package com.p280ss.android.ugc.aweme.p313im.sdk.chat.viewholder;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31887b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.viewholder.LoadMoreViewHolder */
public class LoadMoreViewHolder extends BaseViewHolder {

    /* renamed from: m */
    private ImageView f81246m;

    /* renamed from: n */
    private Animation f81247n;

    /* renamed from: o */
    private AnimationListener f81248o = new AnimationListener() {
        public final void onAnimationEnd(Animation animation) {
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo81420a() {
        super.mo81420a();
        this.f81246m = (ImageView) mo81425a((int) R.id.cr6);
    }

    /* renamed from: f */
    public final void mo81444f() {
        if (this.f81247n == null) {
            this.f81247n = C31887b.m103596a(800, this.f81248o);
        }
        this.f81246m.startAnimation(this.f81247n);
    }

    /* renamed from: g */
    public final void mo81445g() {
        Animation animation = this.f81246m.getAnimation();
        if (animation != null) {
            animation.cancel();
        }
        this.f81246m.clearAnimation();
    }

    public LoadMoreViewHolder(View view, int i) {
        super(view, i);
    }
}
