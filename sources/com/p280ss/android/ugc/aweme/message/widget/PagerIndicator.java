package com.p280ss.android.ugc.aweme.message.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.R$styleable;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.message.widget.PagerIndicator */
public class PagerIndicator extends LinearLayout {

    /* renamed from: a */
    public int f86439a;

    /* renamed from: b */
    public int f86440b;

    /* renamed from: c */
    public boolean f86441c;

    /* renamed from: d */
    public int f86442d;

    /* renamed from: e */
    public ViewPager f86443e;

    /* renamed from: f */
    public C33219a f86444f;

    /* renamed from: g */
    boolean f86445g;

    /* renamed from: h */
    private int f86446h;

    /* renamed from: i */
    private int f86447i;

    /* renamed from: j */
    private int f86448j;

    /* renamed from: k */
    private long f86449k;

    /* renamed from: l */
    private long f86450l;

    /* renamed from: m */
    private boolean f86451m;

    /* renamed from: n */
    private Paint f86452n;

    /* renamed from: o */
    private int f86453o;

    /* renamed from: p */
    private int f86454p;

    /* renamed from: q */
    private int f86455q;

    /* renamed from: r */
    private IndicatorListener f86456r;

    /* renamed from: com.ss.android.ugc.aweme.message.widget.PagerIndicator$IndicatorListener */
    public abstract class IndicatorListener implements C0935e {
        /* renamed from: a */
        public abstract void mo85042a(int i);

        /* renamed from: a */
        public abstract void mo85043a(int i, float f);

        public IndicatorListener() {
        }

        public void onPageScrollStateChanged(int i) {
            if (PagerIndicator.this.f86444f != null) {
                PagerIndicator.this.f86444f.mo84988a(i);
            }
        }

        public void onPageSelected(int i) {
            mo85042a(i);
            if (PagerIndicator.this.f86444f != null) {
                PagerIndicator.this.f86444f.mo84989a(i, PagerIndicator.this.f86445g);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            mo85043a(i, f);
            if (f > 0.0f) {
                PagerIndicator.this.f86445g = true;
            } else {
                PagerIndicator.this.f86445g = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.message.widget.PagerIndicator$a */
    public interface C33219a {
        /* renamed from: a */
        void mo84988a(int i);

        /* renamed from: a */
        void mo84989a(int i, boolean z);
    }

    /* renamed from: c */
    private void m107168c() {
        this.f86441c = true;
    }

    /* renamed from: d */
    private void m107169d() {
        for (final int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof TextView) {
                childAt.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        ClickInstrumentation.onClick(view);
                        PagerIndicator.this.f86443e.setCurrentItem(i);
                    }
                });
            }
        }
    }

    /* renamed from: e */
    private boolean m107170e() {
        if (VERSION.SDK_INT < 17 || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private void m107167b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(this.f86449k);
        ofFloat.setStartDelay(this.f86450l);
        ofFloat.addUpdateListener(new AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int width = PagerIndicator.this.getWidth() / PagerIndicator.this.f86440b;
                PagerIndicator.this.f86442d = (int) ((((float) width) * (((Float) valueAnimator.getAnimatedValue()).floatValue() + 0.0f)) + ((float) (PagerIndicator.this.f86439a / 2)));
                PagerIndicator.this.invalidate();
                if (((Float) valueAnimator.getAnimatedValue()).floatValue() == 1.0f) {
                    PagerIndicator.this.f86441c = false;
                }
            }
        });
        ofFloat.start();
    }

    /* renamed from: a */
    private void m107165a() {
        this.f86452n = new Paint();
        this.f86452n.setAntiAlias(true);
        this.f86452n.setColor(getContext().getResources().getColor(R.color.axb));
        this.f86452n.setStyle(Style.FILL);
        this.f86452n.setStrokeWidth((float) this.f86446h);
    }

    public void setSelectCallBack(C33219a aVar) {
        this.f86444f = aVar;
    }

    public PagerIndicator(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private View m107164a(String str) {
        DmtTextView dmtTextView = new DmtTextView(getContext());
        LayoutParams layoutParams = new LayoutParams(0, -1);
        layoutParams.weight = 1.0f;
        dmtTextView.setGravity(17);
        dmtTextView.setText(str);
        dmtTextView.setTextColor(this.f86455q);
        dmtTextView.setLayoutParams(layoutParams);
        dmtTextView.setTextSize(1, (float) this.f86448j);
        dmtTextView.setMaxLines(1);
        dmtTextView.setEllipsize(TruncateAt.END);
        if (C6399b.m19944t()) {
            dmtTextView.setFontType(C10834d.f29332b);
        }
        return dmtTextView;
    }

    public void setHighLightText(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof TextView) {
                if (i2 == i) {
                    TextView textView = (TextView) childAt;
                    textView.setTextColor(this.f86454p);
                    textView.setTypeface(Typeface.defaultFromStyle(1));
                } else {
                    TextView textView2 = (TextView) childAt;
                    textView2.setTextColor(this.f86455q);
                    textView2.setTypeface(Typeface.defaultFromStyle(0));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f86451m) {
            canvas.save();
            if (m107170e()) {
                int width = getWidth();
                canvas.drawLine((float) (width - this.f86442d), (float) getHeight(), (float) (width - (this.f86442d + ((getWidth() / this.f86440b) - this.f86439a))), (float) getHeight(), this.f86452n);
            } else {
                canvas.drawLine((float) this.f86442d, (float) getHeight(), (float) (this.f86442d + ((getWidth() / this.f86440b) - this.f86439a)), (float) getHeight(), this.f86452n);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
    }

    public void setTabItems(List<String> list) {
        if (list != null) {
            removeAllViews();
            if (list.size() == 1) {
                this.f86451m = false;
            } else {
                this.f86451m = true;
            }
            for (String a : list) {
                addView(m107164a(a));
            }
            this.f86440b = list.size();
            this.f86453o = getWidth() / this.f86440b;
            setHighLightText(list.size() - 1);
            m107169d();
        }
    }

    /* renamed from: a */
    public final void mo85034a(int i) {
        if (this.f86443e != null) {
            try {
                int currentItem = this.f86443e.getCurrentItem();
                int i2 = i - 1;
                if (currentItem != i2) {
                    m107168c();
                }
                this.f86443e.setCurrentItem(i2, false);
                if (currentItem != i2) {
                    m107167b();
                }
            } catch (Exception e) {
                C6921a.m21559a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public final void mo85036a(ViewPager viewPager, int i) {
        this.f86443e = viewPager;
        viewPager.addOnPageChangeListener(this.f86456r);
        viewPager.setCurrentItem(i);
    }

    public PagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f86446h = 12;
        this.f86439a = (int) C9738o.m28708b(getContext(), 30.0f);
        this.f86447i = (int) C9738o.m28708b(getContext(), 110.0f);
        this.f86448j = 17;
        this.f86440b = 1;
        this.f86449k = 380;
        this.f86450l = 250;
        this.f86441c = false;
        this.f86451m = false;
        this.f86456r = new IndicatorListener() {
            /* renamed from: a */
            public final void mo85042a(int i) {
                PagerIndicator.this.setHighLightText(i);
            }

            /* renamed from: a */
            public final void mo85043a(int i, float f) {
                PagerIndicator.this.mo85035a(i, f);
            }
        };
        this.f86445g = false;
        m107166a(context, attributeSet);
        m107165a();
    }

    /* renamed from: a */
    private void m107166a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.PagerIndicator);
        this.f86454p = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.a5d));
        this.f86455q = obtainStyledAttributes.getColor(2, context.getResources().getColor(R.color.avh));
        this.f86448j = (int) obtainStyledAttributes.getDimension(3, (float) this.f86448j);
        this.f86446h = (int) obtainStyledAttributes.getDimension(0, (float) this.f86446h);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public final void mo85035a(int i, float f) {
        if (!this.f86441c) {
            this.f86442d = ((int) (((float) (getWidth() / this.f86440b)) * (((float) i) + f))) + (this.f86439a / 2);
        }
        if (i >= this.f86440b - 2 && f > 0.0f && getChildCount() > this.f86440b && i != getChildCount() - 2) {
            if (this.f86440b != 1) {
                scrollTo(((i - (this.f86440b - 2)) * this.f86453o) + ((int) (((float) this.f86453o) * f)), 0);
            } else {
                scrollTo((i * this.f86453o) + ((int) (((float) this.f86453o) * f)), 0);
            }
        }
        invalidate();
    }
}
