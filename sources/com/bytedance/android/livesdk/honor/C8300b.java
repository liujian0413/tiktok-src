package com.bytedance.android.livesdk.honor;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p022v4.view.animation.C0957c;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.message.model.C8498ax;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.honor.b */
public final class C8300b extends RelativeLayout {

    /* renamed from: s */
    private static final Interpolator f22787s = C0957c.m4073a(0.42f, 0.0f, 0.58f, 1.0f);

    /* renamed from: a */
    public View f22788a;

    /* renamed from: b */
    public C8298a f22789b;

    /* renamed from: c */
    public C8498ax f22790c;

    /* renamed from: d */
    public int f22791d;

    /* renamed from: e */
    public int f22792e;

    /* renamed from: f */
    private View f22793f;

    /* renamed from: g */
    private VHeadView f22794g;

    /* renamed from: h */
    private TextView f22795h;

    /* renamed from: i */
    private View f22796i;

    /* renamed from: j */
    private View f22797j;

    /* renamed from: k */
    private TextView f22798k;

    /* renamed from: l */
    private float f22799l;

    /* renamed from: m */
    private int f22800m;

    /* renamed from: n */
    private ValueAnimator f22801n;

    /* renamed from: o */
    private ValueAnimator f22802o;

    /* renamed from: p */
    private ValueAnimator f22803p;

    /* renamed from: q */
    private boolean f22804q;

    /* renamed from: r */
    private boolean f22805r;

    /* renamed from: a */
    private static int m25363a(int i) {
        return i < 31 ? R.drawable.c2d : i < 41 ? R.drawable.c2e : R.drawable.c2f;
    }

    /* renamed from: b */
    public final void mo21456b() {
        this.f22797j.setAlpha(1.0f);
        this.f22796i.setAlpha(1.0f);
        this.f22793f.setAlpha(1.0f);
        this.f22788a.setScaleX(1.0f);
        this.f22788a.setScaleY(1.0f);
        this.f22788a.setTranslationX(0.0f);
        this.f22788a.setTranslationY(0.0f);
        C9738o.m28701a(this.f22796i, this.f22791d, this.f22792e);
        C9738o.m28701a(this.f22788a, this.f22791d, this.f22792e);
    }

    /* renamed from: a */
    public final void mo21453a() {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f22799l, 0.0f);
        translateAnimation.setDuration(270);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(270);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(translateAnimation);
        animationSet.addAnimation(alphaAnimation);
        animationSet.setDuration(270);
        animationSet.setStartOffset(30);
        this.f22788a.startAnimation(animationSet);
        this.f22801n = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f22801n.setInterpolator(f22787s);
        this.f22801n.setDuration(300);
        this.f22801n.addUpdateListener(new C8303c(this));
        this.f22801n.start();
        this.f22802o = ValueAnimator.ofFloat(new float[]{1.0f, 0.5f, 1.0f, 0.5f, 1.0f, 0.5f, 1.0f, 1.0f});
        this.f22802o.addUpdateListener(new C8304d(this));
        this.f22802o.setDuration(2100);
        this.f22802o.setStartDelay(300);
        this.f22802o.start();
        this.f22803p = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        this.f22803p.addUpdateListener(new C8305e(this));
        this.f22803p.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C8300b.this.f22790c.f23288d = false;
                C8300b.this.setVisibility(4);
                if (C8300b.this.f22789b != null) {
                    C8300b.this.f22789b.mo21452b();
                }
            }
        });
        this.f22803p.setStartDelay(2400);
        this.f22803p.setDuration(150);
        this.f22803p.start();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo21457b(ValueAnimator valueAnimator) {
        if (!this.f22804q) {
            this.f22793f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo21458c(ValueAnimator valueAnimator) {
        if (!this.f22804q) {
            this.f22793f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo21454a(ValueAnimator valueAnimator) {
        if (!this.f22804q) {
            this.f22793f.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: a */
    private void m25364a(Context context) {
        this.f22799l = C9738o.m28708b(getContext(), 20.0f);
        this.f22800m = (int) C9738o.m28708b(getContext(), 40.0f);
        View.inflate(context, R.layout.ar8, this);
        this.f22793f = findViewById(R.id.bfc);
        this.f22788a = findViewById(R.id.bfb);
        this.f22794g = (VHeadView) findViewById(R.id.b64);
        this.f22795h = (TextView) findViewById(R.id.e4l);
        this.f22796i = findViewById(R.id.bfa);
        this.f22797j = findViewById(R.id.bfe);
        this.f22798k = (TextView) findViewById(R.id.dvq);
        C9738o.m28712b((View) this, 4);
    }

    /* renamed from: a */
    public final void mo21455a(C8498ax axVar) {
        float f;
        if (axVar != null) {
            this.f22790c = axVar;
            User user = axVar.f23285a;
            if (user != null) {
                C5343e.m17045b(this.f22794g, user.getAvatarThumb(), this.f22800m, this.f22800m, R.drawable.c4_);
                this.f22795h.setText(user.getNickName());
                int i = axVar.f23287c;
                this.f22793f.setBackgroundResource(m25363a(i));
                this.f22798k.setText(getContext().getResources().getString(R.string.enb, new Object[]{Integer.valueOf(i)}));
                LayoutParams layoutParams = (LayoutParams) this.f22788a.getLayoutParams();
                layoutParams.width = -2;
                layoutParams.height = -2;
                Context context = getContext();
                if (this.f22805r) {
                    f = 24.0f;
                } else {
                    f = 56.0f;
                }
                layoutParams.setMargins(layoutParams.leftMargin, (int) C9738o.m28708b(context, f), layoutParams.rightMargin, layoutParams.bottomMargin);
                this.f22788a.setLayoutParams(layoutParams);
                post(new Runnable() {
                    public final void run() {
                        C9738o.m28712b((View) C8300b.this, 0);
                        C8300b.this.f22791d = C8300b.this.f22788a.getWidth();
                        C8300b.this.f22792e = C8300b.this.f22788a.getHeight();
                        C8300b.this.mo21456b();
                        C8300b.this.mo21453a();
                    }
                });
            }
        }
    }

    public C8300b(Context context, boolean z, C8298a aVar) {
        super(context);
        m25364a(context);
        this.f22789b = aVar;
        this.f22805r = z;
    }
}
