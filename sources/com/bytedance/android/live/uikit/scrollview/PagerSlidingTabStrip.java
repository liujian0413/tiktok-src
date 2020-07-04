package com.bytedance.android.live.uikit.scrollview;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import java.util.Locale;

public final class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: h */
    private static final int[] f10707h = {16842901, 16842904};

    /* renamed from: A */
    private Typeface f10708A;

    /* renamed from: B */
    private int f10709B;

    /* renamed from: C */
    private int f10710C;

    /* renamed from: D */
    private int f10711D;

    /* renamed from: E */
    private Locale f10712E;

    /* renamed from: a */
    public C0935e f10713a;

    /* renamed from: b */
    public LinearLayout f10714b;

    /* renamed from: c */
    public ViewPager f10715c;

    /* renamed from: d */
    public int f10716d;

    /* renamed from: e */
    public float f10717e;

    /* renamed from: f */
    public boolean f10718f;

    /* renamed from: g */
    public boolean f10719g;

    /* renamed from: i */
    private LayoutParams f10720i;

    /* renamed from: j */
    private LayoutParams f10721j;

    /* renamed from: k */
    private final C3585b f10722k;

    /* renamed from: l */
    private int f10723l;

    /* renamed from: m */
    private Paint f10724m;

    /* renamed from: n */
    private Paint f10725n;

    /* renamed from: o */
    private int f10726o;

    /* renamed from: p */
    private int f10727p;

    /* renamed from: q */
    private int f10728q;

    /* renamed from: r */
    private boolean f10729r;

    /* renamed from: s */
    private boolean f10730s;

    /* renamed from: t */
    private int f10731t;

    /* renamed from: u */
    private int f10732u;

    /* renamed from: v */
    private int f10733v;

    /* renamed from: w */
    private int f10734w;

    /* renamed from: x */
    private int f10735x;

    /* renamed from: y */
    private int f10736y;

    /* renamed from: z */
    private int f10737z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m13159a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m13158a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m13158a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m13159a(i);
            }
        };

        /* renamed from: a */
        int f10741a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f10741a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f10741a);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$a */
    public interface C3584a {
        /* renamed from: a */
        int mo10979a(int i);
    }

    /* renamed from: com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$b */
    class C3585b implements C0935e {

        /* renamed from: a */
        final /* synthetic */ PagerSlidingTabStrip f10742a;

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f10742a.mo10936a(this.f10742a.f10715c.getCurrentItem(), 0);
            }
            if (this.f10742a.f10713a != null) {
                this.f10742a.f10713a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageSelected(int i) {
            if (this.f10742a.f10719g) {
                this.f10742a.mo10935a();
            }
            if (this.f10742a.f10713a != null) {
                this.f10742a.f10713a.onPageSelected(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            this.f10742a.f10716d = i;
            this.f10742a.f10717e = f;
            this.f10742a.mo10936a(i, (int) (((float) this.f10742a.f10714b.getChildAt(i).getWidth()) * f));
            this.f10742a.invalidate();
            if (this.f10742a.f10713a != null) {
                this.f10742a.f10713a.onPageScrolled(i, f, i2);
            }
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$c */
    public interface C3586c {
        /* renamed from: a */
        View mo10980a(int i, ViewGroup viewGroup);

        /* renamed from: a */
        TextView mo10981a(View view);
    }

    public final int getDividerColor() {
        return this.f10728q;
    }

    public final int getDividerPadding() {
        return this.f10734w;
    }

    public final boolean getHighlightTitle() {
        return this.f10719g;
    }

    public final int getIndicatorColor() {
        return this.f10726o;
    }

    public final int getIndicatorHeight() {
        return this.f10732u;
    }

    public final int getScrollOffset() {
        return this.f10731t;
    }

    public final boolean getShouldExpand() {
        return this.f10729r;
    }

    public final int getTabBackground() {
        return this.f10711D;
    }

    public final int getTabPaddingLeftRight() {
        return this.f10735x;
    }

    public final int getTextColor() {
        return this.f10737z;
    }

    public final int getTextSize() {
        return this.f10736y;
    }

    public final int getUnderlineColor() {
        return this.f10727p;
    }

    public final int getUnderlineHeight() {
        return this.f10733v;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f10741a = this.f10716d;
        return savedState;
    }

    /* renamed from: b */
    private void m13153b() {
        this.f10714b.removeAllViews();
        this.f10723l = this.f10715c.getAdapter().getCount();
        for (int i = 0; i < this.f10723l; i++) {
            if (this.f10715c.getAdapter() instanceof C3584a) {
                m13154b(i, ((C3584a) this.f10715c.getAdapter()).mo10979a(i));
            } else {
                m13152a(i, this.f10715c.getAdapter().getPageTitle(i).toString());
            }
        }
        m13155c();
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (VERSION.SDK_INT < 16) {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                PagerSlidingTabStrip.this.f10716d = PagerSlidingTabStrip.this.f10715c.getCurrentItem();
                PagerSlidingTabStrip.this.mo10936a(PagerSlidingTabStrip.this.f10716d, 0);
            }
        });
    }

    /* renamed from: c */
    private void m13155c() {
        int currentItem = this.f10715c.getCurrentItem();
        for (int i = 0; i < this.f10723l; i++) {
            View childAt = this.f10714b.getChildAt(i);
            childAt.setBackgroundResource(this.f10711D);
            TextView textView = null;
            if (this.f10715c.getAdapter() instanceof C3586c) {
                textView = ((C3586c) this.f10715c.getAdapter()).mo10981a(childAt);
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                textView.setTextSize(0, (float) this.f10736y);
                textView.setTypeface(this.f10708A, this.f10709B);
                if (currentItem != i || !this.f10719g) {
                    textView.setTextColor(this.f10737z);
                } else {
                    textView.setTextColor(this.f10726o);
                }
                if (this.f10718f) {
                    if (VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.f10712E));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10935a() {
        int currentItem = this.f10715c.getCurrentItem();
        for (int i = 0; i < this.f10723l; i++) {
            View childAt = this.f10714b.getChildAt(i);
            TextView textView = null;
            if (this.f10715c.getAdapter() instanceof C3586c) {
                textView = ((C3586c) this.f10715c.getAdapter()).mo10981a(childAt);
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                if (currentItem != i || !this.f10719g) {
                    textView.setTextColor(this.f10737z);
                } else {
                    textView.setTextColor(this.f10726o);
                }
            }
        }
    }

    public final void setAllCaps(boolean z) {
        this.f10718f = z;
    }

    public final void setHighlightTitle(boolean z) {
        this.f10719g = z;
    }

    public final void setOnPageChangeListener(C0935e eVar) {
        this.f10713a = eVar;
    }

    public final void setOverlayIndicator(boolean z) {
        this.f10730s = z;
    }

    public final void setTabBackground(int i) {
        this.f10711D = i;
    }

    public final void setDividerColor(int i) {
        this.f10728q = i;
        invalidate();
    }

    public final void setDividerPadding(int i) {
        this.f10734w = i;
        invalidate();
    }

    public final void setIndicatorColor(int i) {
        this.f10726o = i;
        invalidate();
    }

    public final void setIndicatorHeight(int i) {
        this.f10732u = i;
        invalidate();
    }

    public final void setScrollOffset(int i) {
        this.f10731t = i;
        invalidate();
    }

    public final void setShouldExpand(boolean z) {
        this.f10729r = z;
        requestLayout();
    }

    public final void setTabPaddingLeftRight(int i) {
        this.f10735x = i;
        m13155c();
    }

    public final void setTextColor(int i) {
        this.f10737z = i;
        m13155c();
    }

    public final void setTextSize(int i) {
        this.f10736y = i;
        m13155c();
    }

    public final void setUnderlineColor(int i) {
        this.f10727p = i;
        invalidate();
    }

    public final void setUnderlineHeight(int i) {
        this.f10733v = i;
        invalidate();
    }

    public final void setDividerColorResource(int i) {
        this.f10728q = getResources().getColor(i);
        invalidate();
    }

    public final void setIndicatorColorResource(int i) {
        this.f10726o = getResources().getColor(i);
        invalidate();
    }

    public final void setTextColorResource(int i) {
        this.f10737z = getResources().getColor(i);
        m13155c();
    }

    public final void setUnderlineColorResource(int i) {
        this.f10727p = getResources().getColor(i);
        invalidate();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f10716d = savedState.f10741a;
        requestLayout();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.f10715c = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f10722k);
            m13153b();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f10723l != 0) {
            int height = getHeight();
            if (this.f10730s) {
                this.f10724m.setColor(this.f10727p);
                canvas.drawRect(0.0f, (float) (height - this.f10733v), (float) this.f10714b.getWidth(), (float) height, this.f10724m);
            }
            this.f10724m.setColor(this.f10726o);
            View childAt = this.f10714b.getChildAt(this.f10716d);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f10717e > 0.0f && this.f10716d < this.f10723l - 1) {
                View childAt2 = this.f10714b.getChildAt(this.f10716d + 1);
                float left2 = (float) childAt2.getLeft();
                left = (this.f10717e * left2) + ((1.0f - this.f10717e) * left);
                right = (this.f10717e * ((float) childAt2.getRight())) + ((1.0f - this.f10717e) * right);
            }
            float f = (float) height;
            Canvas canvas2 = canvas;
            canvas2.drawRect(left, (float) (height - this.f10732u), right, f, this.f10724m);
            if (!this.f10730s) {
                this.f10724m.setColor(this.f10727p);
                canvas.drawRect(0.0f, (float) (height - this.f10733v), (float) this.f10714b.getWidth(), f, this.f10724m);
            }
            this.f10725n.setColor(this.f10728q);
            for (int i = 0; i < this.f10723l - 1; i++) {
                View childAt3 = this.f10714b.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.f10734w, (float) childAt3.getRight(), (float) (height - this.f10734w), this.f10725n);
            }
        }
    }

    /* renamed from: b */
    private void m13154b(int i, int i2) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        m13151a(i, (View) imageButton);
    }

    /* renamed from: a */
    private void m13151a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (!(PagerSlidingTabStrip.this.f10715c.getAdapter() instanceof C3586c) || PagerSlidingTabStrip.this.f10715c.getCurrentItem() != i) {
                    PagerSlidingTabStrip.this.f10715c.setCurrentItem(i);
                } else {
                    PagerSlidingTabStrip.this.f10715c.getAdapter();
                }
            }
        });
        view.setPadding(this.f10735x, 0, this.f10735x, 0);
        LinearLayout linearLayout = this.f10714b;
        if (this.f10729r) {
            layoutParams = this.f10721j;
        } else {
            layoutParams = this.f10720i;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m13152a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            android.support.v4.view.ViewPager r0 = r3.f10715c
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            boolean r0 = r0 instanceof com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip.C3586c
            r1 = 0
            if (r0 == 0) goto L_0x0020
            android.support.v4.view.ViewPager r0 = r3.f10715c
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip$c r0 = (com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip.C3586c) r0
            android.widget.LinearLayout r2 = r3.f10714b
            android.view.View r2 = r0.mo10980a(r4, r2)
            if (r2 == 0) goto L_0x0021
            android.widget.TextView r1 = r0.mo10981a(r2)
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            if (r1 != 0) goto L_0x002d
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r0 = r3.getContext()
            r1.<init>(r0)
            r2 = r1
        L_0x002d:
            r1.setText(r5)
            r5 = 17
            r1.setGravity(r5)
            r1.setSingleLine()
            r3.m13151a(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.uikit.scrollview.PagerSlidingTabStrip.m13152a(int, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo10936a(int i, int i2) {
        if (this.f10723l != 0) {
            int left = this.f10714b.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f10731t;
            }
            if (left != this.f10710C) {
                this.f10710C = left;
                scrollTo(left, 0);
            }
        }
    }
}
