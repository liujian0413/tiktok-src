package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.emoji;

import android.graphics.Canvas;
import android.support.p022v4.view.ViewPager.C0935e;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.emoji.PagerIndicator */
public class PagerIndicator extends View implements C0935e {

    /* renamed from: a */
    private int f80738a;

    /* renamed from: b */
    private int f80739b;

    /* renamed from: c */
    private C0935e f80740c;

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setCount(int i) {
        this.f80739b = i;
    }

    public void setIndex(int i) {
        this.f80738a = i;
    }

    public void setOnPageChangeListener(C0935e eVar) {
        this.f80740c = eVar;
    }

    public void onPageScrollStateChanged(int i) {
        if (this.f80740c != null) {
            this.f80740c.onPageScrollStateChanged(i);
        }
    }

    public void onPageSelected(int i) {
        if (this.f80740c != null) {
            this.f80740c.onPageSelected(i);
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (this.f80740c != null) {
            this.f80740c.onPageScrolled(i, f, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }
}
