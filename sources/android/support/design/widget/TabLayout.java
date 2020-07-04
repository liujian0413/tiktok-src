package android.support.design.widget;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build.VERSION;
import android.support.design.R$styleable;
import android.support.design.internal.C0296b;
import android.support.design.internal.C0297c;
import android.support.design.p015a.C0234a;
import android.support.design.p019e.C0272a;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.util.Pools.C0887a;
import android.support.p022v4.util.Pools.SimplePool;
import android.support.p022v4.util.Pools.SynchronizedPool;
import android.support.p022v4.view.C0976h;
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
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@C0931a
public class TabLayout extends HorizontalScrollView {
    private static final C0887a<C0376f> tabPool = new SynchronizedPool(16);
    private C0369a adapterChangeListener;
    private int contentInsetStart;
    private C0370b currentVpSelectedListener;
    boolean inlineLabel;
    int mode;
    private TabLayoutOnPageChangeListener pageChangeListener;
    private PagerAdapter pagerAdapter;
    private DataSetObserver pagerAdapterObserver;
    private final int requestedTabMaxWidth;
    private final int requestedTabMinWidth;
    private ValueAnimator scrollAnimator;
    private final int scrollableTabMinWidth;
    private C0370b selectedListener;
    private final ArrayList<C0370b> selectedListeners;
    private C0376f selectedTab;
    private boolean setupViewPagerImplicitly;
    private final C0373e slidingTabIndicator;
    final int tabBackgroundResId;
    int tabGravity;
    ColorStateList tabIconTint;
    Mode tabIconTintMode;
    int tabIndicatorAnimationDuration;
    boolean tabIndicatorFullWidth;
    int tabIndicatorGravity;
    int tabMaxWidth;
    int tabPaddingBottom;
    int tabPaddingEnd;
    int tabPaddingStart;
    int tabPaddingTop;
    ColorStateList tabRippleColorStateList;
    Drawable tabSelectedIndicator;
    int tabTextAppearance;
    ColorStateList tabTextColors;
    float tabTextMultiLineSize;
    float tabTextSize;
    public final RectF tabViewContentBounds;
    private final C0887a<TabView> tabViewPool;
    private final ArrayList<C0376f> tabs;
    boolean unboundedRipple;
    ViewPager viewPager;

    public static class TabLayoutOnPageChangeListener implements C0935e {

        /* renamed from: a */
        private final WeakReference<TabLayout> f1511a;

        /* renamed from: b */
        private int f1512b;

        /* renamed from: c */
        private int f1513c;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1650a() {
            this.f1513c = 0;
            this.f1512b = 0;
        }

        public void onPageScrollStateChanged(int i) {
            this.f1512b = this.f1513c;
            this.f1513c = i;
        }

        public TabLayoutOnPageChangeListener(TabLayout tabLayout) {
            this.f1511a = new WeakReference<>(tabLayout);
        }

        public void onPageSelected(int i) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f1511a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                if (this.f1513c == 0 || (this.f1513c == 2 && this.f1512b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.selectTab(tabLayout.getTabAt(i), z);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = (TabLayout) this.f1511a.get();
            if (tabLayout != null) {
                boolean z2 = false;
                if (this.f1513c != 2 || this.f1512b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(this.f1513c == 2 && this.f1512b == 0)) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }
    }

    class TabView extends LinearLayout {
        private Drawable baseBackgroundDrawable;
        private ImageView customIconView;
        private TextView customTextView;
        private View customView;
        private int defaultMaxLines = 2;
        private ImageView iconView;
        private C0376f tab;
        private TextView textView;

        public C0376f getTab() {
            return this.tab;
        }

        /* access modifiers changed from: 0000 */
        public void reset() {
            setTab(null);
            setSelected(false);
        }

        public boolean performClick() {
            boolean performClick = super.performClick();
            if (this.tab == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            this.tab.mo1689a();
            return true;
        }

        /* access modifiers changed from: protected */
        public void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            boolean z = false;
            if (this.baseBackgroundDrawable != null && this.baseBackgroundDrawable.isStateful()) {
                z = false | this.baseBackgroundDrawable.setState(drawableState);
            }
            if (z) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        /* access modifiers changed from: 0000 */
        public final void updateOrientation() {
            setOrientation(TabLayout.this.inlineLabel ^ true ? 1 : 0);
            if (this.customTextView == null && this.customIconView == null) {
                updateTextAndIcon(this.textView, this.iconView);
            } else {
                updateTextAndIcon(this.customTextView, this.customIconView);
            }
        }

        public int getContentWidth() {
            View[] viewArr = {this.textView, this.iconView, this.customView};
            int i = 0;
            int i2 = 0;
            boolean z = false;
            for (int i3 = 0; i3 < 3; i3++) {
                View view = viewArr[i3];
                if (view != null && view.getVisibility() == 0) {
                    if (z) {
                        i2 = Math.min(i2, view.getLeft());
                    } else {
                        i2 = view.getLeft();
                    }
                    if (z) {
                        i = Math.max(i, view.getRight());
                    } else {
                        i = view.getRight();
                    }
                    z = true;
                }
            }
            return i - i2;
        }

        /* access modifiers changed from: 0000 */
        public final void update() {
            View view;
            C0376f fVar = this.tab;
            Drawable drawable = null;
            if (fVar != null) {
                view = fVar.f1539f;
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
                this.customView = view;
                if (this.textView != null) {
                    this.textView.setVisibility(8);
                }
                if (this.iconView != null) {
                    this.iconView.setVisibility(8);
                    this.iconView.setImageDrawable(null);
                }
                this.customTextView = (TextView) view.findViewById(16908308);
                if (this.customTextView != null) {
                    this.defaultMaxLines = C1056n.m4563a(this.customTextView);
                }
                this.customIconView = (ImageView) view.findViewById(16908294);
            } else {
                if (this.customView != null) {
                    removeView(this.customView);
                    this.customView = null;
                }
                this.customTextView = null;
                this.customIconView = null;
            }
            boolean z = false;
            if (this.customView == null) {
                if (this.iconView == null) {
                    ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(R.layout.jd, this, false);
                    addView(imageView, 0);
                    this.iconView = imageView;
                }
                if (!(fVar == null || fVar.f1535b == null)) {
                    drawable = C0727a.m3116g(fVar.f1535b).mutate();
                }
                if (drawable != null) {
                    C0727a.m3105a(drawable, TabLayout.this.tabIconTint);
                    if (TabLayout.this.tabIconTintMode != null) {
                        C0727a.m3108a(drawable, TabLayout.this.tabIconTintMode);
                    }
                }
                if (this.textView == null) {
                    TextView textView2 = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.je, this, false);
                    addView(textView2);
                    this.textView = textView2;
                    this.defaultMaxLines = C1056n.m4563a(this.textView);
                }
                C1056n.m4567a(this.textView, TabLayout.this.tabTextAppearance);
                if (TabLayout.this.tabTextColors != null) {
                    this.textView.setTextColor(TabLayout.this.tabTextColors);
                }
                updateTextAndIcon(this.textView, this.iconView);
            } else if (!(this.customTextView == null && this.customIconView == null)) {
                updateTextAndIcon(this.customTextView, this.customIconView);
            }
            if (fVar != null && !TextUtils.isEmpty(fVar.f1537d)) {
                setContentDescription(fVar.f1537d);
            }
            if (fVar != null && fVar.mo1691b()) {
                z = true;
            }
            setSelected(z);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName(C1067a.class.getName());
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName(C1067a.class.getName());
        }

        /* access modifiers changed from: 0000 */
        public void setTab(C0376f fVar) {
            if (fVar != this.tab) {
                this.tab = fVar;
                update();
            }
        }

        public void drawBackground(Canvas canvas) {
            if (this.baseBackgroundDrawable != null) {
                this.baseBackgroundDrawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.baseBackgroundDrawable.draw(canvas);
            }
        }

        public void setSelected(boolean z) {
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
            if (this.textView != null) {
                this.textView.setSelected(z);
            }
            if (this.iconView != null) {
                this.iconView.setSelected(z);
            }
            if (this.customView != null) {
                this.customView.setSelected(z);
            }
        }

        /* JADX WARNING: type inference failed for: r7v2, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: type inference failed for: r1v1, types: [android.graphics.drawable.LayerDrawable] */
        /* JADX WARNING: type inference failed for: r7v5 */
        /* JADX WARNING: type inference failed for: r2v1, types: [android.graphics.drawable.RippleDrawable] */
        /* JADX WARNING: type inference failed for: r7v7 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void updateBackgroundDrawable(android.content.Context r7) {
            /*
                r6 = this;
                android.support.design.widget.TabLayout r0 = android.support.design.widget.TabLayout.this
                int r0 = r0.tabBackgroundResId
                r1 = 0
                if (r0 == 0) goto L_0x0027
                android.support.design.widget.TabLayout r0 = android.support.design.widget.TabLayout.this
                int r0 = r0.tabBackgroundResId
                android.graphics.drawable.Drawable r7 = android.support.p029v7.p030a.p031a.C1065a.m4641b(r7, r0)
                r6.baseBackgroundDrawable = r7
                android.graphics.drawable.Drawable r7 = r6.baseBackgroundDrawable
                if (r7 == 0) goto L_0x0029
                android.graphics.drawable.Drawable r7 = r6.baseBackgroundDrawable
                boolean r7 = r7.isStateful()
                if (r7 == 0) goto L_0x0029
                android.graphics.drawable.Drawable r7 = r6.baseBackgroundDrawable
                int[] r0 = r6.getDrawableState()
                r7.setState(r0)
                goto L_0x0029
            L_0x0027:
                r6.baseBackgroundDrawable = r1
            L_0x0029:
                android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
                r7.<init>()
                r0 = r7
                android.graphics.drawable.GradientDrawable r0 = (android.graphics.drawable.GradientDrawable) r0
                r2 = 0
                r0.setColor(r2)
                android.support.design.widget.TabLayout r0 = android.support.design.widget.TabLayout.this
                android.content.res.ColorStateList r0 = r0.tabRippleColorStateList
                if (r0 == 0) goto L_0x0082
                android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
                r0.<init>()
                r3 = 925353388(0x3727c5ac, float:1.0E-5)
                r0.setCornerRadius(r3)
                r3 = -1
                r0.setColor(r3)
                android.support.design.widget.TabLayout r3 = android.support.design.widget.TabLayout.this
                android.content.res.ColorStateList r3 = r3.tabRippleColorStateList
                android.content.res.ColorStateList r3 = android.support.design.p020f.C0276a.m1088a(r3)
                int r4 = android.os.Build.VERSION.SDK_INT
                r5 = 21
                if (r4 < r5) goto L_0x006d
                android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
                android.support.design.widget.TabLayout r4 = android.support.design.widget.TabLayout.this
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L_0x0061
                r7 = r1
            L_0x0061:
                android.support.design.widget.TabLayout r4 = android.support.design.widget.TabLayout.this
                boolean r4 = r4.unboundedRipple
                if (r4 == 0) goto L_0x0068
                r0 = r1
            L_0x0068:
                r2.<init>(r3, r7, r0)
                r7 = r2
                goto L_0x0082
            L_0x006d:
                android.graphics.drawable.Drawable r0 = android.support.p022v4.graphics.drawable.C0727a.m3116g(r0)
                android.support.p022v4.graphics.drawable.C0727a.m3105a(r0, r3)
                android.graphics.drawable.LayerDrawable r1 = new android.graphics.drawable.LayerDrawable
                r3 = 2
                android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[r3]
                r3[r2] = r7
                r7 = 1
                r3[r7] = r0
                r1.<init>(r3)
                r7 = r1
            L_0x0082:
                android.support.p022v4.view.C0991u.m4185a(r6, r7)
                android.support.design.widget.TabLayout r7 = android.support.design.widget.TabLayout.this
                r7.invalidate()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.TabView.updateBackgroundDrawable(android.content.Context):void");
        }

        public TabView(Context context) {
            super(context);
            updateBackgroundDrawable(context);
            C0991u.m4202b(this, TabLayout.this.tabPaddingStart, TabLayout.this.tabPaddingTop, TabLayout.this.tabPaddingEnd, TabLayout.this.tabPaddingBottom);
            setGravity(17);
            setOrientation(TabLayout.this.inlineLabel ^ true ? 1 : 0);
            setClickable(true);
            C0991u.m4189a((View) this, C0987q.m4161a(getContext(), 1002));
        }

        private void updateTextAndIcon(TextView textView2, ImageView imageView) {
            Drawable drawable;
            CharSequence charSequence;
            CharSequence charSequence2;
            int i;
            if (this.tab == null || this.tab.f1535b == null) {
                drawable = null;
            } else {
                drawable = C0727a.m3116g(this.tab.f1535b).mutate();
            }
            if (this.tab != null) {
                charSequence = this.tab.f1536c;
            } else {
                charSequence = null;
            }
            if (imageView != null) {
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequence);
            if (textView2 != null) {
                if (z) {
                    textView2.setText(charSequence);
                    textView2.setVisibility(0);
                    setVisibility(0);
                } else {
                    textView2.setVisibility(8);
                    textView2.setText(null);
                }
            }
            if (imageView != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) imageView.getLayoutParams();
                if (!z || imageView.getVisibility() != 0) {
                    i = 0;
                } else {
                    i = TabLayout.this.dpToPx(8);
                }
                if (TabLayout.this.inlineLabel) {
                    if (i != C0976h.m4121b(marginLayoutParams)) {
                        C0976h.m4120a(marginLayoutParams, i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    C0976h.m4120a(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            if (this.tab != null) {
                charSequence2 = this.tab.f1537d;
            } else {
                charSequence2 = null;
            }
            if (z) {
                charSequence2 = null;
            }
            C1366aw.m6763a(this, charSequence2);
        }

        public void onMeasure(int i, int i2) {
            int size = MeasureSpec.getSize(i);
            int mode = MeasureSpec.getMode(i);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = MeasureSpec.makeMeasureSpec(TabLayout.this.tabMaxWidth, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.textView != null) {
                float f = TabLayout.this.tabTextSize;
                int i3 = this.defaultMaxLines;
                boolean z = true;
                if (this.iconView != null && this.iconView.getVisibility() == 0) {
                    i3 = 1;
                } else if (this.textView != null && this.textView.getLineCount() > 1) {
                    f = TabLayout.this.tabTextMultiLineSize;
                }
                float textSize = this.textView.getTextSize();
                int lineCount = this.textView.getLineCount();
                int a = C1056n.m4563a(this.textView);
                if (f != textSize || (a >= 0 && i3 != a)) {
                    if (TabLayout.this.mode == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.textView.getLayout();
                        if (layout == null || approximateLineWidth(layout, 0, f) > ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()))) {
                            z = false;
                        }
                    }
                    if (z) {
                        this.textView.setTextSize(0, f);
                        this.textView.setMaxLines(i3);
                        super.onMeasure(i, i2);
                    }
                }
            }
        }

        private float approximateLineWidth(Layout layout, int i, float f) {
            return layout.getLineWidth(i) * (f / layout.getPaint().getTextSize());
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$a */
    class C0369a implements C0934d {

        /* renamed from: a */
        public boolean f1514a;

        C0369a() {
        }

        /* renamed from: a */
        public final void mo1668a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            if (TabLayout.this.viewPager == viewPager) {
                TabLayout.this.setPagerAdapter(pagerAdapter2, this.f1514a);
            }
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$b */
    public interface C0370b<T extends C0376f> {
        /* renamed from: a */
        void mo1669a(T t);

        /* renamed from: b */
        void mo1670b(T t);
    }

    /* renamed from: android.support.design.widget.TabLayout$c */
    public interface C0371c extends C0370b {
    }

    /* renamed from: android.support.design.widget.TabLayout$d */
    class C0372d extends DataSetObserver {
        public final void onChanged() {
            TabLayout.this.populateFromPagerAdapter();
        }

        public final void onInvalidated() {
            TabLayout.this.populateFromPagerAdapter();
        }

        C0372d() {
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$e */
    class C0373e extends LinearLayout {

        /* renamed from: a */
        int f1517a = -1;

        /* renamed from: b */
        float f1518b;

        /* renamed from: d */
        private int f1520d;

        /* renamed from: e */
        private final Paint f1521e;

        /* renamed from: f */
        private final GradientDrawable f1522f;

        /* renamed from: g */
        private int f1523g = -1;

        /* renamed from: h */
        private int f1524h = -1;

        /* renamed from: i */
        private int f1525i = -1;

        /* renamed from: j */
        private ValueAnimator f1526j;

        /* renamed from: b */
        private void m1613b() {
            int i;
            int i2;
            View childAt = getChildAt(this.f1517a);
            if (childAt == null || childAt.getWidth() <= 0) {
                i2 = -1;
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (!TabLayout.this.tabIndicatorFullWidth && (childAt instanceof TabView)) {
                    m1612a((TabView) childAt, TabLayout.this.tabViewContentBounds);
                    i2 = (int) TabLayout.this.tabViewContentBounds.left;
                    i = (int) TabLayout.this.tabViewContentBounds.right;
                }
                if (this.f1518b > 0.0f && this.f1517a < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f1517a + 1);
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (!TabLayout.this.tabIndicatorFullWidth && (childAt2 instanceof TabView)) {
                        m1612a((TabView) childAt2, TabLayout.this.tabViewContentBounds);
                        left = (int) TabLayout.this.tabViewContentBounds.left;
                        right = (int) TabLayout.this.tabViewContentBounds.right;
                    }
                    i2 = (int) ((this.f1518b * ((float) left)) + ((1.0f - this.f1518b) * ((float) i2)));
                    i = (int) ((this.f1518b * ((float) right)) + ((1.0f - this.f1518b) * ((float) i)));
                }
            }
            mo1675a(i2, i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo1676a() {
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
        public final void mo1677b(int i) {
            if (this.f1520d != i) {
                this.f1520d = i;
                C0991u.m4212e(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1673a(int i) {
            if (this.f1521e.getColor() != i) {
                this.f1521e.setColor(i);
                C0991u.m4212e(this);
            }
        }

        public final void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (VERSION.SDK_INT < 23 && this.f1523g != i) {
                requestLayout();
                this.f1523g = i;
            }
        }

        public final void draw(Canvas canvas) {
            int i;
            Drawable drawable;
            int i2 = 0;
            if (TabLayout.this.tabSelectedIndicator != null) {
                i = TabLayout.this.tabSelectedIndicator.getIntrinsicHeight();
            } else {
                i = 0;
            }
            if (this.f1520d >= 0) {
                i = this.f1520d;
            }
            switch (TabLayout.this.tabIndicatorGravity) {
                case 0:
                    i2 = getHeight() - i;
                    i = getHeight();
                    break;
                case 1:
                    i2 = (getHeight() - i) / 2;
                    i = (getHeight() + i) / 2;
                    break;
                case 2:
                    break;
                case 3:
                    i = getHeight();
                    break;
                default:
                    i = 0;
                    break;
            }
            if (this.f1524h >= 0 && this.f1525i > this.f1524h) {
                if (TabLayout.this.tabSelectedIndicator != null) {
                    drawable = TabLayout.this.tabSelectedIndicator;
                } else {
                    drawable = this.f1522f;
                }
                Drawable g = C0727a.m3116g(drawable);
                g.setBounds(this.f1524h, i2, this.f1525i, i);
                if (this.f1521e != null) {
                    if (VERSION.SDK_INT == 21) {
                        g.setColorFilter(this.f1521e.getColor(), Mode.SRC_IN);
                    } else {
                        C0727a.m3103a(g, this.f1521e.getColor());
                    }
                }
                g.draw(canvas);
            }
            super.draw(canvas);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1675a(int i, int i2) {
            if (i != this.f1524h || i2 != this.f1525i) {
                this.f1524h = i;
                this.f1525i = i2;
                C0991u.m4212e(this);
            }
        }

        C0373e(Context context) {
            super(context);
            setWillNotDraw(false);
            this.f1521e = new Paint();
            this.f1522f = new GradientDrawable();
        }

        /* renamed from: a */
        private void m1612a(TabView tabView, RectF rectF) {
            int contentWidth = tabView.getContentWidth();
            if (contentWidth < TabLayout.this.dpToPx(24)) {
                contentWidth = TabLayout.this.dpToPx(24);
            }
            int left = (tabView.getLeft() + tabView.getRight()) / 2;
            int i = contentWidth / 2;
            rectF.set((float) (left - i), 0.0f, (float) (left + i), 0.0f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo1674a(int i, float f) {
            if (this.f1526j != null && this.f1526j.isRunning()) {
                this.f1526j.cancel();
            }
            this.f1517a = i;
            this.f1518b = f;
            m1613b();
        }

        /* access modifiers changed from: protected */
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (MeasureSpec.getMode(i) == 1073741824) {
                boolean z = true;
                if (TabLayout.this.mode == 1 && TabLayout.this.tabGravity == 1) {
                    int childCount = getChildCount();
                    int i3 = 0;
                    for (int i4 = 0; i4 < childCount; i4++) {
                        View childAt = getChildAt(i4);
                        if (childAt.getVisibility() == 0) {
                            i3 = Math.max(i3, childAt.getMeasuredWidth());
                        }
                    }
                    if (i3 > 0) {
                        if (i3 * childCount <= getMeasuredWidth() - (TabLayout.this.dpToPx(16) * 2)) {
                            boolean z2 = false;
                            for (int i5 = 0; i5 < childCount; i5++) {
                                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                                if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                                    layoutParams.width = i3;
                                    layoutParams.weight = 0.0f;
                                    z2 = true;
                                }
                            }
                            z = z2;
                        } else {
                            TabLayout.this.tabGravity = 0;
                            TabLayout.this.updateTabViews(false);
                        }
                        if (z) {
                            super.onMeasure(i, i2);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo1678b(final int i, int i2) {
            if (this.f1526j != null && this.f1526j.isRunning()) {
                this.f1526j.cancel();
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                m1613b();
                return;
            }
            int left = childAt.getLeft();
            int right = childAt.getRight();
            if (!TabLayout.this.tabIndicatorFullWidth && (childAt instanceof TabView)) {
                m1612a((TabView) childAt, TabLayout.this.tabViewContentBounds);
                left = (int) TabLayout.this.tabViewContentBounds.left;
                right = (int) TabLayout.this.tabViewContentBounds.right;
            }
            final int i3 = left;
            final int i4 = right;
            final int i5 = this.f1524h;
            final int i6 = this.f1525i;
            if (!(i5 == i3 && i6 == i4)) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f1526j = valueAnimator;
                valueAnimator.setInterpolator(C0234a.f873b);
                valueAnimator.setDuration((long) i2);
                valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
                C03741 r3 = new AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float animatedFraction = valueAnimator.getAnimatedFraction();
                        C0373e.this.mo1675a(C0234a.m831a(i5, i3, animatedFraction), C0234a.m831a(i6, i4, animatedFraction));
                    }
                };
                valueAnimator.addUpdateListener(r3);
                valueAnimator.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C0373e.this.f1517a = i;
                        C0373e.this.f1518b = 0.0f;
                    }
                });
                valueAnimator.start();
            }
        }

        /* access modifiers changed from: protected */
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (this.f1526j == null || !this.f1526j.isRunning()) {
                m1613b();
                return;
            }
            this.f1526j.cancel();
            mo1678b(this.f1517a, Math.round((1.0f - this.f1526j.getAnimatedFraction()) * ((float) this.f1526j.getDuration())));
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$f */
    public static class C0376f {

        /* renamed from: a */
        public Object f1534a;

        /* renamed from: b */
        public Drawable f1535b;

        /* renamed from: c */
        public CharSequence f1536c;

        /* renamed from: d */
        public CharSequence f1537d;

        /* renamed from: e */
        public int f1538e = -1;

        /* renamed from: f */
        public View f1539f;

        /* renamed from: g */
        public TabLayout f1540g;

        /* renamed from: h */
        public TabView f1541h;

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo1692c() {
            if (this.f1541h != null) {
                this.f1541h.update();
            }
        }

        /* renamed from: b */
        public final boolean mo1691b() {
            if (this.f1540g == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (this.f1540g.getSelectedTabPosition() == this.f1538e) {
                return true;
            } else {
                return false;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final void mo1693d() {
            this.f1540g = null;
            this.f1541h = null;
            this.f1534a = null;
            this.f1535b = null;
            this.f1536c = null;
            this.f1537d = null;
            this.f1538e = -1;
            this.f1539f = null;
        }

        /* renamed from: a */
        public final void mo1689a() {
            if (this.f1540g != null) {
                this.f1540g.selectTab(this);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        /* renamed from: a */
        public final C0376f mo1686a(Drawable drawable) {
            this.f1535b = drawable;
            mo1692c();
            return this;
        }

        /* renamed from: b */
        public final C0376f mo1690b(CharSequence charSequence) {
            this.f1537d = charSequence;
            mo1692c();
            return this;
        }

        /* renamed from: a */
        public final C0376f mo1687a(View view) {
            this.f1539f = view;
            mo1692c();
            return this;
        }

        /* renamed from: a */
        public final C0376f mo1685a(int i) {
            return mo1687a(LayoutInflater.from(this.f1541h.getContext()).inflate(i, this.f1541h, false));
        }

        /* renamed from: a */
        public final C0376f mo1688a(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f1537d) && !TextUtils.isEmpty(charSequence)) {
                this.f1541h.setContentDescription(charSequence);
            }
            this.f1536c = charSequence;
            mo1692c();
            return this;
        }
    }

    /* renamed from: android.support.design.widget.TabLayout$g */
    public static class C0377g implements C0371c {

        /* renamed from: a */
        private final ViewPager f1542a;

        /* renamed from: b */
        public final void mo1670b(C0376f fVar) {
        }

        public C0377g(ViewPager viewPager) {
            this.f1542a = viewPager;
        }

        /* renamed from: a */
        public final void mo1669a(C0376f fVar) {
            this.f1542a.setCurrentItem(fVar.f1538e);
        }
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    /* access modifiers changed from: 0000 */
    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    private LayoutParams createLayoutParamsForTabs() {
        LayoutParams layoutParams = new LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    /* access modifiers changed from: protected */
    public C0376f createTabFromPool() {
        C0376f fVar = (C0376f) tabPool.acquire();
        if (fVar == null) {
            return new C0376f();
        }
        return fVar;
    }

    public int getSelectedTabPosition() {
        if (this.selectedTab != null) {
            return this.selectedTab.f1538e;
        }
        return -1;
    }

    public C0376f newTab() {
        C0376f createTabFromPool = createTabFromPool();
        createTabFromPool.f1540g = this;
        createTabFromPool.f1541h = createTabView(createTabFromPool);
        return createTabFromPool;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    private int getTabMinWidth() {
        if (this.requestedTabMinWidth != -1) {
            return this.requestedTabMinWidth;
        }
        if (this.mode == 0) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            ((C0376f) this.tabs.get(i)).mo1692c();
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    private void applyModeAndGravity() {
        int i;
        if (this.mode == 0) {
            i = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
        } else {
            i = 0;
        }
        C0991u.m4202b(this.slidingTabIndicator, i, 0, 0, 0);
        switch (this.mode) {
            case 0:
                this.slidingTabIndicator.setGravity(8388611);
                break;
            case 1:
                this.slidingTabIndicator.setGravity(1);
                break;
        }
        updateTabViews(true);
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            this.scrollAnimator = new ValueAnimator();
            this.scrollAnimator.setInterpolator(C0234a.f873b);
            this.scrollAnimator.setDuration((long) this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                }
            });
        }
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C0376f fVar = (C0376f) this.tabs.get(i);
            if (fVar != null && fVar.f1535b != null && !TextUtils.isEmpty(fVar.f1536c)) {
                z = true;
                break;
            }
            i++;
        }
        if (!z || this.inlineLabel) {
            return 48;
        }
        return 72;
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator it = this.tabs.iterator();
        while (it.hasNext()) {
            C0376f fVar = (C0376f) it.next();
            it.remove();
            fVar.mo1693d();
            releaseFromTabPool(fVar);
        }
        this.selectedTab = null;
    }

    /* access modifiers changed from: 0000 */
    public void populateFromPagerAdapter() {
        removeAllTabs();
        if (this.pagerAdapter != null) {
            int count = this.pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                addTab(newTab().mo1688a(this.pagerAdapter.getPageTitle(i)), false);
            }
            if (this.viewPager != null && count > 0) {
                int currentItem = this.viewPager.getCurrentItem();
                if (currentItem != getSelectedTabPosition() && currentItem < getTabCount()) {
                    selectTab(getTabAt(currentItem));
                }
            }
        }
    }

    public void addView(View view) {
        addViewInternal(view);
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public boolean releaseFromTabPool(C0376f fVar) {
        return tabPool.release(fVar);
    }

    public void removeOnTabSelectedListener(C0370b bVar) {
        this.selectedListeners.remove(bVar);
    }

    /* access modifiers changed from: 0000 */
    public void selectTab(C0376f fVar) {
        selectTab(fVar, true);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.slidingTabIndicator.mo1673a(i);
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.slidingTabIndicator.mo1677b(i);
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        C0991u.m4212e(this.slidingTabIndicator);
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter2) {
        setPagerAdapter(pagerAdapter2, false);
    }

    public void setupWithViewPager(ViewPager viewPager2) {
        setupWithViewPager(viewPager2, true);
    }

    private void addTabView(C0376f fVar) {
        this.slidingTabIndicator.addView(fVar.f1541h, fVar.f1538e, createLayoutParamsForTabs());
    }

    public void addOnTabSelectedListener(C0370b bVar) {
        if (!this.selectedListeners.contains(bVar)) {
            this.selectedListeners.add(bVar);
        }
    }

    public void addTab(C0376f fVar) {
        addTab(fVar, this.tabs.isEmpty());
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    /* access modifiers changed from: 0000 */
    public void setScrollAnimatorListener(AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.tabSelectedIndicator != drawable) {
            this.tabSelectedIndicator = drawable;
            C0991u.m4212e(this.slidingTabIndicator);
        }
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            C0991u.m4212e(this.slidingTabIndicator);
        }
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C1065a.m4638a(getContext(), i));
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C1065a.m4638a(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    private void addViewInternal(View view) {
        if (view instanceof C0411n) {
            addTabFromItemView((C0411n) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void dispatchTabReselected(C0376f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            this.selectedListeners.get(size);
        }
    }

    private void dispatchTabSelected(C0376f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((C0370b) this.selectedListeners.get(size)).mo1669a(fVar);
        }
    }

    private void dispatchTabUnselected(C0376f fVar) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((C0370b) this.selectedListeners.get(size)).mo1670b(fVar);
        }
    }

    private void removeTabViewAt(int i) {
        TabView tabView = (TabView) this.slidingTabIndicator.getChildAt(i);
        this.slidingTabIndicator.removeViewAt(i);
        if (tabView != null) {
            tabView.reset();
            this.tabViewPool.release(tabView);
        }
        requestLayout();
    }

    private void updateTabViewLayoutParams(LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
            return;
        }
        layoutParams.width = -2;
        layoutParams.weight = 0.0f;
    }

    /* access modifiers changed from: 0000 */
    public int dpToPx(int i) {
        return Math.round(getResources().getDisplayMetrics().density * ((float) i));
    }

    public C0376f getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C0376f) this.tabs.get(i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            if (childAt instanceof TabView) {
                ((TabView) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    public void removeTab(C0376f fVar) {
        if (fVar.f1540g == this) {
            removeTabAt(fVar.f1538e);
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void setOnTabSelectedListener(C0370b bVar) {
        if (this.selectedListener != null) {
            removeOnTabSelectedListener(this.selectedListener);
        }
        this.selectedListener = bVar;
        if (bVar != null) {
            addOnTabSelectedListener(bVar);
        }
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C1065a.m4641b(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    private void addTabFromItemView(C0411n nVar) {
        C0376f newTab = newTab();
        if (nVar.f1766a != null) {
            newTab.mo1688a(nVar.f1766a);
        }
        if (nVar.f1767b != null) {
            newTab.mo1686a(nVar.f1767b);
        }
        if (nVar.f1768c != 0) {
            newTab.mo1685a(nVar.f1768c);
        }
        if (!TextUtils.isEmpty(nVar.getContentDescription())) {
            newTab.mo1690b(nVar.getContentDescription());
        }
        addTab(newTab);
    }

    private TabView createTabView(C0376f fVar) {
        TabView tabView;
        if (this.tabViewPool != null) {
            tabView = (TabView) this.tabViewPool.acquire();
        } else {
            tabView = null;
        }
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(fVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(fVar.f1537d)) {
            tabView.setContentDescription(fVar.f1536c);
        } else {
            tabView.setContentDescription(fVar.f1537d);
        }
        return tabView;
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    private void animateToTab(int i) {
        if (i != -1) {
            if (getWindowToken() == null || !C0991u.m4167D(this) || this.slidingTabIndicator.mo1676a()) {
                setScrollPosition(i, 0.0f, true);
                return;
            }
            int scrollX = getScrollX();
            int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
            if (scrollX != calculateScrollXForTab) {
                ensureScrollAnimator();
                this.scrollAnimator.setIntValues(new int[]{scrollX, calculateScrollXForTab});
                this.scrollAnimator.start();
            }
            this.slidingTabIndicator.mo1678b(i, this.tabIndicatorAnimationDuration);
        }
    }

    public void removeTabAt(int i) {
        int i2;
        C0376f fVar;
        if (this.selectedTab != null) {
            i2 = this.selectedTab.f1538e;
        } else {
            i2 = 0;
        }
        removeTabViewAt(i);
        C0376f fVar2 = (C0376f) this.tabs.remove(i);
        if (fVar2 != null) {
            fVar2.mo1693d();
            releaseFromTabPool(fVar2);
        }
        int size = this.tabs.size();
        for (int i3 = i; i3 < size; i3++) {
            ((C0376f) this.tabs.get(i3)).f1538e = i3;
        }
        if (i2 == i) {
            if (this.tabs.isEmpty()) {
                fVar = null;
            } else {
                fVar = (C0376f) this.tabs.get(Math.max(0, i - 1));
            }
            selectTab(fVar);
        }
    }

    public void addView(View view, int i) {
        addViewInternal(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.a4k);
    }

    public void setupWithViewPager(ViewPager viewPager2, boolean z) {
        setupWithViewPager(viewPager2, z, false);
    }

    private void configureTab(C0376f fVar, int i) {
        fVar.f1538e = i;
        this.tabs.add(i, fVar);
        int size = this.tabs.size();
        while (true) {
            i++;
            if (i < size) {
                ((C0376f) this.tabs.get(i)).f1538e = i;
            } else {
                return;
            }
        }
    }

    private static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{SELECTED_STATE_SET, EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public void addTab(C0376f fVar, int i) {
        addTab(fVar, i, this.tabs.isEmpty());
    }

    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    /* access modifiers changed from: 0000 */
    public void selectTab(C0376f fVar, boolean z) {
        int i;
        C0376f fVar2 = this.selectedTab;
        if (fVar2 != fVar) {
            if (fVar != null) {
                i = fVar.f1538e;
            } else {
                i = -1;
            }
            if (z) {
                if ((fVar2 == null || fVar2.f1538e == -1) && i != -1) {
                    setScrollPosition(i, 0.0f, true);
                } else {
                    animateToTab(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.selectedTab = fVar;
            if (fVar2 != null) {
                dispatchTabUnselected(fVar2);
            }
            if (fVar != null) {
                dispatchTabSelected(fVar);
            }
        } else if (fVar2 != null) {
            dispatchTabReselected(fVar);
            animateToTab(fVar.f1538e);
        }
    }

    /* access modifiers changed from: 0000 */
    public void setPagerAdapter(PagerAdapter pagerAdapter2, boolean z) {
        if (!(this.pagerAdapter == null || this.pagerAdapterObserver == null)) {
            this.pagerAdapter.unregisterDataSetObserver(this.pagerAdapterObserver);
        }
        this.pagerAdapter = pagerAdapter2;
        if (z && pagerAdapter2 != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new C0372d();
            }
            pagerAdapter2.registerDataSetObserver(this.pagerAdapterObserver);
        }
        populateFromPagerAdapter();
    }

    private int calculateScrollXForTab(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.mode != 0) {
            return 0;
        }
        View childAt = this.slidingTabIndicator.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.slidingTabIndicator.getChildCount()) {
            view = this.slidingTabIndicator.getChildAt(i4);
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
        int i5 = (int) (((float) (i2 + i3)) * 0.5f * f);
        if (C0991u.m4220h(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    public void addTab(C0376f fVar, boolean z) {
        addTab(fVar, this.tabs.size(), z);
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
            int r0 = r5.dpToPx(r0)
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
            int r1 = r5.requestedTabMaxWidth
            if (r1 <= 0) goto L_0x0041
            int r0 = r5.requestedTabMaxWidth
            goto L_0x0048
        L_0x0041:
            r1 = 56
            int r1 = r5.dpToPx(r1)
            int r0 = r0 - r1
        L_0x0048:
            r5.tabMaxWidth = r0
        L_0x004a:
            super.onMeasure(r6, r7)
            int r6 = r5.getChildCount()
            r0 = 1
            if (r6 != r0) goto L_0x0096
            r6 = 0
            android.view.View r1 = r5.getChildAt(r6)
            int r2 = r5.mode
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
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.TabLayout.onMeasure(int, int):void");
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void addTab(C0376f fVar, int i, boolean z) {
        if (fVar.f1540g == this) {
            configureTab(fVar, i);
            addTabView(fVar);
            if (z) {
                fVar.mo1689a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    private void setupWithViewPager(ViewPager viewPager2, boolean z, boolean z2) {
        if (this.viewPager != null) {
            if (this.pageChangeListener != null) {
                this.viewPager.removeOnPageChangeListener(this.pageChangeListener);
            }
            if (this.adapterChangeListener != null) {
                this.viewPager.removeOnAdapterChangeListener(this.adapterChangeListener);
            }
        }
        if (this.currentVpSelectedListener != null) {
            removeOnTabSelectedListener(this.currentVpSelectedListener);
            this.currentVpSelectedListener = null;
        }
        if (viewPager2 != null) {
            this.viewPager = viewPager2;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new TabLayoutOnPageChangeListener(this);
            }
            this.pageChangeListener.mo1650a();
            viewPager2.addOnPageChangeListener(this.pageChangeListener);
            this.currentVpSelectedListener = new C0377g(viewPager2);
            addOnTabSelectedListener(this.currentVpSelectedListener);
            PagerAdapter adapter = viewPager2.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new C0369a();
            }
            this.adapterChangeListener.f1514a = z;
            viewPager2.addOnAdapterChangeListener(this.adapterChangeListener);
            setScrollPosition(viewPager2.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    /* JADX INFO: finally extract failed */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.tabs = new ArrayList<>();
        this.tabViewContentBounds = new RectF();
        this.tabMaxWidth = Integer.MAX_VALUE;
        this.selectedListeners = new ArrayList<>();
        this.tabViewPool = new SimplePool(12);
        setHorizontalScrollBarEnabled(false);
        this.slidingTabIndicator = new C0373e(context);
        super.addView(this.slidingTabIndicator, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray a = C0296b.m1168a(context, attributeSet, R$styleable.TabLayout, i, R.style.qg, 22);
        this.slidingTabIndicator.mo1677b(a.getDimensionPixelSize(10, -1));
        this.slidingTabIndicator.mo1673a(a.getColor(7, 0));
        setSelectedTabIndicator(C0272a.m1076b(context, a, 5));
        setSelectedTabIndicatorGravity(a.getInt(9, 0));
        setTabIndicatorFullWidth(a.getBoolean(8, true));
        int dimensionPixelSize = a.getDimensionPixelSize(15, 0);
        this.tabPaddingBottom = dimensionPixelSize;
        this.tabPaddingEnd = dimensionPixelSize;
        this.tabPaddingTop = dimensionPixelSize;
        this.tabPaddingStart = dimensionPixelSize;
        this.tabPaddingStart = a.getDimensionPixelSize(18, this.tabPaddingStart);
        this.tabPaddingTop = a.getDimensionPixelSize(19, this.tabPaddingTop);
        this.tabPaddingEnd = a.getDimensionPixelSize(17, this.tabPaddingEnd);
        this.tabPaddingBottom = a.getDimensionPixelSize(16, this.tabPaddingBottom);
        this.tabTextAppearance = a.getResourceId(22, R.style.l1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(this.tabTextAppearance, android.support.p029v7.appcompat.R$styleable.TextAppearance);
        try {
            this.tabTextSize = (float) obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.tabTextColors = C0272a.m1075a(context, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (a.hasValue(23)) {
                this.tabTextColors = C0272a.m1075a(context, a, 23);
            }
            if (a.hasValue(21)) {
                this.tabTextColors = createColorStateList(this.tabTextColors.getDefaultColor(), a.getColor(21, 0));
            }
            this.tabIconTint = C0272a.m1075a(context, a, 3);
            this.tabIconTintMode = C0297c.m1177a(a.getInt(4, -1), null);
            this.tabRippleColorStateList = C0272a.m1075a(context, a, 20);
            this.tabIndicatorAnimationDuration = a.getInt(6, C34943c.f91128x);
            this.requestedTabMinWidth = a.getDimensionPixelSize(13, -1);
            this.requestedTabMaxWidth = a.getDimensionPixelSize(12, -1);
            this.tabBackgroundResId = a.getResourceId(0, 0);
            this.contentInsetStart = a.getDimensionPixelSize(1, 0);
            this.mode = a.getInt(14, 1);
            this.tabGravity = a.getInt(2, 0);
            this.inlineLabel = a.getBoolean(11, false);
            this.unboundedRipple = a.getBoolean(24, false);
            a.recycle();
            Resources resources = getResources();
            this.tabTextMultiLineSize = (float) resources.getDimensionPixelSize(R.dimen.fz);
            this.scrollableTabMinWidth = resources.getDimensionPixelSize(R.dimen.fx);
            applyModeAndGravity();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.slidingTabIndicator.getChildCount()) {
            if (z2) {
                this.slidingTabIndicator.mo1674a(i, f);
            }
            if (this.scrollAnimator != null && this.scrollAnimator.isRunning()) {
                this.scrollAnimator.cancel();
            }
            scrollTo(calculateScrollXForTab(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }
}
