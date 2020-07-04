package com.p280ss.android.ugc.aweme.common.widget.tablayout;

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
/* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout */
public class CommonTabLayout extends HorizontalScrollView {

    /* renamed from: t */
    private static final C0887a<C25777f> f68077t = new SynchronizedPool(16);

    /* renamed from: A */
    private int f68078A;

    /* renamed from: B */
    private C25772c f68079B;

    /* renamed from: C */
    private final ArrayList<C25772c> f68080C;

    /* renamed from: D */
    private C25772c f68081D;

    /* renamed from: E */
    private ValueAnimator f68082E;

    /* renamed from: F */
    private PagerAdapter f68083F;

    /* renamed from: G */
    private DataSetObserver f68084G;

    /* renamed from: H */
    private C25770a f68085H;

    /* renamed from: I */
    private boolean f68086I;

    /* renamed from: J */
    private float f68087J;

    /* renamed from: K */
    private float f68088K;

    /* renamed from: L */
    private final C0887a<C25778g> f68089L;

    /* renamed from: a */
    public final C25774e f68090a;

    /* renamed from: b */
    int f68091b;

    /* renamed from: c */
    int f68092c;

    /* renamed from: d */
    int f68093d;

    /* renamed from: e */
    int f68094e;

    /* renamed from: f */
    int f68095f;

    /* renamed from: g */
    ColorStateList f68096g;

    /* renamed from: h */
    float f68097h;

    /* renamed from: i */
    float f68098i;

    /* renamed from: j */
    final int f68099j;

    /* renamed from: k */
    int f68100k;

    /* renamed from: l */
    int f68101l;

    /* renamed from: m */
    int f68102m;

    /* renamed from: n */
    int f68103n;

    /* renamed from: o */
    boolean f68104o;

    /* renamed from: p */
    ViewPager f68105p;

    /* renamed from: q */
    TabLayoutOnPageChangeListener f68106q;

    /* renamed from: r */
    public C25771b f68107r;

    /* renamed from: s */
    public int f68108s;

    /* renamed from: u */
    private final ArrayList<C25777f> f68109u;

    /* renamed from: v */
    private C25777f f68110v;

    /* renamed from: w */
    private int f68111w;

    /* renamed from: x */
    private final int f68112x;

    /* renamed from: y */
    private final int f68113y;

    /* renamed from: z */
    private final int f68114z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$TabLayoutOnPageChangeListener */
    public static class TabLayoutOnPageChangeListener implements C0935e {

        /* renamed from: a */
        private final WeakReference<CommonTabLayout> f68116a;

        /* renamed from: b */
        private int f68117b;

        /* renamed from: c */
        private int f68118c;

        /* renamed from: d */
        private int f68119d;

        /* renamed from: e */
        private int f68120e;

        /* renamed from: f */
        private ArgbEvaluator f68121f = new ArgbEvaluator();

        /* renamed from: g */
        private AccelerateInterpolator f68122g = new AccelerateInterpolator();

        /* renamed from: h */
        private DecelerateInterpolator f68123h = new DecelerateInterpolator(1.6f);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo66927a() {
            this.f68117b = 0;
            this.f68118c = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f68117b = this.f68118c;
            this.f68118c = i;
        }

        public TabLayoutOnPageChangeListener(CommonTabLayout commonTabLayout) {
            this.f68116a = new WeakReference<>(commonTabLayout);
            this.f68120e = commonTabLayout.getTabTextColors().getColorForState(CommonTabLayout.SELECTED_STATE_SET, 0);
            this.f68119d = commonTabLayout.getTabTextColors().getDefaultColor();
        }

        public void onPageSelected(int i) {
            boolean z;
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f68116a.get();
            if (commonTabLayout != null && commonTabLayout.getSelectedTabPosition() != i && i < commonTabLayout.getTabCount()) {
                if (this.f68118c == 0 || (this.f68118c == 2 && this.f68117b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                commonTabLayout.mo66894a(commonTabLayout.mo66887a(i), z);
            }
        }

        /* renamed from: a */
        private static void m84710a(ImageView imageView, TextView textView, int i) {
            if (imageView != null && textView != null) {
                textView.setTextColor(i);
                imageView.setImageAlpha(Color.alpha(i));
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f68116a.get();
            if (commonTabLayout != null) {
                if (this.f68118c != 2 || this.f68117b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f68118c == 2 && this.f68117b == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                commonTabLayout.mo66889a(i, f, z, z2);
                if (this.f68118c == 2 && this.f68117b == 0) {
                    commonTabLayout.f68090a.f68141e = false;
                } else {
                    commonTabLayout.f68090a.f68141e = true;
                    View childAt = commonTabLayout.f68090a.getChildAt(commonTabLayout.f68090a.f68137a);
                    View childAt2 = commonTabLayout.f68090a.getChildAt(commonTabLayout.f68090a.f68137a + 1);
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
                            m84710a((ImageView) findViewById.findViewById(R.id.dfk), (TextView) findViewById.findViewById(R.id.dfm), ((Integer) this.f68121f.evaluate(f, Integer.valueOf(this.f68120e), Integer.valueOf(this.f68119d))).intValue());
                            m84710a(imageView, textView, ((Integer) this.f68121f.evaluate(f, Integer.valueOf(this.f68119d), Integer.valueOf(this.f68120e))).intValue());
                            commonTabLayout.f68090a.f68139c = left + ((left2 - left) * this.f68122g.getInterpolation(f));
                            commonTabLayout.f68090a.f68140d = width + ((width2 - width) * this.f68122g.getInterpolation(f));
                        }
                    }
                }
                C0991u.m4212e(commonTabLayout.f68090a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$TabLayoutOnPageChangeListenerIndependent */
    public static class TabLayoutOnPageChangeListenerIndependent implements C0935e {

        /* renamed from: a */
        final boolean f68124a;

        /* renamed from: b */
        private final WeakReference<CommonTabLayout> f68125b;

        /* renamed from: c */
        private int f68126c;

        /* renamed from: d */
        private int f68127d;

        /* renamed from: e */
        private int f68128e;

        public void onPageScrollStateChanged(int i) {
            this.f68126c = this.f68127d;
            this.f68127d = i;
        }

        public void onPageSelected(int i) {
            boolean z;
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f68125b.get();
            if (commonTabLayout != null && commonTabLayout.getSelectedTabPosition() != i && i < commonTabLayout.getTabCount()) {
                if (this.f68127d == 0 || (this.f68127d == 2 && this.f68126c == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                commonTabLayout.mo66894a(commonTabLayout.mo66887a(i), z);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            boolean z2;
            CommonTabLayout commonTabLayout = (CommonTabLayout) this.f68125b.get();
            if (!(this.f68128e == i || commonTabLayout == null)) {
                if (this.f68127d != 2 || this.f68126c == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.f68127d == 2 && this.f68126c == 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(200);
                final int i3 = i;
                C25781b bVar = new C25781b(this, this.f68128e, i3, commonTabLayout, z, z2);
                duration.addUpdateListener(bVar);
                this.f68128e = i;
                final CommonTabLayout commonTabLayout2 = commonTabLayout;
                final boolean z3 = z;
                final boolean z4 = z2;
                C257691 r0 = new AnimatorListener() {
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    public final void onAnimationStart(Animator animator) {
                    }

                    public final void onAnimationCancel(Animator animator) {
                        commonTabLayout2.mo66889a(i3, 0.0f, z3, z4);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        commonTabLayout2.mo66889a(i3, 0.0f, z3, z4);
                    }
                };
                duration.addListener(r0);
                duration.start();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo66928a(int i, int i2, CommonTabLayout commonTabLayout, boolean z, boolean z2, ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (i >= i2 || this.f68124a) {
                floatValue = 1.0f - floatValue;
            } else {
                i2--;
            }
            commonTabLayout.mo66889a(i2, floatValue, z, z2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$a */
    class C25770a implements C0934d {

        /* renamed from: a */
        public boolean f68134a;

        C25770a() {
        }

        /* renamed from: a */
        public final void mo1668a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (CommonTabLayout.this.f68105p == viewPager) {
                CommonTabLayout.this.mo66891a(pagerAdapter2, this.f68134a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$b */
    public interface C25771b {
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$c */
    public interface C25772c {
        /* renamed from: a */
        void mo66933a(C25777f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$d */
    class C25773d extends DataSetObserver {
        public final void onChanged() {
            CommonTabLayout.this.mo66888a();
        }

        public final void onInvalidated() {
            CommonTabLayout.this.mo66888a();
        }

        C25773d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$e */
    class C25774e extends LinearLayout {

        /* renamed from: a */
        int f68137a = -1;

        /* renamed from: b */
        float f68138b;

        /* renamed from: c */
        public float f68139c;

        /* renamed from: d */
        public float f68140d;

        /* renamed from: e */
        public boolean f68141e;

        /* renamed from: g */
        private int f68143g;

        /* renamed from: h */
        private final Paint f68144h;

        /* renamed from: i */
        private int f68145i = -1;

        /* renamed from: j */
        private int f68146j = -1;

        /* renamed from: k */
        private int f68147k = -1;

        /* renamed from: l */
        private ValueAnimator f68148l;

        /* renamed from: m */
        private int f68149m = CommonTabLayout.this.mo66900b(27);

        /* renamed from: n */
        private int f68150n = Integer.MAX_VALUE;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final float mo66940b() {
            return ((float) this.f68137a) + this.f68138b;
        }

        /* renamed from: c */
        private void m84715c() {
            int i;
            View childAt = getChildAt(this.f68137a);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.f68138b > 0.0f && this.f68137a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f68137a + 1);
                    i2 = (int) ((this.f68138b * ((float) childAt2.getLeft())) + ((1.0f - this.f68138b) * ((float) i2)));
                    i = (int) ((this.f68138b * ((float) childAt2.getRight())) + ((1.0f - this.f68138b) * ((float) i)));
                }
            }
            mo66938a(i2, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo66939a() {
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
        public final void mo66941b(int i) {
            if (this.f68143g != i) {
                this.f68143g = i;
                C0991u.m4212e(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo66936a(int i) {
            if (this.f68144h.getColor() != i) {
                this.f68144h.setColor(i);
                C0991u.m4212e(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f68145i != i) {
                requestLayout();
                this.f68145i = i;
            }
        }

        public final void draw(Canvas canvas) {
            super.draw(canvas);
            if (this.f68146j >= 0 && this.f68147k > this.f68146j) {
                View childAt = getChildAt(CommonTabLayout.this.getSelectedTabPosition());
                if (childAt != null) {
                    View findViewById = childAt.findViewById(R.id.bkb);
                    if (findViewById != null) {
                        if (CommonTabLayout.this.f68105p == null || !this.f68141e) {
                            this.f68139c = (float) (this.f68146j + (((this.f68147k - this.f68146j) - findViewById.getWidth()) / 2));
                            this.f68140d = this.f68139c + ((float) findViewById.getWidth());
                        }
                        canvas.drawRect(this.f68139c, (float) (getHeight() - this.f68143g), this.f68140d, (float) getHeight(), this.f68144h);
                        return;
                    }
                }
                canvas.drawRect((float) this.f68146j, (float) (getHeight() - this.f68143g), (float) this.f68147k, (float) getHeight(), this.f68144h);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo66938a(int i, int i2) {
            if (i != this.f68146j || i2 != this.f68147k) {
                this.f68146j = i;
                this.f68147k = i2;
                C0991u.m4212e(this);
            }
        }

        C25774e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f68144h = new Paint();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo66937a(int i, float f) {
            if (this.f68148l != null && this.f68148l.isRunning()) {
                this.f68148l.cancel();
            }
            this.f68137a = i;
            this.f68138b = f;
            m84715c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo66942b(final int i, int i2) {
            boolean z;
            final int i3;
            final int i4;
            int i5;
            if (this.f68148l != null && this.f68148l.isRunning()) {
                this.f68148l.cancel();
            }
            if (C0991u.m4220h(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m84715c();
                return;
            }
            final int left = childAt.getLeft();
            final int right = childAt.getRight();
            if (Math.abs(i - this.f68137a) <= 1) {
                i4 = this.f68146j;
                i3 = this.f68147k;
            } else {
                int b = CommonTabLayout.this.mo66900b(24);
                if (i < this.f68137a) {
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
                this.f68148l = valueAnimator;
                valueAnimator.setInterpolator(C25780a.f68176b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                C257751 r3 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C25774e.this.mo66938a(C25780a.m84738a(i4, left, animatedFraction), C25780a.m84738a(i3, right, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C25774e.this.f68137a = i;
                        C25774e.this.f68138b = 0.0f;
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
                        this.f68150n = Math.min(this.f68150n, childAt.getMeasuredWidth());
                    }
                }
                if (CommonTabLayout.this.f68102m == 1 && CommonTabLayout.this.f68101l == 1) {
                    if (i4 > 0) {
                        if (i4 * childCount <= getMeasuredWidth() - (CommonTabLayout.this.mo66900b(16) * 2)) {
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
                            CommonTabLayout.this.f68101l = 0;
                            CommonTabLayout.this.mo66895a(false);
                            z2 = true;
                        }
                        if (z2) {
                            super.onMeasure(i, i2);
                        }
                    }
                } else if (CommonTabLayout.this.f68102m == 0 && CommonTabLayout.this.f68104o && CommonTabLayout.this.f68108s == getResources().getConfiguration().orientation && i4 > 0) {
                    int i6 = 0;
                    for (int i7 = 0; i7 < childCount; i7++) {
                        View childAt2 = getChildAt(i7);
                        if (childAt2.getVisibility() != 8) {
                            i6 += childAt2.getMeasuredWidth();
                        }
                    }
                    if (i6 > 0) {
                        int measuredWidth = (CommonTabLayout.this.getMeasuredWidth() - CommonTabLayout.this.f68090a.getPaddingLeft()) - CommonTabLayout.this.f68090a.getPaddingRight();
                        if (i6 < measuredWidth) {
                            if (i4 * childCount < measuredWidth) {
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
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f68148l == null || !this.f68148l.isRunning()) {
                m84715c();
                return;
            }
            this.f68148l.cancel();
            mo66942b(this.f68137a, Math.round((1.0f - this.f68148l.getAnimatedFraction()) * ((float) this.f68148l.getDuration())));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$f */
    public static final class C25777f {

        /* renamed from: a */
        public Object f68158a;

        /* renamed from: b */
        public Drawable f68159b;

        /* renamed from: c */
        public CharSequence f68160c;

        /* renamed from: d */
        public CharSequence f68161d;

        /* renamed from: e */
        public int f68162e = -1;

        /* renamed from: f */
        public View f68163f;

        /* renamed from: g */
        CommonTabLayout f68164g;

        /* renamed from: h */
        public C25778g f68165h;

        C25777f() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo66955c() {
            if (this.f68165h != null) {
                this.f68165h.mo66959b();
            }
        }

        /* renamed from: b */
        public final boolean mo66954b() {
            if (this.f68164g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (this.f68164g.getSelectedTabPosition() == this.f68162e) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo66956d() {
            this.f68164g = null;
            this.f68165h = null;
            this.f68158a = null;
            this.f68159b = null;
            this.f68160c = null;
            this.f68161d = null;
            this.f68162e = -1;
            this.f68163f = null;
        }

        /* renamed from: a */
        public final void mo66952a() {
            if (this.f68164g != null) {
                this.f68164g.mo66893a(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: a */
        private C25777f m84723a(View view) {
            this.f68163f = view;
            mo66955c();
            return this;
        }

        /* renamed from: b */
        public final C25777f mo66953b(CharSequence charSequence) {
            this.f68161d = charSequence;
            mo66955c();
            return this;
        }

        /* renamed from: a */
        public final C25777f mo66950a(Drawable drawable) {
            this.f68159b = drawable;
            mo66955c();
            return this;
        }

        /* renamed from: a */
        public final C25777f mo66949a(int i) {
            return m84723a(LayoutInflater.from(this.f68165h.getContext()).inflate(i, this.f68165h, false));
        }

        /* renamed from: a */
        public final C25777f mo66951a(CharSequence charSequence) {
            this.f68160c = charSequence;
            mo66955c();
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$g */
    public class C25778g extends LinearLayout {

        /* renamed from: b */
        private C25777f f68167b;

        /* renamed from: c */
        private TextView f68168c;

        /* renamed from: d */
        private ImageView f68169d;

        /* renamed from: e */
        private View f68170e;

        /* renamed from: f */
        private TextView f68171f;

        /* renamed from: g */
        private ImageView f68172g;

        /* renamed from: h */
        private int f68173h = 2;

        public final C25777f getTab() {
            return this.f68167b;
        }

        public final TextView getTextView() {
            return this.f68168c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo66957a() {
            setTab(null);
            setSelected(false);
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f68167b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (CommonTabLayout.this.f68107r == null) {
                this.f68167b.mo66952a();
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo66959b() {
            View view;
            C25777f fVar = this.f68167b;
            if (fVar != null) {
                view = fVar.f68163f;
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
                this.f68170e = view;
                if (this.f68168c != null) {
                    this.f68168c.setVisibility(8);
                }
                if (this.f68169d != null) {
                    this.f68169d.setVisibility(8);
                    this.f68169d.setImageDrawable(null);
                }
                this.f68171f = (TextView) view.findViewById(16908308);
                if (this.f68171f != null) {
                    this.f68173h = C1056n.m4563a(this.f68171f);
                }
                this.f68172g = (ImageView) view.findViewById(16908294);
            } else {
                if (this.f68170e != null) {
                    removeView(this.f68170e);
                    this.f68170e = null;
                }
                this.f68171f = null;
                this.f68172g = null;
            }
            boolean z = false;
            if (this.f68170e == null) {
                if (this.f68169d == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.jd, this, false);
                    addView(imageView, 0);
                    this.f68169d = imageView;
                }
                if (this.f68168c == null) {
                    TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.je, this, false);
                    addView(textView);
                    this.f68168c = textView;
                    this.f68173h = C1056n.m4563a(this.f68168c);
                }
                C1056n.m4567a(this.f68168c, CommonTabLayout.this.f68095f);
                if (CommonTabLayout.this.f68096g != null) {
                    this.f68168c.setTextColor(CommonTabLayout.this.f68096g);
                }
                m84733a(this.f68168c, this.f68169d);
            } else if (!(this.f68171f == null && this.f68172g == null)) {
                m84733a(this.f68171f, this.f68172g);
            }
            if (fVar != null && fVar.mo66954b()) {
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
        public final void setTab(C25777f fVar) {
            if (fVar != this.f68167b) {
                this.f68167b = fVar;
                mo66959b();
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
            if (this.f68168c != null) {
                this.f68168c.setSelected(z);
            }
            if (this.f68169d != null) {
                this.f68169d.setSelected(z);
            }
            if (this.f68170e != null) {
                this.f68170e.setSelected(z);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo66958a(C25777f fVar, boolean z) {
            if (fVar != this.f68167b) {
                this.f68167b = fVar;
            }
        }

        public C25778g(Context context) {
            super(context);
            if (CommonTabLayout.this.f68099j != 0) {
                C0991u.m4185a((View) this, C1065a.m4641b(context, CommonTabLayout.this.f68099j));
            }
            C0991u.m4202b(this, CommonTabLayout.this.f68091b, CommonTabLayout.this.f68092c, CommonTabLayout.this.f68093d, CommonTabLayout.this.f68094e);
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0991u.m4189a((View) this, C0987q.m4161a(getContext(), 1002));
        }

        /* renamed from: a */
        private void m84733a(TextView textView, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            CharSequence charSequence3 = null;
            if (this.f68167b != null) {
                drawable = this.f68167b.f68159b;
            } else {
                drawable = null;
            }
            if (this.f68167b != null) {
                charSequence = this.f68167b.f68160c;
            } else {
                charSequence = null;
            }
            if (this.f68167b != null) {
                charSequence2 = this.f68167b.f68161d;
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
                    i = CommonTabLayout.this.mo66900b(8);
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
            int tabMaxWidth = CommonTabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(CommonTabLayout.this.f68100k, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.f68168c != null) {
                getResources();
                float f = CommonTabLayout.this.f68097h;
                int i3 = this.f68173h;
                boolean z = true;
                if (this.f68169d != null && this.f68169d.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.f68168c != null && this.f68168c.getLineCount() > 1) {
                    f = CommonTabLayout.this.f68098i;
                }
                float textSize = this.f68168c.getTextSize();
                int lineCount = this.f68168c.getLineCount();
                int a = C1056n.m4563a(this.f68168c);
                if (f != textSize || (a >= 0 && i3 != a)) {
                    if (CommonTabLayout.this.f68102m == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.f68168c.getLayout();
                        if (layout == null || m84732a(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.f68168c.setTextSize(0, f);
                        this.f68168c.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        /* renamed from: a */
        private static float m84732a(Layout layout, int i, float f) {
            return layout.getLineWidth(0) * (f / layout.getPaint().getTextSize());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout$h */
    public static class C25779h implements C25772c {

        /* renamed from: a */
        private final ViewPager f68174a;

        public C25779h(ViewPager viewPager) {
            this.f68174a = viewPager;
        }

        /* renamed from: a */
        public final void mo66933a(C25777f fVar) {
            this.f68174a.setCurrentItem(fVar.f68162e);
        }
    }

    public int getTabGravity() {
        return this.f68101l;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.f68100k;
    }

    public int getTabMode() {
        return this.f68102m;
    }

    public ColorStateList getTabTextColors() {
        return this.f68096g;
    }

    /* renamed from: a */
    public final void mo66890a(int i, int i2, int i3, int i4) {
        this.f68090a.setPadding(i, 0, i3, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66889a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f68090a.getChildCount()) {
            if (z2) {
                this.f68090a.mo66937a(i, f);
            }
            if (this.f68082E != null && this.f68082E.isRunning()) {
                this.f68082E.cancel();
            }
            scrollTo(m84673a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* renamed from: a */
    private void m84682a(C25782c cVar) {
        C25777f c = m84687c(0);
        if (cVar.f68186a != null) {
            c.mo66951a(cVar.f68186a);
        }
        if (cVar.f68187b != null) {
            c.mo66950a(cVar.f68187b);
        }
        if (cVar.f68188c != 0) {
            c.mo66949a(cVar.f68188c);
        }
        if (!TextUtils.isEmpty(cVar.getContentDescription())) {
            c.mo66953b(cVar.getContentDescription());
        }
        m84684b(c);
    }

    /* renamed from: a */
    public final void mo66892a(C25772c cVar) {
        if (!this.f68080C.contains(cVar)) {
            this.f68080C.add(cVar);
        }
    }

    /* renamed from: a */
    public final C25777f mo66887a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C25777f) this.f68109u.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66891a(PagerAdapter pagerAdapter, boolean z) {
        if (!(this.f68083F == null || this.f68084G == null)) {
            this.f68083F.unregisterDataSetObserver(this.f68084G);
        }
        this.f68083F = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.f68084G == null) {
                this.f68084G = new C25773d();
            }
            pagerAdapter.registerDataSetObserver(this.f68084G);
        }
        mo66888a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66888a() {
        m84688c();
        if (this.f68083F != null) {
            int count = this.f68083F.getCount();
            for (int i = 0; i < count; i++) {
                m84685b(m84687c(this.f68103n).mo66951a(this.f68083F.getPageTitle(i)), false);
            }
            if (this.f68105p != null && count > 0) {
                int currentItem = this.f68105p.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    mo66893a(mo66887a(currentItem));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66893a(C25777f fVar) {
        mo66894a(fVar, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66894a(C25777f fVar, boolean z) {
        C25777f fVar2 = this.f68110v;
        if (fVar2 != fVar) {
            int i = fVar != null ? fVar.f68162e : -1;
            if (z) {
                if ((fVar2 == null || fVar2.f68162e == -1) && i != -1) {
                    m84675a(i, 0.0f, true);
                } else {
                    m84694e(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                m84695e(fVar2);
            }
            this.f68110v = fVar;
            if (fVar != null) {
                m84692d(fVar);
            }
        } else if (fVar2 != null) {
            m84697f(fVar);
            m84694e(fVar.f68162e);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo66895a(boolean z) {
        for (int i = 0; i < this.f68090a.getChildCount(); i++) {
            View childAt = this.f68090a.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            m84679a((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private float getScrollPosition() {
        return this.f68090a.mo66940b();
    }

    public int getTabCount() {
        return this.f68109u.size();
    }

    /* renamed from: f */
    private LayoutParams m84696f() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        m84679a(layoutParams);
        return layoutParams;
    }

    public int getSelectedTabPosition() {
        if (this.f68110v != null) {
            return this.f68110v.f68162e;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f68086I) {
            setupWithViewPager(null);
            this.f68086I = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m84690d() {
        int size = this.f68109u.size();
        for (int i = 0; i < size; i++) {
            ((C25777f) this.f68109u.get(i)).mo66955c();
        }
    }

    private int getTabMinWidth() {
        if (this.f68112x != -1) {
            return this.f68112x;
        }
        if (this.f68102m == 0) {
            return this.f68114z;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f68090a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f68105p == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                m84677a((ViewPager) parent, true, true);
            }
        }
    }

    /* renamed from: e */
    private C25778g m84693e() {
        C25778g gVar;
        if (this.f68089L != null) {
            gVar = (C25778g) this.f68089L.acquire();
        } else {
            gVar = null;
        }
        if (gVar == null) {
            gVar = new C25778g(getContext());
        }
        gVar.setFocusable(true);
        gVar.setMinimumWidth(getTabMinWidth());
        return gVar;
    }

    /* renamed from: g */
    private void m84698g() {
        if (this.f68082E == null) {
            this.f68082E = new ValueAnimator();
            this.f68082E.setInterpolator(C25780a.f68176b);
            this.f68082E.setDuration(300);
            this.f68082E.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CommonTabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.f68109u.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C25777f fVar = (C25777f) this.f68109u.get(i);
            if (fVar != null && fVar.f68159b != null && !TextUtils.isEmpty(fVar.f68160c)) {
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
    private void m84699h() {
        int i;
        if (this.f68102m == 0) {
            i = Math.max(0, this.f68078A - this.f68091b);
        } else {
            i = 0;
        }
        C0991u.m4202b(this.f68090a, i, 0, 0, 0);
        switch (this.f68102m) {
            case 0:
                this.f68090a.setGravity(8388611);
                break;
            case 1:
                this.f68090a.setGravity(1);
                break;
        }
        mo66895a(true);
    }

    /* renamed from: c */
    private void m84688c() {
        for (int childCount = this.f68090a.getChildCount() - 1; childCount >= 0; childCount--) {
            m84691d(childCount);
        }
        Iterator it = this.f68109u.iterator();
        while (it.hasNext()) {
            C25777f fVar = (C25777f) it.next();
            it.remove();
            fVar.mo66956d();
            f68077t.release(fVar);
        }
        this.f68110v = null;
    }

    public void addView(View view) {
        m84678a(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.f68104o = z;
    }

    public void setCustomTabViewResId(int i) {
        this.f68103n = i;
    }

    public void setOnTabClickListener(C25771b bVar) {
        this.f68107r = bVar;
    }

    public CommonTabLayout(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private void m84683b(C25772c cVar) {
        this.f68080C.remove(cVar);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.f68090a.mo66936a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.f68090a.mo66941b(i);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        mo66891a(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        m84676a(viewPager, true);
    }

    /* renamed from: b */
    private void m84684b(C25777f fVar) {
        m84685b(fVar, this.f68109u.isEmpty());
    }

    /* renamed from: c */
    private void m84689c(C25777f fVar) {
        this.f68090a.addView(fVar.f68165h, fVar.f68162e, m84696f());
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        m84698g();
        this.f68082E.addListener(animatorListener);
    }

    public void setTabGravity(int i) {
        if (this.f68101l != i) {
            this.f68101l = i;
            m84699h();
        }
    }

    public void setTabMode(int i) {
        if (i != this.f68102m) {
            this.f68102m = i;
            m84699h();
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f68096g != colorStateList) {
            this.f68096g = colorStateList;
            m84690d();
        }
    }

    /* renamed from: e */
    private void m84695e(C25777f fVar) {
        for (int size = this.f68080C.size() - 1; size >= 0; size--) {
            this.f68080C.get(size);
        }
    }

    /* renamed from: f */
    private void m84697f(C25777f fVar) {
        for (int size = this.f68080C.size() - 1; size >= 0; size--) {
            this.f68080C.get(size);
        }
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f68090a.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f68090a.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public void setOnTabSelectedListener(C25772c cVar) {
        if (this.f68079B != null) {
            m84683b(this.f68079B);
        }
        this.f68079B = cVar;
        if (cVar != null) {
            mo66892a(cVar);
        }
    }

    /* renamed from: a */
    private void m84678a(View view) {
        if (view instanceof C25782c) {
            m84682a((C25782c) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* renamed from: c */
    private C25777f m84687c(int i) {
        C25777f fVar = (C25777f) f68077t.acquire();
        if (fVar == null) {
            fVar = new C25777f();
        }
        fVar.f68164g = this;
        fVar.f68165h = m84693e();
        if (i > 0) {
            fVar.f68165h.mo66958a(fVar, false);
            fVar.mo66949a(i);
        } else {
            fVar.f68165h.setTab(fVar);
        }
        return fVar;
    }

    /* renamed from: d */
    private void m84691d(int i) {
        C25778g gVar = (C25778g) this.f68090a.getChildAt(i);
        this.f68090a.removeViewAt(i);
        if (gVar != null) {
            gVar.mo66957a();
            this.f68089L.release(gVar);
        }
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo66900b(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public void setTabMargin(int i) {
        this.f68111w = mo66900b(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.f68090a.getChildAt(i2);
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = mo66900b(i);
            marginLayoutParams.rightMargin = mo66900b(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: d */
    private void m84692d(C25777f fVar) {
        for (int size = this.f68080C.size() - 1; size >= 0; size--) {
            ((C25772c) this.f68080C.get(size)).mo66933a(fVar);
        }
    }

    /* renamed from: e */
    private void m84694e(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C0991u.m4167D(this) || this.f68090a.mo66939a()) {
                m84675a(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int a = m84673a(i, 0.0f);
            if (scrollX != a) {
                m84698g();
                this.f68082E.setIntValues(new int[]{scrollX, a});
                this.f68082E.start();
            }
            this.f68090a.mo66942b(i, C34943c.f91128x);
        }
    }

    /* renamed from: a */
    private void m84679a(LayoutParams layoutParams) {
        if (this.f68102m == 1 && this.f68101l == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        if (this.f68111w != 0) {
            layoutParams.leftMargin = this.f68111w;
            layoutParams.rightMargin = this.f68111w;
        }
    }

    public void addView(View view, int i) {
        m84678a(view);
    }

    public CommonTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m84676a(ViewPager viewPager, boolean z) {
        m84677a(viewPager, true, false);
    }

    /* renamed from: a */
    private static ColorStateList m84674a(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    /* renamed from: b */
    private void m84685b(C25777f fVar, boolean z) {
        m84681a(fVar, this.f68109u.size(), z);
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m84678a(view);
    }

    /* renamed from: a */
    private int m84673a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f68102m != 0) {
            return 0;
        }
        View childAt = this.f68090a.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f68090a.getChildCount()) {
            view = this.f68090a.getChildAt(i4);
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
        int i5 = (int) (((float) (i2 + i3 + (this.f68111w * 4))) * 0.5f * f);
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
            int r0 = r5.mo66900b(r0)
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
            int r1 = r5.f68113y
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.f68113y
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.mo66900b(r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.f68100k = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.f68102m
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.widget.tablayout.CommonTabLayout.onMeasure(int, int):void");
    }

    /* renamed from: a */
    private void m84680a(C25777f fVar, int i) {
        fVar.f68162e = i;
        this.f68109u.add(i, fVar);
        int size = this.f68109u.size();
        while (true) {
            i++;
            if (i < size) {
                ((C25777f) this.f68109u.get(i)).f68162e = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m84675a(int i, float f, boolean z) {
        mo66889a(i, 0.0f, true, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        m84678a(view);
    }

    /* renamed from: a */
    private void m84677a(ViewPager viewPager, boolean z, boolean z2) {
        if (this.f68105p != null) {
            if (this.f68106q != null) {
                this.f68105p.removeOnPageChangeListener(this.f68106q);
            }
            if (this.f68085H != null) {
                this.f68105p.removeOnAdapterChangeListener(this.f68085H);
            }
        }
        if (this.f68081D != null) {
            m84683b(this.f68081D);
            this.f68081D = null;
        }
        if (viewPager != null) {
            this.f68105p = viewPager;
            if (this.f68106q == null) {
                this.f68106q = new TabLayoutOnPageChangeListener(this);
            }
            this.f68106q.mo66927a();
            viewPager.addOnPageChangeListener(this.f68106q);
            this.f68081D = new C25779h(viewPager);
            mo66892a(this.f68081D);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                mo66891a(adapter, z);
            }
            if (this.f68085H == null) {
                this.f68085H = new C25770a();
            }
            this.f68085H.f68134a = z;
            viewPager.addOnAdapterChangeListener(this.f68085H);
            m84675a(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.f68105p = null;
            mo66891a((PagerAdapter) null, false);
        }
        this.f68086I = z2;
    }

    /* JADX INFO: finally extract failed */
    public CommonTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f68109u = new ArrayList<>();
        this.f68100k = Integer.MAX_VALUE;
        this.f68080C = new ArrayList<>();
        this.f68089L = new SimplePool(12);
        C25783d.m84739a(context);
        setHorizontalScrollBarEnabled(false);
        this.f68090a = new C25774e(context);
        super.addView(this.f68090a, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TabLayout, i, R.style.qg);
        this.f68090a.mo66941b(obtainStyledAttributes.getDimensionPixelSize(10, 0));
        this.f68090a.mo66936a(obtainStyledAttributes.getColor(7, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.f68091b = dimensionPixelSize;
        this.f68092c = dimensionPixelSize;
        this.f68093d = dimensionPixelSize;
        this.f68094e = dimensionPixelSize;
        this.f68091b = obtainStyledAttributes.getDimensionPixelSize(18, this.f68091b);
        this.f68092c = obtainStyledAttributes.getDimensionPixelSize(19, this.f68092c);
        this.f68093d = obtainStyledAttributes.getDimensionPixelSize(17, this.f68093d);
        this.f68094e = obtainStyledAttributes.getDimensionPixelSize(16, this.f68094e);
        this.f68095f = obtainStyledAttributes.getResourceId(22, R.style.l1);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(this.f68095f, android.support.p029v7.appcompat.R$styleable.TextAppearance);
        try {
            this.f68097h = (float) obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.f68096g = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(23)) {
                this.f68096g = obtainStyledAttributes.getColorStateList(23);
            }
            if (obtainStyledAttributes.hasValue(21)) {
                this.f68096g = m84674a(this.f68096g.getDefaultColor(), obtainStyledAttributes.getColor(21, 0));
            }
            this.f68112x = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.f68113y = obtainStyledAttributes.getDimensionPixelSize(12, -1);
            this.f68099j = obtainStyledAttributes.getResourceId(0, 0);
            this.f68078A = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.f68102m = obtainStyledAttributes.getInt(14, 1);
            this.f68101l = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.f68098i = (float) resources.getDimensionPixelSize(R.dimen.fz);
            this.f68114z = resources.getDimensionPixelSize(R.dimen.fx);
            this.f68087J = C9738o.m28708b(getContext(), 1.5f);
            this.f68088K = C9738o.m28708b(getContext(), 1.5f);
            this.f68108s = getResources().getConfiguration().orientation;
            m84699h();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    /* renamed from: a */
    private void m84681a(C25777f fVar, int i, boolean z) {
        if (fVar.f68164g == this) {
            m84680a(fVar, i);
            m84689c(fVar);
            if (z) {
                fVar.mo66952a();
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
