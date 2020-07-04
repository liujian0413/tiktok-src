package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.support.p022v4.view.DmtRtlViewPager;
import android.support.p022v4.view.DmtViewPager;
import android.support.p022v4.view.DmtViewPager.C0922d;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0934d;
import android.support.p022v4.view.ViewPager.C0935e;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.aweme.common.p575ui.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ViewPagerIndicatorLayout */
public class ViewPagerIndicatorLayout extends LinearLayout implements C0922d, C0934d, C0935e {

    /* renamed from: a */
    public ViewPager f107409a;

    /* renamed from: b */
    public DmtRtlViewPager f107410b;

    /* renamed from: c */
    int f107411c;

    /* renamed from: d */
    int f107412d;

    /* renamed from: e */
    int f107413e;

    /* renamed from: f */
    int f107414f;

    /* renamed from: g */
    int f107415g;

    /* renamed from: h */
    int f107416h;

    /* renamed from: i */
    DataSetObserver f107417i;

    /* renamed from: j */
    private C41223b[] f107418j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ViewPagerIndicatorLayout$a */
    class C41222a extends DataSetObserver {

        /* renamed from: a */
        PagerAdapter f107419a;

        /* renamed from: b */
        ViewPagerIndicatorLayout f107420b;

        public final void onChanged() {
            if (ViewPagerIndicatorLayout.this.f107409a != null) {
                ViewPagerIndicatorLayout.this.f107409a.requestLayout();
            }
            if (ViewPagerIndicatorLayout.this.f107410b != null) {
                ViewPagerIndicatorLayout.this.f107410b.requestLayout();
            }
            this.f107420b.setUpViews(this.f107419a);
        }

        public final void onInvalidated() {
            if (ViewPagerIndicatorLayout.this.f107409a != null) {
                ViewPagerIndicatorLayout.this.f107409a.requestLayout();
            }
            if (ViewPagerIndicatorLayout.this.f107410b != null) {
                ViewPagerIndicatorLayout.this.f107410b.requestLayout();
            }
            this.f107420b.setUpViews(this.f107419a);
        }

        C41222a(ViewPagerIndicatorLayout viewPagerIndicatorLayout, PagerAdapter pagerAdapter) {
            this.f107419a = pagerAdapter;
            this.f107420b = viewPagerIndicatorLayout;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ViewPagerIndicatorLayout$b */
    public static class C41223b extends View {

        /* renamed from: a */
        Paint f107422a = new Paint();

        /* renamed from: b */
        Paint f107423b;

        /* renamed from: c */
        int f107424c;

        /* renamed from: d */
        int f107425d;

        /* renamed from: e */
        int f107426e;

        public final void setFillAlpha(int i) {
            this.f107424c = i;
            invalidate();
        }

        public final void setStrokeAlpha(int i) {
            this.f107425d = i;
            invalidate();
        }

        public final void setSolidColor(int i) {
            this.f107422a.setColor(i);
            invalidate();
        }

        public final void setStrokeColor(int i) {
            this.f107423b.setColor(i);
            invalidate();
        }

        public final void setStrokeWidth(int i) {
            this.f107426e = i;
            this.f107423b.setStrokeWidth((float) i);
            invalidate();
        }

        public C41223b(Context context) {
            super(context);
            this.f107422a.setAntiAlias(true);
            this.f107422a.setStyle(Style.FILL);
            this.f107423b = new Paint();
            this.f107423b.setAntiAlias(true);
            this.f107423b.setStyle(Style.STROKE);
        }

        /* access modifiers changed from: protected */
        public final void onDraw(Canvas canvas) {
            int width = getWidth() / 2;
            this.f107422a.setAlpha(this.f107424c);
            float f = (float) width;
            canvas.drawCircle(f, f, f, this.f107422a);
            this.f107423b.setAlpha(this.f107425d);
            canvas.drawCircle(f, f, (float) (width - (this.f107426e / 2)), this.f107423b);
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageSelected(int i) {
    }

    public int getCount() {
        int i;
        int i2;
        if (this.f107409a != null) {
            PagerAdapter adapter = this.f107409a.getAdapter();
            if (adapter == null) {
                return 0;
            }
            if (adapter instanceof InfiniteLoopPagerAdapter) {
                i2 = ((InfiniteLoopPagerAdapter) adapter).mo101622c();
            } else {
                i2 = adapter.getCount();
            }
            return i2;
        } else if (this.f107410b == null) {
            return 0;
        } else {
            PagerAdapter adapter2 = this.f107410b.getAdapter();
            if (adapter2 == null) {
                return 0;
            }
            if (adapter2 instanceof InfiniteLoopPagerAdapter) {
                i = ((InfiniteLoopPagerAdapter) adapter2).mo101622c();
            } else {
                i = adapter2.getCount();
            }
            return i;
        }
    }

    public ViewPagerIndicatorLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private C41223b m131804a(int i) {
        return this.f107418j[i];
    }

    public void setOrientation(int i) {
        super.setOrientation(i);
        if (i == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    public void setUpViewPager(DmtRtlViewPager dmtRtlViewPager) {
        if (dmtRtlViewPager != null) {
            if (this.f107410b != null) {
                dmtRtlViewPager.mo3453b((C0935e) this);
                dmtRtlViewPager.mo3484b((C0922d) this);
            }
            this.f107410b = dmtRtlViewPager;
            PagerAdapter adapter = dmtRtlViewPager.getAdapter();
            dmtRtlViewPager.mo3451a((C0935e) this);
            dmtRtlViewPager.mo3478a((C0922d) this);
            if (adapter != null) {
                if (this.f107417i != null) {
                    adapter.unregisterDataSetObserver(this.f107417i);
                }
                this.f107417i = new C41222a(this, adapter);
                adapter.registerDataSetObserver(this.f107417i);
                setUpViews(adapter);
                return;
            }
            return;
        }
        throw new NullPointerException("viewPager == null.");
    }

    public void setUpViewPager(ViewPager viewPager) {
        if (viewPager != null) {
            if (this.f107409a != null) {
                viewPager.removeOnPageChangeListener(this);
                viewPager.removeOnAdapterChangeListener(this);
            }
            this.f107409a = viewPager;
            PagerAdapter adapter = viewPager.getAdapter();
            viewPager.addOnPageChangeListener(this);
            viewPager.addOnAdapterChangeListener(this);
            if (adapter != null) {
                if (this.f107417i != null) {
                    adapter.unregisterDataSetObserver(this.f107417i);
                }
                this.f107417i = new C41222a(this, adapter);
                adapter.registerDataSetObserver(this.f107417i);
                setUpViews(adapter);
                return;
            }
            return;
        }
        throw new NullPointerException("viewPager == null.");
    }

    public void setUpViews(PagerAdapter pagerAdapter) {
        int i;
        if (pagerAdapter instanceof InfiniteLoopPagerAdapter) {
            i = ((InfiniteLoopPagerAdapter) pagerAdapter).mo101622c();
        } else {
            i = pagerAdapter.getCount();
        }
        removeAllViews();
        this.f107418j = new C41223b[i];
        int i2 = this.f107415g / 2;
        for (int i3 = 0; i3 < i; i3++) {
            C41223b bVar = new C41223b(getContext());
            bVar.setSolidColor(this.f107412d);
            bVar.setStrokeColor(this.f107413e);
            LayoutParams layoutParams = new LayoutParams(this.f107411c, this.f107411c);
            if (getOrientation() == 1) {
                layoutParams.setMargins(0, i2, 0, i2);
            } else {
                layoutParams.setMargins(i2, 0, i2, 0);
            }
            addView(bVar, layoutParams);
            this.f107418j[i3] = bVar;
        }
    }

    public ViewPagerIndicatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo3520a(DmtViewPager dmtViewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (!(pagerAdapter == null || this.f107417i == null)) {
            pagerAdapter.unregisterDataSetObserver(this.f107417i);
        }
        if (pagerAdapter2 != null) {
            this.f107417i = new C41222a(this, pagerAdapter2);
            pagerAdapter2.registerDataSetObserver(this.f107417i);
        }
    }

    /* renamed from: a */
    public final void mo1668a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        if (!(pagerAdapter == null || this.f107417i == null)) {
            pagerAdapter.unregisterDataSetObserver(this.f107417i);
        }
        if (pagerAdapter2 != null) {
            this.f107417i = new C41222a(this, pagerAdapter2);
            pagerAdapter2.registerDataSetObserver(this.f107417i);
        }
    }

    public ViewPagerIndicatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f107418j = new C41223b[0];
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ViewPagerIndicatorLayout, i, 0);
        this.f107412d = obtainStyledAttributes.getColor(1, -1);
        this.f107413e = obtainStyledAttributes.getColor(3, -1);
        this.f107411c = obtainStyledAttributes.getDimensionPixelSize(0, (int) C9738o.m28708b(context, 4.0f));
        this.f107414f = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        float f = 0.5f;
        float f2 = obtainStyledAttributes.getFloat(5, 0.5f);
        if (f2 > 0.0f && f2 <= 1.0f) {
            f = f2;
        }
        this.f107416h = (int) (f * 255.0f);
        this.f107415g = obtainStyledAttributes.getDimensionPixelSize(2, (int) C9738o.m28708b(context, 4.0f));
        obtainStyledAttributes.recycle();
        if (getOrientation() == 0) {
            setGravity(16);
        } else {
            setGravity(1);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        int count = getCount();
        if (count != 0) {
            if (count != this.f107418j.length) {
                if (this.f107409a != null) {
                    setUpViews(this.f107409a.getAdapter());
                }
                if (this.f107410b != null) {
                    setUpViews(this.f107410b.getAdapter());
                }
            }
            int i3 = i % count;
            C41223b a = m131804a(i3);
            a.setStrokeAlpha(0);
            double d = (double) (1.0f - f);
            Double.isNaN(d);
            double sin = (Math.sin((d * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d;
            double d2 = (double) this.f107416h;
            Double.isNaN(d2);
            a.setFillAlpha((int) (sin + d2));
            int i4 = (i3 + 1) % count;
            C41223b a2 = m131804a(i4);
            a2.setStrokeAlpha(0);
            double d3 = (double) f;
            Double.isNaN(d3);
            double sin2 = (Math.sin((d3 * 3.141592653589793d) / 2.0d) * 255.0d) / 2.0d;
            double d4 = (double) this.f107416h;
            Double.isNaN(d4);
            a2.setFillAlpha((int) (sin2 + d4));
            for (int i5 = 0; i5 < count; i5++) {
                if (!(i5 == i3 || i5 == i4)) {
                    C41223b a3 = m131804a(i5);
                    a3.setStrokeAlpha(0);
                    a3.setFillAlpha(this.f107416h);
                }
            }
        }
    }
}
