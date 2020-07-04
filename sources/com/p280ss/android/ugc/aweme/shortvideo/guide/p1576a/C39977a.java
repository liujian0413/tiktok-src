package com.p280ss.android.ugc.aweme.shortvideo.guide.p1576a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23477d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.shortvideo.guide.C39990e;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.guide.a.a */
public final class C39977a implements C39990e {

    /* renamed from: a */
    public View f103866a;

    /* renamed from: b */
    private TextView f103867b;

    /* renamed from: c */
    private RemoteImageView f103868c;

    /* renamed from: d */
    private View f103869d;

    /* renamed from: e */
    private FrameLayout f103870e;

    /* renamed from: f */
    private FaceStickerBean f103871f;

    /* renamed from: g */
    private Runnable f103872g = new Runnable() {
        public final void run() {
            Animation a = C39977a.m127862a(1.0f, 0.0f, 300);
            a.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C39977a.this.mo98266a(true);
                }
            });
            C39977a.this.f103866a.startAnimation(a);
        }
    };

    public C39977a(FaceStickerBean faceStickerBean) {
        this.f103871f = faceStickerBean;
    }

    /* renamed from: a */
    public final void mo98266a(boolean z) {
        if (this.f103871f != null) {
            this.f103866a.removeCallbacks(this.f103872g);
            this.f103870e.removeView(this.f103869d);
        }
    }

    /* renamed from: a */
    public final void mo98265a(FrameLayout frameLayout) {
        boolean z;
        this.f103870e = frameLayout;
        if (this.f103871f != null) {
            int i = 0;
            this.f103869d = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.aav, frameLayout, false);
            this.f103870e.addView(this.f103869d);
            this.f103866a = this.f103869d.findViewById(R.id.als);
            this.f103867b = (TextView) this.f103869d.findViewById(R.id.db6);
            if (this.f103871f.getHint() != null) {
                this.f103867b.setText(this.f103871f.getHint());
            }
            this.f103868c = (RemoteImageView) this.f103869d.findViewById(R.id.db7);
            if (this.f103871f.getHintIcon() == null || C23477d.m77081a((Collection<T>) this.f103871f.getHintIcon().getUrlList())) {
                z = false;
            } else {
                z = true;
            }
            RemoteImageView remoteImageView = this.f103868c;
            if (!z) {
                i = 8;
            }
            C23487o.m77140a((View) remoteImageView, i);
            if (z) {
                C23323e.m76524b(this.f103868c, this.f103871f.getHintIcon());
            }
            this.f103866a.startAnimation(m127862a(0.0f, 1.0f, 300));
            this.f103866a.postDelayed(this.f103872g, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    /* renamed from: a */
    public static Animation m127862a(float f, float f2, long j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setDuration(j);
        return alphaAnimation;
    }
}
