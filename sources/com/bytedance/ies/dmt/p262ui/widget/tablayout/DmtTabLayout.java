package com.bytedance.ies.dmt.p262ui.widget.tablayout;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p022v4.util.Pools.C0887a;
import android.support.p022v4.util.Pools.SimplePool;
import android.support.p022v4.util.Pools.SynchronizedPool;
import android.support.p022v4.view.C0987q;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0931a;
import android.support.p022v4.view.ViewPager.C0934d;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p022v4.view.animation.FastOutSlowInInterpolator;
import android.support.p022v4.widget.C1056n;
import android.support.p029v7.app.ActionBar.C1067a;
import android.support.p029v7.p030a.p031a.C1065a;
import android.support.p029v7.widget.C1366aw;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.R$styleable;
import com.bytedance.ies.dmt.p262ui.base.C10745a.C10746a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@C0931a
/* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout */
public class DmtTabLayout extends HorizontalScrollView {

    /* renamed from: N */
    private static final int[] f29203N = {R.attr.g8};

    /* renamed from: a */
    public static final Interpolator f29204a = new FastOutSlowInInterpolator();

    /* renamed from: u */
    private static final C0887a<C10825f> f29205u = new SynchronizedPool(16);

    /* renamed from: A */
    private final int f29206A;

    /* renamed from: B */
    private int f29207B;

    /* renamed from: C */
    private C10820c f29208C;

    /* renamed from: D */
    private final ArrayList<C10820c> f29209D;

    /* renamed from: E */
    private C10820c f29210E;

    /* renamed from: F */
    private ValueAnimator f29211F;

    /* renamed from: G */
    private PagerAdapter f29212G;

    /* renamed from: H */
    private DataSetObserver f29213H;

    /* renamed from: I */
    private C10818a f29214I;

    /* renamed from: J */
    private boolean f29215J;

    /* renamed from: K */
    private float f29216K;

    /* renamed from: L */
    private float f29217L;

    /* renamed from: M */
    private final C0887a<C10826g> f29218M;

    /* renamed from: b */
    public final C10822e f29219b;

    /* renamed from: c */
    int f29220c;

    /* renamed from: d */
    int f29221d;

    /* renamed from: e */
    int f29222e;

    /* renamed from: f */
    int f29223f;

    /* renamed from: g */
    int f29224g;

    /* renamed from: h */
    ColorStateList f29225h;

    /* renamed from: i */
    float f29226i;

    /* renamed from: j */
    float f29227j;

    /* renamed from: k */
    int f29228k;

    /* renamed from: l */
    int f29229l;

    /* renamed from: m */
    int f29230m;

    /* renamed from: n */
    int f29231n;

    /* renamed from: o */
    int f29232o;

    /* renamed from: p */
    boolean f29233p;

    /* renamed from: q */
    ViewPager f29234q;

    /* renamed from: r */
    TabLayoutOnPageChangeListener f29235r;

    /* renamed from: s */
    public C10819b f29236s;

    /* renamed from: t */
    public int f29237t;

    /* renamed from: v */
    private final ArrayList<C10825f> f29238v;

    /* renamed from: w */
    private C10825f f29239w;

    /* renamed from: x */
    private int f29240x;

    /* renamed from: y */
    private int f29241y;

    /* renamed from: z */
    private int f29242z;

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$TabLayoutOnPageChangeListener */
    public static class TabLayoutOnPageChangeListener implements C0935e {

        /* renamed from: a */
        private final WeakReference<DmtTabLayout> f29244a;

        /* renamed from: b */
        private int f29245b;

        /* renamed from: c */
        private int f29246c;

        /* renamed from: d */
        private int f29247d;

        /* renamed from: e */
        private int f29248e;

        /* renamed from: f */
        private ArgbEvaluator f29249f = new ArgbEvaluator();

        /* renamed from: g */
        private AccelerateInterpolator f29250g = new AccelerateInterpolator();

        /* renamed from: h */
        private DecelerateInterpolator f29251h = new DecelerateInterpolator(1.6f);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo26109a() {
            this.f29245b = 0;
            this.f29246c = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f29245b = this.f29246c;
            this.f29246c = i;
        }

        public TabLayoutOnPageChangeListener(DmtTabLayout dmtTabLayout) {
            this.f29244a = new WeakReference<>(dmtTabLayout);
            this.f29248e = dmtTabLayout.getTabTextColors().getColorForState(DmtTabLayout.SELECTED_STATE_SET, 0);
            this.f29247d = dmtTabLayout.getTabTextColors().getDefaultColor();
        }

        public void onPageSelected(int i) {
            boolean z;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f29244a.get();
            if (dmtTabLayout != null && dmtTabLayout.getSelectedTabPosition() != i && i < dmtTabLayout.getTabCount()) {
                if (this.f29246c == 0 || (this.f29246c == 2 && this.f29245b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                dmtTabLayout.mo26060a(dmtTabLayout.mo26066b(i), z);
            }
        }

        /* renamed from: a */
        private static void m31741a(ImageView imageView, TextView textView, int i) {
            if (imageView != null && textView != null) {
                textView.setTextColor(i);
                imageView.setImageAlpha(Color.alpha(i));
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f29244a.get();
            if (dmtTabLayout != null) {
                if (this.f29246c != 2 || this.f29245b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f29246c == 2 && this.f29245b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                dmtTabLayout.mo26055a(i, f, z, z2);
                if (this.f29246c == 2 && this.f29245b == 0) {
                    dmtTabLayout.f29219b.f29269e = false;
                } else {
                    dmtTabLayout.f29219b.f29269e = true;
                    View childAt = dmtTabLayout.f29219b.getChildAt(dmtTabLayout.f29219b.f29265a);
                    View childAt2 = dmtTabLayout.f29219b.getChildAt(dmtTabLayout.f29219b.f29265a + 1);
                    if (!(childAt == null || childAt2 == null)) {
                        View findViewById = childAt.findViewById(R.id.bkb);
                        View findViewById2 = childAt2.findViewById(R.id.bkb);
                        if (!(findViewById == null || findViewById2 == null)) {
                            float left = (float) (childAt.getLeft() + ((childAt.getWidth() - findViewById.getWidth()) / 2));
                            float width = ((float) findViewById.getWidth()) + left;
                            float left2 = (float) (childAt2.getLeft() + ((childAt2.getWidth() - findViewById2.getWidth()) / 2));
                            float width2 = ((float) findViewById2.getWidth()) + left2;
                            ImageView imageView = (ImageView) findViewById2.findViewById(R.id.dfk);
                            TextView textView = (TextView) findViewById2.findViewById(R.id.dfm);
                            m31741a((ImageView) findViewById.findViewById(R.id.dfk), (TextView) findViewById.findViewById(R.id.dfm), ((Integer) this.f29249f.evaluate(f, Integer.valueOf(this.f29248e), Integer.valueOf(this.f29247d))).intValue());
                            m31741a(imageView, textView, ((Integer) this.f29249f.evaluate(f, Integer.valueOf(this.f29247d), Integer.valueOf(this.f29248e))).intValue());
                            dmtTabLayout.f29219b.f29267c = left + ((left2 - left) * this.f29250g.getInterpolation(f));
                            dmtTabLayout.f29219b.f29268d = width + ((width2 - width) * this.f29250g.getInterpolation(f));
                        }
                    }
                }
                C0991u.m4212e(dmtTabLayout.f29219b);
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$TabLayoutOnPageChangeListenerIndependent */
    public static class TabLayoutOnPageChangeListenerIndependent implements C0935e {

        /* renamed from: a */
        final boolean f29252a;

        /* renamed from: b */
        private final WeakReference<DmtTabLayout> f29253b;

        /* renamed from: c */
        private int f29254c;

        /* renamed from: d */
        private int f29255d;

        /* renamed from: e */
        private int f29256e;

        public void onPageScrollStateChanged(int i) {
            this.f29254c = this.f29255d;
            this.f29255d = i;
        }

        public void onPageSelected(int i) {
            boolean z;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f29253b.get();
            if (dmtTabLayout != null && dmtTabLayout.getSelectedTabPosition() != i && i < dmtTabLayout.getTabCount()) {
                if (this.f29255d == 0 || (this.f29255d == 2 && this.f29254c == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                dmtTabLayout.mo26060a(dmtTabLayout.mo26066b(i), z);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            DmtTabLayout dmtTabLayout = (DmtTabLayout) this.f29253b.get();
            if (!(this.f29256e == i || dmtTabLayout == null)) {
                if (this.f29255d != 2 || this.f29254c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f29255d == 2 && this.f29254c == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int i3 = i;
                C10829b bVar = new C10829b(this, this.f29256e, i3, dmtTabLayout, z, z2);
                duration.addUpdateListener(bVar);
                this.f29256e = i;
                final DmtTabLayout dmtTabLayout2 = dmtTabLayout;
                final boolean z3 = z;
                final boolean z4 = z2;
                C108171 r0 = new AnimatorListener() {
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        dmtTabLayout2.mo26055a(i3, 0.0f, z3, z4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        dmtTabLayout2.mo26055a(i3, 0.0f, z3, z4);
                    }
                };
                duration.addListener(r0);
                duration.start();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo26110a(int i, int i2, DmtTabLayout dmtTabLayout, boolean z, boolean z2, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (i >= i2 || this.f29252a) {
                floatValue = 1.0f - floatValue;
            } else {
                i2--;
            }
            dmtTabLayout.mo26055a(i2, floatValue, z, z2);
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$a */
    class C10818a implements C0934d {

        /* renamed from: a */
        public boolean f29262a;

        C10818a() {
        }

        /* renamed from: a */
        public final void mo1668a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (DmtTabLayout.this.f29234q == viewPager) {
                DmtTabLayout.this.mo26057a(pagerAdapter2, this.f29262a);
            }
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$b */
    public interface C10819b {
        /* renamed from: a */
        void mo26115a(C10825f fVar);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$c */
    public interface C10820c {
        /* renamed from: b */
        void mo26116b(C10825f fVar);
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$d */
    class C10821d extends DataSetObserver {
        public final void onChanged() {
            DmtTabLayout.this.mo26067b();
        }

        public final void onInvalidated() {
            DmtTabLayout.this.mo26067b();
        }

        C10821d() {
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$e */
    class C10822e extends LinearLayout {

        /* renamed from: a */
        int f29265a = -1;

        /* renamed from: b */
        float f29266b;

        /* renamed from: c */
        public float f29267c;

        /* renamed from: d */
        public float f29268d;

        /* renamed from: e */
        public boolean f29269e;

        /* renamed from: g */
        private int f29271g;

        /* renamed from: h */
        private final Paint f29272h;

        /* renamed from: i */
        private int f29273i = -1;

        /* renamed from: j */
        private int f29274j = -1;

        /* renamed from: k */
        private int f29275k = -1;

        /* renamed from: l */
        private ValueAnimator f29276l;

        /* renamed from: m */
        private int f29277m = DmtTabLayout.this.mo26069c(27);

        /* renamed from: n */
        private int f29278n = Integer.MAX_VALUE;

        /* renamed from: o */
        private int f29279o;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final float mo26123b() {
            return ((float) this.f29265a) + this.f29266b;
        }

        /* renamed from: c */
        private void m31748c() {
            int i;
            View childAt = getChildAt(this.f29265a);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.f29266b > 0.0f && this.f29265a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f29265a + 1);
                    i2 = (int) ((this.f29266b * ((float) childAt2.getLeft())) + ((1.0f - this.f29266b) * ((float) i2)));
                    i = (int) ((this.f29266b * ((float) childAt2.getRight())) + ((1.0f - this.f29266b) * ((float) i)));
                }
            }
            mo26121a(i2, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo26122a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: c */
        public final void mo26126c(int i) {
            this.f29279o = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo26124b(int i) {
            if (this.f29271g != i) {
                this.f29271g = i;
                C0991u.m4212e(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo26119a(int i) {
            if (this.f29272h.getColor() != i) {
                this.f29272h.setColor(i);
                C0991u.m4212e(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f29273i != i) {
                requestLayout();
                this.f29273i = i;
            }
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f29274j >= 0 && this.f29275k > this.f29274j) {
                View childAt = getChildAt(DmtTabLayout.this.getSelectedTabPosition());
                if (childAt != null) {
                    View findViewById = childAt.findViewById(R.id.bkb);
                    if (findViewById != null) {
                        if (DmtTabLayout.this.f29234q == null || !this.f29269e) {
                            this.f29267c = (float) (this.f29274j + (((this.f29275k - this.f29274j) - findViewById.getWidth()) / 2));
                            this.f29268d = this.f29267c + ((float) findViewById.getWidth());
                        }
                        canvas.drawRect(this.f29267c + ((float) this.f29279o), (float) (getHeight() - this.f29271g), this.f29268d - ((float) this.f29279o), (float) getHeight(), this.f29272h);
                        return;
                    }
                }
                canvas.drawRect((float) (this.f29274j + this.f29279o), (float) (getHeight() - this.f29271g), (float) (this.f29275k - this.f29279o), (float) getHeight(), this.f29272h);
            }
        }

        C10822e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f29272h = new Paint();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo26120a(int i, float f) {
            if (this.f29276l != null && this.f29276l.isRunning()) {
                this.f29276l.cancel();
            }
            this.f29265a = i;
            this.f29266b = f;
            m31748c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo26121a(int i, int i2) {
            if (i != this.f29274j || i2 != this.f29275k) {
                this.f29274j = i;
                this.f29275k = i2;
                C0991u.m4212e(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo26125b(final int i, int i2) {
            boolean z;
            final int i3;
            final int i4;
            int i5;
            if (this.f29276l != null && this.f29276l.isRunning()) {
                this.f29276l.cancel();
            }
            if (C0991u.m4220h(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m31748c();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f29265a) <= 1) {
                i4 = this.f29274j;
                i3 = this.f29275k;
            } else {
                int c = DmtTabLayout.this.mo26069c(24);
                if (i < this.f29265a) {
                    if (!z) {
                        i5 = c + right;
                    }
                    i4 = left - c;
                    i3 = i4;
                } else {
                    if (z) {
                        i5 = c + right;
                    }
                    i4 = left - c;
                    i3 = i4;
                }
                i4 = i5;
                i3 = i4;
            }
            if (!(i4 == left && i3 == right)) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f29276l = valueAnimator;
                valueAnimator.setInterpolator(DmtTabLayout.f29204a);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                C108231 r3 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C10822e.this.mo26121a(C10822e.m31747a(i4, left, animatedFraction), C10822e.m31747a(i3, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C10822e.this.f29265a = i;
                        C10822e.this.f29266b = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            boolean z;
            boolean z2;
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                int childCount = getChildCount();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < childCount; i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt.getVisibility() == 0) {
                        i4 = Math.max(i4, childAt.getMeasuredWidth());
                        this.f29278n = Math.min(this.f29278n, childAt.getMeasuredWidth());
                    }
                }
                if (DmtTabLayout.this.f29231n == 1 && DmtTabLayout.this.f29230m == 1) {
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (DmtTabLayout.this.mo26069c(16) * 2)) {
                            z2 = false;
                            while (i3 < childCount) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                                if (layoutParams.width != i4 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i4;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                                i3++;
                            }
                        } else {
                            DmtTabLayout.this.f29230m = 0;
                            DmtTabLayout.this.mo26061a(false);
                            z2 = true;
                        }
                        if (z2) {
                            super.onMeasure(i, i2);
                        }
                    }
                } else if (DmtTabLayout.this.f29231n == 0 && DmtTabLayout.this.f29233p && DmtTabLayout.this.f29237t == getResources().getConfiguration().orientation && i4 > 0) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt2 = getChildAt(i7);
                        if (childAt2.getVisibility() != 8) {
                            i6 += childAt2.getMeasuredWidth();
                        }
                    }
                    if (i6 > 0) {
                        int measuredWidth = (DmtTabLayout.this.getMeasuredWidth() - DmtTabLayout.this.f29219b.getPaddingLeft()) - DmtTabLayout.this.f29219b.getPaddingRight();
                        if (i6 >= measuredWidth) {
                            z = false;
                        } else if (i4 * childCount < measuredWidth) {
                            z = false;
                            for (int i8 = 0; i8 < childCount; i8++) {
                                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i8).getLayoutParams();
                                if (layoutParams2.width != 0 || layoutParams2.weight != 1.0f) {
                                    layoutParams2.width = 0;
                                    layoutParams2.weight = 1.0f;
                                    z = true;
                                }
                            }
                        } else {
                            int i9 = (measuredWidth - i6) / (childCount * 2);
                            z = false;
                            while (i3 < childCount) {
                                if (getChildAt(i3).getVisibility() != 8) {
                                    LayoutParams layoutParams3 = (LayoutParams) getChildAt(i3).getLayoutParams();
                                    layoutParams3.leftMargin = i9;
                                    layoutParams3.rightMargin = i9;
                                    z = true;
                                }
                                i3++;
                            }
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        static int m31747a(int i, int i2, float f) {
            return i + Math.round(f * ((float) (i2 - i)));
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f29276l == null || !this.f29276l.isRunning()) {
                m31748c();
                return;
            }
            this.f29276l.cancel();
            mo26125b(this.f29265a, Math.round((1.0f - this.f29276l.getAnimatedFraction()) * ((float) this.f29276l.getDuration())));
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$f */
    public static final class C10825f {

        /* renamed from: a */
        public Object f29287a;

        /* renamed from: b */
        public Drawable f29288b;

        /* renamed from: c */
        public CharSequence f29289c;

        /* renamed from: d */
        public CharSequence f29290d;

        /* renamed from: e */
        public int f29291e = -1;

        /* renamed from: f */
        public View f29292f;

        /* renamed from: g */
        DmtTabLayout f29293g;

        /* renamed from: h */
        public C10826g f29294h;

        C10825f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo26141c() {
            if (this.f29294h != null) {
                this.f29294h.mo26145b();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo26142d() {
            this.f29293g = null;
            this.f29294h = null;
            this.f29287a = null;
            this.f29288b = null;
            this.f29289c = null;
            this.f29290d = null;
            this.f29291e = -1;
            this.f29292f = null;
        }

        /* renamed from: b */
        public final boolean mo26140b() {
            if (this.f29293g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (this.f29293g.getSelectedTabPosition() == this.f29291e) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        public final void mo26137a() {
            if (this.f29293g != null) {
                this.f29293g.mo26068b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: a */
        public final C10825f mo26136a(Object obj) {
            this.f29287a = obj;
            return this;
        }

        /* renamed from: a */
        private C10825f m31757a(View view) {
            this.f29292f = view;
            mo26141c();
            return this;
        }

        /* renamed from: b */
        public final C10825f mo26139b(CharSequence charSequence) {
            this.f29290d = charSequence;
            mo26141c();
            return this;
        }

        /* renamed from: a */
        public final C10825f mo26134a(Drawable drawable) {
            this.f29288b = drawable;
            mo26141c();
            return this;
        }

        /* renamed from: a */
        public final C10825f mo26133a(int i) {
            return m31757a(C10746a.m31338a(this.f29294h.getContext(), i, this.f29294h, false));
        }

        /* renamed from: b */
        public final C10825f mo26138b(int i) {
            if (this.f29293g != null) {
                return mo26135a(this.f29293g.getResources().getText(i));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: a */
        public final C10825f mo26135a(CharSequence charSequence) {
            this.f29289c = charSequence;
            mo26141c();
            return this;
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$g */
    public class C10826g extends LinearLayout {

        /* renamed from: b */
        private C10825f f29296b;

        /* renamed from: c */
        private TextView f29297c;

        /* renamed from: d */
        private ImageView f29298d;

        /* renamed from: e */
        private View f29299e;

        /* renamed from: f */
        private TextView f29300f;

        /* renamed from: g */
        private ImageView f29301g;

        /* renamed from: h */
        private int f29302h = 2;

        public final C10825f getTab() {
            return this.f29296b;
        }

        public final TextView getTextView() {
            return this.f29297c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo26143a() {
            setTab(null);
            setSelected(false);
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f29296b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (DmtTabLayout.this.f29236s != null) {
                DmtTabLayout.this.f29236s.mo26115a(this.f29296b);
            } else {
                this.f29296b.mo26137a();
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo26145b() {
            View view;
            C10825f fVar = this.f29296b;
            if (fVar != null) {
                view = fVar.f29292f;
            } else {
                view = null;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(view);
                    }
                    addView(view);
                }
                this.f29299e = view;
                if (this.f29297c != null) {
                    this.f29297c.setVisibility(8);
                }
                if (this.f29298d != null) {
                    this.f29298d.setVisibility(8);
                    this.f29298d.setImageDrawable(null);
                }
                this.f29300f = (TextView) view.findViewById(16908308);
                if (this.f29300f != null) {
                    this.f29302h = C1056n.m4563a(this.f29300f);
                }
                this.f29301g = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f29299e != null) {
                    removeView(this.f29299e);
                    this.f29299e = null;
                }
                this.f29300f = null;
                this.f29301g = null;
            }
            boolean z = false;
            if (this.f29299e == null) {
                if (this.f29298d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.jd, this, false);
                    addView(imageView, 0);
                    this.f29298d = imageView;
                }
                if (this.f29297c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.je, this, false);
                    addView(textView);
                    this.f29297c = textView;
                    this.f29302h = C1056n.m4563a(this.f29297c);
                }
                C1056n.m4567a(this.f29297c, DmtTabLayout.this.f29224g);
                if (DmtTabLayout.this.f29225h != null) {
                    this.f29297c.setTextColor(DmtTabLayout.this.f29225h);
                }
                m31769a(this.f29297c, this.f29298d);
            } else if (!(this.f29300f == null && this.f29301g == null)) {
                m31769a(this.f29300f, this.f29301g);
            }
            if (fVar != null && fVar.mo26140b()) {
                z = true;
            }
            setSelected(z);
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C1067a.class.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C1067a.class.getName());
        }

        /* access modifiers changed from: 0000 */
        public final void setTab(C10825f fVar) {
            if (fVar != this.f29296b) {
                this.f29296b = fVar;
                mo26145b();
            }
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z && VERSION.SDK_INT < 16) {
                sendAccessibilityEvent(4);
            }
            if (this.f29297c != null) {
                this.f29297c.setSelected(z);
            }
            if (this.f29298d != null) {
                this.f29298d.setSelected(z);
            }
            if (this.f29299e != null) {
                this.f29299e.setSelected(z);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo26144a(C10825f fVar, boolean z) {
            if (fVar != this.f29296b) {
                this.f29296b = fVar;
            }
        }

        public C10826g(Context context) {
            super(context);
            if (DmtTabLayout.this.f29228k != 0) {
                C0991u.m4185a((View) this, C1065a.m4641b(context, DmtTabLayout.this.f29228k));
            }
            C0991u.m4202b(this, DmtTabLayout.this.f29220c, DmtTabLayout.this.f29221d, DmtTabLayout.this.f29222e, DmtTabLayout.this.f29223f);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0991u.m4189a((View) this, C0987q.m4161a(getContext(), 1002));
        }

        /* renamed from: a */
        private void m31769a(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            CharSequence charSequence3 = null;
            if (this.f29296b != null) {
                drawable = this.f29296b.f29288b;
            } else {
                drawable = null;
            }
            if (this.f29296b != null) {
                charSequence = this.f29296b.f29289c;
            } else {
                charSequence = null;
            }
            if (this.f29296b != null) {
                charSequence2 = this.f29296b.f29290d;
            } else {
                charSequence2 = null;
            }
            int i = 0;
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
                imageView.setContentDescription(charSequence2);
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (z) {
                    textView.setText(charSequence);
                    textView.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText(null);
                }
                textView.setContentDescription(charSequence2);
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                if (z && imageView.getVisibility() == 0) {
                    i = DmtTabLayout.this.mo26069c(8);
                }
                if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    imageView.requestLayout();
                }
            }
            if (!z) {
                charSequence3 = charSequence2;
            }
            C1366aw.m6763a(this, charSequence3);
        }

        public final void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = DmtTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(DmtTabLayout.this.f29229l, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f29297c != null) {
                getResources();
                float f = DmtTabLayout.this.f29226i;
                int i3 = this.f29302h;
                boolean z = true;
                if (this.f29298d != null && this.f29298d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.f29297c != null && this.f29297c.getLineCount() > 1) {
                    f = DmtTabLayout.this.f29227j;
                }
                float textSize = this.f29297c.getTextSize();
                int lineCount = this.f29297c.getLineCount();
                int a = C1056n.m4563a(this.f29297c);
                if (f != textSize || (a >= 0 && i3 != a)) {
                    if (DmtTabLayout.this.f29231n == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f29297c.getLayout();
                        if (layout == null || m31768a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f29297c.setTextSize(0, f);
                        this.f29297c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: a */
        private static float m31768a(Layout layout, int i, float f) {
            return layout.getLineWidth(0) * (f / layout.getPaint().getTextSize());
        }
    }

    /* renamed from: com.bytedance.ies.dmt.ui.widget.tablayout.DmtTabLayout$h */
    public static class C10827h implements C10820c {

        /* renamed from: a */
        private final ViewPager f29303a;

        public C10827h(ViewPager viewPager) {
            this.f29303a = viewPager;
        }

        /* renamed from: b */
        public final void mo26116b(C10825f fVar) {
            this.f29303a.setCurrentItem(fVar.f29291e);
        }
    }

    public int getTabGravity() {
        return this.f29230m;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f29229l;
    }

    public int getTabMode() {
        return this.f29231n;
    }

    public ColorStateList getTabTextColors() {
        return this.f29225h;
    }

    /* renamed from: a */
    public final void mo26056a(int i, int i2, int i3, int i4) {
        this.f29219b.setPadding(i, 0, i3, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26055a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f29219b.getChildCount()) {
            if (z2) {
                this.f29219b.mo26120a(i, f);
            }
            if (this.f29211F != null && this.f29211F.isRunning()) {
                this.f29211F.cancel();
            }
            scrollTo(m31703a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public final void mo26059a(C10825f fVar) {
        m31714b(fVar, this.f29238v.isEmpty());
    }

    /* renamed from: a */
    private void m31712a(C10828a aVar) {
        C10825f a = mo26053a(0);
        if (aVar.f29304a != null) {
            a.mo26135a(aVar.f29304a);
        }
        if (aVar.f29305b != null) {
            a.mo26134a(aVar.f29305b);
        }
        if (aVar.f29306c != 0) {
            a.mo26133a(aVar.f29306c);
        }
        if (!TextUtils.isEmpty(aVar.getContentDescription())) {
            a.mo26139b(aVar.getContentDescription());
        }
        mo26059a(a);
    }

    /* renamed from: a */
    public final void mo26058a(C10820c cVar) {
        if (!this.f29209D.contains(cVar)) {
            this.f29209D.add(cVar);
        }
    }

    /* renamed from: a */
    public final void mo26054a() {
        this.f29209D.clear();
    }

    /* renamed from: a */
    public final C10825f mo26053a(int i) {
        C10825f fVar = (C10825f) f29205u.acquire();
        if (fVar == null) {
            fVar = new C10825f();
        }
        fVar.f29293g = this;
        fVar.f29294h = m31723f();
        if (i > 0) {
            fVar.f29294h.mo26144a(fVar, false);
            fVar.mo26133a(i);
        } else {
            fVar.f29294h.setTab(fVar);
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26057a(PagerAdapter pagerAdapter, boolean z) {
        if (!(this.f29212G == null || this.f29213H == null)) {
            this.f29212G.unregisterDataSetObserver(this.f29213H);
        }
        this.f29212G = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f29213H == null) {
                this.f29213H = new C10821d();
            }
            pagerAdapter.registerDataSetObserver(this.f29213H);
        }
        mo26067b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26060a(C10825f fVar, boolean z) {
        C10825f fVar2 = this.f29239w;
        if (fVar2 != fVar) {
            int i = fVar != null ? fVar.f29291e : -1;
            if (z) {
                if ((fVar2 == null || fVar2.f29291e == -1) && i != -1) {
                    m31705a(i, 0.0f, true);
                } else {
                    m31721e(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                m31722e(fVar2);
            }
            this.f29239w = fVar;
            if (fVar != null) {
                m31719d(fVar);
            }
        } else if (fVar2 != null) {
            m31724f(fVar);
            m31721e(fVar.f29291e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo26061a(boolean z) {
        for (int i = 0; i < this.f29219b.getChildCount(); i++) {
            View childAt = this.f29219b.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m31709a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private float getScrollPosition() {
        return this.f29219b.mo26123b();
    }

    public int getTabCount() {
        return this.f29238v.size();
    }

    public int getTabStripLeftPadding() {
        return this.f29219b.getPaddingLeft();
    }

    public int getTabStripRightPadding() {
        return this.f29219b.getPaddingRight();
    }

    /* renamed from: g */
    private LayoutParams m31725g() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m31709a(layoutParams);
        return layoutParams;
    }

    public int getSelectedTabPosition() {
        if (this.f29239w != null) {
            return this.f29239w.f29291e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f29215J) {
            setupWithViewPager(null);
            this.f29215J = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m31720e() {
        int size = this.f29238v.size();
        for (int i = 0; i < size; i++) {
            ((C10825f) this.f29238v.get(i)).mo26141c();
        }
    }

    private int getTabMinWidth() {
        if (this.f29241y != -1) {
            return this.f29241y;
        }
        if (this.f29231n == 0) {
            return this.f29206A;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f29219b.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f29234q == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m31707a((ViewPager) parent, true, true);
            }
        }
    }

    /* renamed from: d */
    private void m31717d() {
        for (int childCount = this.f29219b.getChildCount() - 1; childCount >= 0; childCount--) {
            m31718d(childCount);
        }
        Iterator it = this.f29238v.iterator();
        while (it.hasNext()) {
            C10825f fVar = (C10825f) it.next();
            it.remove();
            fVar.mo26142d();
            f29205u.release(fVar);
        }
        this.f29239w = null;
    }

    /* renamed from: f */
    private C10826g m31723f() {
        C10826g gVar;
        if (this.f29218M != null) {
            gVar = (C10826g) this.f29218M.acquire();
        } else {
            gVar = null;
        }
        if (gVar == null) {
            gVar = new C10826g(getContext());
        }
        gVar.setFocusable(true);
        gVar.setMinimumWidth(getTabMinWidth());
        return gVar;
    }

    private int getDefaultHeight() {
        int size = this.f29238v.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C10825f fVar = (C10825f) this.f29238v.get(i);
            if (fVar != null && fVar.f29288b != null && !TextUtils.isEmpty(fVar.f29289c)) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            return 72;
        }
        return 48;
    }

    /* renamed from: h */
    private void m31726h() {
        if (this.f29211F == null) {
            this.f29211F = new ValueAnimator();
            this.f29211F.setInterpolator(f29204a);
            this.f29211F.setDuration(200);
            this.f29211F.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DmtTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    /* renamed from: i */
    private void m31727i() {
        int i;
        if (this.f29231n == 0) {
            i = Math.max(0, this.f29207B - this.f29220c);
        } else {
            i = 0;
        }
        C0991u.m4202b(this.f29219b, i, 0, 0, 0);
        switch (this.f29231n) {
            case 0:
                this.f29219b.setGravity(8388611);
                break;
            case 1:
                this.f29219b.setGravity(1);
                break;
        }
        mo26061a(true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26067b() {
        m31717d();
        if (this.f29212G != null) {
            int count = this.f29212G.getCount();
            for (int i = 0; i < count; i++) {
                m31714b(mo26053a(this.f29232o).mo26135a(this.f29212G.getPageTitle(i)), false);
            }
            if (this.f29234q != null && count > 0) {
                int currentItem = this.f29234q.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    mo26068b(mo26066b(currentItem));
                }
            }
        }
    }

    public void addView(View view) {
        m31708a(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.f29233p = z;
    }

    public void setContentInsetStart(int i) {
        this.f29207B = i;
    }

    public void setCustomTabViewResId(int i) {
        this.f29232o = i;
    }

    public void setOnTabClickListener(C10819b bVar) {
        this.f29236s = bVar;
    }

    public void setTabBackgroundResId(int i) {
        this.f29228k = i;
    }

    public void setTabMaxWidth(int i) {
        this.f29242z = i;
    }

    public void setTabMinWidth(int i) {
        this.f29241y = i;
    }

    public void setTabPaddingBottom(int i) {
        this.f29223f = i;
    }

    public void setTabPaddingEnd(int i) {
        this.f29222e = i;
    }

    public void setTabPaddingStart(int i) {
        this.f29220c = i;
    }

    public void setTabPaddingTop(int i) {
        this.f29221d = i;
    }

    public void setTabTextAppearance(int i) {
        this.f29224g = i;
    }

    public DmtTabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m31713b(C10820c cVar) {
        this.f29209D.remove(cVar);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        this.f29219b.mo26126c(i);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f29219b.mo26119a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f29219b.mo26124b(i);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo26057a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m31706a(viewPager, true);
    }

    /* renamed from: c */
    private void m31715c(C10825f fVar) {
        this.f29219b.addView(fVar.f29294h, fVar.f29291e, m31725g());
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m31726h();
        this.f29211F.addListener(animatorListener);
    }

    public void setTabGravity(int i) {
        if (this.f29230m != i) {
            this.f29230m = i;
            m31727i();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f29231n) {
            this.f29231n = i;
            m31727i();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f29225h != colorStateList) {
            this.f29225h = colorStateList;
            m31720e();
        }
    }

    /* renamed from: d */
    private void m31718d(int i) {
        C10826g gVar = (C10826g) this.f29219b.getChildAt(i);
        this.f29219b.removeViewAt(i);
        if (gVar != null) {
            gVar.mo26143a();
            this.f29218M.release(gVar);
        }
        requestLayout();
    }

    /* renamed from: f */
    private void m31724f(C10825f fVar) {
        for (int size = this.f29209D.size() - 1; size >= 0; size--) {
            this.f29209D.get(size);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f29219b.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f29219b.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    /* renamed from: b */
    public final C10825f mo26066b(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C10825f) this.f29238v.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo26069c(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public void setOnTabSelectedListener(C10820c cVar) {
        if (this.f29208C != null) {
            m31713b(this.f29208C);
        }
        this.f29208C = cVar;
        if (cVar != null) {
            mo26058a(cVar);
        }
    }

    /* renamed from: a */
    private void m31708a(View view) {
        if (view instanceof C10828a) {
            m31712a((C10828a) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: e */
    private void m31722e(C10825f fVar) {
        for (int size = this.f29209D.size() - 1; size >= 0; size--) {
            this.f29209D.get(size);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo26068b(C10825f fVar) {
        mo26060a(fVar, true);
    }

    public void setTabMargin(int i) {
        this.f29240x = mo26069c(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.f29219b.getChildAt(i2);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = mo26069c(i);
            marginLayoutParams.rightMargin = mo26069c(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: d */
    private void m31719d(C10825f fVar) {
        for (int size = this.f29209D.size() - 1; size >= 0; size--) {
            ((C10820c) this.f29209D.get(size)).mo26116b(fVar);
        }
    }

    /* renamed from: e */
    private void m31721e(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C0991u.m4167D(this) || this.f29219b.mo26122a()) {
                m31705a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a = m31703a(i, 0.0f);
            if (scrollX != a) {
                m31726h();
                this.f29211F.setIntValues(new int[]{scrollX, a});
                this.f29211F.start();
            }
            this.f29219b.mo26125b(i, C34943c.f91127w);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTabMode(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = 66669991(0x3f94da7, float:1.4652733E-36)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 97445748(0x5cee774, float:1.945717E-35)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "fixed"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "scrollable"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = -1
        L_0x0026:
            switch(r5) {
                case 0: goto L_0x0034;
                case 1: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x003e
        L_0x002a:
            int r5 = r4.f29231n
            if (r5 == 0) goto L_0x003e
            r4.f29231n = r2
            r4.m31727i()
            goto L_0x003e
        L_0x0034:
            int r5 = r4.f29231n
            if (r5 == r3) goto L_0x003e
            r4.f29231n = r3
            r4.m31727i()
            return
        L_0x003e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.setTabMode(java.lang.String):void");
    }

    /* renamed from: a */
    private void m31709a(LayoutParams layoutParams) {
        if (this.f29231n == 1 && this.f29230m == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        if (this.f29240x != 0) {
            layoutParams.leftMargin = this.f29240x;
            layoutParams.rightMargin = this.f29240x;
        }
    }

    public void addView(View view, int i) {
        m31708a(view);
    }

    public DmtTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m31706a(ViewPager viewPager, boolean z) {
        m31707a(viewPager, true, false);
    }

    /* renamed from: b */
    private void m31714b(C10825f fVar, boolean z) {
        m31711a(fVar, this.f29238v.size(), z);
    }

    /* renamed from: a */
    private static ColorStateList m31704a(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m31708a(view);
    }

    /* renamed from: a */
    private int m31703a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f29231n != 0) {
            return 0;
        }
        View childAt = this.f29219b.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f29219b.getChildCount()) {
            view = this.f29219b.getChildAt(i4);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i3 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (i2 + i3 + (this.f29240x * 4))) * 0.5f * f);
        if (C0991u.m4220h(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r1.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0069, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        if (r1.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.getDefaultHeight()
            int r0 = r5.mo26069c(r0)
            int r1 = r5.getPaddingTop()
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L_0x0024
            if (r1 == 0) goto L_0x001f
            goto L_0x0030
        L_0x001f:
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L_0x0030
        L_0x0024:
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            int r7 = java.lang.Math.min(r0, r7)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
        L_0x0030:
            int r0 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r6)
            if (r1 == 0) goto L_0x004a
            int r1 = r5.f29242z
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.f29242z
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.mo26069c(r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.f29229l = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.f29231n
            switch(r2) {
                case 0: goto L_0x006b;
                case 1: goto L_0x005f;
                default: goto L_0x005e;
            }
        L_0x005e:
            goto L_0x0076
        L_0x005f:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 == r4) goto L_0x0076
        L_0x0069:
            r6 = 1
            goto L_0x0076
        L_0x006b:
            int r2 = r1.getMeasuredWidth()
            int r4 = r5.getMeasuredWidth()
            if (r2 >= r4) goto L_0x0076
            goto L_0x0069
        L_0x0076:
            if (r6 == 0) goto L_0x0096
            int r6 = r5.getPaddingTop()
            int r0 = r5.getPaddingBottom()
            int r6 = r6 + r0
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            int r0 = r0.height
            int r6 = getChildMeasureSpec(r7, r6, r0)
            int r7 = r5.getMeasuredWidth()
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            r1.measure(r7, r6)
        L_0x0096:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m31710a(C10825f fVar, int i) {
        fVar.f29291e = i;
        this.f29238v.add(i, fVar);
        int size = this.f29238v.size();
        while (true) {
            i++;
            if (i < size) {
                ((C10825f) this.f29238v.get(i)).f29291e = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m31705a(int i, float f, boolean z) {
        mo26055a(i, 0.0f, true, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m31708a(view);
    }

    /* renamed from: a */
    private void m31707a(ViewPager viewPager, boolean z, boolean z2) {
        if (this.f29234q != null) {
            if (this.f29235r != null) {
                this.f29234q.removeOnPageChangeListener(this.f29235r);
            }
            if (this.f29214I != null) {
                this.f29234q.removeOnAdapterChangeListener(this.f29214I);
            }
        }
        if (this.f29210E != null) {
            m31713b(this.f29210E);
            this.f29210E = null;
        }
        if (viewPager != null) {
            this.f29234q = viewPager;
            if (this.f29235r == null) {
                this.f29235r = new TabLayoutOnPageChangeListener(this);
            }
            this.f29235r.mo26109a();
            viewPager.addOnPageChangeListener(this.f29235r);
            this.f29210E = new C10827h(viewPager);
            mo26058a(this.f29210E);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo26057a(adapter, z);
            }
            if (this.f29214I == null) {
                this.f29214I = new C10818a();
            }
            this.f29214I.f29262a = z;
            viewPager.addOnAdapterChangeListener(this.f29214I);
            m31705a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f29234q = null;
            mo26057a((PagerAdapter) null, false);
        }
        this.f29215J = z2;
    }

    /* JADX INFO: finally extract failed */
    public DmtTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29238v = new ArrayList<>();
        this.f29229l = Integer.MAX_VALUE;
        this.f29209D = new ArrayList<>();
        this.f29218M = new SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        this.f29219b = new C10822e(context);
        super.addView(this.f29219b, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i, R.style.qg);
        this.f29219b.mo26124b(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        this.f29219b.mo26119a(obtainStyledAttributes.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f29220c = dimensionPixelSize;
        this.f29221d = dimensionPixelSize;
        this.f29222e = dimensionPixelSize;
        this.f29223f = dimensionPixelSize;
        this.f29220c = obtainStyledAttributes.getDimensionPixelSize(18, this.f29220c);
        this.f29221d = obtainStyledAttributes.getDimensionPixelSize(19, this.f29221d);
        this.f29222e = obtainStyledAttributes.getDimensionPixelSize(17, this.f29222e);
        this.f29223f = obtainStyledAttributes.getDimensionPixelSize(16, this.f29223f);
        this.f29224g = obtainStyledAttributes.getResourceId(22, R.style.l1);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f29224g, android.support.p029v7.appcompat.R$styleable.TextAppearance);
        try {
            this.f29226i = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f29225h = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(23)) {
                this.f29225h = obtainStyledAttributes.getColorStateList(23);
            }
            if (obtainStyledAttributes.hasValue(21)) {
                this.f29225h = m31704a(this.f29225h.getDefaultColor(), obtainStyledAttributes.getColor(21, 0));
            }
            this.f29241y = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f29242z = obtainStyledAttributes.getDimensionPixelSize(12, -1);
            this.f29228k = obtainStyledAttributes.getResourceId(0, 0);
            this.f29207B = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f29231n = obtainStyledAttributes.getInt(14, 1);
            this.f29230m = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f29227j = (float) resources.getDimensionPixelSize(R.dimen.fz);
            this.f29206A = resources.getDimensionPixelSize(R.dimen.fx);
            this.f29216K = C9738o.m28708b(getContext(), 1.5f);
            this.f29217L = C9738o.m28708b(getContext(), 1.5f);
            this.f29237t = getResources().getConfiguration().orientation;
            m31727i();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private void m31711a(C10825f fVar, int i, boolean z) {
        if (fVar.f29293g == this) {
            m31710a(fVar, i);
            m31715c(fVar);
            if (z) {
                fVar.mo26137a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    /* access modifiers changed from: protected */
    public boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 80, i8, z);
    }
}
