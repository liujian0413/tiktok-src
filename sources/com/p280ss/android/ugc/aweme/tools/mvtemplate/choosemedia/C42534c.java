package com.p280ss.android.ugc.aweme.tools.mvtemplate.choosemedia;

import android.content.Context;
import android.support.p022v4.view.ViewPager;
import android.widget.Scroller;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.c */
public final class C42534c extends Scroller {

    /* renamed from: a */
    public int f110606a = 1500;

    public C42534c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo104123a(ViewPager viewPager) {
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
            declaredField.setAccessible(true);
            declaredField.set(viewPager, this);
        } catch (Exception unused) {
        }
    }

    public final void startScroll(int i, int i2, int i3, int i4) {
        startScroll(i, i2, i3, i4, this.f110606a);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, this.f110606a);
    }
}
