package com.bytedance.ies.uikit.scrollview;

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
    private static final int[] f30054h = {16842901, 16842904};

    /* renamed from: A */
    private Typeface f30055A;

    /* renamed from: B */
    private int f30056B;

    /* renamed from: C */
    private int f30057C;

    /* renamed from: D */
    private int f30058D;

    /* renamed from: E */
    private Locale f30059E;

    /* renamed from: a */
    public C0935e f30060a;

    /* renamed from: b */
    public LinearLayout f30061b;

    /* renamed from: c */
    public ViewPager f30062c;

    /* renamed from: d */
    public int f30063d;

    /* renamed from: e */
    public float f30064e;

    /* renamed from: f */
    public boolean f30065f;

    /* renamed from: g */
    public boolean f30066g;

    /* renamed from: i */
    private LayoutParams f30067i;

    /* renamed from: j */
    private LayoutParams f30068j;

    /* renamed from: k */
    private final C11071b f30069k;

    /* renamed from: l */
    private int f30070l;

    /* renamed from: m */
    private Paint f30071m;

    /* renamed from: n */
    private Paint f30072n;

    /* renamed from: o */
    private int f30073o;

    /* renamed from: p */
    private int f30074p;

    /* renamed from: q */
    private int f30075q;

    /* renamed from: r */
    private boolean f30076r;

    /* renamed from: s */
    private boolean f30077s;

    /* renamed from: t */
    private int f30078t;

    /* renamed from: u */
    private int f30079u;

    /* renamed from: v */
    private int f30080v;

    /* renamed from: w */
    private int f30081w;

    /* renamed from: x */
    private int f30082x;

    /* renamed from: y */
    private int f30083y;

    /* renamed from: z */
    private int f30084z;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m32437a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m32436a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m32436a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m32437a(i);
            }
        };

        /* renamed from: a */
        int f30088a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f30088a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f30088a);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$a */
    public interface C11070a {
        /* renamed from: a */
        int mo26960a(int i);
    }

    /* renamed from: com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$b */
    class C11071b implements C0935e {

        /* renamed from: a */
        final /* synthetic */ PagerSlidingTabStrip f30089a;

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f30089a.mo26917a(this.f30089a.f30062c.getCurrentItem(), 0);
            }
            if (this.f30089a.f30060a != null) {
                this.f30089a.f30060a.onPageScrollStateChanged(i);
            }
        }

        public final void onPageSelected(int i) {
            if (this.f30089a.f30066g) {
                this.f30089a.mo26916a();
            }
            if (this.f30089a.f30060a != null) {
                this.f30089a.f30060a.onPageSelected(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            this.f30089a.f30063d = i;
            this.f30089a.f30064e = f;
            this.f30089a.mo26917a(i, (int) (((float) this.f30089a.f30061b.getChildAt(i).getWidth()) * f));
            this.f30089a.invalidate();
            if (this.f30089a.f30060a != null) {
                this.f30089a.f30060a.onPageScrolled(i, f, i2);
            }
        }
    }

    /* renamed from: com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$c */
    public interface C11072c {
        /* renamed from: a */
        View mo26961a(int i, ViewGroup viewGroup);

        /* renamed from: a */
        TextView mo26962a(View view);
    }

    public final int getDividerColor() {
        return this.f30075q;
    }

    public final int getDividerPadding() {
        return this.f30081w;
    }

    public final boolean getHighlightTitle() {
        return this.f30066g;
    }

    public final int getIndicatorColor() {
        return this.f30073o;
    }

    public final int getIndicatorHeight() {
        return this.f30079u;
    }

    public final int getScrollOffset() {
        return this.f30078t;
    }

    public final boolean getShouldExpand() {
        return this.f30076r;
    }

    public final int getTabBackground() {
        return this.f30058D;
    }

    public final int getTabPaddingLeftRight() {
        return this.f30082x;
    }

    public final int getTextColor() {
        return this.f30084z;
    }

    public final int getTextSize() {
        return this.f30083y;
    }

    public final int getUnderlineColor() {
        return this.f30074p;
    }

    public final int getUnderlineHeight() {
        return this.f30080v;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f30088a = this.f30063d;
        return savedState;
    }

    /* renamed from: b */
    private void m32431b() {
        this.f30061b.removeAllViews();
        this.f30070l = this.f30062c.getAdapter().getCount();
        for (int i = 0; i < this.f30070l; i++) {
            if (this.f30062c.getAdapter() instanceof C11070a) {
                m32432b(i, ((C11070a) this.f30062c.getAdapter()).mo26960a(i));
            } else {
                m32430a(i, this.f30062c.getAdapter().getPageTitle(i).toString());
            }
        }
        m32433c();
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (VERSION.SDK_INT < 16) {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                PagerSlidingTabStrip.this.f30063d = PagerSlidingTabStrip.this.f30062c.getCurrentItem();
                PagerSlidingTabStrip.this.mo26917a(PagerSlidingTabStrip.this.f30063d, 0);
            }
        });
    }

    /* renamed from: c */
    private void m32433c() {
        int currentItem = this.f30062c.getCurrentItem();
        for (int i = 0; i < this.f30070l; i++) {
            View childAt = this.f30061b.getChildAt(i);
            childAt.setBackgroundResource(this.f30058D);
            TextView textView = null;
            if (this.f30062c.getAdapter() instanceof C11072c) {
                textView = ((C11072c) this.f30062c.getAdapter()).mo26962a(childAt);
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                textView.setTextSize(0, (float) this.f30083y);
                textView.setTypeface(this.f30055A, this.f30056B);
                if (currentItem != i || !this.f30066g) {
                    textView.setTextColor(this.f30084z);
                } else {
                    textView.setTextColor(this.f30073o);
                }
                if (this.f30065f) {
                    if (VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.f30059E));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo26916a() {
        int currentItem = this.f30062c.getCurrentItem();
        for (int i = 0; i < this.f30070l; i++) {
            View childAt = this.f30061b.getChildAt(i);
            TextView textView = null;
            if (this.f30062c.getAdapter() instanceof C11072c) {
                textView = ((C11072c) this.f30062c.getAdapter()).mo26962a(childAt);
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                if (currentItem != i || !this.f30066g) {
                    textView.setTextColor(this.f30084z);
                } else {
                    textView.setTextColor(this.f30073o);
                }
            }
        }
    }

    public final void setAllCaps(boolean z) {
        this.f30065f = z;
    }

    public final void setHighlightTitle(boolean z) {
        this.f30066g = z;
    }

    public final void setOnPageChangeListener(C0935e eVar) {
        this.f30060a = eVar;
    }

    public final void setOverlayIndicator(boolean z) {
        this.f30077s = z;
    }

    public final void setTabBackground(int i) {
        this.f30058D = i;
    }

    public final void setDividerColor(int i) {
        this.f30075q = i;
        invalidate();
    }

    public final void setDividerPadding(int i) {
        this.f30081w = i;
        invalidate();
    }

    public final void setIndicatorColor(int i) {
        this.f30073o = i;
        invalidate();
    }

    public final void setIndicatorHeight(int i) {
        this.f30079u = i;
        invalidate();
    }

    public final void setScrollOffset(int i) {
        this.f30078t = i;
        invalidate();
    }

    public final void setShouldExpand(boolean z) {
        this.f30076r = z;
        requestLayout();
    }

    public final void setTabPaddingLeftRight(int i) {
        this.f30082x = i;
        m32433c();
    }

    public final void setTextColor(int i) {
        this.f30084z = i;
        m32433c();
    }

    public final void setTextSize(int i) {
        this.f30083y = i;
        m32433c();
    }

    public final void setUnderlineColor(int i) {
        this.f30074p = i;
        invalidate();
    }

    public final void setUnderlineHeight(int i) {
        this.f30080v = i;
        invalidate();
    }

    public final void setDividerColorResource(int i) {
        this.f30075q = getResources().getColor(i);
        invalidate();
    }

    public final void setIndicatorColorResource(int i) {
        this.f30073o = getResources().getColor(i);
        invalidate();
    }

    public final void setTextColorResource(int i) {
        this.f30084z = getResources().getColor(i);
        m32433c();
    }

    public final void setUnderlineColorResource(int i) {
        this.f30074p = getResources().getColor(i);
        invalidate();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f30063d = savedState.f30088a;
        requestLayout();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.f30062c = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f30069k);
            m32431b();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f30070l != 0) {
            int height = getHeight();
            if (this.f30077s) {
                this.f30071m.setColor(this.f30074p);
                canvas.drawRect(0.0f, (float) (height - this.f30080v), (float) this.f30061b.getWidth(), (float) height, this.f30071m);
            }
            this.f30071m.setColor(this.f30073o);
            View childAt = this.f30061b.getChildAt(this.f30063d);
            float left = (float) childAt.getLeft();
            float right = (float) childAt.getRight();
            if (this.f30064e > 0.0f && this.f30063d < this.f30070l - 1) {
                View childAt2 = this.f30061b.getChildAt(this.f30063d + 1);
                float left2 = (float) childAt2.getLeft();
                left = (this.f30064e * left2) + ((1.0f - this.f30064e) * left);
                right = (this.f30064e * ((float) childAt2.getRight())) + ((1.0f - this.f30064e) * right);
            }
            float f = (float) height;
            Canvas canvas2 = canvas;
            canvas2.drawRect(left, (float) (height - this.f30079u), right, f, this.f30071m);
            if (!this.f30077s) {
                this.f30071m.setColor(this.f30074p);
                canvas.drawRect(0.0f, (float) (height - this.f30080v), (float) this.f30061b.getWidth(), f, this.f30071m);
            }
            this.f30072n.setColor(this.f30075q);
            for (int i = 0; i < this.f30070l - 1; i++) {
                View childAt3 = this.f30061b.getChildAt(i);
                canvas.drawLine((float) childAt3.getRight(), (float) this.f30081w, (float) childAt3.getRight(), (float) (height - this.f30081w), this.f30072n);
            }
        }
    }

    /* renamed from: b */
    private void m32432b(int i, int i2) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        m32429a(i, (View) imageButton);
    }

    /* renamed from: a */
    private void m32429a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                if (!(PagerSlidingTabStrip.this.f30062c.getAdapter() instanceof C11072c) || PagerSlidingTabStrip.this.f30062c.getCurrentItem() != i) {
                    PagerSlidingTabStrip.this.f30062c.setCurrentItem(i);
                } else {
                    PagerSlidingTabStrip.this.f30062c.getAdapter();
                }
            }
        });
        view.setPadding(this.f30082x, 0, this.f30082x, 0);
        LinearLayout linearLayout = this.f30061b;
        if (this.f30076r) {
            layoutParams = this.f30068j;
        } else {
            layoutParams = this.f30067i;
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
    private void m32430a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            android.support.v4.view.ViewPager r0 = r3.f30062c
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            boolean r0 = r0 instanceof com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip.C11072c
            r1 = 0
            if (r0 == 0) goto L_0x0020
            android.support.v4.view.ViewPager r0 = r3.f30062c
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip$c r0 = (com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip.C11072c) r0
            android.widget.LinearLayout r2 = r3.f30061b
            android.view.View r2 = r0.mo26961a(r4, r2)
            if (r2 == 0) goto L_0x0021
            android.widget.TextView r1 = r0.mo26962a(r2)
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
            r3.m32429a(r4, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.scrollview.PagerSlidingTabStrip.m32430a(int, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo26917a(int i, int i2) {
        if (this.f30070l != 0) {
            int left = this.f30061b.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f30078t;
            }
            if (left != this.f30057C) {
                this.f30057C = left;
                scrollTo(left, 0);
            }
        }
    }
}
