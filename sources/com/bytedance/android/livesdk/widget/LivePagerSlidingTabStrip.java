package com.bytedance.android.livesdk.widget;

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
import android.view.LayoutInflater;
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
import com.bytedance.android.live.utility.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

public class LivePagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: g */
    private static final int[] f25023g = {16842901, 16842904};

    /* renamed from: A */
    private ColorStateList f25024A;

    /* renamed from: B */
    private Typeface f25025B;

    /* renamed from: C */
    private int f25026C;

    /* renamed from: D */
    private int f25027D;

    /* renamed from: E */
    private int f25028E;

    /* renamed from: F */
    private Locale f25029F;

    /* renamed from: G */
    private int f25030G;

    /* renamed from: H */
    private int f25031H;

    /* renamed from: I */
    private int f25032I;

    /* renamed from: J */
    private int f25033J;

    /* renamed from: K */
    private int f25034K;

    /* renamed from: a */
    public C0935e f25035a;

    /* renamed from: b */
    public LinearLayout f25036b;

    /* renamed from: c */
    public ViewPager f25037c;

    /* renamed from: d */
    public int f25038d;

    /* renamed from: e */
    public float f25039e;

    /* renamed from: f */
    public boolean f25040f;

    /* renamed from: h */
    private LayoutParams f25041h;

    /* renamed from: i */
    private LayoutParams f25042i;

    /* renamed from: j */
    private final C9201d f25043j;

    /* renamed from: k */
    private int f25044k;

    /* renamed from: l */
    private Paint f25045l;

    /* renamed from: m */
    private Paint f25046m;

    /* renamed from: n */
    private int f25047n;

    /* renamed from: o */
    private int f25048o;

    /* renamed from: p */
    private int f25049p;

    /* renamed from: q */
    private int f25050q;

    /* renamed from: r */
    private int f25051r;

    /* renamed from: s */
    private boolean f25052s;

    /* renamed from: t */
    private int f25053t;

    /* renamed from: u */
    private int f25054u;

    /* renamed from: v */
    private int f25055v;

    /* renamed from: w */
    private int f25056w;

    /* renamed from: x */
    private int f25057x;

    /* renamed from: y */
    private int f25058y;

    /* renamed from: z */
    private int f25059z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m27373a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m27372a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m27372a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m27373a(i);
            }
        };

        /* renamed from: a */
        int f25063a;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f25063a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f25063a);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$a */
    public interface C9198a {
        /* renamed from: a */
        View mo22507a(Context context, int i);
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$b */
    public interface C9199b {
        /* renamed from: a */
        int mo22508a(int i);
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$c */
    static class C9200c {

        /* renamed from: a */
        TextView f25064a;

        /* renamed from: b */
        View f25065b;

        /* renamed from: c */
        View f25066c;

        C9200c() {
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.LivePagerSlidingTabStrip$d */
    class C9201d implements C0935e {
        private C9201d() {
        }

        public final void onPageSelected(int i) {
            if (LivePagerSlidingTabStrip.this.f25035a != null) {
                LivePagerSlidingTabStrip.this.f25035a.onPageSelected(i);
            }
        }

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                LivePagerSlidingTabStrip.this.mo22461b(LivePagerSlidingTabStrip.this.f25037c.getCurrentItem(), 0);
            }
            if (LivePagerSlidingTabStrip.this.f25035a != null) {
                LivePagerSlidingTabStrip.this.f25035a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            if (LivePagerSlidingTabStrip.this.f25038d != i) {
                LivePagerSlidingTabStrip.this.mo22459a(LivePagerSlidingTabStrip.this.f25038d, false);
                LivePagerSlidingTabStrip.this.mo22459a(i, true);
            }
            LivePagerSlidingTabStrip.this.f25038d = i;
            LivePagerSlidingTabStrip.this.f25039e = f;
            LivePagerSlidingTabStrip.this.mo22461b(i, (int) (((float) LivePagerSlidingTabStrip.this.f25036b.getChildAt(i).getWidth()) * f));
            LivePagerSlidingTabStrip.this.invalidate();
            if (LivePagerSlidingTabStrip.this.f25035a != null) {
                LivePagerSlidingTabStrip.this.f25035a.onPageScrolled(i, f, i2);
            }
        }
    }

    public int getDividerColor() {
        return this.f25051r;
    }

    public int getDividerPadding() {
        return this.f25056w;
    }

    public int getIndicatorColor() {
        return this.f25049p;
    }

    public int getIndicatorHeight() {
        return this.f25054u;
    }

    public int getIndicatorWidth() {
        return this.f25047n;
    }

    public int getScrollOffset() {
        return this.f25053t;
    }

    public boolean getShouldExpand() {
        return this.f25052s;
    }

    public int getTabBackground() {
        return this.f25028E;
    }

    public int getTabPaddingLeftRight() {
        return this.f25057x;
    }

    public ColorStateList getTextColor() {
        return this.f25024A;
    }

    public int getTextSize() {
        return this.f25059z;
    }

    public int getUnderlineColor() {
        return this.f25050q;
    }

    public int getUnderlineHeight() {
        return this.f25055v;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f25063a = this.f25038d;
        return savedState;
    }

    /* renamed from: a */
    private void m27362a() {
        this.f25036b.removeAllViews();
        this.f25044k = this.f25037c.getAdapter().getCount();
        for (int i = 0; i < this.f25044k; i++) {
            if (this.f25037c.getAdapter() instanceof C9198a) {
                m27363a(i, ((C9198a) this.f25037c.getAdapter()).mo22507a(getContext(), i));
            } else if (this.f25037c.getAdapter() instanceof C9199b) {
                m27366c(i, ((C9199b) this.f25037c.getAdapter()).mo22508a(i));
            } else {
                CharSequence pageTitle = this.f25037c.getAdapter().getPageTitle(i);
                if (pageTitle != null) {
                    m27364a(i, pageTitle.toString());
                }
            }
        }
        m27365b();
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (VERSION.SDK_INT < 16) {
                    LivePagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    LivePagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                LivePagerSlidingTabStrip.this.f25038d = LivePagerSlidingTabStrip.this.f25037c.getCurrentItem();
                LivePagerSlidingTabStrip.this.mo22459a(LivePagerSlidingTabStrip.this.f25038d, true);
                LivePagerSlidingTabStrip.this.mo22461b(LivePagerSlidingTabStrip.this.f25038d, 0);
            }
        });
    }

    /* renamed from: b */
    private void m27365b() {
        for (int i = 0; i < this.f25044k; i++) {
            View childAt = this.f25036b.getChildAt(i);
            childAt.setBackgroundResource(this.f25028E);
            Object tag = childAt.getTag();
            if (tag instanceof C9200c) {
                C9200c cVar = (C9200c) tag;
                cVar.f25064a.setTextSize(0, (float) this.f25059z);
                cVar.f25064a.setTypeface(this.f25025B, this.f25026C);
                cVar.f25064a.setTextColor(this.f25024A);
                if (this.f25040f) {
                    if (VERSION.SDK_INT >= 14) {
                        cVar.f25064a.setAllCaps(true);
                    } else {
                        cVar.f25064a.setText(cVar.f25064a.getText().toString().toUpperCase(this.f25029F));
                    }
                }
            }
        }
    }

    public void setAllCaps(boolean z) {
        this.f25040f = z;
    }

    public void setIconResId(int i) {
        this.f25032I = i;
    }

    public void setIndicatorBottomMargin(int i) {
        this.f25033J = i;
    }

    public void setOnPageChangeListener(C0935e eVar) {
        this.f25035a = eVar;
    }

    public void setTabBackground(int i) {
        this.f25028E = i;
    }

    public void setTextSelectedStyle(int i) {
        this.f25034K = i;
    }

    public LivePagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    public void setDividerColor(int i) {
        this.f25051r = i;
        invalidate();
    }

    public void setDividerPadding(int i) {
        this.f25056w = i;
        invalidate();
    }

    public void setIndicatorColor(int i) {
        this.f25049p = i;
        invalidate();
    }

    public void setIndicatorHeight(int i) {
        this.f25054u = i;
        invalidate();
    }

    public void setIndicatorRadius(int i) {
        this.f25048o = i;
        m27365b();
    }

    public void setIndicatorWidth(int i) {
        this.f25047n = i;
        m27365b();
    }

    public void setScrollOffset(int i) {
        this.f25053t = i;
        invalidate();
    }

    public void setShouldExpand(boolean z) {
        this.f25052s = z;
        requestLayout();
    }

    public void setTabPaddingLeftRight(int i) {
        this.f25057x = i;
        m27365b();
    }

    public void setTextSize(int i) {
        this.f25059z = i;
        m27365b();
    }

    public void setUnderlineColor(int i) {
        this.f25050q = i;
        invalidate();
    }

    public void setUnderlineHeight(int i) {
        this.f25055v = i;
        invalidate();
    }

    public void setDividerColorResource(int i) {
        this.f25051r = getResources().getColor(i);
        invalidate();
    }

    public void setIndicatorColorResource(int i) {
        this.f25049p = getResources().getColor(i);
        invalidate();
    }

    public void setTextColor(int i) {
        this.f25024A = ColorStateList.valueOf(i);
        m27365b();
    }

    public void setTextColorResource(int i) {
        this.f25024A = getResources().getColorStateList(i);
        m27365b();
    }

    public void setUnderlineColorResource(int i) {
        this.f25050q = getResources().getColor(i);
        invalidate();
    }

    /* renamed from: a */
    public final void mo22457a(int i) {
        if (this.f25036b.getChildCount() > i) {
            Object tag = this.f25036b.getChildAt(i).getTag();
            if (tag instanceof C9200c) {
                ((C9200c) tag).f25065b.setVisibility(0);
            }
        }
    }

    /* renamed from: b */
    public final void mo22460b(int i) {
        if (this.f25036b.getChildCount() > i) {
            Object tag = this.f25036b.getChildAt(i).getTag();
            if (tag instanceof C9200c) {
                ((C9200c) tag).f25065b.setVisibility(8);
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f25038d = savedState.f25063a;
        requestLayout();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f25037c = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f25043j);
            m27362a();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter INSTANCE.");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f25044k != 0) {
            int height = getHeight();
            this.f25045l.setColor(this.f25049p);
            View childAt = this.f25036b.getChildAt(this.f25038d);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f25039e > 0.0f && this.f25038d < this.f25044k - 1) {
                View childAt2 = this.f25036b.getChildAt(this.f25038d + 1);
                float left2 = (float) childAt2.getLeft();
                left = (this.f25039e * left2) + ((1.0f - this.f25039e) * left);
                right = (this.f25039e * ((float) childAt2.getRight())) + ((1.0f - this.f25039e) * right);
            }
            if (this.f25047n != 0) {
                float f = ((right - left) - ((float) this.f25047n)) / 2.0f;
                left += f;
                right -= f;
            }
            float f2 = right;
            float f3 = left;
            if (this.f25048o <= 0 || VERSION.SDK_INT <= 21) {
                canvas.drawRect(f3, (float) ((height - this.f25054u) - this.f25033J), f2, (float) (height - this.f25033J), this.f25045l);
            } else {
                canvas.drawRoundRect(f3, (float) ((height - this.f25054u) - this.f25033J), f2, (float) (height - this.f25033J), (float) this.f25048o, (float) this.f25048o, this.f25045l);
            }
            this.f25045l.setColor(this.f25050q);
            canvas.drawRect(0.0f, (float) (height - this.f25055v), (float) this.f25036b.getWidth(), (float) height, this.f25045l);
            this.f25046m.setColor(this.f25051r);
            for (int i = 0; i < this.f25044k - 1; i++) {
                View childAt3 = this.f25036b.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.f25056w, (float) childAt3.getRight(), (float) (height - this.f25056w), this.f25046m);
            }
        }
    }

    public LivePagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    private void m27366c(int i, int i2) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        m27363a(i, (View) imageButton);
    }

    /* renamed from: a */
    public final void mo22458a(int i, int i2) {
        this.f25030G = R.layout.au_;
        this.f25031H = R.id.dfw;
    }

    /* renamed from: a */
    private void m27363a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                LivePagerSlidingTabStrip.this.f25037c.setCurrentItem(i);
            }
        });
        view.setPadding(this.f25057x, 0, this.f25057x, 0);
        if (VERSION.SDK_INT >= 17 && C3519c.m12965a(getContext())) {
            view.setPaddingRelative(this.f25057x, 0, this.f25057x, 0);
        }
        LinearLayout linearLayout = this.f25036b;
        if (this.f25052s) {
            layoutParams = this.f25042i;
        } else {
            layoutParams = this.f25041h;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final void mo22461b(int i, int i2) {
        int i3;
        if (this.f25044k != 0) {
            if (C3519c.m12965a(getContext())) {
                i3 = this.f25036b.getChildAt(i).getLeft() - i2;
            } else {
                i3 = this.f25036b.getChildAt(i).getLeft() + i2;
            }
            if (i > 0 || i2 > 0) {
                i3 -= this.f25053t;
            }
            if (i3 != this.f25027D) {
                this.f25027D = i3;
                scrollTo(i3, 0);
            }
        }
    }

    /* renamed from: a */
    private void m27364a(int i, String str) {
        View view;
        C9200c cVar = new C9200c();
        if (this.f25030G <= 0 || this.f25031H <= 0) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.ass, null, false);
            cVar.f25064a = (TextView) view.findViewById(R.id.text);
            cVar.f25065b = view.findViewById(R.id.a_j);
            cVar.f25065b.setVisibility(8);
        } else {
            view = LayoutInflater.from(getContext()).inflate(this.f25030G, null, false);
            cVar.f25064a = (TextView) view.findViewById(this.f25031H);
            cVar.f25066c = view.findViewById(this.f25032I);
        }
        cVar.f25064a.setText(str);
        cVar.f25064a.setGravity(17);
        cVar.f25064a.setSingleLine();
        view.setTag(cVar);
        m27363a(i, view);
    }

    /* renamed from: a */
    public final void mo22459a(int i, boolean z) {
        int childCount = this.f25036b.getChildCount();
        if (childCount != 0 && i >= 0 && i < childCount) {
            View childAt = this.f25036b.getChildAt(i);
            childAt.setSelected(z);
            Object tag = childAt.getTag();
            if (tag instanceof C9200c) {
                C9200c cVar = (C9200c) tag;
                if (this.f25034K == 1) {
                    if (z) {
                        cVar.f25064a.setTypeface(Typeface.DEFAULT_BOLD);
                        return;
                    }
                    cVar.f25064a.setTypeface(Typeface.DEFAULT);
                }
            }
        }
    }

    public LivePagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25043j = new C9201d();
        this.f25038d = 0;
        this.f25039e = 0.0f;
        this.f25047n = 0;
        this.f25048o = 0;
        this.f25049p = 16737894;
        this.f25050q = 436207616;
        this.f25051r = 436207616;
        this.f25052s = false;
        this.f25040f = true;
        this.f25053t = 52;
        this.f25054u = 8;
        this.f25055v = 2;
        this.f25056w = 12;
        this.f25057x = 24;
        this.f25058y = 1;
        this.f25059z = 12;
        this.f25024A = ColorStateList.valueOf(16737894);
        this.f25025B = null;
        this.f25026C = 1;
        this.f25027D = 0;
        this.f25028E = R.drawable.bm3;
        this.f25033J = 0;
        this.f25034K = 0;
        setFillViewport(true);
        setWillNotDraw(false);
        this.f25036b = new LinearLayout(context);
        this.f25036b.setOrientation(0);
        this.f25036b.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f25036b);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f25053t = (int) TypedValue.applyDimension(1, (float) this.f25053t, displayMetrics);
        this.f25054u = (int) TypedValue.applyDimension(1, (float) this.f25054u, displayMetrics);
        this.f25055v = (int) TypedValue.applyDimension(1, (float) this.f25055v, displayMetrics);
        this.f25056w = (int) TypedValue.applyDimension(1, (float) this.f25056w, displayMetrics);
        this.f25057x = (int) TypedValue.applyDimension(1, (float) this.f25057x, displayMetrics);
        this.f25058y = (int) TypedValue.applyDimension(1, (float) this.f25058y, displayMetrics);
        this.f25059z = (int) TypedValue.applyDimension(2, (float) this.f25059z, displayMetrics);
        this.f25047n = (int) TypedValue.applyDimension(1, (float) this.f25047n, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f25023g);
        this.f25059z = obtainStyledAttributes.getDimensionPixelSize(0, this.f25059z);
        this.f25024A = obtainStyledAttributes.getColorStateList(1);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.LivePagerSlidingTabStrip);
        this.f25049p = obtainStyledAttributes2.getColor(3, this.f25049p);
        this.f25050q = obtainStyledAttributes2.getColor(14, this.f25050q);
        this.f25051r = obtainStyledAttributes2.getColor(1, this.f25051r);
        this.f25054u = obtainStyledAttributes2.getDimensionPixelSize(4, this.f25054u);
        this.f25055v = obtainStyledAttributes2.getDimensionPixelSize(15, this.f25055v);
        this.f25056w = obtainStyledAttributes2.getDimensionPixelSize(2, this.f25056w);
        this.f25057x = obtainStyledAttributes2.getDimensionPixelSize(7, this.f25057x);
        this.f25028E = obtainStyledAttributes2.getResourceId(0, this.f25028E);
        this.f25052s = obtainStyledAttributes2.getBoolean(9, this.f25052s);
        this.f25053t = obtainStyledAttributes2.getDimensionPixelSize(8, this.f25053t);
        this.f25040f = obtainStyledAttributes2.getBoolean(10, this.f25040f);
        this.f25059z = obtainStyledAttributes2.getDimensionPixelSize(12, this.f25059z);
        this.f25024A = obtainStyledAttributes2.getColorStateList(11);
        this.f25047n = obtainStyledAttributes2.getDimensionPixelSize(6, this.f25047n);
        this.f25048o = obtainStyledAttributes2.getDimensionPixelSize(5, 0);
        this.f25026C = obtainStyledAttributes2.getInt(13, 1);
        obtainStyledAttributes2.recycle();
        this.f25045l = new Paint();
        this.f25045l.setAntiAlias(true);
        this.f25045l.setStyle(Style.FILL);
        this.f25046m = new Paint();
        this.f25046m.setAntiAlias(true);
        this.f25046m.setStrokeWidth((float) this.f25058y);
        this.f25041h = new LayoutParams(-2, -1);
        this.f25042i = new LayoutParams(0, -1, 1.0f);
        if (this.f25029F == null) {
            this.f25029F = getResources().getConfiguration().locale;
        }
        if (this.f25024A == null) {
            this.f25024A = ColorStateList.valueOf(16737894);
        }
    }
}
