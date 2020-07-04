package com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout;

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
import android.support.p022v4.widget.C1056n;
import android.support.p029v7.app.ActionBar.C1067a;
import android.support.p029v7.p030a.p031a.C1065a;
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
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.tools.services.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@C0931a
/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout */
public class TabLayout extends HorizontalScrollView {

    /* renamed from: t */
    private static final C0887a<C41011f> f106614t = new SynchronizedPool(16);

    /* renamed from: A */
    private int f106615A;

    /* renamed from: B */
    private C41006c f106616B;

    /* renamed from: C */
    private final ArrayList<C41006c> f106617C;

    /* renamed from: D */
    private C41006c f106618D;

    /* renamed from: E */
    private ValueAnimator f106619E;

    /* renamed from: F */
    private PagerAdapter f106620F;

    /* renamed from: G */
    private DataSetObserver f106621G;

    /* renamed from: H */
    private C41004a f106622H;

    /* renamed from: I */
    private boolean f106623I;

    /* renamed from: J */
    private float f106624J;

    /* renamed from: K */
    private float f106625K;

    /* renamed from: L */
    private boolean f106626L;

    /* renamed from: M */
    private int f106627M;

    /* renamed from: N */
    private boolean f106628N;

    /* renamed from: O */
    private final C0887a<C41012g> f106629O;

    /* renamed from: a */
    public C41008e f106630a;

    /* renamed from: b */
    int f106631b;

    /* renamed from: c */
    int f106632c;

    /* renamed from: d */
    int f106633d;

    /* renamed from: e */
    int f106634e;

    /* renamed from: f */
    int f106635f;

    /* renamed from: g */
    ColorStateList f106636g;

    /* renamed from: h */
    float f106637h;

    /* renamed from: i */
    float f106638i;

    /* renamed from: j */
    final int f106639j;

    /* renamed from: k */
    int f106640k;

    /* renamed from: l */
    int f106641l;

    /* renamed from: m */
    int f106642m;

    /* renamed from: n */
    boolean f106643n;

    /* renamed from: o */
    ViewPager f106644o;

    /* renamed from: p */
    TabLayoutOnPageChangeListener f106645p;

    /* renamed from: q */
    public boolean f106646q;

    /* renamed from: r */
    public C41005b f106647r;

    /* renamed from: s */
    public int f106648s;

    /* renamed from: u */
    private final ArrayList<C41011f> f106649u;

    /* renamed from: v */
    private C41011f f106650v;

    /* renamed from: w */
    private int f106651w;

    /* renamed from: x */
    private final int f106652x;

    /* renamed from: y */
    private final int f106653y;

    /* renamed from: z */
    private final int f106654z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$TabLayoutOnPageChangeListener */
    public static class TabLayoutOnPageChangeListener implements C0935e {

        /* renamed from: a */
        private final WeakReference<TabLayout> f106656a;

        /* renamed from: b */
        private int f106657b;

        /* renamed from: c */
        private int f106658c;

        /* renamed from: d */
        private int f106659d;

        /* renamed from: e */
        private int f106660e;

        /* renamed from: f */
        private ArgbEvaluator f106661f = new ArgbEvaluator();

        /* renamed from: g */
        private AccelerateInterpolator f106662g = new AccelerateInterpolator();

        /* renamed from: h */
        private DecelerateInterpolator f106663h = new DecelerateInterpolator(1.6f);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo101378a() {
            this.f106658c = 0;
            this.f106657b = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f106657b = this.f106658c;
            this.f106658c = i;
        }

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f106656a = new WeakReference<>(tabLayout);
            this.f106660e = tabLayout.getTabTextColors().getColorForState(TabLayout.SELECTED_STATE_SET, 0);
            this.f106659d = tabLayout.getTabTextColors().getDefaultColor();
        }

        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f106656a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                if (this.f106658c == 0 || (this.f106658c == 2 && this.f106657b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo101346b(tabLayout.mo101330a(i), z);
            }
        }

        /* renamed from: a */
        private static void m131035a(ImageView imageView, TextView textView, int i) {
            if (imageView != null && textView != null) {
                textView.setTextColor(i);
                imageView.setImageAlpha(Color.alpha(i));
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            TabLayout tabLayout = (TabLayout) this.f106656a.get();
            if (tabLayout != null) {
                if (this.f106658c != 2 || this.f106657b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f106658c == 2 && this.f106657b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                tabLayout.mo101332a(i, f, z, z2);
                if (this.f106658c == 2 && this.f106657b == 0) {
                    tabLayout.f106630a.f106681e = false;
                } else {
                    tabLayout.f106630a.f106681e = true;
                    View childAt = tabLayout.f106630a.getChildAt(tabLayout.f106630a.f106677a);
                    View childAt2 = tabLayout.f106630a.getChildAt(tabLayout.f106630a.f106677a + 1);
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
                            m131035a((ImageView) findViewById.findViewById(R.id.dfk), (TextView) findViewById.findViewById(R.id.dfm), ((Integer) this.f106661f.evaluate(f, Integer.valueOf(this.f106660e), Integer.valueOf(this.f106659d))).intValue());
                            m131035a(imageView, textView, ((Integer) this.f106661f.evaluate(f, Integer.valueOf(this.f106659d), Integer.valueOf(this.f106660e))).intValue());
                            tabLayout.f106630a.f106679c = left + ((left2 - left) * this.f106662g.getInterpolation(f));
                            tabLayout.f106630a.f106680d = width + ((width2 - width) * this.f106662g.getInterpolation(f));
                        }
                    }
                }
                C0991u.m4212e(tabLayout.f106630a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$TabLayoutOnPageChangeListenerIndependent */
    public static class TabLayoutOnPageChangeListenerIndependent implements C0935e {

        /* renamed from: a */
        final boolean f106664a;

        /* renamed from: b */
        private final WeakReference<TabLayout> f106665b;

        /* renamed from: c */
        private int f106666c;

        /* renamed from: d */
        private int f106667d;

        /* renamed from: e */
        private int f106668e;

        public void onPageScrollStateChanged(int i) {
            this.f106666c = this.f106667d;
            this.f106667d = i;
        }

        public TabLayoutOnPageChangeListenerIndependent(TabLayout tabLayout) {
            this.f106665b = new WeakReference<>(tabLayout);
            boolean z = true;
            if (C0991u.m4220h(tabLayout) != 1) {
                z = false;
            }
            this.f106664a = z;
        }

        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f106665b.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                if (this.f106667d == 0 || (this.f106667d == 2 && this.f106666c == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo101346b(tabLayout.mo101330a(i), z);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            TabLayout tabLayout = (TabLayout) this.f106665b.get();
            if (!(this.f106668e == i || tabLayout == null)) {
                if (this.f106667d != 2 || this.f106666c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f106667d == 2 && this.f106666c == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int i3 = i;
                C41016c cVar = new C41016c(this, this.f106668e, i3, tabLayout, z, z2);
                duration.addUpdateListener(cVar);
                this.f106668e = i;
                final TabLayout tabLayout2 = tabLayout;
                final boolean z3 = z;
                final boolean z4 = z2;
                C410031 r0 = new AnimatorListener() {
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        tabLayout2.mo101332a(i3, 0.0f, z3, z4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        tabLayout2.mo101332a(i3, 0.0f, z3, z4);
                    }
                };
                duration.addListener(r0);
                duration.start();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo101379a(int i, int i2, TabLayout tabLayout, boolean z, boolean z2, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (i >= i2 || this.f106664a) {
                floatValue = 1.0f - floatValue;
            } else {
                i2--;
            }
            tabLayout.mo101332a(i2, floatValue, z, z2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$a */
    class C41004a implements C0934d {

        /* renamed from: a */
        public boolean f106674a;

        C41004a() {
        }

        /* renamed from: a */
        public final void mo1668a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabLayout.this.f106644o == viewPager) {
                TabLayout.this.mo101334a(pagerAdapter2, this.f106674a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$b */
    public interface C41005b {
        /* renamed from: a */
        void mo74815a(C41011f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$c */
    public interface C41006c {
        /* renamed from: a */
        void mo74743a(C41011f fVar);

        /* renamed from: b */
        void mo74744b(C41011f fVar);

        /* renamed from: c */
        void mo74745c(C41011f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$d */
    class C41007d extends DataSetObserver {
        public final void onChanged() {
            TabLayout.this.mo101347c();
        }

        public final void onInvalidated() {
            TabLayout.this.mo101347c();
        }

        C41007d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$e */
    class C41008e extends LinearLayout {

        /* renamed from: a */
        int f106677a = -1;

        /* renamed from: b */
        float f106678b;

        /* renamed from: c */
        public float f106679c;

        /* renamed from: d */
        public float f106680d;

        /* renamed from: e */
        public boolean f106681e;

        /* renamed from: g */
        private int f106683g;

        /* renamed from: h */
        private final Paint f106684h;

        /* renamed from: i */
        private int f106685i = -1;

        /* renamed from: j */
        private int f106686j = -1;

        /* renamed from: k */
        private int f106687k = -1;

        /* renamed from: l */
        private ValueAnimator f106688l;

        /* renamed from: m */
        private int f106689m = TabLayout.this.mo101343b(27);

        /* renamed from: n */
        private int f106690n = Integer.MAX_VALUE;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final float mo101390b() {
            return ((float) this.f106677a) + this.f106678b;
        }

        /* renamed from: c */
        private void m131043c() {
            int i;
            int i2;
            View childAt = getChildAt(this.f106677a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
                i2 = -1;
            } else {
                i = childAt.getLeft();
                i2 = childAt.getRight();
                if (this.f106678b > 0.0f && this.f106677a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f106677a + 1);
                    i = (int) ((this.f106678b * ((float) childAt2.getLeft())) + ((1.0f - this.f106678b) * ((float) i)));
                    i2 = (int) ((this.f106678b * ((float) childAt2.getRight())) + ((1.0f - this.f106678b) * ((float) i2)));
                }
            }
            mo101388a(i, i2);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo101389a() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (getChildAt(i).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo101391b(int i) {
            if (this.f106683g != i) {
                this.f106683g = i;
                C0991u.m4212e(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo101386a(int i) {
            if (this.f106684h.getColor() != i) {
                this.f106684h.setColor(i);
                C0991u.m4212e(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f106685i != i) {
                requestLayout();
                this.f106685i = i;
            }
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f106686j >= 0 && this.f106687k > this.f106686j && !TabLayout.this.f106646q) {
                View childAt = getChildAt(TabLayout.this.getSelectedTabPosition());
                if (childAt != null) {
                    View findViewById = childAt.findViewById(R.id.bkb);
                    if (findViewById != null) {
                        if (TabLayout.this.f106644o == null || !this.f106681e) {
                            this.f106679c = (float) (this.f106686j + (((this.f106687k - this.f106686j) - findViewById.getWidth()) / 2));
                            this.f106680d = this.f106679c + ((float) findViewById.getWidth());
                        }
                        canvas.drawRect(this.f106679c, (float) (getHeight() - this.f106683g), this.f106680d, (float) getHeight(), this.f106684h);
                        return;
                    }
                }
                canvas.drawRect((float) this.f106686j, (float) (getHeight() - this.f106683g), (float) this.f106687k, (float) getHeight(), this.f106684h);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo101388a(int i, int i2) {
            if (i != this.f106686j || i2 != this.f106687k) {
                this.f106686j = i;
                this.f106687k = i2;
                C0991u.m4212e(this);
            }
        }

        C41008e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f106684h = new Paint();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo101387a(int i, float f) {
            if (this.f106688l != null && this.f106688l.isRunning()) {
                this.f106688l.cancel();
            }
            this.f106677a = i;
            this.f106678b = f;
            m131043c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo101392b(final int i, int i2) {
            boolean z;
            final int i3;
            final int i4;
            int i5;
            if (this.f106688l != null && this.f106688l.isRunning()) {
                this.f106688l.cancel();
            }
            if (C0991u.m4220h(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m131043c();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f106677a) <= 1) {
                i4 = this.f106686j;
                i3 = this.f106687k;
            } else {
                int b = TabLayout.this.mo101343b(24);
                if (i < this.f106677a) {
                    if (!z) {
                        i5 = b + right;
                    }
                    i4 = left - b;
                    i3 = i4;
                } else {
                    if (z) {
                        i5 = b + right;
                    }
                    i4 = left - b;
                    i3 = i4;
                }
                i4 = i5;
                i3 = i4;
            }
            if (!(i4 == left && i3 == right)) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f106688l = valueAnimator;
                valueAnimator.setInterpolator(C41014a.f106716b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                C410091 r3 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C41008e.this.mo101388a(C41014a.m131066a(i4, left, animatedFraction), C41014a.m131066a(i3, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C41008e.this.f106677a = i;
                        C41008e.this.f106678b = 0.0f;
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
                        this.f106690n = Math.min(this.f106690n, childAt.getMeasuredWidth());
                    }
                }
                if (TabLayout.this.f106642m == 1 && TabLayout.this.f106641l == 1) {
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (TabLayout.this.mo101343b(16) * 2)) {
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
                            TabLayout.this.f106641l = 0;
                            TabLayout.this.mo101338a(false);
                            z2 = true;
                        }
                        if (z2) {
                            super.onMeasure(i, i2);
                        }
                    }
                } else if (TabLayout.this.f106642m == 0 && TabLayout.this.f106643n && TabLayout.this.f106648s == getResources().getConfiguration().orientation && i4 > 0) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt2 = getChildAt(i7);
                        if (childAt2.getVisibility() != 8) {
                            i6 += childAt2.getMeasuredWidth();
                        }
                    }
                    if (i6 > 0 && i6 < TabLayout.this.getMeasuredWidth()) {
                        int i8 = i4 * childCount;
                        if (i8 < TabLayout.this.getMeasuredWidth()) {
                            int measuredWidth = (TabLayout.this.getMeasuredWidth() - i8) / (childCount * 2);
                            z = false;
                            while (i3 < childCount) {
                                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i3).getLayoutParams();
                                if (layoutParams2.width != i4 || layoutParams2.weight != 0.0f || layoutParams2.leftMargin != measuredWidth || layoutParams2.rightMargin != measuredWidth) {
                                    layoutParams2.width = i4;
                                    layoutParams2.weight = 0.0f;
                                    layoutParams2.leftMargin = measuredWidth;
                                    layoutParams2.rightMargin = measuredWidth;
                                    z = true;
                                }
                                i3++;
                            }
                        } else {
                            int measuredWidth2 = (TabLayout.this.getMeasuredWidth() - i6) / (childCount * 2);
                            boolean z3 = false;
                            while (i3 < childCount) {
                                if (getChildAt(i3).getVisibility() != 8) {
                                    LayoutParams layoutParams3 = (LayoutParams) getChildAt(i3).getLayoutParams();
                                    layoutParams3.leftMargin = measuredWidth2;
                                    layoutParams3.rightMargin = measuredWidth2;
                                    z3 = true;
                                }
                                i3++;
                            }
                            z = z3;
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f106688l == null || !this.f106688l.isRunning()) {
                m131043c();
                return;
            }
            this.f106688l.cancel();
            mo101392b(this.f106677a, Math.round((1.0f - this.f106688l.getAnimatedFraction()) * ((float) this.f106688l.getDuration())));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$f */
    public static final class C41011f {

        /* renamed from: a */
        public Object f106698a;

        /* renamed from: b */
        public Drawable f106699b;

        /* renamed from: c */
        public CharSequence f106700c;

        /* renamed from: d */
        public CharSequence f106701d;

        /* renamed from: e */
        public int f106702e = -1;

        /* renamed from: f */
        public View f106703f;

        /* renamed from: g */
        TabLayout f106704g;

        /* renamed from: h */
        public C41012g f106705h;

        C41011f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo101406c() {
            if (this.f106705h != null) {
                this.f106705h.mo101409b();
            }
        }

        /* renamed from: b */
        public final boolean mo101405b() {
            if (this.f106704g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (this.f106704g.getSelectedTabPosition() == this.f106702e) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo101407d() {
            this.f106704g = null;
            this.f106705h = null;
            this.f106698a = null;
            this.f106699b = null;
            this.f106700c = null;
            this.f106701d = null;
            this.f106702e = -1;
            this.f106703f = null;
        }

        /* renamed from: a */
        public final void mo101403a() {
            if (this.f106704g != null) {
                this.f106704g.mo101345b(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: a */
        public final C41011f mo101400a(Drawable drawable) {
            this.f106699b = drawable;
            mo101406c();
            return this;
        }

        /* renamed from: b */
        public final C41011f mo101404b(CharSequence charSequence) {
            this.f106701d = charSequence;
            mo101406c();
            return this;
        }

        /* renamed from: a */
        public final C41011f mo101401a(View view) {
            this.f106703f = view;
            mo101406c();
            return this;
        }

        /* renamed from: a */
        public final C41011f mo101399a(int i) {
            return mo101401a(LayoutInflater.from(this.f106705h.getContext()).inflate(i, this.f106705h, false));
        }

        /* renamed from: a */
        public final C41011f mo101402a(CharSequence charSequence) {
            this.f106700c = charSequence;
            mo101406c();
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$g */
    public class C41012g extends LinearLayout {

        /* renamed from: b */
        private C41011f f106707b;

        /* renamed from: c */
        private TextView f106708c;

        /* renamed from: d */
        private ImageView f106709d;

        /* renamed from: e */
        private View f106710e;

        /* renamed from: f */
        private TextView f106711f;

        /* renamed from: g */
        private ImageView f106712g;

        /* renamed from: h */
        private int f106713h = 2;

        public final C41011f getTab() {
            return this.f106707b;
        }

        public final TextView getTextView() {
            return this.f106708c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo101408a() {
            setTab(null);
            setSelected(false);
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f106707b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (TabLayout.this.f106647r != null) {
                TabLayout.this.f106647r.mo74815a(this.f106707b);
            } else {
                this.f106707b.mo101403a();
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo101409b() {
            View view;
            boolean z;
            C41011f fVar = this.f106707b;
            if (fVar != null) {
                view = fVar.f106703f;
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
                this.f106710e = view;
                if (this.f106708c != null) {
                    this.f106708c.setVisibility(8);
                }
                if (this.f106709d != null) {
                    this.f106709d.setVisibility(8);
                    this.f106709d.setImageDrawable(null);
                }
                this.f106711f = (TextView) view.findViewById(16908308);
                if (this.f106711f != null) {
                    this.f106713h = C1056n.m4563a(this.f106711f);
                }
                this.f106712g = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f106710e != null) {
                    removeView(this.f106710e);
                    this.f106710e = null;
                }
                this.f106711f = null;
                this.f106712g = null;
            }
            if (fVar == null || !fVar.mo101405b()) {
                z = false;
            } else {
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
        public final void setTab(C41011f fVar) {
            if (fVar != this.f106707b) {
                this.f106707b = fVar;
                mo101409b();
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
            if (this.f106708c != null) {
                this.f106708c.setSelected(z);
            }
            if (this.f106709d != null) {
                this.f106709d.setSelected(z);
            }
            if (this.f106710e != null) {
                this.f106710e.setSelected(z);
            }
        }

        public C41012g(Context context) {
            super(context);
            if (TabLayout.this.f106639j != 0) {
                C0991u.m4185a((View) this, C1065a.m4641b(context, TabLayout.this.f106639j));
            }
            C0991u.m4202b(this, TabLayout.this.f106631b, TabLayout.this.f106632c, TabLayout.this.f106633d, TabLayout.this.f106634e);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0991u.m4189a((View) this, C0987q.m4161a(getContext(), 1002));
        }

        public final void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.f106640k, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f106708c != null) {
                getResources();
                float f = TabLayout.this.f106637h;
                int i3 = this.f106713h;
                boolean z = true;
                if (this.f106709d != null && this.f106709d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.f106708c != null && this.f106708c.getLineCount() > 1) {
                    f = TabLayout.this.f106638i;
                }
                float textSize = this.f106708c.getTextSize();
                int lineCount = this.f106708c.getLineCount();
                int a = C1056n.m4563a(this.f106708c);
                if (f != textSize || (a >= 0 && i3 != a)) {
                    if (TabLayout.this.f106642m == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f106708c.getLayout();
                        if (layout == null || m131060a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f106708c.setTextSize(0, f);
                        this.f106708c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: a */
        private static float m131060a(Layout layout, int i, float f) {
            return layout.getLineWidth(0) * (f / layout.getPaint().getTextSize());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout$h */
    public static class C41013h implements C41006c {

        /* renamed from: a */
        private final ViewPager f106714a;

        /* renamed from: b */
        public final void mo74744b(C41011f fVar) {
        }

        /* renamed from: c */
        public final void mo74745c(C41011f fVar) {
        }

        public C41013h(ViewPager viewPager) {
            this.f106714a = viewPager;
        }

        /* renamed from: a */
        public final void mo74743a(C41011f fVar) {
            this.f106714a.setCurrentItem(fVar.f106702e);
        }
    }

    public C41011f getCurSelectedTab() {
        return this.f106650v;
    }

    public int getTabGravity() {
        return this.f106641l;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f106640k;
    }

    public int getTabMode() {
        return this.f106642m;
    }

    public ColorStateList getTabTextColors() {
        return this.f106636g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo101332a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f106630a.getChildCount()) {
            if (z2) {
                this.f106630a.mo101387a(i, f);
            }
            if (this.f106619E != null && this.f106619E.isRunning()) {
                this.f106619E.cancel();
            }
            scrollTo(m130996a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    public final void mo101336a(C41011f fVar) {
        mo101337a(fVar, this.f106649u.isEmpty());
    }

    /* renamed from: a */
    public final void mo101337a(C41011f fVar, boolean z) {
        m131002a(fVar, this.f106649u.size(), z);
    }

    /* renamed from: a */
    public void mo101335a(C41006c cVar) {
        if (!this.f106617C.contains(cVar)) {
            this.f106617C.add(cVar);
        }
    }

    /* renamed from: a */
    public final C41011f mo101329a() {
        C41011f fVar = (C41011f) f106614t.acquire();
        if (fVar == null) {
            fVar = new C41011f();
        }
        fVar.f106704g = this;
        fVar.f106705h = m131006c(fVar);
        return fVar;
    }

    /* renamed from: a */
    public final C41011f mo101330a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C41011f) this.f106649u.get(i);
    }

    /* renamed from: a */
    public final void mo101333a(int i, int i2) {
        setTabTextColors(m131004b(i, i2));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo101334a(PagerAdapter pagerAdapter, boolean z) {
        if (!(this.f106620F == null || this.f106621G == null)) {
            this.f106620F.unregisterDataSetObserver(this.f106621G);
        }
        this.f106620F = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f106621G == null) {
                this.f106621G = new C41007d();
            }
            pagerAdapter.registerDataSetObserver(this.f106621G);
        }
        mo101347c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo101338a(boolean z) {
        for (int i = 0; i < this.f106630a.getChildCount(); i++) {
            View childAt = this.f106630a.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m131000a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private float getScrollPosition() {
        return this.f106630a.mo101390b();
    }

    public int getTabCount() {
        return this.f106649u.size();
    }

    /* renamed from: g */
    private LayoutParams m131015g() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m131000a(layoutParams);
        return layoutParams;
    }

    public int getSelectedTabPosition() {
        if (this.f106650v != null) {
            return this.f106650v.f106702e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f106623I) {
            setupWithViewPager(null);
            this.f106623I = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private void mo103530f() {
        int size = this.f106649u.size();
        for (int i = 0; i < size; i++) {
            ((C41011f) this.f106649u.get(i)).mo101406c();
        }
    }

    private int getTabMinWidth() {
        if (this.f106652x != -1) {
            return this.f106652x;
        }
        if (this.f106642m == 0) {
            return this.f106654z;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f106630a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f106644o == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m130998a((ViewPager) parent, true, true);
            }
        }
    }

    private int getDefaultHeight() {
        int size = this.f106649u.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C41011f fVar = (C41011f) this.f106649u.get(i);
            if (fVar != null && fVar.f106699b != null && !TextUtils.isEmpty(fVar.f106700c)) {
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
    private void m131017h() {
        if (this.f106619E == null) {
            this.f106619E = new ValueAnimator();
            this.f106619E.setInterpolator(C41014a.f106716b);
            this.f106619E.setDuration(300);
            this.f106619E.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    /* renamed from: i */
    private void m131018i() {
        int i;
        if (this.f106642m == 0) {
            i = Math.max(0, this.f106615A - this.f106631b);
        } else {
            i = 0;
        }
        C0991u.m4202b(this.f106630a, i, 0, 0, 0);
        switch (this.f106642m) {
            case 0:
                this.f106630a.setGravity(8388611);
                break;
            case 1:
                this.f106630a.setGravity(1);
                break;
        }
        mo101338a(true);
    }

    /* renamed from: d */
    public final void mo101348d() {
        if (this.f106650v != null) {
            this.f106630a.mo101387a(-1, 0.0f);
            m131014f(this.f106650v);
            this.f106650v = null;
        }
    }

    /* renamed from: b */
    public final void mo101344b() {
        for (int childCount = this.f106630a.getChildCount() - 1; childCount >= 0; childCount--) {
            m131008d(childCount);
        }
        Iterator it = this.f106649u.iterator();
        while (it.hasNext()) {
            C41011f fVar = (C41011f) it.next();
            it.remove();
            fVar.mo101407d();
            f106614t.release(fVar);
        }
        this.f106650v = null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo101347c() {
        if (this.f106628N) {
            mo101344b();
            if (this.f106620F != null) {
                int count = this.f106620F.getCount();
                m131007c(count);
                for (int i = 0; i < count; i++) {
                    mo101337a(mo101329a().mo101402a(this.f106620F.getPageTitle(i)), false);
                }
                if (this.f106644o != null && count > 0) {
                    int currentItem = this.f106644o.getCurrentItem();
                    if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                        mo101345b(mo101330a(currentItem));
                    }
                }
            }
        }
    }

    public void addView(View view) {
        m130999a(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.f106643n = z;
    }

    public void setDefaultAddTab(boolean z) {
        this.f106628N = z;
    }

    public void setHideIndicatorView(boolean z) {
        this.f106646q = z;
    }

    public void setOnTabClickListener(C41005b bVar) {
        this.f106647r = bVar;
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m131005b(C41006c cVar) {
        this.f106617C.remove(cVar);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f106630a.mo101386a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f106630a.mo101391b(i);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo101334a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m130997a(viewPager, true);
    }

    /* renamed from: d */
    private void m131009d(C41011f fVar) {
        this.f106630a.addView(fVar.f106705h, fVar.f106702e, m131015g());
    }

    /* renamed from: b */
    public final void mo101345b(C41011f fVar) {
        mo101346b(fVar, true);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m131017h();
        this.f106619E.addListener(animatorListener);
    }

    public void setTabGravity(int i) {
        if (this.f106641l != i) {
            this.f106641l = i;
            m131018i();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f106642m) {
            this.f106642m = i;
            m131018i();
        }
    }

    public void setTabStripLeftMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f106630a.getLayoutParams();
        layoutParams.leftMargin = i;
        this.f106630a.setLayoutParams(layoutParams);
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f106636g != colorStateList) {
            this.f106636g = colorStateList;
            mo103530f();
        }
    }

    /* renamed from: a */
    private void m130999a(View view) {
        if (view instanceof C41015b) {
            m131003a((C41015b) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: c */
    private void m131007c(int i) {
        if (this.f106626L) {
            if (i > this.f106627M) {
                setTabMode(0);
                return;
            }
            setTabMode(1);
        }
    }

    /* renamed from: d */
    private void m131008d(int i) {
        C41012g gVar = (C41012g) this.f106630a.getChildAt(i);
        this.f106630a.removeViewAt(i);
        if (gVar != null) {
            gVar.mo101408a();
            this.f106629O.release(gVar);
        }
        requestLayout();
    }

    /* renamed from: e */
    private void m131011e(C41011f fVar) {
        for (int size = this.f106617C.size() - 1; size >= 0; size--) {
            ((C41006c) this.f106617C.get(size)).mo74743a(fVar);
        }
    }

    /* renamed from: g */
    private void m131016g(C41011f fVar) {
        for (int size = this.f106617C.size() - 1; size >= 0; size--) {
            ((C41006c) this.f106617C.get(size)).mo74745c(fVar);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f106630a.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f106630a.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public void setOnTabSelectedListener(C41006c cVar) {
        if (this.f106616B != null) {
            m131005b(this.f106616B);
        }
        this.f106616B = cVar;
        if (cVar != null) {
            mo101335a(cVar);
        }
    }

    /* renamed from: a */
    private void m131000a(LayoutParams layoutParams) {
        if (this.f106642m == 1 && this.f106641l == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        if (this.f106651w != 0) {
            layoutParams.leftMargin = this.f106651w;
            layoutParams.rightMargin = this.f106651w;
        }
    }

    /* renamed from: c */
    private C41012g m131006c(C41011f fVar) {
        C41012g gVar;
        if (this.f106629O != null) {
            gVar = (C41012g) this.f106629O.acquire();
        } else {
            gVar = null;
        }
        if (gVar == null) {
            gVar = new C41012g(getContext());
        }
        gVar.setTab(fVar);
        gVar.setFocusable(true);
        gVar.setMinimumWidth(getTabMinWidth());
        return gVar;
    }

    /* renamed from: f */
    private void m131014f(C41011f fVar) {
        for (int size = this.f106617C.size() - 1; size >= 0; size--) {
            ((C41006c) this.f106617C.get(size)).mo74744b(fVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo101343b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public void setTabMargin(int i) {
        this.f106651w = mo101343b(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.f106630a.getChildAt(i2);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = mo101343b(i);
            marginLayoutParams.rightMargin = mo101343b(i);
            childAt.setLayoutParams(marginLayoutParams);
            childAt.invalidate();
        }
    }

    /* renamed from: e */
    private void m131010e(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C0991u.m4167D(this) || this.f106630a.mo101389a()) {
                mo101331a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a = m130996a(i, 0.0f);
            if (scrollX != a) {
                m131017h();
                this.f106619E.setIntValues(new int[]{scrollX, a});
                this.f106619E.start();
            }
            this.f106630a.mo101392b(i, C34943c.f91128x);
        }
    }

    /* renamed from: a */
    private void m131003a(C41015b bVar) {
        C41011f a = mo101329a();
        if (bVar.f106720a != null) {
            a.mo101402a(bVar.f106720a);
        }
        if (bVar.f106721b != null) {
            a.mo101400a(bVar.f106721b);
        }
        if (bVar.f106722c != 0) {
            a.mo101399a(bVar.f106722c);
        }
        if (!TextUtils.isEmpty(bVar.getContentDescription())) {
            a.mo101404b(bVar.getContentDescription());
        }
        mo101336a(a);
    }

    /* renamed from: a */
    private void m130997a(ViewPager viewPager, boolean z) {
        m130998a(viewPager, true, false);
    }

    public void addView(View view, int i) {
        m130999a(view);
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private static ColorStateList m131004b(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m130999a(view);
    }

    /* renamed from: a */
    private int m130996a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f106642m != 0) {
            return 0;
        }
        View childAt = this.f106630a.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f106630a.getChildCount()) {
            view = this.f106630a.getChildAt(i4);
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
        int i5 = (int) (((float) (i2 + i3 + (this.f106651w * 4))) * 0.5f * f);
        if (C0991u.m4220h(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo101346b(C41011f fVar, boolean z) {
        int i;
        C41011f fVar2 = this.f106650v;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i = fVar.f106702e;
            } else {
                i = -1;
            }
            if (z) {
                if ((fVar2 == null || fVar2.f106702e == -1) && i != -1) {
                    mo101331a(i, 0.0f, true);
                } else {
                    m131010e(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                m131014f(fVar2);
            }
            this.f106650v = fVar;
            if (fVar != null) {
                m131011e(fVar);
            }
        } else if (fVar2 != null) {
            m131016g(fVar);
            m131010e(fVar.f106702e);
        }
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
            int r0 = r5.mo101343b(r0)
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
            int r1 = r5.f106653y
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.f106653y
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.mo101343b(r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.f106640k = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.f106642m
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.widget.tablayout.TabLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m131001a(C41011f fVar, int i) {
        fVar.f106702e = i;
        this.f106649u.add(i, fVar);
        int size = this.f106649u.size();
        while (true) {
            i++;
            if (i < size) {
                ((C41011f) this.f106649u.get(i)).f106702e = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo101331a(int i, float f, boolean z) {
        mo101332a(i, 0.0f, true, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m130999a(view);
    }

    /* renamed from: a */
    private void m130998a(ViewPager viewPager, boolean z, boolean z2) {
        if (this.f106644o != null) {
            if (this.f106645p != null) {
                this.f106644o.removeOnPageChangeListener(this.f106645p);
            }
            if (this.f106622H != null) {
                this.f106644o.removeOnAdapterChangeListener(this.f106622H);
            }
        }
        if (this.f106618D != null) {
            m131005b(this.f106618D);
            this.f106618D = null;
        }
        if (viewPager != null) {
            this.f106644o = viewPager;
            if (this.f106645p == null) {
                this.f106645p = new TabLayoutOnPageChangeListener(this);
            }
            this.f106645p.mo101378a();
            viewPager.addOnPageChangeListener(this.f106645p);
            this.f106618D = new C41013h(viewPager);
            mo101335a(this.f106618D);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo101334a(adapter, z);
            }
            if (this.f106622H == null) {
                this.f106622H = new C41004a();
            }
            this.f106622H.f106674a = z;
            viewPager.addOnAdapterChangeListener(this.f106622H);
            mo101331a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f106644o = null;
            mo101334a((PagerAdapter) null, false);
        }
        this.f106623I = z2;
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f106649u = new ArrayList<>();
        this.f106640k = Integer.MAX_VALUE;
        this.f106617C = new ArrayList<>();
        this.f106628N = true;
        this.f106629O = new SimplePool(12);
        C41017d.m131067a(context);
        setHorizontalScrollBarEnabled(false);
        this.f106630a = new C41008e(context);
        super.addView(this.f106630a, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i, R.style.qg);
        this.f106630a.mo101391b(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        this.f106630a.mo101386a(obtainStyledAttributes.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f106634e = dimensionPixelSize;
        this.f106633d = dimensionPixelSize;
        this.f106632c = dimensionPixelSize;
        this.f106631b = dimensionPixelSize;
        this.f106631b = obtainStyledAttributes.getDimensionPixelSize(18, this.f106631b);
        this.f106632c = obtainStyledAttributes.getDimensionPixelSize(19, this.f106632c);
        this.f106633d = obtainStyledAttributes.getDimensionPixelSize(17, this.f106633d);
        this.f106634e = obtainStyledAttributes.getDimensionPixelSize(16, this.f106634e);
        this.f106635f = obtainStyledAttributes.getResourceId(22, R.style.l1);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f106635f, android.support.p029v7.appcompat.R$styleable.TextAppearance);
        try {
            this.f106637h = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f106636g = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(23)) {
                this.f106636g = obtainStyledAttributes.getColorStateList(23);
            }
            if (obtainStyledAttributes.hasValue(21)) {
                this.f106636g = m131004b(this.f106636g.getDefaultColor(), obtainStyledAttributes.getColor(21, 0));
            }
            this.f106652x = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f106653y = obtainStyledAttributes.getDimensionPixelSize(12, -1);
            this.f106639j = obtainStyledAttributes.getResourceId(0, 0);
            this.f106615A = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f106642m = obtainStyledAttributes.getInt(14, 1);
            this.f106641l = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f106638i = (float) resources.getDimensionPixelSize(R.dimen.fz);
            this.f106654z = resources.getDimensionPixelSize(R.dimen.fx);
            this.f106624J = C9738o.m28708b(getContext(), 1.5f);
            this.f106625K = C9738o.m28708b(getContext(), 1.5f);
            this.f106648s = getResources().getConfiguration().orientation;
            m131018i();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private void m131002a(C41011f fVar, int i, boolean z) {
        if (fVar.f106704g == this) {
            m131001a(fVar, i);
            m131009d(fVar);
            if (z) {
                fVar.mo101403a();
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
