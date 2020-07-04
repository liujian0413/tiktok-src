package com.bytedance.android.livesdk.chatroom.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p022v4.view.animation.C0957c;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.model.C4889av;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.message.model.C8492ar;
import com.bytedance.android.livesdk.utils.C9048ao;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.ak */
public final class C5792ak extends FrameLayout {

    /* renamed from: a */
    public View f17053a;

    /* renamed from: b */
    private View f17054b;

    /* renamed from: c */
    private TextView f17055c;

    /* renamed from: d */
    private TextView f17056d;

    /* renamed from: e */
    private HSImageView f17057e;

    /* renamed from: f */
    private TextView f17058f;

    /* renamed from: g */
    private HSImageView f17059g;

    /* renamed from: h */
    private View f17060h;

    /* renamed from: i */
    private View f17061i;

    /* renamed from: j */
    private ImageView f17062j;

    /* renamed from: k */
    private TextView f17063k;

    /* renamed from: l */
    private TextView f17064l;

    /* renamed from: m */
    private View f17065m;

    /* renamed from: n */
    private View f17066n;

    /* renamed from: o */
    private float f17067o;

    /* renamed from: p */
    private float f17068p;

    /* renamed from: q */
    private final float f17069q = 0.3272727f;

    /* renamed from: r */
    private final float f17070r = 0.375f;

    /* renamed from: s */
    private final int f17071s = ((int) C9738o.m28708b(C9469i.m27991c(), 32.0f));

    /* renamed from: t */
    private AnimatorSet f17072t;

    /* renamed from: u */
    private final int f17073u = 600;

    /* renamed from: a */
    public final void mo14285a() {
        if (this.f17072t != null) {
            this.f17072t.removeAllListeners();
            this.f17072t.cancel();
        }
    }

    /* renamed from: b */
    private void m18235b() {
        LayoutInflater.from(getContext()).inflate(R.layout.alc, this, true);
        this.f17054b = findViewById(R.id.mc);
        this.f17053a = findViewById(R.id.d7z);
        this.f17055c = (TextView) findViewById(R.id.e3c);
        this.f17056d = (TextView) findViewById(R.id.e4n);
        this.f17058f = (TextView) findViewById(R.id.e4o);
        this.f17057e = (HSImageView) findViewById(R.id.bdj);
        this.f17059g = (HSImageView) findViewById(R.id.bdk);
        this.f17060h = findViewById(R.id.ee9);
        this.f17061i = findViewById(R.id.eed);
        this.f17062j = (ImageView) findViewById(R.id.ay4);
        this.f17063k = (TextView) findViewById(R.id.dto);
        this.f17064l = (TextView) findViewById(R.id.e3_);
        this.f17065m = findViewById(R.id.m8);
    }

    public C5792ak(Context context) {
        super(context);
        m18235b();
    }

    /* renamed from: a */
    public final void mo14287a(long j) {
        this.f17055c.setText(C9048ao.m27017a(j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14290b(ValueAnimator valueAnimator) {
        if (this.f17054b != null) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - (0.6727273f * floatValue);
            this.f17054b.setScaleX(f);
            float f2 = 1.0f - (floatValue * 0.625f);
            this.f17054b.setScaleY(f2);
            this.f17065m.setScaleX(f);
            this.f17065m.setScaleY(f2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14288a(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m18234a(this.f17060h, this.f17067o * floatValue);
        m18234a(this.f17061i, floatValue * this.f17068p);
    }

    /* renamed from: a */
    private void m18234a(View view, float f) {
        if (view != null) {
            C9738o.m28701a(view, -3, (int) (f * ((float) this.f17071s)));
        }
    }

    /* renamed from: a */
    public final void mo14289a(C4889av avVar, long j) {
        if (avVar != null && avVar.f14002b != null && avVar.f14002b.size() >= 2) {
            C8492ar arVar = (C8492ar) avVar.f14002b.get(0);
            C8492ar arVar2 = (C8492ar) avVar.f14002b.get(1);
            this.f17056d.setText(arVar.f23275d);
            this.f17058f.setText(arVar2.f23275d);
            C5343e.m17030a((ImageView) this.f17057e, arVar.f23274c);
            C5343e.m17030a((ImageView) this.f17059g, arVar2.f23274c);
            this.f17055c.setText(C9048ao.m27017a(j));
            if (arVar.f23273b == arVar2.f23273b) {
                this.f17063k.setVisibility(0);
                this.f17062j.setVisibility(8);
                this.f17063k.setAlpha(0.0f);
                this.f17066n = this.f17063k;
                this.f17067o = 1.0f;
                this.f17068p = 1.0f;
            } else {
                if (arVar.f23273b > arVar2.f23273b) {
                    this.f17067o = 1.0f;
                    this.f17068p = (((float) arVar2.f23273b) * 1.0f) / ((float) arVar.f23273b);
                    C5343e.m17030a(this.f17062j, arVar.f23274c);
                } else if (arVar.f23273b < arVar2.f23273b) {
                    this.f17068p = 1.0f;
                    this.f17067o = (((float) arVar.f23273b) * 1.0f) / ((float) arVar2.f23273b);
                    C5343e.m17030a(this.f17062j, arVar2.f23274c);
                }
                this.f17062j.setVisibility(0);
                this.f17063k.setVisibility(8);
                this.f17062j.setAlpha(0.0f);
                this.f17066n = this.f17062j;
            }
            this.f17064l.setText(C9048ao.m27017a(j));
        }
    }

    /* renamed from: a */
    public final void mo14286a(int i, AnimatorListener animatorListener) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "translationX", new float[]{0.0f, (float) i});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(C0957c.m4073a(0.4f, 1.2f, 0.74f, 1.0f));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setDuration(300);
        ofFloat2.setStartDelay(1233);
        this.f17054b.setPivotX(0.0f);
        this.f17054b.setPivotY(0.0f);
        this.f17065m.setPivotX(0.0f);
        this.f17065m.setPivotY(0.0f);
        ofFloat2.addUpdateListener(new C5794al(this));
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f17054b, "alpha", new float[]{1.0f, 0.0f});
        ofFloat3.setDuration(100);
        ofFloat3.setStartDelay(1233);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.f17053a, "translationX", new float[]{0.0f, -C9738o.m28708b(getContext(), 37.0f)});
        ofFloat4.setDuration(300);
        ofFloat4.setStartDelay(1233);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.f17053a, "translationY", new float[]{0.0f, -C9738o.m28708b(getContext(), 30.0f)});
        ofFloat5.setDuration(300);
        ofFloat5.setStartDelay(1233);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.f17066n, "alpha", new float[]{0.0f, 1.0f});
        ofFloat6.setDuration(200);
        ofFloat6.setStartDelay(1333);
        ofFloat6.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                if (C5792ak.this.f17053a != null) {
                    C5792ak.this.f17053a.setVisibility(0);
                }
            }
        });
        ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.f17064l, "alpha", new float[]{0.0f, 1.0f});
        ofFloat7.setDuration(100);
        ofFloat7.setStartDelay(1433);
        ValueAnimator ofFloat8 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat8.setStartDelay(1433);
        ofFloat8.setDuration(400);
        ofFloat8.addUpdateListener(new C5795am(this));
        this.f17072t = new AnimatorSet();
        this.f17072t.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8});
        this.f17072t.addListener(animatorListener);
        this.f17072t.start();
    }
}
