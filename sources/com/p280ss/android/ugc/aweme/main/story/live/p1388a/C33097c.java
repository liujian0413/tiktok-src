package com.p280ss.android.ugc.aweme.main.story.live.p1388a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.AvatarImageView;
import com.p280ss.android.ugc.aweme.feed.p1238ui.LiveCircleView;
import com.p280ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.a.c */
public class C33097c implements C33093a {

    /* renamed from: a */
    protected LiveCircleView f86104a;

    /* renamed from: b */
    public AvatarImageView f86105b;

    /* renamed from: c */
    public boolean f86106c;

    /* renamed from: d */
    public int f86107d;

    /* renamed from: e */
    public int f86108e;

    /* renamed from: f */
    public ValueAnimator f86109f;

    /* renamed from: g */
    public List<UrlModel> f86110g = new ArrayList();

    /* renamed from: h */
    private ValueAnimator f86111h;

    /* renamed from: b */
    public void mo64474b() {
        if (this.f86111h != null) {
            this.f86111h.cancel();
            this.f86111h = null;
            this.f86106c = false;
        }
    }

    /* renamed from: c */
    public void mo64476c() {
        if (this.f86111h != null) {
            this.f86111h.cancel();
        }
    }

    /* renamed from: a */
    public void mo64470a() {
        if (this.f86105b != null && this.f86104a != null && !this.f86106c) {
            if (this.f86111h != null) {
                this.f86111h.start();
                return;
            }
            this.f86107d = 1;
            this.f86111h = ValueAnimator.ofInt(new int[]{0, 800});
            this.f86109f = ValueAnimator.ofInt(new int[]{0, 800});
            this.f86109f.setRepeatCount(-1);
            this.f86109f.setRepeatMode(1);
            this.f86109f.setDuration(800);
            this.f86111h.setRepeatCount(-1);
            this.f86111h.setRepeatMode(1);
            this.f86111h.setDuration(800);
            this.f86111h.start();
            this.f86109f.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    if (intValue >= 0 && intValue <= 640) {
                        C33097c.this.f86104a.setFraction((((float) intValue) * 1.0f) / 640.0f);
                    }
                }
            });
            this.f86111h.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float f;
                    float f2;
                    int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    if (C33097c.this.f86107d % 5 == 0) {
                        f = 1.0f;
                    } else {
                        f = 0.08f;
                    }
                    if (C33097c.this.f86107d % 5 == 0 && animatedFraction > 0.48f && animatedFraction < 0.52f && C33097c.this.f86110g.size() != 0) {
                        C23323e.m76524b(C33097c.this.f86105b, (UrlModel) C33097c.this.f86110g.get(C33097c.this.f86108e));
                        C33097c.this.f86108e = (C33097c.this.f86108e + 1) % C33097c.this.f86110g.size();
                    }
                    if (animatedFraction <= 0.5f) {
                        f2 = 1.0f - (f * (animatedFraction / 0.5f));
                    } else {
                        f2 = (1.0f - f) + (f * ((animatedFraction - 0.5f) / 0.5f));
                    }
                    C33097c.this.f86105b.setScaleX(f2);
                    C33097c.this.f86105b.setScaleY(f2);
                    if (intValue >= 730 && intValue < 740 && !C33097c.this.f86106c) {
                        C33097c.this.f86106c = true;
                        C33097c.this.f86109f.start();
                    }
                }
            });
            this.f86111h.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationCancel(Animator animator) {
                    C33097c.this.f86109f.cancel();
                    C33097c.this.f86106c = false;
                }

                public final void onAnimationRepeat(Animator animator) {
                    C33097c.this.f86107d = (C33097c.this.f86107d + 1) % 5;
                }
            });
        }
    }

    /* renamed from: a */
    public void mo64472a(AbsLiveStoryItemView absLiveStoryItemView) {
        View rootView = absLiveStoryItemView.getRootView();
        this.f86105b = (AvatarImageView) rootView.findViewById(R.id.b3s);
        this.f86104a = (LiveCircleView) rootView.findViewById(R.id.b3w);
    }

    /* renamed from: a */
    public final void mo84814a(List<UrlModel> list) {
        if (list != null && list.size() != 0) {
            this.f86110g.addAll(list);
            C23323e.m76524b(this.f86105b, (UrlModel) this.f86110g.get(0));
        }
    }
}
