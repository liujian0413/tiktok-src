package com.p280ss.android.ugc.aweme.p313im.sdk.notification;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p022v4.view.C0978j;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.base.p308ui.CircleImageView;
import com.p280ss.android.ugc.aweme.p313im.service.C32024j;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.NotificationWidget */
public final class NotificationWidget extends FrameLayout {

    /* renamed from: c */
    public static final C31589a f82664c = new C31589a(null);

    /* renamed from: A */
    private View f82665A;

    /* renamed from: B */
    private final int f82666B;

    /* renamed from: a */
    public final View f82667a;

    /* renamed from: b */
    public C7562b<? super Integer, C7581n> f82668b;

    /* renamed from: d */
    private final View f82669d;

    /* renamed from: e */
    private final CircleImageView f82670e;

    /* renamed from: f */
    private final DmtTextView f82671f;

    /* renamed from: g */
    private final DmtTextView f82672g;

    /* renamed from: h */
    private final View f82673h;

    /* renamed from: i */
    private final View f82674i;

    /* renamed from: j */
    private final View f82675j;

    /* renamed from: k */
    private final DmtTextView f82676k;

    /* renamed from: l */
    private final DmtTextView f82677l;

    /* renamed from: m */
    private FrameLayout f82678m;

    /* renamed from: n */
    private ImageView f82679n;

    /* renamed from: o */
    private FrameLayout f82680o;

    /* renamed from: p */
    private final float f82681p;

    /* renamed from: q */
    private final float f82682q;

    /* renamed from: r */
    private final float f82683r;

    /* renamed from: s */
    private boolean f82684s;

    /* renamed from: t */
    private int f82685t;

    /* renamed from: u */
    private float f82686u;

    /* renamed from: v */
    private int f82687v;

    /* renamed from: w */
    private final Scroller f82688w;

    /* renamed from: x */
    private final GestureDetector f82689x;

    /* renamed from: y */
    private int f82690y;

    /* renamed from: z */
    private C32024j f82691z;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.NotificationWidget$a */
    public static final class C31589a {
        private C31589a() {
        }

        public /* synthetic */ C31589a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.NotificationWidget$b */
    static final class C31590b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ float f82693a;

        /* renamed from: b */
        final /* synthetic */ C7561a f82694b;

        C31590b(float f, C7561a aVar) {
            this.f82693a = f;
            this.f82694b = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                if (((Float) animatedValue).floatValue() == this.f82693a) {
                    C7561a aVar = this.f82694b;
                    if (aVar != null) {
                        aVar.invoke();
                        return;
                    }
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.NotificationWidget$c */
    public static final class C31591c extends SimpleOnGestureListener {

        /* renamed from: a */
        final /* synthetic */ NotificationWidget f82695a;

        C31591c(NotificationWidget notificationWidget) {
            this.f82695a = notificationWidget;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            C7562b<? super Integer, C7581n> bVar = this.f82695a.f82668b;
            if (bVar != null) {
                bVar.invoke(Integer.valueOf(0));
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (motionEvent == null || motionEvent2 == null) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            float x = motionEvent.getX() - motionEvent2.getX();
            if (motionEvent.getY() > motionEvent2.getY()) {
                float y = motionEvent.getY() - motionEvent2.getY();
                if (x == 0.0f) {
                    x = 1.0f;
                }
                if (y / Math.abs(x) > 0.65f) {
                    C7562b<? super Integer, C7581n> bVar = this.f82695a.f82668b;
                    if (bVar != null) {
                        bVar.invoke(Integer.valueOf(3));
                    }
                    return true;
                }
            }
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.NotificationWidget$d */
    static final class C31592d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ NotificationWidget f82696a;

        /* renamed from: b */
        final /* synthetic */ float f82697b;

        /* renamed from: c */
        final /* synthetic */ float f82698c;

        C31592d(NotificationWidget notificationWidget, float f, float f2) {
            this.f82696a = notificationWidget;
            this.f82697b = f;
            this.f82698c = f2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = this.f82696a.f82667a;
            C7573i.m23582a((Object) view, "mContentView");
            LayoutParams layoutParams = view.getLayoutParams();
            float f = this.f82697b;
            float f2 = this.f82698c;
            C7573i.m23582a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = (int) (f - (f2 * (1.0f - ((Float) animatedValue).floatValue())));
                View view2 = this.f82696a.f82667a;
                C7573i.m23582a((Object) view2, "mContentView");
                view2.setLayoutParams(layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: b */
    private final void m102682b() {
        m102679a(-getScrollY(), (int) C34943c.f91128x);
        this.f82685t = -1;
        m102680a(2, true);
        C7562b<? super Integer, C7581n> bVar = this.f82668b;
        if (bVar != null) {
            bVar.invoke(Integer.valueOf(4));
        }
    }

    public final void computeScroll() {
        super.computeScroll();
        if (this.f82688w.computeScrollOffset()) {
            scrollTo(this.f82688w.getCurrX(), this.f82688w.getCurrY());
            invalidate();
        }
    }

    /* renamed from: c */
    private final void m102683c() {
        float b = C9738o.m28708b(getContext(), 150.0f);
        float b2 = C9738o.m28708b(getContext(), 60.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f82675j, "scaleY", new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(m…Layout, \"scaleY\", 0f, 1f)");
        ofFloat.setDuration(300);
        View view = this.f82675j;
        C7573i.m23582a((Object) view, "mNotificationCloseLayout");
        view.setPivotY(0.0f);
        ofFloat.addUpdateListener(new C31592d(this, b, b2));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f82675j, "alpha", new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat2, "ObjectAnimator.ofFloat(m…eLayout, \"alpha\", 0f, 1f)");
        ofFloat2.setDuration(300);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    /* renamed from: a */
    public final void mo82321a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f82669d, "translationY", new float[]{(-C9738o.m28708b(getContext(), 80.0f)) - ((float) this.f82687v), 0.0f});
        C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(m…) - mStatusBarHeight, 0f)");
        ofFloat.setDuration(300);
        ofFloat.start();
    }

    public final void setActionListener(C7562b<? super Integer, C7581n> bVar) {
        this.f82668b = bVar;
    }

    /* renamed from: a */
    private final void m102678a(int i) {
        View view = this.f82669d;
        C7573i.m23582a((Object) view, "mRootView");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-1, i);
        }
        layoutParams.height = i;
        View view2 = this.f82669d;
        C7573i.m23582a((Object) view2, "mRootView");
        view2.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final void m102681a(MotionEvent motionEvent) {
        int i;
        int b = C0978j.m4131b(motionEvent);
        if (motionEvent.getPointerId(b) == this.f82685t) {
            if (b == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f82685t = motionEvent.getPointerId(i);
        }
    }

    /* renamed from: a */
    public final void mo82323a(C7561a<C7581n> aVar) {
        float f = (-((float) getMeasuredHeight())) - ((float) this.f82687v);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f82669d, "translationY", new float[]{0.0f, f});
        C7573i.m23582a((Object) ofFloat, "ObjectAnimator.ofFloat(m…              0f, height)");
        ofFloat.setDuration(300);
        ofFloat.addUpdateListener(new C31590b(f, aVar));
        ofFloat.start();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && !this.f82689x.onTouchEvent(motionEvent) && this.f82690y == 0) {
            int action = motionEvent.getAction();
            if (action != 6) {
                switch (action) {
                    case 0:
                        this.f82684s = false;
                        this.f82685t = motionEvent.getPointerId(0);
                        if (motionEvent.findPointerIndex(this.f82685t) >= 0) {
                            this.f82686u = motionEvent.getRawY();
                            break;
                        } else {
                            return false;
                        }
                    case 1:
                    case 3:
                        if (motionEvent.findPointerIndex(this.f82685t) >= 0) {
                            if (this.f82684s) {
                                this.f82684s = false;
                                m102682b();
                            }
                            this.f82685t = -1;
                            break;
                        } else {
                            return false;
                        }
                    case 2:
                        if (this.f82685t != -1 && motionEvent.findPointerIndex(this.f82685t) >= 0) {
                            if (Math.min(motionEvent.getRawY() - this.f82686u, this.f82681p) > this.f82681p / 4.0f && !this.f82684s) {
                                m102678a((int) this.f82683r);
                                scrollBy(0, -((int) this.f82681p));
                                this.f82684s = true;
                                break;
                            }
                        } else {
                            return false;
                        }
                        break;
                }
            } else {
                m102681a(motionEvent);
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo82322a(com.p280ss.android.ugc.aweme.p313im.sdk.notification.C31593b r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0152
            int r0 = r6.f82699a
            r1 = 0
            if (r0 == 0) goto L_0x0105
            int r0 = r6.f82699a
            r2 = 3
            if (r0 == r2) goto L_0x0105
            int r0 = r6.f82699a
            r2 = 2
            if (r0 != r2) goto L_0x0013
            goto L_0x0105
        L_0x0013:
            int r0 = r6.f82699a
            r2 = 1
            if (r0 != r2) goto L_0x0024
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r5.f82670e
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            r2 = 2131232833(0x7f080841, float:1.8081786E38)
            com.p280ss.android.ugc.aweme.base.C23323e.m76503a(r0, r2)
            goto L_0x010e
        L_0x0024:
            int r0 = r6.f82699a
            r2 = 4
            if (r0 != r2) goto L_0x010e
            android.content.Context r0 = r5.getContext()
            if (r0 == 0) goto L_0x0087
            android.widget.FrameLayout r0 = r5.f82680o
            java.lang.String r2 = "mAvatarFl"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.content.Context r2 = r5.getContext()
            r3 = 1109917696(0x42280000, float:42.0)
            float r2 = com.bytedance.common.utility.C9738o.m28708b(r2, r3)
            int r2 = (int) r2
            r0.height = r2
            android.content.Context r2 = r5.getContext()
            float r2 = com.bytedance.common.utility.C9738o.m28708b(r2, r3)
            int r2 = (int) r2
            r0.width = r2
            android.widget.FrameLayout r2 = r5.f82680o
            java.lang.String r4 = "mAvatarFl"
            kotlin.jvm.internal.C7573i.m23582a(r2, r4)
            r2.setLayoutParams(r0)
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r5.f82670e
            java.lang.String r2 = "mAvatarIv"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.content.Context r2 = r5.getContext()
            float r2 = com.bytedance.common.utility.C9738o.m28708b(r2, r3)
            int r2 = (int) r2
            r0.height = r2
            android.content.Context r2 = r5.getContext()
            float r2 = com.bytedance.common.utility.C9738o.m28708b(r2, r3)
            int r2 = (int) r2
            r0.width = r2
            com.ss.android.ugc.aweme.base.ui.CircleImageView r2 = r5.f82670e
            java.lang.String r3 = "mAvatarIv"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r2.setLayoutParams(r0)
        L_0x0087:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r5.f82670e
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r6.f82703e
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r2)
            com.ss.android.ugc.aweme.im.sdk.d.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            com.ss.android.ugc.aweme.im.service.h r0 = r0.mo18009f()
            r2 = 0
            if (r0 == 0) goto L_0x00aa
            com.ss.android.ugc.aweme.im.service.g r0 = r0.getLiveProxy()
            if (r0 == 0) goto L_0x00aa
            android.content.Context r3 = r5.getContext()
            com.ss.android.ugc.aweme.im.service.d r0 = r0.mo82985a(r3)
            goto L_0x00ab
        L_0x00aa:
            r0 = r2
        L_0x00ab:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L_0x00e4
            android.view.View r0 = (android.view.View) r0
            r5.f82665A = r0
            android.view.View r0 = r5.f82665A
            if (r0 == 0) goto L_0x00ca
            r3 = 2131299531(0x7f090ccb, float:1.8217066E38)
            android.view.View r3 = r5.findViewById(r3)
            java.lang.String r4 = "findViewById<View>(R.id.live_circle)"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r0.setLayoutParams(r3)
        L_0x00ca:
            android.content.Context r0 = r5.getContext()
            int r3 = r5.f82666B
            float r3 = (float) r3
            float r0 = com.bytedance.common.utility.C9738o.m28708b(r0, r3)
            int r0 = (int) r0
            android.view.View r3 = r5.f82665A
            if (r3 == 0) goto L_0x00dd
            r3.setPadding(r0, r0, r0, r0)
        L_0x00dd:
            android.widget.FrameLayout r0 = r5.f82678m
            android.view.View r3 = r5.f82665A
            r0.addView(r3, r1)
        L_0x00e4:
            android.widget.ImageView r0 = r5.f82679n
            java.lang.String r3 = "mAvatarLive"
            kotlin.jvm.internal.C7573i.m23582a(r0, r3)
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.im.sdk.d.a r0 = com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6956a.m21632a()
            com.ss.android.ugc.aweme.im.service.h r0 = r0.mo18009f()
            if (r0 == 0) goto L_0x0102
            com.ss.android.ugc.aweme.im.service.g r0 = r0.getLiveProxy()
            if (r0 == 0) goto L_0x0102
            com.ss.android.ugc.aweme.im.service.j r2 = r0.mo82988c()
        L_0x0102:
            r5.f82691z = r2
            goto L_0x010e
        L_0x0105:
            com.ss.android.ugc.aweme.base.ui.CircleImageView r0 = r5.f82670e
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = (com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView) r0
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r6.f82703e
            com.p280ss.android.ugc.aweme.base.C23323e.m76524b(r0, r2)
        L_0x010e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f82671f
            java.lang.String r2 = "mNameTv"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r2 = r6.f82704f
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f82672g
            java.lang.String r2 = "mDescriptionTv"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            java.lang.String r2 = r6.f82705g
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r0.setText(r2)
            java.lang.Integer r0 = r6.f82702d
            if (r0 == 0) goto L_0x0142
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r2 = 7
            if (r0 == r2) goto L_0x013b
            r2 = 52
            if (r0 != r2) goto L_0x0142
        L_0x013b:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r5.f82672g
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.p280ss.android.ugc.aweme.emoji.smallemoji.p1208a.C27608b.m90502a(r0)
        L_0x0142:
            int r0 = r6.f82699a
            if (r0 != 0) goto L_0x014c
            int r6 = r5.f82690y
            r5.m102680a(r6, r1)
            goto L_0x0152
        L_0x014c:
            int r6 = r6.f82699a
            r5.m102680a(r6, r1)
            return
        L_0x0152:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.notification.NotificationWidget.mo82322a(com.ss.android.ugc.aweme.im.sdk.notification.b):void");
    }

    /* renamed from: a */
    private final void m102679a(int i, int i2) {
        this.f82688w.startScroll(0, i, 0, -i, C34943c.f91128x);
        invalidate();
    }

    /* renamed from: a */
    private final void m102680a(int i, boolean z) {
        this.f82690y = i;
        switch (this.f82690y) {
            case 0:
                m102678a((int) this.f82682q);
                View view = this.f82673h;
                C7573i.m23582a((Object) view, "mDropDownIV");
                view.setVisibility(0);
                View view2 = this.f82674i;
                C7573i.m23582a((Object) view2, "mDropDownMoreIV");
                view2.setVisibility(8);
                View view3 = this.f82675j;
                C7573i.m23582a((Object) view3, "mNotificationCloseLayout");
                view3.setVisibility(8);
                return;
            case 1:
                m102678a((int) this.f82682q);
                View view4 = this.f82673h;
                C7573i.m23582a((Object) view4, "mDropDownIV");
                view4.setVisibility(8);
                View view5 = this.f82674i;
                C7573i.m23582a((Object) view5, "mDropDownMoreIV");
                view5.setVisibility(8);
                View view6 = this.f82675j;
                C7573i.m23582a((Object) view6, "mNotificationCloseLayout");
                view6.setVisibility(8);
                return;
            case 2:
                m102678a((int) this.f82683r);
                View view7 = this.f82673h;
                C7573i.m23582a((Object) view7, "mDropDownIV");
                view7.setVisibility(8);
                View view8 = this.f82675j;
                C7573i.m23582a((Object) view8, "mNotificationCloseLayout");
                view8.setVisibility(0);
                DmtTextView dmtTextView = this.f82676k;
                C7573i.m23582a((Object) dmtTextView, "mCloseNotificationBtn");
                dmtTextView.setVisibility(0);
                DmtTextView dmtTextView2 = this.f82677l;
                C7573i.m23582a((Object) dmtTextView2, "mCloseNotificationTv");
                dmtTextView2.setVisibility(8);
                View view9 = this.f82674i;
                C7573i.m23582a((Object) view9, "mDropDownMoreIV");
                view9.setVisibility(0);
                if (z) {
                    m102683c();
                    return;
                }
                break;
            case 3:
                m102678a((int) this.f82683r);
                View view10 = this.f82673h;
                C7573i.m23582a((Object) view10, "mDropDownIV");
                view10.setVisibility(8);
                View view11 = this.f82675j;
                C7573i.m23582a((Object) view11, "mNotificationCloseLayout");
                view11.setVisibility(0);
                DmtTextView dmtTextView3 = this.f82676k;
                C7573i.m23582a((Object) dmtTextView3, "mCloseNotificationBtn");
                dmtTextView3.setVisibility(8);
                DmtTextView dmtTextView4 = this.f82677l;
                C7573i.m23582a((Object) dmtTextView4, "mCloseNotificationTv");
                dmtTextView4.setVisibility(0);
                View view12 = this.f82674i;
                C7573i.m23582a((Object) view12, "mDropDownMoreIV");
                view12.setVisibility(0);
                return;
            case 4:
                m102678a((int) this.f82683r);
                View view13 = this.f82673h;
                C7573i.m23582a((Object) view13, "mDropDownIV");
                view13.setVisibility(8);
                View view14 = this.f82675j;
                C7573i.m23582a((Object) view14, "mNotificationCloseLayout");
                view14.setVisibility(8);
                DmtTextView dmtTextView5 = this.f82676k;
                C7573i.m23582a((Object) dmtTextView5, "mCloseNotificationBtn");
                dmtTextView5.setVisibility(8);
                DmtTextView dmtTextView6 = this.f82677l;
                C7573i.m23582a((Object) dmtTextView6, "mCloseNotificationTv");
                dmtTextView6.setVisibility(8);
                View view15 = this.f82674i;
                C7573i.m23582a((Object) view15, "mDropDownMoreIV");
                view15.setVisibility(0);
                if (z) {
                    m102683c();
                    break;
                }
                break;
        }
    }

    public NotificationWidget(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f82669d = View.inflate(context, R.layout.b3e, this);
        this.f82667a = this.f82669d.findViewById(R.id.a1q);
        this.f82670e = (CircleImageView) this.f82669d.findViewById(R.id.j2);
        this.f82671f = (DmtTextView) this.f82669d.findViewById(R.id.c37);
        this.f82672g = (DmtTextView) this.f82669d.findViewById(R.id.a7m);
        this.f82673h = this.f82669d.findViewById(R.id.abk);
        this.f82674i = this.f82669d.findViewById(R.id.abl);
        this.f82675j = this.f82669d.findViewById(R.id.c5r);
        this.f82676k = (DmtTextView) this.f82669d.findViewById(R.id.xm);
        this.f82677l = (DmtTextView) this.f82669d.findViewById(R.id.xn);
        this.f82678m = (FrameLayout) this.f82669d.findViewById(R.id.im);
        this.f82679n = (ImageView) this.f82669d.findViewById(R.id.e8s);
        this.f82680o = (FrameLayout) this.f82669d.findViewById(R.id.iy);
        this.f82681p = C9738o.m28708b(context, 25.0f);
        this.f82682q = C9738o.m28708b(context, 80.0f);
        this.f82683r = C9738o.m28708b(context, 160.0f);
        this.f82685t = -1;
        this.f82687v = C9738o.m28717e(context);
        this.f82688w = new Scroller(context);
        this.f82689x = new GestureDetector(context, new C31591c(this));
        this.f82666B = 3;
        this.f82676k.setOnClickListener(new OnClickListener(this) {

            /* renamed from: a */
            final /* synthetic */ NotificationWidget f82692a;

            {
                this.f82692a = r1;
            }

            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C7562b<? super Integer, C7581n> bVar = this.f82692a.f82668b;
                if (bVar != null) {
                    bVar.invoke(Integer.valueOf(1));
                }
            }
        });
    }

    public /* synthetic */ NotificationWidget(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
