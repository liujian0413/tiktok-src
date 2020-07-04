package com.bytedance.android.livesdk.chatroom.widget;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.uikit.rtl.AutoRTLTextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.widget.aj */
public final class C5787aj extends RelativeLayout {

    /* renamed from: a */
    public View f17035a;

    /* renamed from: b */
    public View f17036b;

    /* renamed from: c */
    public C5791a f17037c;

    /* renamed from: d */
    final int f17038d = 294;

    /* renamed from: e */
    final int f17039e = 80;

    /* renamed from: f */
    final int f17040f = 160;

    /* renamed from: g */
    final int f17041g = 320;

    /* renamed from: h */
    private LottieAnimationView f17042h;

    /* renamed from: i */
    private AutoRTLTextView f17043i;

    /* renamed from: j */
    private String f17044j;

    /* renamed from: k */
    private Boolean f17045k = Boolean.valueOf(true);

    /* renamed from: l */
    private Animation f17046l;

    /* renamed from: m */
    private Animation f17047m;

    /* renamed from: n */
    private Animation f17048n;

    /* renamed from: o */
    private Animation f17049o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.aj$a */
    public interface C5791a {
        /* renamed from: a */
        void mo11381a();
    }

    /* renamed from: c */
    public final void mo14276c() {
        if (!(this.f17046l == null && this.f17048n == null)) {
            this.f17036b.clearAnimation();
        }
        if (this.f17047m != null || this.f17049o != null) {
            this.f17035a.clearAnimation();
        }
    }

    /* renamed from: a */
    public final void mo14273a() {
        if (this.f17046l == null) {
            this.f17046l = new AlphaAnimation(0.0f, 1.0f);
            this.f17046l.setDuration(160);
        }
        if (this.f17047m == null) {
            this.f17047m = new AlphaAnimation(0.0f, 1.0f);
            this.f17047m.setDuration(320);
            this.f17047m.setStartOffset(160);
        }
        this.f17036b.clearAnimation();
        this.f17035a.clearAnimation();
        this.f17036b.startAnimation(this.f17046l);
        this.f17035a.startAnimation(this.f17047m);
    }

    /* renamed from: b */
    public final void mo14275b() {
        if (this.f17048n == null) {
            this.f17048n = new AlphaAnimation(1.0f, 0.0f);
            this.f17048n.setDuration(160);
            this.f17048n.setStartOffset(160);
            this.f17048n.setAnimationListener(new AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    C5787aj.this.f17036b.setVisibility(8);
                    C5787aj.this.f17035a.setVisibility(8);
                }
            });
        }
        if (this.f17049o == null) {
            this.f17049o = new AlphaAnimation(1.0f, 0.0f);
            this.f17049o.setDuration(320);
        }
        this.f17036b.clearAnimation();
        this.f17035a.clearAnimation();
        this.f17036b.startAnimation(this.f17048n);
        this.f17035a.startAnimation(this.f17049o);
    }

    public final void setDestText(String str) {
        if (this.f17043i != null) {
            this.f17043i.setText(str);
        }
    }

    public C5787aj(Context context) {
        super(context);
        m18228a(context);
    }

    public final void setClickListener(C5791a aVar) {
        this.f17036b.setClickable(true);
        this.f17037c = aVar;
        this.f17036b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                C5787aj.this.f17037c.mo11381a();
            }
        });
    }

    public final void setAnimResource(String str) {
        if (this.f17042h != null && !TextUtils.isEmpty(str) && !str.equals(this.f17044j)) {
            this.f17044j = str;
            this.f17042h.setAnimation(str);
            this.f17042h.mo7082c(true);
            this.f17042h.mo7078b();
        }
    }

    /* renamed from: a */
    private void m18228a(Context context) {
        inflate(getContext(), R.layout.au9, this);
        this.f17036b = findViewById(R.id.a1b);
        this.f17035a = findViewById(R.id.a1m);
        this.f17042h = (LottieAnimationView) findViewById(R.id.d7o);
        this.f17043i = (AutoRTLTextView) findViewById(R.id.dt5);
        if (C3519c.m12965a(context)) {
            this.f17043i.setText(R.string.fct);
        } else {
            this.f17043i.setText(R.string.fcu);
        }
        LayoutParams layoutParams = (LayoutParams) this.f17035a.getLayoutParams();
        layoutParams.topMargin = (int) (((float) (((int) (((float) C9738o.m28709b(getContext())) - C9738o.m28708b(getContext(), 294.0f))) / 2)) - C9738o.m28708b(getContext(), 80.0f));
        this.f17035a.setLayoutParams(layoutParams);
        if (this.f17037c == null) {
            this.f17036b.setClickable(false);
        } else {
            this.f17036b.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    C5787aj.this.f17037c.mo11381a();
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo14274a(String str, String str2) {
        if (this.f17042h != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !str.equals(this.f17044j)) {
            this.f17044j = str;
            this.f17042h.setAnimation(str);
            this.f17042h.setImageAssetsFolder(str2);
            this.f17042h.mo7082c(true);
            this.f17042h.mo7078b();
        }
    }
}
