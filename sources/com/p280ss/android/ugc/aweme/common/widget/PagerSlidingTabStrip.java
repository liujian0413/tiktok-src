package com.p280ss.android.ugc.aweme.common.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextPaint;
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
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip */
public final class PagerSlidingTabStrip extends HorizontalScrollView {

    /* renamed from: j */
    private static final int[] f67779j = {16842901, 16842904};

    /* renamed from: A */
    private int f67780A;

    /* renamed from: B */
    private int f67781B;

    /* renamed from: C */
    private Typeface f67782C;

    /* renamed from: D */
    private int f67783D;

    /* renamed from: E */
    private int f67784E;

    /* renamed from: F */
    private int f67785F;

    /* renamed from: G */
    private Locale f67786G;

    /* renamed from: H */
    private int f67787H;

    /* renamed from: I */
    private int f67788I;

    /* renamed from: J */
    private int f67789J;

    /* renamed from: K */
    private boolean f67790K;

    /* renamed from: a */
    public C25737b f67791a;

    /* renamed from: b */
    public C0935e f67792b;

    /* renamed from: c */
    public LinearLayout f67793c;

    /* renamed from: d */
    public ViewPager f67794d;

    /* renamed from: e */
    public int f67795e;

    /* renamed from: f */
    public int f67796f;

    /* renamed from: g */
    public float f67797g;

    /* renamed from: h */
    public boolean f67798h;

    /* renamed from: i */
    public boolean f67799i;

    /* renamed from: k */
    private LayoutParams f67800k;

    /* renamed from: l */
    private LayoutParams f67801l;

    /* renamed from: m */
    private final C25738c f67802m;

    /* renamed from: n */
    private Paint f67803n;

    /* renamed from: o */
    private Paint f67804o;

    /* renamed from: p */
    private int f67805p;

    /* renamed from: q */
    private int f67806q;

    /* renamed from: r */
    private int f67807r;

    /* renamed from: s */
    private boolean f67808s;

    /* renamed from: t */
    private boolean f67809t;

    /* renamed from: u */
    private int f67810u;

    /* renamed from: v */
    private int f67811v;

    /* renamed from: w */
    private int f67812w;

    /* renamed from: x */
    private int f67813x;

    /* renamed from: y */
    private int f67814y;

    /* renamed from: z */
    private int f67815z;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$SavedState */
    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new Creator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m84535a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m84534a(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m84534a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m84535a(i);
            }
        };

        /* renamed from: a */
        int f67819a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f67819a = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f67819a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$a */
    public interface C25736a {
        /* renamed from: a */
        int mo66728a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$b */
    public interface C25737b {
        /* renamed from: a */
        boolean mo66729a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$c */
    class C25738c implements C0935e {

        /* renamed from: a */
        final /* synthetic */ PagerSlidingTabStrip f67820a;

        public final void onPageScrollStateChanged(int i) {
            if (i == 0) {
                this.f67820a.mo66682a(this.f67820a.f67794d.getCurrentItem(), 0);
            }
            if (this.f67820a.f67792b != null) {
                this.f67820a.f67792b.onPageScrollStateChanged(i);
            }
        }

        public final void onPageSelected(int i) {
            if (this.f67820a.f67799i) {
                this.f67820a.mo66681a();
            }
            if (this.f67820a.f67792b != null) {
                this.f67820a.f67792b.onPageSelected(i);
            }
        }

        public final void onPageScrolled(int i, float f, int i2) {
            this.f67820a.f67796f = i;
            this.f67820a.f67797g = f;
            this.f67820a.mo66682a(i, (int) (((float) this.f67820a.f67793c.getChildAt(i).getWidth()) * f));
            this.f67820a.invalidate();
            if (this.f67820a.f67792b != null) {
                this.f67820a.f67792b.onPageScrolled(i, f, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$d */
    public interface C25739d {
        /* renamed from: a */
        View mo66730a(int i, ViewGroup viewGroup);

        /* renamed from: a */
        TextView mo66731a(View view);
    }

    public final int getDividerColor() {
        return this.f67807r;
    }

    public final int getDividerPadding() {
        return this.f67813x;
    }

    public final boolean getHighlightTitle() {
        return this.f67799i;
    }

    public final int getIndicatorColor() {
        return this.f67805p;
    }

    public final int getIndicatorHeight() {
        return this.f67811v;
    }

    public final int getScrollOffset() {
        return this.f67810u;
    }

    public final boolean getShouldExpand() {
        return this.f67808s;
    }

    public final int getTabBackground() {
        return this.f67785F;
    }

    public final int getTabPaddingLeftRight() {
        return this.f67814y;
    }

    public final int getTextColor() {
        return this.f67781B;
    }

    public final int getTextSize() {
        return this.f67780A;
    }

    public final int getUnderlineColor() {
        return this.f67806q;
    }

    public final int getUnderlineHeight() {
        return this.f67812w;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f67819a = this.f67796f;
        return savedState;
    }

    /* renamed from: b */
    private void m84529b() {
        this.f67793c.removeAllViews();
        this.f67795e = this.f67794d.getAdapter().getCount();
        for (int i = 0; i < this.f67795e; i++) {
            if (this.f67794d.getAdapter() instanceof C25736a) {
                m84530b(i, ((C25736a) this.f67794d.getAdapter()).mo66728a(i));
            } else {
                m84528a(i, this.f67794d.getAdapter().getPageTitle(i).toString());
            }
        }
        m84531c();
        getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                if (VERSION.SDK_INT < 16) {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                PagerSlidingTabStrip.this.f67796f = Math.max(0, Math.min(PagerSlidingTabStrip.this.f67795e - 1, PagerSlidingTabStrip.this.f67794d.getCurrentItem()));
                PagerSlidingTabStrip.this.mo66682a(PagerSlidingTabStrip.this.f67796f, 0);
            }
        });
    }

    /* renamed from: c */
    private void m84531c() {
        TextView textView;
        int currentItem = this.f67794d.getCurrentItem();
        for (int i = 0; i < this.f67795e; i++) {
            View childAt = this.f67793c.getChildAt(i);
            childAt.setBackgroundResource(this.f67785F);
            if (this.f67794d.getAdapter() instanceof C25739d) {
                textView = ((C25739d) this.f67794d.getAdapter()).mo66731a(childAt);
            } else {
                textView = null;
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                textView.setTextSize(0, (float) this.f67780A);
                textView.setTypeface(this.f67782C, this.f67783D);
                if (currentItem != i || !this.f67799i) {
                    textView.setTextColor(this.f67781B);
                    textView.setTypeface(null, 0);
                    textView.setShadowLayer(0.0f, 0.0f, 0.0f, getContext().getResources().getColor(R.color.a5o));
                } else {
                    textView.setTextColor(this.f67805p);
                    textView.setTypeface(null, 1);
                    textView.setShadowLayer(2.0f, 0.0f, 2.0f, getContext().getResources().getColor(R.color.a5o));
                }
                if (this.f67798h) {
                    if (VERSION.SDK_INT >= 14) {
                        textView.setAllCaps(true);
                    } else {
                        textView.setText(textView.getText().toString().toUpperCase(this.f67786G));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo66681a() {
        TextView textView;
        int currentItem = this.f67794d.getCurrentItem();
        for (int i = 0; i < this.f67795e; i++) {
            View childAt = this.f67793c.getChildAt(i);
            childAt.setBackgroundColor(getContext().getResources().getColor(R.color.ayd));
            childAt.setBackgroundColor(getContext().getResources().getColor(R.color.ayd));
            int b = (int) C9738o.m28708b(getContext(), 0.0f);
            childAt.setPadding(b, (int) C9738o.m28708b(getContext(), 7.0f), b, 0);
            if (this.f67794d.getAdapter() instanceof C25739d) {
                textView = ((C25739d) this.f67794d.getAdapter()).mo66731a(childAt);
            } else {
                textView = null;
            }
            if (textView == null && (childAt instanceof TextView)) {
                textView = (TextView) childAt;
            }
            if (textView != null) {
                if (currentItem != i || !this.f67799i) {
                    textView.setTextColor(this.f67781B);
                    textView.setTypeface(null, 0);
                    textView.setShadowLayer(0.0f, 0.0f, 0.0f, getContext().getResources().getColor(R.color.a5o));
                } else {
                    textView.setTextColor(this.f67805p);
                    textView.setTypeface(null, 1);
                    textView.setShadowLayer(2.0f, 0.0f, 2.0f, getContext().getResources().getColor(R.color.a5o));
                }
            }
        }
    }

    public final void setAllCaps(boolean z) {
        this.f67798h = z;
    }

    public final void setHighlightTitle(boolean z) {
        this.f67799i = z;
    }

    public final void setOnPageChangeListener(C0935e eVar) {
        this.f67792b = eVar;
    }

    public final void setOnTabTriggerOnListener(C25737b bVar) {
        this.f67791a = bVar;
    }

    public final void setOverlayIndicator(boolean z) {
        this.f67809t = z;
    }

    public final void setTabBackground(int i) {
        this.f67785F = i;
    }

    public final void setDividerColor(int i) {
        this.f67807r = i;
        invalidate();
    }

    public final void setDividerPadding(int i) {
        this.f67813x = i;
        invalidate();
    }

    public final void setIndicatorColor(int i) {
        this.f67805p = i;
        invalidate();
    }

    public final void setIndicatorHeight(int i) {
        this.f67811v = i;
        invalidate();
    }

    public final void setScrollOffset(int i) {
        this.f67810u = i;
        invalidate();
    }

    public final void setShouldExpand(boolean z) {
        this.f67808s = z;
        requestLayout();
    }

    public final void setTabPaddingLeftRight(int i) {
        this.f67814y = i;
        m84531c();
    }

    public final void setTextColor(int i) {
        this.f67781B = i;
        m84531c();
    }

    public final void setTextSize(int i) {
        this.f67780A = i;
        m84531c();
    }

    public final void setUnderlineColor(int i) {
        this.f67806q = i;
        invalidate();
    }

    public final void setUnderlineHeight(int i) {
        this.f67812w = i;
        invalidate();
    }

    public final void setDividerColorResource(int i) {
        this.f67807r = getResources().getColor(i);
        invalidate();
    }

    public final void setIndicatorColorResource(int i) {
        this.f67805p = getResources().getColor(i);
        invalidate();
    }

    public final void setShowDot(boolean z) {
        if (this.f67790K != z) {
            this.f67790K = z;
            invalidate();
        }
    }

    public final void setTextColorResource(int i) {
        this.f67781B = getResources().getColor(i);
        m84531c();
    }

    public final void setUnderlineColorResource(int i) {
        this.f67806q = getResources().getColor(i);
        invalidate();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f67796f = savedState.f67819a;
        requestLayout();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.f67794d = viewPager;
        if (viewPager.getAdapter() != null) {
            viewPager.setOnPageChangeListener(this.f67802m);
            m84529b();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && this.f67795e != 0) {
            int height = getHeight();
            if (this.f67809t) {
                this.f67803n.setColor(this.f67806q);
                canvas.drawRect(0.0f, 0.0f, (float) this.f67793c.getWidth(), (float) this.f67812w, this.f67803n);
            }
            if (this.f67790K) {
                this.f67803n.setColor(this.f67788I);
                View childAt = getChildAt(0);
                if (!(childAt == null || childAt.getWidth() == 0)) {
                    LinearLayout linearLayout = (LinearLayout) childAt;
                    if (linearLayout.getChildCount() > 0) {
                        if (this.f67789J < 0) {
                            Rect rect = new Rect();
                            TextView textView = (TextView) linearLayout.getChildAt(0);
                            TextPaint paint = textView.getPaint();
                            String charSequence = textView.getText().toString();
                            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                            this.f67789J = (textView.getWidth() + rect.width()) / 2;
                        }
                        canvas.drawCircle((float) (this.f67789J + this.f67787H), (float) (((int) C9738o.m28708b(getContext(), 7.0f)) + this.f67787H), (float) (this.f67787H / 2), this.f67803n);
                    }
                }
            }
            this.f67803n.setColor(this.f67805p);
            View childAt2 = this.f67793c.getChildAt(this.f67796f);
            float left = (float) childAt2.getLeft();
            float right = (float) childAt2.getRight();
            if (this.f67797g > 0.0f && this.f67796f < this.f67795e - 1) {
                View childAt3 = this.f67793c.getChildAt(this.f67796f + 1);
                float left2 = (float) childAt3.getLeft();
                left = (this.f67797g * left2) + ((1.0f - this.f67797g) * left);
                right = (this.f67797g * ((float) childAt3.getRight())) + ((1.0f - this.f67797g) * right);
            }
            Canvas canvas2 = canvas;
            canvas2.drawRect(left, 0.0f, right, (float) this.f67811v, this.f67803n);
            if (!this.f67809t) {
                this.f67803n.setColor(this.f67806q);
                canvas.drawRect(0.0f, 0.0f, (float) this.f67793c.getWidth(), (float) this.f67812w, this.f67803n);
            }
            this.f67804o.setColor(this.f67807r);
            for (int i = 0; i < this.f67795e - 1; i++) {
                View childAt4 = this.f67793c.getChildAt(i);
                canvas.drawLine((float) childAt4.getRight(), (float) this.f67813x, (float) childAt4.getRight(), (float) (height - this.f67813x), this.f67804o);
            }
        }
    }

    /* renamed from: b */
    private void m84530b(int i, int i2) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(i2);
        m84527a(i, (View) imageButton);
    }

    /* renamed from: a */
    private void m84527a(final int i, View view) {
        LayoutParams layoutParams;
        view.setFocusable(true);
        view.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if ((PagerSlidingTabStrip.this.f67794d.getAdapter() instanceof C25739d) && PagerSlidingTabStrip.this.f67794d.getCurrentItem() == i) {
                    PagerSlidingTabStrip.this.f67794d.getAdapter();
                } else if (PagerSlidingTabStrip.this.f67791a == null || !PagerSlidingTabStrip.this.f67791a.mo66729a(i)) {
                    PagerSlidingTabStrip.this.f67794d.setCurrentItem(i);
                }
            }
        });
        view.setPadding(this.f67814y, 0, this.f67814y, 0);
        LinearLayout linearLayout = this.f67793c;
        if (this.f67808s) {
            layoutParams = this.f67801l;
        } else {
            layoutParams = this.f67800k;
        }
        linearLayout.addView(view, i, layoutParams);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.widget.TextView, com.bytedance.ies.dmt.ui.widget.DmtTextView] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.widget.TextView] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m84528a(int r5, java.lang.String r6) {
        /*
            r4 = this;
            android.support.v4.view.ViewPager r0 = r4.f67794d
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip.C25739d
            r1 = 0
            if (r0 == 0) goto L_0x0020
            android.support.v4.view.ViewPager r0 = r4.f67794d
            android.support.v4.view.PagerAdapter r0 = r0.getAdapter()
            com.ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip$d r0 = (com.p280ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip.C25739d) r0
            android.widget.LinearLayout r2 = r4.f67793c
            android.view.View r2 = r0.mo66730a(r5, r2)
            if (r2 == 0) goto L_0x0021
            android.widget.TextView r1 = r0.mo66731a(r2)
            goto L_0x0021
        L_0x0020:
            r2 = r1
        L_0x0021:
            if (r1 != 0) goto L_0x0038
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = new com.bytedance.ies.dmt.ui.widget.DmtTextView
            android.content.Context r0 = r4.getContext()
            r1.<init>(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            int r2 = r4.f67815z
            r3 = -1
            r0.<init>(r2, r3)
            r1.setLayoutParams(r0)
            r2 = r1
        L_0x0038:
            r1.setText(r6)
            r6 = 1
            r1.setGravity(r6)
            r1.setSingleLine()
            r6 = 0
            r1.setBackgroundColor(r6)
            r4.m84527a(r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.common.widget.PagerSlidingTabStrip.m84528a(int, java.lang.String):void");
    }

    /* renamed from: a */
    public final void mo66682a(int i, int i2) {
        if (this.f67795e != 0) {
            int left = this.f67793c.getChildAt(i).getLeft() + i2;
            if (i > 0 || i2 > 0) {
                left -= this.f67810u;
            }
            if (left != this.f67784E) {
                this.f67784E = left;
                scrollTo(left, 0);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!isInEditMode() && this.f67795e != 0) {
            mo66681a();
        }
    }
}
