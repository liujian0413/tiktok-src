package com.p280ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/* renamed from: com.ss.android.ugc.aweme.common.widget.DiggLayout */
public class DiggLayout extends FrameLayout {

    /* renamed from: f */
    private static Drawable f67685f;

    /* renamed from: a */
    Queue<ImageView> f67686a;

    /* renamed from: b */
    int f67687b;

    /* renamed from: c */
    int f67688c;

    /* renamed from: d */
    Random f67689d;

    /* renamed from: e */
    private Context f67690e;

    public DiggLayout(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    private void m84489a(Context context) {
        this.f67690e = context;
        this.f67689d = new Random();
        this.f67688c = (int) C9738o.m28708b(context, 72.0f);
        this.f67687b = (int) C9738o.m28708b(context, 79.0f);
    }

    /* renamed from: a */
    private void m84490a(ImageView imageView) {
        final ImageView imageView2 = imageView;
        float nextInt = (float) (this.f67689d.nextInt(40) - 20);
        imageView2.setRotation(nextInt);
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.6f, 1.0f, 1.6f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setFillBefore(true);
        scaleAnimation.setDuration(300);
        AnimationSet animationSet2 = new AnimationSet(true);
        animationSet2.setDuration(500);
        animationSet2.setStartOffset(500);
        animationSet2.setFillAfter(true);
        animationSet2.setInterpolator(new DecelerateInterpolator());
        float nextInt2 = (((float) this.f67689d.nextInt(10)) + 20.0f) / 10.0f;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.6f, nextInt2, 1.6f, nextInt2, 1, 0.5f, 1, 1.0f);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        int b = (int) C9738o.m28708b(this.f67690e, 50.0f);
        float f = (float) (-(this.f67689d.nextInt(b) + b));
        double d = (double) f;
        double d2 = (double) nextInt;
        Double.isNaN(d2);
        double tan = Math.tan((d2 * 3.141592653589793d) / 360.0d);
        Double.isNaN(d);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) (d * tan), 0.0f, f);
        animationSet2.addAnimation(scaleAnimation2);
        animationSet2.addAnimation(alphaAnimation);
        animationSet2.addAnimation(translateAnimation);
        animationSet.addAnimation(scaleAnimation);
        animationSet.addAnimation(animationSet2);
        imageView2.startAnimation(animationSet);
        animationSet.setAnimationListener(new AnimationListener() {
            public final void onAnimationRepeat(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
            }

            public final void onAnimationEnd(Animation animation) {
                DiggLayout.this.post(new Runnable() {
                    public final void run() {
                        if (DiggLayout.this.f67686a.size() < 3) {
                            DiggLayout.this.f67686a.add(imageView2);
                        }
                        imageView2.setImageDrawable(null);
                        imageView2.clearAnimation();
                        DiggLayout.this.removeView(imageView2);
                    }
                });
            }
        });
    }

    public DiggLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo66634a(float f, float f2) {
        ImageView imageView;
        if (this.f67686a.isEmpty()) {
            imageView = new ImageView(this.f67690e);
            if (f67685f == null) {
                if (C29132a.m95560a()) {
                    Drawable e = C29125d.m95526e();
                    f67685f = e;
                    if (e == null) {
                        f67685f = C0683b.m2903a(this.f67690e, (int) R.drawable.a8g);
                    }
                } else {
                    f67685f = C0683b.m2903a(this.f67690e, (int) R.drawable.a8g);
                }
            }
        } else {
            imageView = (ImageView) this.f67686a.poll();
        }
        imageView.setImageDrawable(f67685f);
        LayoutParams layoutParams = new LayoutParams(this.f67688c, this.f67687b);
        layoutParams.setMargins((int) (f - ((float) (this.f67688c / 2))), (int) (f2 - ((float) this.f67687b)), 0, 0);
        imageView.setLayoutParams(layoutParams);
        if (imageView.getParent() == null) {
            addView(imageView);
        }
        m84490a(imageView);
    }

    public DiggLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f67686a = new LinkedList();
        this.f67687b = -1;
        this.f67688c = -1;
        m84489a(context);
    }
}
