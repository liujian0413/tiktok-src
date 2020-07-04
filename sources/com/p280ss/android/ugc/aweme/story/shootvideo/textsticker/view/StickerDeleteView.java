package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.gamora.editor.C44295cr;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.view.StickerDeleteView */
public class StickerDeleteView extends FrameLayout implements C44295cr {

    /* renamed from: b */
    private ImageView f109296b;

    /* renamed from: c */
    private View f109297c;

    /* renamed from: d */
    private View f109298d;

    /* renamed from: e */
    private View f109299e;

    /* renamed from: f */
    private boolean f109300f;

    /* renamed from: g */
    private boolean f109301g;

    /* renamed from: h */
    private boolean f109302h;

    /* renamed from: i */
    private boolean f109303i;

    /* renamed from: j */
    private Vibrator f109304j;

    /* renamed from: k */
    private int f109305k;

    /* renamed from: e */
    private void m133795e() {
        this.f109300f = false;
        this.f109301g = false;
        this.f109303i = false;
        this.f109302h = false;
    }

    /* renamed from: g */
    private void m133797g() {
        if (this.f109299e.getVisibility() == 0) {
            m133791a(this.f109299e, false, true);
        }
    }

    /* renamed from: i */
    private void m133799i() {
        if (this.f109303i) {
            this.f109303i = false;
            m133791a(this.f109297c, false, true);
        }
    }

    /* renamed from: j */
    private void m133800j() {
        if (this.f109304j != null) {
            try {
                this.f109304j.vibrate(10);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo103322a() {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.topMargin = C23482j.m77101d();
        setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final void mo103323b() {
        m133797g();
        m133794d();
        this.f109300f = false;
    }

    /* renamed from: f */
    private void m133796f() {
        if (this.f109299e.getVisibility() == 8) {
            this.f109299e.setVisibility(0);
            m133791a(this.f109299e, true, false);
        }
    }

    /* renamed from: h */
    private void m133798h() {
        if (!this.f109303i) {
            this.f109303i = true;
            this.f109297c.setVisibility(0);
            m133791a(this.f109297c, true, false);
        }
    }

    /* renamed from: c */
    private void m133793c() {
        if (!this.f109302h) {
            this.f109298d.setVisibility(0);
            this.f109302h = true;
            m133791a(this.f109298d, true, false);
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, -20.0f, 10.0f, 30.0f);
            rotateAnimation.setDuration(300);
            rotateAnimation.setFillAfter(true);
            this.f109296b.startAnimation(rotateAnimation);
        }
    }

    /* renamed from: d */
    private void m133794d() {
        if (this.f109302h) {
            this.f109302h = false;
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 0.0f, 10.0f, 30.0f);
            rotateAnimation.setFillAfter(true);
            rotateAnimation.setDuration(300);
            this.f109296b.startAnimation(rotateAnimation);
            m133791a(this.f109298d, false, false);
        }
    }

    private StickerDeleteView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static StickerDeleteView m133790a(Context context) {
        if (context == null) {
            return null;
        }
        StickerDeleteView stickerDeleteView = new StickerDeleteView(context);
        int b = (int) C9738o.m28708b(context, 72.0f);
        LayoutParams layoutParams = new LayoutParams(b, b);
        layoutParams.topMargin = C23482j.m77101d();
        stickerDeleteView.setLayoutParams(layoutParams);
        layoutParams.gravity = 49;
        stickerDeleteView.setLayoutParams(layoutParams);
        return stickerDeleteView;
    }

    /* renamed from: b */
    private void m133792b(Context context) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.abb, null);
        this.f109296b = (ImageView) inflate.findViewById(R.id.dm8);
        this.f109297c = inflate.findViewById(R.id.a7_);
        this.f109299e = inflate.findViewById(R.id.c_e);
        this.f109298d = inflate.findViewById(R.id.m8);
        addView(inflate);
    }

    public StickerDeleteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m133792b(context);
        this.f109298d.setVisibility(8);
        this.f109299e.setVisibility(8);
        this.f109304j = (Vibrator) context.getSystemService("vibrator");
    }

    /* renamed from: a */
    private int m133789a(int i, int i2, boolean z) {
        Rect rect = new Rect(getLeft(), getTop(), getRight(), getBottom());
        if (z) {
            if (rect.contains(i, i2)) {
                m133797g();
                m133794d();
                return 2;
            }
            m133797g();
            m133794d();
        } else if (rect.contains(i, i2)) {
            m133799i();
            m133793c();
            this.f109300f = true;
            return 1;
        } else {
            m133794d();
            m133796f();
            m133798h();
            if (this.f109300f) {
                this.f109300f = false;
                return 3;
            }
        }
        this.f109300f = false;
        return -1;
    }

    /* renamed from: a */
    private void m133791a(final View view, boolean z, final boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        AnimatorSet animatorSet = new AnimatorSet();
        String str = "alpha";
        float[] fArr = new float[2];
        float f6 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        fArr[0] = f;
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, str, fArr);
        String str2 = "scaleX";
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = 1.0f;
        }
        fArr2[0] = f3;
        if (z) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, str2, fArr2);
        String str3 = "scaleY";
        float[] fArr3 = new float[2];
        if (z) {
            f5 = 0.0f;
        } else {
            f5 = 1.0f;
        }
        fArr3[0] = f5;
        if (!z) {
            f6 = 0.0f;
        }
        fArr3[1] = f6;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, str3, fArr3);
        animatorSet.setDuration(300);
        animatorSet.play(ofFloat).with(ofFloat2).with(ofFloat3);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                if (z2) {
                    view.setVisibility(8);
                }
                super.onAnimationEnd(animator);
            }
        });
        animatorSet.start();
    }

    /* renamed from: a */
    public final int mo103321a(int i, int i2, boolean z, boolean z2) {
        int i3;
        if (!z2) {
            i3 = m133789a(i, i2, z);
        } else if (z) {
            m133797g();
            m133794d();
            this.f109300f = false;
            m133795e();
            if (this.f109305k == 1) {
                i3 = 2;
            } else {
                i3 = -1;
            }
        } else {
            m133799i();
            m133793c();
            this.f109300f = true;
            i3 = 1;
        }
        this.f109305k = i3;
        if (i3 == 1) {
            if (!this.f109301g) {
                m133800j();
                this.f109301g = true;
                return 1;
            }
            this.f109301g = true;
            return 0;
        } else if (i3 == 2) {
            m133795e();
            this.f109301g = false;
            return 3;
        } else if (i3 == 3) {
            m133800j();
            return 2;
        } else {
            this.f109301g = false;
            return 4;
        }
    }
}
