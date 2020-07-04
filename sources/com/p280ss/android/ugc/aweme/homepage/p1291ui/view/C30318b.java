package com.p280ss.android.ugc.aweme.homepage.p1291ui.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.DmtTabTextView;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.festival.p311a.C29127f;
import com.p280ss.android.ugc.aweme.festival.p311a.C29127f.C29128a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.PreDrawableInflate;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.p1684u.C42685a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.b */
public final class C30318b extends C30335l {

    /* renamed from: a */
    public ImageView f79713a;

    /* renamed from: b */
    public ImageView f79714b;

    /* renamed from: c */
    public View f79715c;

    /* renamed from: d */
    public ImageView f79716d;

    /* renamed from: g */
    private ImageView f79717g;

    /* renamed from: h */
    private TextView f79718h;

    /* renamed from: i */
    private PreDrawableInflate f79719i = ((PreDrawableInflate) C7121a.m22249b(PreDrawableInflate.class));

    /* renamed from: j */
    private boolean f79720j;

    /* renamed from: k */
    private boolean f79721k;

    /* renamed from: l */
    private boolean f79722l;

    public final ImageView getRefreshIcon() {
        return this.f79716d;
    }

    /* renamed from: f */
    public final void mo79860f() {
        m99101a((View) this.f79717g, 0, (Callable<View>) new C30329f<View>(this));
    }

    /* renamed from: g */
    public final void mo79861g() {
        m99101a((View) this.f79717g, 8, (Callable<View>) new C30330g<View>(this));
    }

    /* renamed from: a */
    public final void mo79853a() {
        if (m99102a(false, this.f79721k, false)) {
            m99103b(this.f79720j, this.f79721k, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo79856b() {
        if (m99102a(false, this.f79721k, false)) {
            m99103b(this.f79720j, this.f79721k, false);
        }
        m99104c(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo79857c() {
        if (m99102a(true, this.f79721k, false)) {
            m99103b(this.f79720j, this.f79721k, false);
        }
        m99104c(false);
    }

    /* renamed from: i */
    public final void mo79864i() {
        if (this.f79713a != null) {
            this.f79713a.setLayerType(0, null);
        }
        if (this.f79714b != null) {
            this.f79714b.setLayerType(0, null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public View mo79870o() {
        if (this.f79713a == null) {
            this.f79713a = new ImageView(getContext());
            this.f79713a.setScaleType(ScaleType.CENTER);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f79713a.setLayoutParams(layoutParams);
            addView(this.f79713a);
        }
        return this.f79713a;
    }

    /* renamed from: v */
    private View m99107v() {
        if (this.f79716d == null) {
            this.f79716d = new ImageView(getContext());
            this.f79716d.setScaleType(ScaleType.CENTER);
            this.f79716d.setImageDrawable(this.f79719i.getDrawable(R.drawable.av0, getContext()));
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f79716d.setLayoutParams(layoutParams);
            addView(this.f79716d);
        }
        return this.f79716d;
    }

    /* renamed from: h */
    public final void mo79863h() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue <= 0.66f) {
                    float f = ((floatValue / 0.66f) * 0.04f) + 1.0f;
                    C30318b.this.f79714b.setScaleX(f);
                    C30318b.this.f79714b.setScaleY(f);
                    return;
                }
                float f2 = 1.04f - (((floatValue - 0.66f) / 0.33f) * 0.04f);
                C30318b.this.f79714b.setScaleX(f2);
                C30318b.this.f79714b.setScaleY(f2);
            }
        });
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    /* renamed from: j */
    public final void mo79865j() {
        if (TextUtils.equals(getTabType(), "PUBLISH")) {
            boolean z = false;
            if (C29132a.m95560a()) {
                Drawable festivalDrawable = this.f79719i.getFestivalDrawable();
                if (festivalDrawable != null) {
                    if (!this.f79746f) {
                        this.f79714b.setScaleType(ScaleType.CENTER_INSIDE);
                        this.f79714b.setImageDrawable(festivalDrawable);
                        z = true;
                    } else {
                        return;
                    }
                }
            }
            if (!z) {
                m99105t();
            }
        }
    }

    /* renamed from: l */
    public final View mo79867l() {
        if (this.f79714b == null) {
            this.f79714b = new ImageView(getContext());
            this.f79714b.setScaleType(ScaleType.CENTER);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f79714b.setLayoutParams(layoutParams);
            addView(this.f79714b);
        }
        return this.f79714b;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && this.f79714b != null && (this.f79714b.getDrawable() instanceof C29127f)) {
            C29127f fVar = (C29127f) this.f79714b.getDrawable();
            if (fVar.isRunning()) {
                fVar.mo74585a();
            }
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: t */
    private void m99105t() {
        if (!this.f79722l) {
            this.f79722l = true;
            this.f79714b.setImageDrawable(this.f79719i.getDrawable(C42685a.m135539a(false), getContext()));
            return;
        }
        if (C6399b.m19946v() || ((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
            this.f79714b.setImageDrawable(this.f79719i.getDrawable(C42685a.m135539a(this.f79721k), getContext()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public View mo79872p() {
        if (this.f79715c == null) {
            this.f79715c = new View(getContext());
            this.f79715c.setBackground(this.f79719i.getDrawable(R.drawable.b_7, getContext()));
            LayoutParams layoutParams = new LayoutParams(C23486n.m77122a(28.0d), C23486n.m77122a(2.0d));
            layoutParams.gravity = 81;
            this.f79715c.setLayoutParams(layoutParams);
            addView(this.f79715c);
        }
        return this.f79715c;
    }

    /* renamed from: e */
    public final void mo79859e() {
        m99107v();
        mo79870o();
        mo79867l();
        this.f79716d.setVisibility(8);
        this.f79716d.setAlpha(1.0f);
        if (this.f79713a != null) {
            this.f79713a.setVisibility(0);
        }
        if (this.f79714b != null) {
            this.f79714b.setVisibility(0);
        }
        if (isSelected()) {
            if (this.f79713a != null) {
                this.f79713a.setAlpha(1.0f);
            }
            if (this.f79714b != null) {
                this.f79714b.setAlpha(0.0f);
            }
        } else {
            if (this.f79713a != null) {
                this.f79713a.setAlpha(0.0f);
            }
            if (this.f79714b != null) {
                this.f79714b.setAlpha(1.0f);
            }
        }
    }

    /* renamed from: k */
    public final void mo79866k() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && C29132a.m95560a()) {
            Boolean bool = (Boolean) this.f79714b.getTag(C29132a.axr);
            if (bool == null || !bool.booleanValue()) {
                C29127f l = C29125d.m95533l();
                if (l == null) {
                    mo79865j();
                    return;
                }
                this.f79714b.setScaleType(ScaleType.CENTER_INSIDE);
                this.f79714b.setImageDrawable(l);
                if (l.isRunning()) {
                    l.mo74585a();
                }
                l.f76876a = new C29128a() {
                    /* renamed from: a */
                    public final void mo74588a() {
                        C30318b.this.f79746f = true;
                    }

                    /* renamed from: b */
                    public final void mo74589b() {
                        C30318b.this.f79746f = false;
                        C30318b.this.mo79865j();
                    }
                };
                l.start();
                this.f79714b.setTag(C29132a.axr, Boolean.valueOf(true));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public View mo79868m() {
        if (this.f79717g == null) {
            this.f79717g = new ImageView(getContext());
            this.f79717g.setImageDrawable(this.f79719i.getDrawable(R.drawable.ba4, getContext()));
            if (C6399b.m19944t()) {
                int a = C23486n.m77122a(8.0d);
                LayoutParams layoutParams = new LayoutParams(a, a);
                this.f79717g.setScaleType(ScaleType.FIT_CENTER);
                layoutParams.setMargins(C23486n.m77122a(14.0d), C23486n.m77122a(6.0d), 0, 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(C23486n.m77122a(14.0d));
                }
                layoutParams.gravity = 49;
                this.f79717g.setLayoutParams(layoutParams);
            } else {
                LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                layoutParams2.setMargins(0, C23486n.m77122a(7.0d), C23486n.m77122a(10.0d), 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginEnd(C23486n.m77122a(10.0d));
                }
                layoutParams2.gravity = 8388661;
                this.f79717g.setLayoutParams(layoutParams2);
            }
            addView(this.f79717g);
        }
        return this.f79717g;
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public View mo79869n() {
        if (this.f79718h == null) {
            DmtTabTextView dmtTabTextView = new DmtTabTextView(getContext());
            dmtTabTextView.setBackground(this.f79719i.getDrawable(R.drawable.vj, getContext()));
            dmtTabTextView.setClickable(false);
            dmtTabTextView.setGravity(17);
            dmtTabTextView.setLines(1);
            dmtTabTextView.setIncludeFontPadding(false);
            dmtTabTextView.setTextSize(1, 12.0f);
            dmtTabTextView.setLineSpacing((float) C23486n.m77122a(2.0d), 1.0f);
            if (C6399b.m19944t()) {
                dmtTabTextView.setTextColor(getResources().getColor(R.color.wn));
                dmtTabTextView.setPadding(C23486n.m77122a(5.0d), 0, C23486n.m77122a(5.0d), 0);
                dmtTabTextView.setFontType(C10834d.f29337g);
                dmtTabTextView.setMinWidth(C23486n.m77122a(16.0d));
                dmtTabTextView.setMinHeight(C23486n.m77122a(16.0d));
            } else {
                dmtTabTextView.setTextColor(-10944495);
                dmtTabTextView.setPadding(C23486n.m77122a(4.0d), 0, C23486n.m77122a(4.0d), 0);
            }
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            if (C6399b.m19944t()) {
                layoutParams.setMargins(C23486n.m77122a(13.0d), C23486n.m77122a(4.0d), 0, 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(C23486n.m77122a(13.0d));
                }
                layoutParams.gravity = 49;
            } else {
                layoutParams.setMargins(0, C23486n.m77122a(5.0d), C23486n.m77122a(6.0d), 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(C23486n.m77122a(6.0d));
                }
                layoutParams.gravity = 8388661;
            }
            dmtTabTextView.setLayoutParams(layoutParams);
            addView(dmtTabTextView);
            this.f79718h = dmtTabTextView;
        }
        return this.f79718h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo79858d() {
        m99107v();
        mo79870o();
        mo79867l();
        this.f79716d.setVisibility(0);
        this.f79716d.setLayerType(2, null);
        m99101a((View) this.f79713a, 8, (Callable<View>) new C30327d<View>(this));
        m99101a((View) this.f79714b, 8, (Callable<View>) new C30328e<View>(this));
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, -360.0f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C30318b.this.f79716d.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationRepeat(Animator animator) {
                if (!C30318b.this.f79745e) {
                    ofFloat.setRepeatCount(0);
                }
            }

            /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
                if (r4.f79725b.f79714b != null) goto L_0x0035;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:6:0x0033, code lost:
                if (r4.f79725b.f79713a != null) goto L_0x0035;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onAnimationEnd(android.animation.Animator r5) {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    boolean r5 = r5.isSelected()
                    r0 = 1
                    r1 = 0
                    if (r5 != 0) goto L_0x0021
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    android.widget.ImageView r5 = r5.f79714b
                    com.ss.android.ugc.aweme.homepage.ui.view.j r2 = new com.ss.android.ugc.aweme.homepage.ui.view.j
                    com.ss.android.ugc.aweme.homepage.ui.view.b r3 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    r2.<init>(r3)
                    com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.m99101a(r5, r1, r2)
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    android.widget.ImageView r5 = r5.f79714b
                    if (r5 == 0) goto L_0x001f
                    goto L_0x0035
                L_0x001f:
                    r0 = 0
                    goto L_0x0035
                L_0x0021:
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    android.widget.ImageView r5 = r5.f79713a
                    com.ss.android.ugc.aweme.homepage.ui.view.k r2 = new com.ss.android.ugc.aweme.homepage.ui.view.k
                    com.ss.android.ugc.aweme.homepage.ui.view.b r3 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    r2.<init>(r3)
                    com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.m99101a(r5, r1, r2)
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    android.widget.ImageView r5 = r5.f79713a
                    if (r5 == 0) goto L_0x001f
                L_0x0035:
                    if (r0 != 0) goto L_0x0052
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    android.widget.ImageView r5 = r5.f79713a
                    if (r5 == 0) goto L_0x0045
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    android.widget.ImageView r5 = r5.f79713a
                    r5.setVisibility(r1)
                    return
                L_0x0045:
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    android.widget.ImageView r5 = r5.f79714b
                    if (r5 == 0) goto L_0x0052
                    com.ss.android.ugc.aweme.homepage.ui.view.b r5 = com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.this
                    android.widget.ImageView r5 = r5.f79714b
                    r5.setVisibility(r1)
                L_0x0052:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.C303202.onAnimationEnd(android.animation.Animator):void");
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        ofFloat2.setDuration(300);
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C30318b.this.f79716d.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                C30318b.this.f79716d.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f79716d.setSelected(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
        animatorSet.start();
    }

    public final void setActivated(boolean z) {
        super.setActivated(z);
        if (this.f79714b != null) {
            this.f79714b.setSelected(z);
            this.f79714b.invalidate();
        }
        if (m99102a(this.f79720j, z, true)) {
            m99103b(this.f79720j, this.f79721k, true);
        }
    }

    /* renamed from: c */
    private void m99104c(final boolean z) {
        ValueAnimator valueAnimator;
        mo79864i();
        if (TextUtils.equals(getTabType(), "HOME")) {
            valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f, 1.0f});
        } else {
            valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        }
        valueAnimator.setDuration(400);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                long currentPlayTime = valueAnimator.getCurrentPlayTime();
                if (!C6399b.m19946v()) {
                    if (!z) {
                        C30318b.this.f79715c.setTranslationY(C9738o.m28708b(C30318b.this.getContext(), 2.0f) - ((C9738o.m28708b(C30318b.this.getContext(), 2.0f) * ((float) currentPlayTime)) / ((float) valueAnimator.getDuration())));
                        return;
                    }
                    C30318b.this.f79715c.setTranslationY((C9738o.m28708b(C30318b.this.getContext(), 2.0f) * ((float) currentPlayTime)) / ((float) valueAnimator.getDuration()));
                }
            }
        });
        valueAnimator.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                C30318b.this.mo79864i();
                if (!C6399b.m19946v()) {
                    if (!z) {
                        C30318b.this.f79715c.setTranslationY(0.0f);
                        return;
                    }
                    C30318b.this.f79715c.setTranslationY(C9738o.m28708b(C30318b.this.getContext(), 2.0f));
                }
            }
        });
        valueAnimator.start();
    }

    /* renamed from: a */
    public final void mo79854a(int i) {
        String str;
        if (TextUtils.equals(getTabType(), "NOTIFICATION")) {
            if (i <= 0) {
                m99101a((View) this.f79718h, 8, (Callable<View>) new C30331h<View>(this));
                return;
            }
            m99101a((View) this.f79718h, 0, (Callable<View>) new C30332i<View>(this));
            if (i > 99) {
                str = "99+";
            } else {
                str = String.valueOf(i);
            }
            this.f79718h.setText(str);
        }
    }

    /* renamed from: a */
    public final void mo79855a(boolean z) {
        if (m99102a(true, this.f79721k, false)) {
            m99103b(this.f79720j, this.f79721k, true);
        }
    }

    /* renamed from: a */
    public static void m99101a(View view, int i, Callable<View> callable) {
        if (i == 4 || i == 0) {
            if (view == null) {
                try {
                    view = (View) callable.call();
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
            view.setVisibility(i);
            return;
        }
        if (i == 8 && view != null) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    private boolean m99102a(boolean z, boolean z2, boolean z3) {
        if (this.f79720j == z && this.f79721k == z2 && !z3) {
            return false;
        }
        if (getTabType().equals("PUBLISH")) {
            this.f79720j = z;
            if (z3) {
                mo79867l();
            }
        } else if (this.f79720j != z || z3) {
            this.f79720j = z;
            z3 = true;
        }
        if (getTabType().equals("HOME")) {
            this.f79721k = z2;
        } else if (this.f79721k != z2) {
            this.f79721k = z2;
            if (!this.f79720j || getTabType().equals("PUBLISH")) {
                z3 = true;
            }
        }
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r9.equals("DISCOVER") == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00fc, code lost:
        if (r9.equals("DISCOVER") != false) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c8  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m99103b(boolean r9, boolean r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = -1
            if (r9 == 0) goto L_0x00e7
            java.lang.String r9 = r8.getTabType()
            java.lang.String r7 = "PUBLISH"
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x00e7
            r8.mo79870o()
            java.lang.String r9 = r8.getTabType()
            int r10 = r9.hashCode()
            r7 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r10 == r7) goto L_0x0053
            r5 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r10 == r5) goto L_0x0049
            r4 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r10 == r4) goto L_0x003f
            r3 = 1055811561(0x3eee67e9, float:0.46563652)
            if (r10 == r3) goto L_0x0036
            goto L_0x005d
        L_0x0036:
            java.lang.String r10 = "DISCOVER"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x005d
            goto L_0x005e
        L_0x003f:
            java.lang.String r10 = "USER"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x005d
            r2 = 3
            goto L_0x005e
        L_0x0049:
            java.lang.String r10 = "HOME"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x005d
            r2 = 0
            goto L_0x005e
        L_0x0053:
            java.lang.String r10 = "NOTIFICATION"
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x005d
            r2 = 2
            goto L_0x005e
        L_0x005d:
            r2 = -1
        L_0x005e:
            switch(r2) {
                case 0: goto L_0x00b4;
                case 1: goto L_0x0088;
                case 2: goto L_0x0075;
                case 3: goto L_0x0062;
                default: goto L_0x0061;
            }
        L_0x0061:
            goto L_0x00c6
        L_0x0062:
            android.widget.ImageView r9 = r8.f79713a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232485(0x7f0806e5, float:1.808108E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x00c6
        L_0x0075:
            android.widget.ImageView r9 = r8.f79713a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232479(0x7f0806df, float:1.8081068E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x00c6
        L_0x0088:
            boolean r9 = com.p280ss.android.ugc.aweme.main.experiment.C33003b.m106651a()
            if (r9 == 0) goto L_0x00a1
            android.widget.ImageView r9 = r8.f79713a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232679(0x7f0807a7, float:1.8081474E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x00c6
        L_0x00a1:
            android.widget.ImageView r9 = r8.f79713a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232800(0x7f080820, float:1.808172E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x00c6
        L_0x00b4:
            android.widget.ImageView r9 = r8.f79713a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232473(0x7f0806d9, float:1.8081056E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
        L_0x00c6:
            if (r11 == 0) goto L_0x020d
            android.widget.ImageView r9 = r8.f79713a
            r9.setAlpha(r1)
            android.widget.ImageView r9 = r8.f79714b
            if (r9 == 0) goto L_0x00d6
            android.widget.ImageView r9 = r8.f79714b
            r9.setAlpha(r0)
        L_0x00d6:
            android.view.View r9 = r8.f79715c
            if (r9 == 0) goto L_0x020d
            android.view.View r9 = r8.f79715c
            r10 = 0
            int r10 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r10)
            float r10 = (float) r10
            r9.setTranslationY(r10)
            return
        L_0x00e7:
            r8.mo79867l()
            java.lang.String r9 = r8.getTabType()
            int r7 = r9.hashCode()
            switch(r7) {
                case -1382453013: goto L_0x011d;
                case 2223327: goto L_0x0113;
                case 2614219: goto L_0x0109;
                case 482617583: goto L_0x00ff;
                case 1055811561: goto L_0x00f6;
                default: goto L_0x00f5;
            }
        L_0x00f5:
            goto L_0x0127
        L_0x00f6:
            java.lang.String r3 = "DISCOVER"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x0127
            goto L_0x0128
        L_0x00ff:
            java.lang.String r2 = "PUBLISH"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0127
            r2 = 4
            goto L_0x0128
        L_0x0109:
            java.lang.String r2 = "USER"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0127
            r2 = 3
            goto L_0x0128
        L_0x0113:
            java.lang.String r2 = "HOME"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0127
            r2 = 0
            goto L_0x0128
        L_0x011d:
            java.lang.String r2 = "NOTIFICATION"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x0127
            r2 = 2
            goto L_0x0128
        L_0x0127:
            r2 = -1
        L_0x0128:
            switch(r2) {
                case 0: goto L_0x01db;
                case 1: goto L_0x0185;
                case 2: goto L_0x015c;
                case 3: goto L_0x0132;
                case 4: goto L_0x012d;
                default: goto L_0x012b;
            }
        L_0x012b:
            goto L_0x01ed
        L_0x012d:
            r8.mo79865j()
            goto L_0x01ed
        L_0x0132:
            if (r10 == 0) goto L_0x0148
            android.widget.ImageView r9 = r8.f79714b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232487(0x7f0806e7, float:1.8081085E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01ed
        L_0x0148:
            android.widget.ImageView r9 = r8.f79714b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232489(0x7f0806e9, float:1.8081089E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01ed
        L_0x015c:
            if (r10 == 0) goto L_0x0172
            android.widget.ImageView r9 = r8.f79714b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232481(0x7f0806e1, float:1.8081072E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01ed
        L_0x0172:
            android.widget.ImageView r9 = r8.f79714b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232483(0x7f0806e3, float:1.8081077E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01ed
        L_0x0185:
            boolean r9 = com.p280ss.android.ugc.aweme.main.experiment.C33003b.m106651a()
            if (r9 == 0) goto L_0x01b3
            if (r10 == 0) goto L_0x01a0
            android.widget.ImageView r9 = r8.f79714b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232681(0x7f0807a9, float:1.8081478E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01ed
        L_0x01a0:
            android.widget.ImageView r9 = r8.f79714b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232683(0x7f0807ab, float:1.8081482E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01ed
        L_0x01b3:
            if (r10 == 0) goto L_0x01c8
            android.widget.ImageView r9 = r8.f79714b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232491(0x7f0806eb, float:1.8081093E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01ed
        L_0x01c8:
            android.widget.ImageView r9 = r8.f79714b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232493(0x7f0806ed, float:1.8081097E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
            goto L_0x01ed
        L_0x01db:
            android.widget.ImageView r9 = r8.f79714b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r10 = r8.f79719i
            r2 = 2131232475(0x7f0806db, float:1.808106E38)
            android.content.Context r3 = r8.getContext()
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r2, r3)
            r9.setImageDrawable(r10)
        L_0x01ed:
            if (r11 == 0) goto L_0x020d
            android.widget.ImageView r9 = r8.f79714b
            r9.setAlpha(r1)
            android.widget.ImageView r9 = r8.f79713a
            if (r9 == 0) goto L_0x01fd
            android.widget.ImageView r9 = r8.f79713a
            r9.setAlpha(r0)
        L_0x01fd:
            android.view.View r9 = r8.f79715c
            if (r9 == 0) goto L_0x020d
            android.view.View r9 = r8.f79715c
            r10 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r10 = com.p280ss.android.ugc.aweme.base.utils.C23486n.m77122a(r10)
            float r10 = (float) r10
            r9.setTranslationY(r10)
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30318b.m99103b(boolean, boolean, boolean):void");
    }

    public C30318b(Context context, String str, MainBottomTabView mainBottomTabView, boolean z, boolean z2) {
        super(context, str, mainBottomTabView);
        int i = 0;
        if (C6399b.m19947w() && !getTabType().equals("PUBLISH")) {
            m99101a(this.f79715c, 0, (Callable<View>) new C30326c<View>(this));
        }
        if (m99102a(z, false, true)) {
            m99103b(this.f79720j, this.f79721k, true);
        }
        View view = this.f79715c;
        if (C21085a.m71129c()) {
            i = 8;
        }
        C23487o.m77140a(view, i);
    }
}
