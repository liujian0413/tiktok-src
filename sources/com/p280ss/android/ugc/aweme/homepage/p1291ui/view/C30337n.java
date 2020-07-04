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
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.favorites.p1215ui.DmtTabTextView;
import com.p280ss.android.ugc.aweme.festival.christmas.C29132a;
import com.p280ss.android.ugc.aweme.festival.p311a.C29125d;
import com.p280ss.android.ugc.aweme.festival.p311a.C29127f;
import com.p280ss.android.ugc.aweme.festival.p311a.C29127f.C29128a;
import com.p280ss.android.ugc.aweme.homepage.p1291ui.inflate.PreDrawableInflate;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.n */
public final class C30337n extends C30335l {

    /* renamed from: a */
    public ImageView f79748a;

    /* renamed from: b */
    public ImageView f79749b;

    /* renamed from: c */
    public ImageView f79750c;

    /* renamed from: d */
    private ImageView f79751d;

    /* renamed from: g */
    private TextView f79752g;

    /* renamed from: h */
    private DmtTextView f79753h;

    /* renamed from: i */
    private PreDrawableInflate f79754i = ((PreDrawableInflate) C7121a.m22249b(PreDrawableInflate.class));

    /* renamed from: j */
    private boolean f79755j;

    /* renamed from: k */
    private boolean f79756k;

    public final ImageView getRefreshIcon() {
        return this.f79750c;
    }

    /* renamed from: f */
    public final void mo79860f() {
        m99150a((View) this.f79751d, 0, (Callable<View>) new C30344q<View>(this));
    }

    /* renamed from: g */
    public final void mo79861g() {
        m99150a((View) this.f79751d, 8, (Callable<View>) new C30345r<View>(this));
    }

    /* renamed from: a */
    public final void mo79853a() {
        if (m99151a(false, this.f79756k, false)) {
            m99152b(this.f79755j, this.f79756k, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo79856b() {
        if (m99151a(false, this.f79756k, false)) {
            m99152b(this.f79755j, this.f79756k, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo79857c() {
        if (m99151a(true, this.f79756k, false)) {
            m99152b(this.f79755j, this.f79756k, false);
        }
    }

    /* renamed from: o */
    private void m99153o() {
        if (this.f79756k) {
            this.f79749b.setImageDrawable(this.f79754i.getDrawable(R.drawable.ajg, getContext()));
        } else {
            this.f79749b.setImageDrawable(this.f79754i.getDrawable(R.drawable.a90, getContext()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public View mo79904m() {
        if (this.f79748a == null) {
            this.f79748a = new ImageView(getContext());
            this.f79748a.setScaleType(ScaleType.FIT_CENTER);
            int b = (int) C9738o.m28708b(getContext(), 36.0f);
            LayoutParams layoutParams = new LayoutParams(b, b);
            layoutParams.gravity = 49;
            this.f79748a.setLayoutParams(layoutParams);
            addView(this.f79748a);
        }
        return this.f79748a;
    }

    /* renamed from: h */
    public final void mo79863h() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C30346s(this));
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    /* renamed from: i */
    public final View mo79902i() {
        if (this.f79749b == null) {
            this.f79749b = new ImageView(getContext());
            this.f79749b.setScaleType(ScaleType.FIT_CENTER);
            int b = (int) C9738o.m28708b(getContext(), 36.0f);
            LayoutParams layoutParams = new LayoutParams(b, b);
            layoutParams.gravity = 49;
            this.f79749b.setLayoutParams(layoutParams);
            addView(this.f79749b);
        }
        return this.f79749b;
    }

    /* renamed from: j */
    public final void mo79865j() {
        if (TextUtils.equals(getTabType(), "PUBLISH")) {
            boolean z = false;
            if (C29132a.m95560a()) {
                Drawable festivalDrawable = this.f79754i.getFestivalDrawable();
                if (festivalDrawable != null) {
                    if (!this.f79746f) {
                        this.f79749b.setScaleType(ScaleType.CENTER_INSIDE);
                        this.f79749b.setImageDrawable(festivalDrawable);
                        z = true;
                    } else {
                        return;
                    }
                }
            }
            if (!z) {
                m99153o();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && this.f79749b != null && (this.f79749b.getDrawable() instanceof C29127f)) {
            C29127f fVar = (C29127f) this.f79749b.getDrawable();
            if (fVar.isRunning()) {
                fVar.mo74585a();
            }
        }
        super.onDetachedFromWindow();
    }

    /* renamed from: u */
    private View m99156u() {
        if (this.f79750c == null) {
            this.f79750c = new ImageView(getContext());
            this.f79750c.setScaleType(ScaleType.FIT_CENTER);
            this.f79750c.setImageDrawable(this.f79754i.getDrawable(R.drawable.av0, getContext()));
            int b = (int) C9738o.m28708b(getContext(), 36.0f);
            LayoutParams layoutParams = new LayoutParams(b, b);
            layoutParams.gravity = 49;
            this.f79750c.setLayoutParams(layoutParams);
            addView(this.f79750c);
        }
        return this.f79750c;
    }

    /* renamed from: e */
    public final void mo79859e() {
        m99156u();
        mo79904m();
        mo79902i();
        m99155t();
        this.f79750c.setVisibility(8);
        this.f79750c.setAlpha(1.0f);
        if (this.f79748a != null) {
            this.f79748a.setVisibility(0);
        }
        if (this.f79749b != null) {
            this.f79749b.setVisibility(0);
        }
        if (isSelected()) {
            if (this.f79748a != null) {
                this.f79748a.setAlpha(1.0f);
            }
            if (this.f79749b != null) {
                this.f79749b.setAlpha(0.0f);
            }
        } else {
            if (this.f79748a != null) {
                this.f79748a.setAlpha(0.0f);
            }
            if (this.f79749b != null) {
                this.f79749b.setAlpha(1.0f);
            }
        }
    }

    /* renamed from: k */
    public final void mo79866k() {
        if (TextUtils.equals(getTabType(), "PUBLISH") && C29132a.m95560a()) {
            Boolean bool = (Boolean) this.f79749b.getTag(C29132a.axr);
            if (bool == null || !bool.booleanValue()) {
                C29127f l = C29125d.m95533l();
                if (l == null) {
                    mo79865j();
                    return;
                }
                this.f79749b.setScaleType(ScaleType.CENTER_INSIDE);
                this.f79749b.setImageDrawable(l);
                if (l.isRunning()) {
                    l.mo74585a();
                }
                l.f76876a = new C29128a() {
                    /* renamed from: a */
                    public final void mo74588a() {
                        C30337n.this.f79746f = true;
                    }

                    /* renamed from: b */
                    public final void mo74589b() {
                        C30337n.this.f79746f = false;
                        C30337n.this.mo79865j();
                    }
                };
                l.start();
                this.f79749b.setTag(C29132a.axr, Boolean.valueOf(true));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public View mo79903l() {
        if (this.f79751d == null) {
            this.f79751d = new ImageView(getContext());
            this.f79751d.setImageDrawable(this.f79754i.getDrawable(R.drawable.ba4, getContext()));
            if (C6399b.m19944t()) {
                int a = C23486n.m77122a(8.0d);
                LayoutParams layoutParams = new LayoutParams(a, a);
                this.f79751d.setScaleType(ScaleType.FIT_CENTER);
                layoutParams.setMargins(C23486n.m77122a(16.0d), C23486n.m77122a(4.0d), 0, 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(C23486n.m77122a(16.0d));
                }
                layoutParams.gravity = 49;
                this.f79751d.setLayoutParams(layoutParams);
            } else {
                int a2 = C23486n.m77122a(7.0d);
                LayoutParams layoutParams2 = new LayoutParams(a2, a2);
                this.f79751d.setScaleType(ScaleType.FIT_CENTER);
                layoutParams2.topMargin = C23486n.m77122a(4.0d);
                layoutParams2.setMargins(a2, C23486n.m77122a(4.0d), 0, 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams2.setMarginStart(a2);
                }
                layoutParams2.gravity = 49;
                this.f79751d.setLayoutParams(layoutParams2);
            }
            addView(this.f79751d);
        }
        return this.f79751d;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public View mo79905n() {
        if (this.f79752g == null) {
            DmtTabTextView dmtTabTextView = new DmtTabTextView(getContext());
            dmtTabTextView.setBackground(this.f79754i.getDrawable(R.drawable.vj, getContext()));
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
                layoutParams.setMargins(C23486n.m77122a(13.0d), C23486n.m77122a(2.0d), 0, 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(C23486n.m77122a(13.0d));
                }
                layoutParams.gravity = 49;
            } else {
                layoutParams.setMargins(C23486n.m77122a(7.0d), C23486n.m77122a(3.0d), 0, 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(C23486n.m77122a(6.0d));
                }
                layoutParams.gravity = 49;
            }
            dmtTabTextView.setLayoutParams(layoutParams);
            addView(dmtTabTextView);
            this.f79752g = dmtTabTextView;
        }
        return this.f79752g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo79858d() {
        m99156u();
        mo79904m();
        mo79902i();
        m99155t();
        this.f79750c.setVisibility(0);
        this.f79750c.setLayerType(2, null);
        m99150a((View) this.f79748a, 8, (Callable<View>) new C30342o<View>(this));
        m99150a((View) this.f79749b, 8, (Callable<View>) new C30343p<View>(this));
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, -360.0f});
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C30337n.this.f79750c.setRotation(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationRepeat(Animator animator) {
                if (!C30337n.this.f79745e) {
                    ofFloat.setRepeatCount(0);
                }
            }

            public final void onAnimationEnd(Animator animator) {
                if (!C30337n.this.isSelected()) {
                    C30337n.m99150a((View) C30337n.this.f79749b, 0, (Callable<View>) new C30349v<View>(C30337n.this));
                } else {
                    C30337n.m99150a((View) C30337n.this.f79748a, 0, (Callable<View>) new C30350w<View>(C30337n.this));
                }
                if (C30337n.this.f79748a != null) {
                    C30337n.this.f79748a.setVisibility(0);
                }
                if (C30337n.this.f79749b != null) {
                    C30337n.this.f79749b.setVisibility(0);
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.8f, 1.0f});
        ofFloat2.setDuration(300);
        ofFloat2.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C30337n.this.f79750c.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                C30337n.this.f79750c.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f79750c.setSelected(true);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
        animatorSet.start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00af, code lost:
        if (r0.equals("DISCOVER") == false) goto L_0x00d0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010b  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m99155t() {
        /*
            r7 = this;
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            if (r0 != 0) goto L_0x013c
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = new com.bytedance.ies.dmt.ui.widget.DmtTextView
            android.content.Context r1 = r7.getContext()
            r0.<init>(r1)
            r7.f79753h = r0
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            java.lang.String r1 = com.bytedance.ies.dmt.p262ui.widget.util.C10834d.f29337g
            r0.setFontType(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            r1 = 1091567616(0x41100000, float:9.0)
            r2 = 1
            r0.setTextSize(r2, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            android.content.res.Resources r1 = r7.getResources()
            r3 = 2131101791(0x7f06085f, float:1.7816002E38)
            int r1 = r1.getColor(r3)
            r0.setTextColor(r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            android.content.Context r1 = r7.getContext()
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = com.bytedance.common.utility.C9738o.m28708b(r1, r3)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.setLineSpacing(r1, r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x004d
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            r1 = 1008981770(0x3c23d70a, float:0.01)
            r0.setLetterSpacing(r1)
        L_0x004d:
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            java.lang.String r3 = r7.getTabType()
            java.lang.String r4 = "NOTIFICATION"
            boolean r3 = r3.equals(r4)
            r4 = -1
            if (r3 == 0) goto L_0x0071
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r4, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f79753h
            r3 = 17
            r1.setGravity(r3)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f79753h
            r1.setSingleLine(r2)
        L_0x0071:
            r1 = 81
            r0.gravity = r1
            android.content.Context r1 = r7.getContext()
            r3 = 1082130432(0x40800000, float:4.0)
            float r1 = com.bytedance.common.utility.C9738o.m28708b(r1, r3)
            int r1 = (int) r1
            r0.bottomMargin = r1
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r7.f79753h
            r1.setLayoutParams(r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            r7.addView(r0)
            java.lang.String r0 = r7.getTabType()
            int r1 = r0.hashCode()
            r3 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r1 == r3) goto L_0x00c6
            r3 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r1 == r3) goto L_0x00bc
            r3 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r1 == r3) goto L_0x00b2
            r3 = 1055811561(0x3eee67e9, float:0.46563652)
            if (r1 == r3) goto L_0x00a9
            goto L_0x00d0
        L_0x00a9:
            java.lang.String r1 = "DISCOVER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d0
            goto L_0x00d1
        L_0x00b2:
            java.lang.String r1 = "USER"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d0
            r2 = 3
            goto L_0x00d1
        L_0x00bc:
            java.lang.String r1 = "HOME"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d0
            r2 = 0
            goto L_0x00d1
        L_0x00c6:
            java.lang.String r1 = "NOTIFICATION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00d0
            r2 = 2
            goto L_0x00d1
        L_0x00d0:
            r2 = -1
        L_0x00d1:
            switch(r2) {
                case 0: goto L_0x010b;
                case 1: goto L_0x0102;
                case 2: goto L_0x00de;
                case 3: goto L_0x00d5;
                default: goto L_0x00d4;
            }
        L_0x00d4:
            goto L_0x013c
        L_0x00d5:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            r1 = 2131824552(0x7f110fa8, float:1.9281935E38)
            r0.setText(r1)
            goto L_0x013c
        L_0x00de:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.services.IMainService> r1 = com.p280ss.android.ugc.aweme.services.IMainService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.services.IMainService r0 = (com.p280ss.android.ugc.aweme.services.IMainService) r0
            boolean r0 = r0.isNotificationTabMStyle()
            if (r0 == 0) goto L_0x00f9
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            r1 = 2131825242(0x7f11125a, float:1.9283335E38)
            r0.setText(r1)
            goto L_0x013c
        L_0x00f9:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            r1 = 2131824553(0x7f110fa9, float:1.9281937E38)
            r0.setText(r1)
            goto L_0x013c
        L_0x0102:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            r1 = 2131824550(0x7f110fa6, float:1.9281931E38)
            r0.setText(r1)
            goto L_0x013c
        L_0x010b:
            boolean r0 = com.p280ss.android.ugc.aweme.language.C32326h.m104887i()
            if (r0 == 0) goto L_0x0134
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.main.experiment.ForYouTranslationsExperiment> r2 = com.p280ss.android.ugc.aweme.main.experiment.ForYouTranslationsExperiment.class
            r3 = 1
            java.lang.String r4 = "for_you_new_translations"
            com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r0 = r0.mo15295d()
            boolean r5 = r0.for_you_new_translations
            r6 = 0
            boolean r0 = r1.mo15292a(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0134
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            r1 = 2131823474(0x7f110b72, float:1.9279749E38)
            r0.setText(r1)
            goto L_0x013c
        L_0x0134:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            r1 = 2131824551(0x7f110fa7, float:1.9281933E38)
            r0.setText(r1)
        L_0x013c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r7.f79753h
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30337n.m99155t():android.view.View");
    }

    public final void setActivated(boolean z) {
        super.setActivated(z);
        if (this.f79749b != null) {
            this.f79749b.setSelected(z);
            this.f79749b.invalidate();
        }
        if (m99151a(this.f79755j, z, true)) {
            m99152b(this.f79755j, this.f79756k, true);
        }
    }

    /* renamed from: a */
    public final void mo79854a(int i) {
        String str;
        if (TextUtils.equals(getTabType(), "NOTIFICATION")) {
            if (i <= 0) {
                m99150a((View) this.f79752g, 8, (Callable<View>) new C30347t<View>(this));
                return;
            }
            m99150a((View) this.f79752g, 0, (Callable<View>) new C30348u<View>(this));
            if (i > 99) {
                str = "99+";
            } else {
                str = String.valueOf(i);
            }
            this.f79752g.setText(str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo79901a(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (floatValue <= 0.66f) {
            float f = ((floatValue / 0.66f) * 0.04f) + 1.0f;
            this.f79749b.setScaleX(f);
            this.f79749b.setScaleY(f);
            return;
        }
        float f2 = 1.04f - (((floatValue - 0.66f) / 0.33f) * 0.04f);
        this.f79749b.setScaleX(f2);
        this.f79749b.setScaleY(f2);
    }

    /* renamed from: a */
    public final void mo79855a(boolean z) {
        if (m99151a(true, this.f79756k, false)) {
            m99152b(this.f79755j, this.f79756k, true);
        }
    }

    /* renamed from: a */
    public static void m99150a(View view, int i, Callable<View> callable) {
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
    private boolean m99151a(boolean z, boolean z2, boolean z3) {
        if (this.f79755j == z && this.f79756k == z2 && !z3) {
            return false;
        }
        if (getTabType().equals("PUBLISH")) {
            this.f79755j = z;
            if (z3) {
                mo79902i();
                m99155t();
            }
        } else if (this.f79755j != z || z3) {
            this.f79755j = z;
            z3 = true;
        }
        if (getTabType().equals("HOME")) {
            this.f79756k = z2;
        } else if (this.f79756k != z2) {
            this.f79756k = z2;
            if (!this.f79755j || getTabType().equals("PUBLISH")) {
                z3 = true;
            }
        }
        return z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        if (r11.equals("DISCOVER") == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x015f, code lost:
        if (r7.equals("DISCOVER") != false) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x010e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m99152b(boolean r11, boolean r12, boolean r13) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = -1
            if (r11 == 0) goto L_0x011d
            java.lang.String r11 = r10.getTabType()
            java.lang.String r7 = "PUBLISH"
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x011d
            r10.mo79904m()
            r10.m99155t()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f79753h
            java.lang.String r12 = com.bytedance.ies.dmt.p262ui.widget.util.C10834d.f29332b
            r11.setFontType(r12)
            java.lang.String r11 = r10.getTabType()
            int r12 = r11.hashCode()
            r7 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r12 == r7) goto L_0x005d
            r5 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r12 == r5) goto L_0x0053
            r4 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r12 == r4) goto L_0x0049
            r3 = 1055811561(0x3eee67e9, float:0.46563652)
            if (r12 == r3) goto L_0x0040
            goto L_0x0067
        L_0x0040:
            java.lang.String r12 = "DISCOVER"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0049:
            java.lang.String r12 = "USER"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0067
            r2 = 3
            goto L_0x0068
        L_0x0053:
            java.lang.String r12 = "HOME"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0067
            r2 = 0
            goto L_0x0068
        L_0x005d:
            java.lang.String r12 = "NOTIFICATION"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x0067
            r2 = 2
            goto L_0x0068
        L_0x0067:
            r2 = -1
        L_0x0068:
            r11 = 2131099904(0x7f060100, float:1.7812174E38)
            switch(r2) {
                case 0: goto L_0x00ea;
                case 1: goto L_0x00b1;
                case 2: goto L_0x0091;
                case 3: goto L_0x0070;
                default: goto L_0x006e;
            }
        L_0x006e:
            goto L_0x010c
        L_0x0070:
            android.widget.ImageView r12 = r10.f79748a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232484(0x7f0806e4, float:1.8081079E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r12.setImageDrawable(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f79753h
            android.content.res.Resources r2 = r10.getResources()
            int r11 = r2.getColor(r11)
            r12.setTextColor(r11)
            goto L_0x010c
        L_0x0091:
            android.widget.ImageView r12 = r10.f79748a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232478(0x7f0806de, float:1.8081066E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r12.setImageDrawable(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f79753h
            android.content.res.Resources r2 = r10.getResources()
            int r11 = r2.getColor(r11)
            r12.setTextColor(r11)
            goto L_0x010c
        L_0x00b1:
            boolean r12 = com.p280ss.android.ugc.aweme.main.experiment.C33003b.m106651a()
            if (r12 == 0) goto L_0x00ca
            android.widget.ImageView r12 = r10.f79748a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232678(0x7f0807a6, float:1.8081472E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r12.setImageDrawable(r2)
            goto L_0x00dc
        L_0x00ca:
            android.widget.ImageView r12 = r10.f79748a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232799(0x7f08081f, float:1.8081717E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r12.setImageDrawable(r2)
        L_0x00dc:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r10.f79753h
            android.content.res.Resources r2 = r10.getResources()
            int r11 = r2.getColor(r11)
            r12.setTextColor(r11)
            goto L_0x010c
        L_0x00ea:
            android.widget.ImageView r11 = r10.f79748a
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r12 = r10.f79754i
            r2 = 2131232472(0x7f0806d8, float:1.8081054E38)
            android.content.Context r3 = r10.getContext()
            android.graphics.drawable.Drawable r12 = r12.getDrawable(r2, r3)
            r11.setImageDrawable(r12)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f79753h
            android.content.res.Resources r12 = r10.getResources()
            r2 = 2131099902(0x7f0600fe, float:1.781217E38)
            int r12 = r12.getColor(r2)
            r11.setTextColor(r12)
        L_0x010c:
            if (r13 == 0) goto L_0x027e
            android.widget.ImageView r11 = r10.f79748a
            r11.setAlpha(r1)
            android.widget.ImageView r11 = r10.f79749b
            if (r11 == 0) goto L_0x027e
            android.widget.ImageView r11 = r10.f79749b
            r11.setAlpha(r0)
            return
        L_0x011d:
            r10.mo79902i()
            r10.m99155t()
            com.bytedance.ies.dmt.ui.widget.DmtTextView r11 = r10.f79753h
            java.lang.String r7 = com.bytedance.ies.dmt.p262ui.widget.util.C10834d.f29337g
            r11.setFontType(r7)
            r11 = 2131099903(0x7f0600ff, float:1.7812172E38)
            if (r12 == 0) goto L_0x013d
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r10.f79753h
            android.content.res.Resources r8 = r10.getResources()
            int r8 = r8.getColor(r11)
            r7.setTextColor(r8)
            goto L_0x014d
        L_0x013d:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r10.f79753h
            android.content.res.Resources r8 = r10.getResources()
            r9 = 2131099905(0x7f060101, float:1.7812176E38)
            int r8 = r8.getColor(r9)
            r7.setTextColor(r8)
        L_0x014d:
            java.lang.String r7 = r10.getTabType()
            int r8 = r7.hashCode()
            switch(r8) {
                case -1382453013: goto L_0x0180;
                case 2223327: goto L_0x0176;
                case 2614219: goto L_0x016c;
                case 482617583: goto L_0x0162;
                case 1055811561: goto L_0x0159;
                default: goto L_0x0158;
            }
        L_0x0158:
            goto L_0x018a
        L_0x0159:
            java.lang.String r3 = "DISCOVER"
            boolean r3 = r7.equals(r3)
            if (r3 == 0) goto L_0x018a
            goto L_0x018b
        L_0x0162:
            java.lang.String r2 = "PUBLISH"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x018a
            r2 = 4
            goto L_0x018b
        L_0x016c:
            java.lang.String r2 = "USER"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x018a
            r2 = 3
            goto L_0x018b
        L_0x0176:
            java.lang.String r2 = "HOME"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x018a
            r2 = 0
            goto L_0x018b
        L_0x0180:
            java.lang.String r2 = "NOTIFICATION"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x018a
            r2 = 2
            goto L_0x018b
        L_0x018a:
            r2 = -1
        L_0x018b:
            switch(r2) {
                case 0: goto L_0x023f;
                case 1: goto L_0x01e9;
                case 2: goto L_0x01bf;
                case 3: goto L_0x0195;
                case 4: goto L_0x0190;
                default: goto L_0x018e;
            }
        L_0x018e:
            goto L_0x025e
        L_0x0190:
            r10.mo79865j()
            goto L_0x025e
        L_0x0195:
            if (r12 == 0) goto L_0x01ab
            android.widget.ImageView r11 = r10.f79749b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232486(0x7f0806e6, float:1.8081083E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r11.setImageDrawable(r2)
            goto L_0x025e
        L_0x01ab:
            android.widget.ImageView r11 = r10.f79749b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232488(0x7f0806e8, float:1.8081087E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r11.setImageDrawable(r2)
            goto L_0x025e
        L_0x01bf:
            if (r12 == 0) goto L_0x01d5
            android.widget.ImageView r11 = r10.f79749b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232480(0x7f0806e0, float:1.808107E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r11.setImageDrawable(r2)
            goto L_0x025e
        L_0x01d5:
            android.widget.ImageView r11 = r10.f79749b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232482(0x7f0806e2, float:1.8081075E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r11.setImageDrawable(r2)
            goto L_0x025e
        L_0x01e9:
            boolean r11 = com.p280ss.android.ugc.aweme.main.experiment.C33003b.m106651a()
            if (r11 == 0) goto L_0x0217
            if (r12 == 0) goto L_0x0204
            android.widget.ImageView r11 = r10.f79749b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232680(0x7f0807a8, float:1.8081476E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r11.setImageDrawable(r2)
            goto L_0x025e
        L_0x0204:
            android.widget.ImageView r11 = r10.f79749b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232682(0x7f0807aa, float:1.808148E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r11.setImageDrawable(r2)
            goto L_0x025e
        L_0x0217:
            if (r12 == 0) goto L_0x022c
            android.widget.ImageView r11 = r10.f79749b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232490(0x7f0806ea, float:1.808109E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r11.setImageDrawable(r2)
            goto L_0x025e
        L_0x022c:
            android.widget.ImageView r11 = r10.f79749b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232492(0x7f0806ec, float:1.8081095E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r11.setImageDrawable(r2)
            goto L_0x025e
        L_0x023f:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r10.f79753h
            android.content.res.Resources r3 = r10.getResources()
            int r11 = r3.getColor(r11)
            r2.setTextColor(r11)
            android.widget.ImageView r11 = r10.f79749b
            com.ss.android.ugc.aweme.homepage.ui.inflate.PreDrawableInflate r2 = r10.f79754i
            r3 = 2131232474(0x7f0806da, float:1.8081058E38)
            android.content.Context r4 = r10.getContext()
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r3, r4)
            r11.setImageDrawable(r2)
        L_0x025e:
            if (r13 == 0) goto L_0x027e
            android.widget.ImageView r11 = r10.f79748a
            if (r11 == 0) goto L_0x0269
            android.widget.ImageView r11 = r10.f79748a
            r11.setAlpha(r0)
        L_0x0269:
            boolean r11 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            if (r11 == 0) goto L_0x0279
            if (r12 == 0) goto L_0x0279
            android.widget.ImageView r11 = r10.f79749b
            r12 = 1056964608(0x3f000000, float:0.5)
            r11.setAlpha(r12)
            return
        L_0x0279:
            android.widget.ImageView r11 = r10.f79749b
            r11.setAlpha(r1)
        L_0x027e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.homepage.p1291ui.view.C30337n.m99152b(boolean, boolean, boolean):void");
    }

    public C30337n(Context context, String str, MainBottomTabView mainBottomTabView, boolean z, boolean z2) {
        super(context, str, mainBottomTabView);
        mo79904m();
        if (m99151a(z, false, true)) {
            m99152b(this.f79755j, this.f79756k, true);
        }
    }
}
