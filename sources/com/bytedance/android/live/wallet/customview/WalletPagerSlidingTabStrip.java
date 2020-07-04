package com.bytedance.android.live.wallet.customview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.android.live.uikit.p176d.C3519c;
import com.bytedance.android.live.wallet.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

public class WalletPagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: g */
    private static final int[] f11008g = {16842901, 16842904};

    /* renamed from: A */
    private ColorStateList f11009A;

    /* renamed from: B */
    private Typeface f11010B;

    /* renamed from: C */
    private int f11011C;

    /* renamed from: D */
    private int f11012D;

    /* renamed from: E */
    private Locale f11013E;

    /* renamed from: a */
    public C0935e f11014a;

    /* renamed from: b */
    public LinearLayout f11015b;

    /* renamed from: c */
    public ViewPager f11016c;

    /* renamed from: d */
    public int f11017d;

    /* renamed from: e */
    public float f11018e;

    /* renamed from: f */
    public boolean f11019f;

    /* renamed from: h */
    private LayoutParams f11020h;

    /* renamed from: i */
    private LayoutParams f11021i;

    /* renamed from: j */
    private final C3700d f11022j;

    /* renamed from: k */
    private int f11023k;

    /* renamed from: l */
    private Paint f11024l;

    /* renamed from: m */
    private Paint f11025m;

    /* renamed from: n */
    private int f11026n;

    /* renamed from: o */
    private int f11027o;

    /* renamed from: p */
    private int f11028p;

    /* renamed from: q */
    private int f11029q;

    /* renamed from: r */
    private int f11030r;

    /* renamed from: s */
    private boolean f11031s;

    /* renamed from: t */
    private int f11032t;

    /* renamed from: u */
    private int f11033u;

    /* renamed from: v */
    private int f11034v;

    /* renamed from: w */
    private int f11035w;

    /* renamed from: x */
    private int f11036x;

    /* renamed from: y */
    private int f11037y;

    /* renamed from: z */
    private int f11038z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m13362a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m13361a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m13361a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m13362a(i);
            }
        };

        /* renamed from: a */
        int f11042a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f11042a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f11042a);
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip$a */
    public interface C3697a {
        /* renamed from: a */
        View mo11068a(Context context, int i);
    }

    /* renamed from: com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip$b */
    public interface C3698b {
        /* renamed from: a */
        int mo11207a(int i);
    }

    /* renamed from: com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip$c */
    static class C3699c {

        /* renamed from: a */
        TextView f11043a;

        C3699c() {
        }
    }

    /* renamed from: com.bytedance.android.live.wallet.customview.WalletPagerSlidingTabStrip$d */
    class C3700d implements C0935e {
        private C3700d() {
        }

        public final void onPageSelected(int i) {
            if (WalletPagerSlidingTabStrip.this.f11014a != null) {
                WalletPagerSlidingTabStrip.this.f11014a.onPageSelected(i);
            }
        }

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                WalletPagerSlidingTabStrip.this.mo11163a(WalletPagerSlidingTabStrip.this.f11016c.getCurrentItem(), 0);
            }
            if (WalletPagerSlidingTabStrip.this.f11014a != null) {
                WalletPagerSlidingTabStrip.this.f11014a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (WalletPagerSlidingTabStrip.this.f11017d != i) {
                WalletPagerSlidingTabStrip.this.mo11164a(WalletPagerSlidingTabStrip.this.f11017d, false);
                WalletPagerSlidingTabStrip.this.mo11164a(i, true);
            }
            WalletPagerSlidingTabStrip.this.f11017d = i;
            WalletPagerSlidingTabStrip.this.f11018e = f;
            WalletPagerSlidingTabStrip.this.mo11163a(i, (int) (((float) WalletPagerSlidingTabStrip.this.f11015b.getChildAt(i).getWidth()) * f));
            WalletPagerSlidingTabStrip.this.invalidate();
            if (WalletPagerSlidingTabStrip.this.f11014a != null) {
                WalletPagerSlidingTabStrip.this.f11014a.onPageScrolled(i, f, i2);
            }
        }
    }

    public int getDividerColor() {
        return this.f11030r;
    }

    public int getDividerPadding() {
        return this.f11035w;
    }

    public int getIndicatorColor() {
        return this.f11028p;
    }

    public int getIndicatorHeight() {
        return this.f11033u;
    }

    public int getIndicatorWidth() {
        return this.f11026n;
    }

    public int getScrollOffset() {
        return this.f11032t;
    }

    public boolean getShouldExpand() {
        return this.f11031s;
    }

    public int getTabBackground() {
        return this.f11012D;
    }

    public int getTabPaddingLeftRight() {
        return this.f11036x;
    }

    public ColorStateList getTextColor() {
        return this.f11009A;
    }

    public int getTextSize() {
        return this.f11038z;
    }

    public int getUnderlineColor() {
        return this.f11029q;
    }

    public int getUnderlineHeight() {
        return this.f11034v;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f11042a = this.f11017d;
        return savedState;
    }

    /* renamed from: b */
    private void m13355b() {
        this.f11015b.removeAllViews();
        this.f11023k = this.f11016c.getAdapter().getCount();
        for (int i = 0; i < this.f11023k; i++) {
            if (this.f11016c.getAdapter() instanceof C3697a) {
                m13354a(i, ((C3697a) this.f11016c.getAdapter()).mo11068a(getContext(), i));
            } else if (this.f11016c.getAdapter() instanceof C3698b) {
                m13356b(i, ((C3698b) this.f11016c.getAdapter()).mo11207a(i));
            }
        }
        m13357c();
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (VERSION.SDK_INT < 16) {
                    WalletPagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    WalletPagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                WalletPagerSlidingTabStrip.this.f11017d = WalletPagerSlidingTabStrip.this.f11016c.getCurrentItem();
                WalletPagerSlidingTabStrip.this.mo11164a(WalletPagerSlidingTabStrip.this.f11017d, true);
                WalletPagerSlidingTabStrip.this.mo11163a(WalletPagerSlidingTabStrip.this.f11017d, 0);
            }
        });
    }

    /* renamed from: c */
    private void m13357c() {
        for (int i = 0; i < this.f11023k; i++) {
            View childAt = this.f11015b.getChildAt(i);
            childAt.setBackgroundResource(this.f11012D);
            Object tag = childAt.getTag();
            if (tag instanceof C3699c) {
                C3699c cVar = (C3699c) tag;
                cVar.f11043a.setTextSize(0, (float) this.f11038z);
                cVar.f11043a.setTextColor(this.f11009A);
                if (this.f11019f) {
                    if (VERSION.SDK_INT >= 14) {
                        cVar.f11043a.setAllCaps(true);
                    } else {
                        cVar.f11043a.setText(cVar.f11043a.getText().toString().toUpperCase(this.f11013E));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11165a() {
        if (this.f11023k == 0 || this.f11015b.getChildCount() < 5) {
            return false;
        }
        ObjectAnimator.ofInt(this, "scrollX", new int[]{0, this.f11015b.getChildAt(2).getLeft(), 0}).setDuration(1300).start();
        return true;
    }

    public void setAllCaps(boolean z) {
        this.f11019f = z;
    }

    public void setOnPageChangeListener(C0935e eVar) {
        this.f11014a = eVar;
    }

    public void setTabBackground(int i) {
        this.f11012D = i;
    }

    public WalletPagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public void setDividerColor(int i) {
        this.f11030r = i;
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.f11035w = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f11028p = i;
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.f11033u = i;
        invalidate();
    }

    public void setIndicatorWidth(int i) {
        this.f11026n = i;
        m13357c();
    }

    public void setScrollOffset(int i) {
        this.f11032t = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.f11031s = z;
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i) {
        this.f11036x = i;
        m13357c();
    }

    public void setTextSize(int i) {
        this.f11038z = i;
        m13357c();
    }

    public void setUnderlineColor(int i) {
        this.f11029q = i;
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.f11034v = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.f11030r = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.f11028p = getResources().getColor(i);
        invalidate();
    }

    public void setTextColor(int i) {
        this.f11009A = ColorStateList.valueOf(i);
        m13357c();
    }

    public void setTextColorResource(int i) {
        this.f11009A = getResources().getColorStateList(i);
        m13357c();
    }

    public void setUnderlineColorResource(int i) {
        this.f11029q = getResources().getColor(i);
        invalidate();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f11017d = savedState.f11042a;
        requestLayout();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f11016c = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f11022j);
            m13355b();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f11023k != 0) {
            int height = getHeight();
            this.f11024l.setColor(this.f11028p);
            View childAt = this.f11015b.getChildAt(this.f11017d);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f11018e > 0.0f && this.f11017d < this.f11023k - 1) {
                View childAt2 = this.f11015b.getChildAt(this.f11017d + 1);
                float left2 = (float) childAt2.getLeft();
                left = (this.f11018e * left2) + ((1.0f - this.f11018e) * left);
                right = (this.f11018e * ((float) childAt2.getRight())) + ((1.0f - this.f11018e) * right);
            }
            if (this.f11026n != 0) {
                float f = ((right - left) - ((float) this.f11026n)) / 2.0f;
                left += f;
                right -= f;
            }
            float f2 = right;
            float f3 = left;
            if (this.f11027o <= 0 || VERSION.SDK_INT <= 21) {
                canvas.drawRect(f3, (float) (height - this.f11033u), f2, (float) height, this.f11024l);
            } else {
                canvas.drawRoundRect(f3, (float) (height - this.f11033u), f2, (float) height, (float) this.f11027o, (float) this.f11027o, this.f11024l);
            }
            this.f11024l.setColor(this.f11029q);
            canvas.drawRect(0.0f, (float) (height - this.f11034v), (float) this.f11015b.getWidth(), (float) height, this.f11024l);
            this.f11025m.setColor(this.f11030r);
            for (int i = 0; i < this.f11023k - 1; i++) {
                View childAt3 = this.f11015b.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.f11035w, (float) childAt3.getRight(), (float) (height - this.f11035w), this.f11025m);
            }
        }
    }

    public WalletPagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private void m13356b(int i, int i2) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        m13354a(i, (View) imageButton);
    }

    /* renamed from: a */
    public final void mo11164a(int i, boolean z) {
        int childCount = this.f11015b.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            this.f11015b.getChildAt(i).setSelected(z);
        }
    }

    /* renamed from: a */
    private void m13354a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                WalletPagerSlidingTabStrip.this.f11016c.setCurrentItem(i);
            }
        });
        view.setPadding(this.f11036x, 0, this.f11036x, 0);
        if (VERSION.SDK_INT >= 17 && C3519c.m12965a(getContext())) {
            view.setPaddingRelative(this.f11036x, 0, this.f11036x, 0);
        }
        LinearLayout linearLayout = this.f11015b;
        if (this.f11031s) {
            layoutParams = this.f11021i;
        } else {
            layoutParams = this.f11020h;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    /* renamed from: a */
    public final void mo11163a(int i, int i2) {
        int i3;
        if (this.f11023k != 0) {
            if (C3519c.m12965a(getContext())) {
                i3 = this.f11015b.getChildAt(i).getLeft() - i2;
            } else {
                i3 = this.f11015b.getChildAt(i).getLeft() + i2;
            }
            if (i > 0 || i2 > 0) {
                i3 -= this.f11032t;
            }
            if (i3 != this.f11011C) {
                this.f11011C = i3;
                scrollTo(i3, 0);
            }
        }
    }

    public WalletPagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11022j = new C3700d();
        this.f11017d = 0;
        this.f11018e = 0.0f;
        this.f11026n = 0;
        this.f11027o = 0;
        this.f11028p = 16737894;
        this.f11029q = 436207616;
        this.f11030r = 436207616;
        this.f11031s = false;
        this.f11019f = true;
        this.f11032t = 52;
        this.f11033u = 8;
        this.f11034v = 2;
        this.f11035w = 12;
        this.f11036x = 24;
        this.f11037y = 1;
        this.f11038z = 12;
        this.f11009A = ColorStateList.valueOf(16737894);
        this.f11010B = null;
        this.f11011C = 0;
        this.f11012D = R.drawable.gl;
        setFillViewport(true);
        setWillNotDraw(false);
        this.f11015b = new LinearLayout(context);
        this.f11015b.setOrientation(0);
        this.f11015b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f11015b);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f11032t = (int) TypedValue.applyDimension(1, (float) this.f11032t, displayMetrics);
        this.f11033u = (int) TypedValue.applyDimension(1, (float) this.f11033u, displayMetrics);
        this.f11034v = (int) TypedValue.applyDimension(1, (float) this.f11034v, displayMetrics);
        this.f11035w = (int) TypedValue.applyDimension(1, (float) this.f11035w, displayMetrics);
        this.f11036x = (int) TypedValue.applyDimension(1, (float) this.f11036x, displayMetrics);
        this.f11037y = (int) TypedValue.applyDimension(1, (float) this.f11037y, displayMetrics);
        this.f11038z = (int) TypedValue.applyDimension(2, (float) this.f11038z, displayMetrics);
        this.f11026n = (int) TypedValue.applyDimension(1, (float) this.f11026n, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f11008g);
        this.f11038z = obtainStyledAttributes.getDimensionPixelSize(0, this.f11038z);
        this.f11009A = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.ttlive_WalletPagerSlidingTabStrip);
        this.f11028p = obtainStyledAttributes2.getColor(3, this.f11028p);
        this.f11029q = obtainStyledAttributes2.getColor(13, this.f11029q);
        this.f11030r = obtainStyledAttributes2.getColor(1, this.f11030r);
        this.f11033u = obtainStyledAttributes2.getDimensionPixelSize(4, this.f11033u);
        this.f11034v = obtainStyledAttributes2.getDimensionPixelSize(14, this.f11034v);
        this.f11035w = obtainStyledAttributes2.getDimensionPixelSize(2, this.f11035w);
        this.f11036x = obtainStyledAttributes2.getDimensionPixelSize(7, this.f11036x);
        this.f11012D = obtainStyledAttributes2.getResourceId(0, this.f11012D);
        this.f11031s = obtainStyledAttributes2.getBoolean(9, this.f11031s);
        this.f11032t = obtainStyledAttributes2.getDimensionPixelSize(8, this.f11032t);
        this.f11019f = obtainStyledAttributes2.getBoolean(10, this.f11019f);
        this.f11038z = obtainStyledAttributes2.getDimensionPixelSize(12, this.f11038z);
        this.f11009A = obtainStyledAttributes2.getColorStateList(11);
        this.f11026n = obtainStyledAttributes2.getDimensionPixelSize(6, this.f11026n);
        this.f11027o = obtainStyledAttributes2.getDimensionPixelSize(5, 0);
        obtainStyledAttributes2.recycle();
        this.f11024l = new Paint();
        this.f11024l.setAntiAlias(true);
        this.f11024l.setStyle(Style.FILL);
        this.f11025m = new Paint();
        this.f11025m.setAntiAlias(true);
        this.f11025m.setStrokeWidth((float) this.f11037y);
        this.f11020h = new LayoutParams(-2, -1);
        this.f11021i = new LayoutParams(0, -1, 1.0f);
        if (this.f11013E == null) {
            this.f11013E = getResources().getConfiguration().locale;
        }
        if (this.f11009A == null) {
            this.f11009A = ColorStateList.valueOf(16737894);
        }
    }
}
