package com.p280ss.android.ugc.aweme.poi.preview.view.indicator;

import android.content.Context;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.C0935e;
import android.support.p029v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import com.C1642a;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.indicator.NumberIndicator */
public class NumberIndicator extends AppCompatTextView {

    /* renamed from: b */
    public ViewPager f92167b;

    /* renamed from: c */
    public int f92168c;

    /* renamed from: d */
    private final C0935e f92169d;

    /* renamed from: a */
    private void m113586a() {
        setTextColor(-2130706433);
        setTextSize(14.0f);
    }

    public int getCurrentItem() {
        if (this.f92167b != null) {
            return this.f92167b.getCurrentItem() % this.f92168c;
        }
        return -1;
    }

    public NumberIndicator(Context context) {
        this(context, null);
    }

    public void setRealSize(int i) {
        if (i > 0) {
            this.f92168c = i;
        }
    }

    public void setViewPager(ViewPager viewPager) {
        if (viewPager != null && viewPager.getAdapter() != null) {
            this.f92167b = viewPager;
            this.f92167b.removeOnPageChangeListener(this.f92169d);
            this.f92167b.addOnPageChangeListener(this.f92169d);
            this.f92169d.onPageSelected(this.f92167b.getCurrentItem());
        }
    }

    public NumberIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f92169d = new C0935e() {
            public final void onPageScrollStateChanged(int i) {
            }

            public final void onPageScrolled(int i, float f, int i2) {
            }

            public final void onPageSelected(int i) {
                if (NumberIndicator.this.f92167b.getAdapter() != null && NumberIndicator.this.f92168c > 0) {
                    NumberIndicator.this.setText(C1642a.m8035a(Locale.getDefault(), "%s/%s", new Object[]{Integer.valueOf((i % NumberIndicator.this.f92168c) + 1), Integer.valueOf(NumberIndicator.this.f92168c)}));
                }
            }
        };
        m113586a();
    }
}
