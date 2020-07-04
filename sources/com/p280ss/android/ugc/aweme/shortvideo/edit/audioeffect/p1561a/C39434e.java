package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect.p1561a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.shortvideo.guide.C39990e;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e */
public final class C39434e implements C39990e {

    /* renamed from: b */
    public static final C39435a f102386b = new C39435a(null);

    /* renamed from: a */
    public View f102387a;

    /* renamed from: c */
    private TextView f102388c;

    /* renamed from: d */
    private RemoteImageView f102389d;

    /* renamed from: e */
    private View f102390e;

    /* renamed from: f */
    private FrameLayout f102391f;

    /* renamed from: g */
    private final Runnable f102392g = new C39436b(this);

    /* renamed from: h */
    private final Effect f102393h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e$a */
    public static final class C39435a {
        private C39435a() {
        }

        public /* synthetic */ C39435a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static Animation m125960a(float f, float f2, long j) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(f, f2);
            alphaAnimation.setDuration(300);
            return alphaAnimation;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.a.e$b */
    static final class C39436b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C39434e f102394a;

        C39436b(C39434e eVar) {
            this.f102394a = eVar;
        }

        public final void run() {
            Animation a = C39435a.m125960a(1.0f, 0.0f, 300);
            a.setAnimationListener(new AnimationListener(this) {

                /* renamed from: a */
                final /* synthetic */ C39436b f102395a;

                public final void onAnimationRepeat(Animation animation) {
                    C7573i.m23587b(animation, "animation");
                }

                public final void onAnimationStart(Animation animation) {
                    C7573i.m23587b(animation, "animation");
                }

                {
                    this.f102395a = r1;
                }

                public final void onAnimationEnd(Animation animation) {
                    C7573i.m23587b(animation, "animation");
                    this.f102395a.f102394a.mo98266a(true);
                }
            });
            View view = this.f102394a.f102387a;
            if (view != null) {
                view.startAnimation(a);
            }
        }
    }

    public C39434e(Effect effect) {
        C7573i.m23587b(effect, "mEffect");
        this.f102393h = effect;
    }

    /* renamed from: a */
    public final void mo98266a(boolean z) {
        View view = this.f102387a;
        if (view != null) {
            view.removeCallbacks(this.f102392g);
        }
        FrameLayout frameLayout = this.f102391f;
        if (frameLayout != null) {
            frameLayout.removeView(this.f102390e);
        }
    }

    /* renamed from: a */
    public final void mo98265a(FrameLayout frameLayout) {
        View view;
        TextView textView;
        if (frameLayout != null) {
            this.f102391f = frameLayout;
            this.f102390e = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.aav, frameLayout, false);
            FrameLayout frameLayout2 = this.f102391f;
            if (frameLayout2 != null) {
                frameLayout2.addView(this.f102390e);
            }
            View view2 = this.f102390e;
            RemoteImageView remoteImageView = null;
            if (view2 != null) {
                view = view2.findViewById(R.id.als);
            } else {
                view = null;
            }
            this.f102387a = view;
            View view3 = this.f102390e;
            if (view3 != null) {
                textView = (TextView) view3.findViewById(R.id.db6);
            } else {
                textView = null;
            }
            this.f102388c = textView;
            TextView textView2 = this.f102388c;
            if (textView2 != null) {
                String hint = this.f102393h.getHint();
                if (hint == null) {
                    hint = "";
                }
                textView2.setText(hint);
            }
            View view4 = this.f102390e;
            if (view4 != null) {
                remoteImageView = (RemoteImageView) view4.findViewById(R.id.db7);
            }
            this.f102389d = remoteImageView;
            C23487o.m77140a((View) this.f102389d, 8);
            View view5 = this.f102387a;
            if (view5 != null) {
                view5.startAnimation(C39435a.m125960a(0.0f, 1.0f, 300));
            }
            View view6 = this.f102387a;
            if (view6 != null) {
                view6.postDelayed(this.f102392g, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
            }
        }
    }
}
