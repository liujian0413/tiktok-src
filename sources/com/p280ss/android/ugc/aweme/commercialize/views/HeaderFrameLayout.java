package com.p280ss.android.ugc.aweme.commercialize.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import java.util.Iterator;
import kotlin.TypeCastException;
import kotlin.collections.C7506ac;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout */
public class HeaderFrameLayout extends FrameLayout {

    /* renamed from: e */
    public static final C25481a f67081e = new C25481a(null);

    /* renamed from: a */
    public View f67082a;

    /* renamed from: b */
    public int f67083b;

    /* renamed from: c */
    public int f67084c;

    /* renamed from: d */
    public Animator f67085d;

    /* renamed from: f */
    private int f67086f = -1;

    /* renamed from: g */
    private int f67087g;

    /* renamed from: h */
    private int f67088h;

    /* renamed from: i */
    private int f67089i;

    /* renamed from: j */
    private boolean f67090j;

    /* renamed from: k */
    private boolean f67091k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$a */
    public static final class C25481a {
        private C25481a() {
        }

        public /* synthetic */ C25481a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static <T extends Comparable<? super T>> T m83808a(T t, T t2, T t3) {
            if (t.compareTo(t2) < 0) {
                return t2;
            }
            if (t.compareTo(t3) > 0) {
                return t3;
            }
            return t;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$b */
    public static final class C25482b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HeaderFrameLayout f67092a;

        /* renamed from: b */
        final /* synthetic */ View f67093b;

        /* renamed from: c */
        final /* synthetic */ HeaderFrameLayout f67094c;

        public C25482b(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f67092a = headerFrameLayout;
            this.f67093b = view;
            this.f67094c = headerFrameLayout2;
        }

        public final void run() {
            if (this.f67093b.getMeasuredHeight() <= 0) {
                this.f67092a.measureChild(this.f67093b, this.f67092a.f67083b, this.f67092a.f67084c);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f67092a, "scrollOffset", new int[]{this.f67094c.getScrollOffset(), this.f67093b.getMeasuredHeight()});
            C7573i.m23582a((Object) ofInt, "anim");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250);
            ofInt.addUpdateListener(new AnimatorUpdateListener(this) {

                /* renamed from: a */
                final /* synthetic */ C25482b f67095a;

                {
                    this.f67095a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HeaderFrameLayout headerFrameLayout = this.f67095a.f67092a;
                    C7573i.m23582a((Object) valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ C25482b f67096a;

                public final void onAnimationCancel(Animator animator) {
                    this.f67096a.f67092a.f67085d = null;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f67096a.f67092a.f67085d = null;
                }

                {
                    this.f67096a = r1;
                }

                public final void onAnimationStart(Animator animator, boolean z) {
                    Animator animator2 = this.f67096a.f67092a.f67085d;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f67096a.f67092a.f67085d = ofInt;
                }
            });
            ofInt.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout$c */
    public static final class C25485c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ HeaderFrameLayout f67098a;

        /* renamed from: b */
        final /* synthetic */ View f67099b;

        /* renamed from: c */
        final /* synthetic */ HeaderFrameLayout f67100c;

        public C25485c(HeaderFrameLayout headerFrameLayout, View view, HeaderFrameLayout headerFrameLayout2) {
            this.f67098a = headerFrameLayout;
            this.f67099b = view;
            this.f67100c = headerFrameLayout2;
        }

        public final void run() {
            if (this.f67099b.getMeasuredHeight() <= 0) {
                this.f67098a.measureChild(this.f67099b, this.f67098a.f67083b, this.f67098a.f67084c);
            }
            final ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f67098a, "scrollOffset", new int[]{this.f67100c.getScrollOffset(), 0});
            C7573i.m23582a((Object) ofInt, "anim");
            ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
            ofInt.setDuration(250);
            ofInt.addUpdateListener(new AnimatorUpdateListener(this) {

                /* renamed from: a */
                final /* synthetic */ C25485c f67101a;

                {
                    this.f67101a = r1;
                }

                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    HeaderFrameLayout headerFrameLayout = this.f67101a.f67098a;
                    C7573i.m23582a((Object) valueAnimator, "it");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    if (animatedValue != null) {
                        headerFrameLayout.setScrollOffset(((Integer) animatedValue).intValue());
                        return;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
                }
            });
            ofInt.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ C25485c f67102a;

                public final void onAnimationCancel(Animator animator) {
                    this.f67102a.f67098a.f67085d = null;
                }

                public final void onAnimationEnd(Animator animator) {
                    this.f67102a.f67098a.f67085d = null;
                }

                {
                    this.f67102a = r1;
                }

                public final void onAnimationStart(Animator animator, boolean z) {
                    Animator animator2 = this.f67102a.f67098a.f67085d;
                    if (animator2 != null) {
                        animator2.cancel();
                    }
                    this.f67102a.f67098a.f67085d = ofInt;
                }
            });
            ofInt.start();
        }
    }

    /* access modifiers changed from: protected */
    public boolean getCanScaleContent() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean getCanScroll() {
        return false;
    }

    public final View getHeader() {
        return this.f67082a;
    }

    public final int getHeaderId() {
        return this.f67086f;
    }

    public final int getScrollOffset() {
        return this.f67087g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66156a() {
        View header = getHeader();
        if (header != null) {
            postDelayed(new C25482b(this, header, this), 500);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo66157b() {
        View header = getHeader();
        if (header != null) {
            postDelayed(new C25485c(this, header, this), 0);
        }
    }

    public HeaderFrameLayout(Context context) {
        super(context);
    }

    public final void setScrollOffset(int i) {
        if (this.f67087g != i) {
            this.f67087g = i;
            requestLayout();
        }
    }

    public void onViewRemoved(View view) {
        C7573i.m23587b(view, "child");
        super.onViewRemoved(view);
        if (C7573i.m23585a((Object) this.f67082a, (Object) view)) {
            this.f67082a = null;
        }
    }

    public final void setHeaderId(int i) {
        if (this.f67086f != i) {
            View findViewById = findViewById(i);
            if (!C7573i.m23585a((Object) this.f67082a, (Object) findViewById)) {
                this.f67082a = findViewById;
                requestLayout();
            }
            this.f67086f = i;
        }
    }

    public void onViewAdded(View view) {
        C7573i.m23587b(view, "child");
        super.onViewAdded(view);
        if (this.f67086f != -1 && view.getId() == this.f67086f) {
            if (this.f67082a == null) {
                this.f67082a = view;
                return;
            }
            throw new RuntimeException("dup header");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C7573i.m23587b(r7, r0)
            android.view.View r0 = r6.f67082a
            int r1 = r7.getActionMasked()
            r2 = 2
            r3 = 0
            if (r1 == 0) goto L_0x001e
            if (r1 == r2) goto L_0x0012
            goto L_0x0033
        L_0x0012:
            float r1 = r7.getY()
            int r1 = (int) r1
            int r4 = r6.f67088h
            int r4 = r1 - r4
            r6.f67088h = r1
            goto L_0x0034
        L_0x001e:
            float r1 = r7.getY()
            int r1 = (int) r1
            r6.f67089i = r1
            float r1 = r7.getY()
            int r1 = (int) r1
            r6.f67088h = r1
            android.animation.Animator r1 = r6.f67085d
            if (r1 == 0) goto L_0x0033
            r1.cancel()
        L_0x0033:
            r4 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x00ca
            int r1 = r7.getActionMasked()
            if (r1 != r2) goto L_0x00ca
            boolean r1 = r6.getCanScroll()
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r6.f67091k
            r2 = 1
            if (r1 != 0) goto L_0x005b
            float r1 = r7.getY()
            int r5 = r6.f67089i
            float r5 = (float) r5
            float r1 = r1 - r5
            float r1 = java.lang.Math.abs(r1)
            r5 = 1101004800(0x41a00000, float:20.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x005b
            r6.f67091k = r2
        L_0x005b:
            int r1 = r6.f67087g
            int r1 = r1 + r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Comparable r4 = (java.lang.Comparable) r4
            int r0 = r0.getMeasuredHeight()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Comparable r0 = (java.lang.Comparable) r0
            java.lang.Comparable r0 = com.p280ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.C25481a.m83808a(r1, r4, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r1 = r6.f67091k
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r6.f67090j
            if (r1 == 0) goto L_0x00ad
            int r1 = r6.f67087g
            if (r0 != r1) goto L_0x00a9
            r6.f67090j = r3
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r7)
            java.lang.String r1 = "downEvent"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            r0.setAction(r3)
            super.dispatchTouchEvent(r0)
            r0.recycle()
            android.view.MotionEvent r7 = android.view.MotionEvent.obtainNoHistory(r7)
            super.dispatchTouchEvent(r7)
            r7.recycle()
            goto L_0x00ac
        L_0x00a9:
            r6.setScrollOffset(r0)
        L_0x00ac:
            return r2
        L_0x00ad:
            int r1 = r6.f67087g
            if (r0 == r1) goto L_0x00ca
            r6.f67090j = r2
            r6.setScrollOffset(r0)
            android.view.MotionEvent r7 = android.view.MotionEvent.obtainNoHistory(r7)
            java.lang.String r0 = "cancelEvent"
            kotlin.jvm.internal.C7573i.m23582a(r7, r0)
            r0 = 3
            r7.setAction(r0)
            super.dispatchTouchEvent(r7)
            r7.recycle()
            return r2
        L_0x00ca:
            android.view.MotionEvent r7 = android.view.MotionEvent.obtainNoHistory(r7)
            boolean r0 = super.dispatchTouchEvent(r7)
            r7.recycle()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.f67083b = i;
        this.f67084c = i2;
        super.onMeasure(i, i2);
    }

    public HeaderFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HeaderFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m83804a(View view, int i, int i2, int i3, int i4) {
        C7573i.m23587b(view, "child");
        if (C7573i.m23585a((Object) view, (Object) this.f67082a)) {
            int measuredHeight = this.f67087g - view.getMeasuredHeight();
            i2 += measuredHeight;
            i4 += measuredHeight;
        } else if (this.f67082a != null) {
            i2 += this.f67087g;
            if (!getCanScaleContent()) {
                i4 += this.f67087g;
            }
        }
        view.layout(i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = i + getPaddingLeft();
        int paddingTop = i2 + getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int paddingBottom = i4 - getPaddingBottom();
        Iterator it = C7551d.m23565b(0, getChildCount()).iterator();
        while (it.hasNext()) {
            View childAt = getChildAt(((C7506ac) it).mo19392a());
            C7573i.m23582a((Object) childAt, "child");
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (layoutParams2.gravity == -1) {
                        i5 = 8388659;
                    } else {
                        i5 = layoutParams2.gravity;
                    }
                    if (VERSION.SDK_INT >= 17) {
                        i5 = Gravity.getAbsoluteGravity(i5, getLayoutDirection());
                    }
                    int i8 = i5 & 7;
                    int i9 = i5 & 112;
                    if (i8 == 1) {
                        i6 = (((((paddingRight - paddingLeft) - measuredWidth) / 2) + paddingLeft) + layoutParams2.leftMargin) - layoutParams2.rightMargin;
                    } else if (i8 != 5) {
                        i6 = paddingLeft;
                    } else {
                        i6 = (paddingRight - measuredWidth) - layoutParams2.rightMargin;
                    }
                    if (i9 == 16) {
                        i7 = (((((paddingBottom - paddingTop) - measuredHeight) / 2) + paddingTop) + layoutParams2.topMargin) - layoutParams2.bottomMargin;
                    } else if (i9 != 80) {
                        i7 = layoutParams2.topMargin + paddingTop;
                    } else {
                        i7 = (paddingBottom - measuredHeight) - layoutParams2.bottomMargin;
                    }
                    m83804a(childAt, i6, i7, i6 + measuredWidth, i7 + measuredHeight);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }
}
