package com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget;

import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.LayoutParams;
import android.view.View;
import com.p280ss.android.ugc.aweme.views.RtlViewPager;
import java.lang.reflect.Field;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a */
public final class C23373a {

    /* renamed from: a */
    static final Field f61484a;

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a$a */
    static class C23374a {
        C23374a() {
        }

        /* renamed from: a */
        public static View m76663a(ViewPager viewPager) {
            if (viewPager == null) {
                return null;
            }
            int currentItem = viewPager.getCurrentItem();
            int i = 0;
            while (i < viewPager.getChildCount()) {
                View childAt = viewPager.getChildAt(i);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                try {
                    int intValue = ((Integer) C23373a.f61484a.get(layoutParams)).intValue();
                    if (!layoutParams.f3279a && currentItem == intValue) {
                        return childAt;
                    }
                    i++;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.design.widget.a$b */
    static class C23375b {
        C23375b() {
        }

        /* renamed from: a */
        public static View m76664a(ViewPager viewPager) {
            if (viewPager == null || !(viewPager instanceof RtlViewPager)) {
                return null;
            }
            RtlViewPager rtlViewPager = (RtlViewPager) viewPager;
            int currentItem = viewPager.getCurrentItem();
            int i = 0;
            while (i < viewPager.getChildCount()) {
                View childAt = viewPager.getChildAt(i);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                try {
                    int intValue = ((Integer) C23373a.f61484a.get(layoutParams)).intValue();
                    if (rtlViewPager.mo105208b()) {
                        intValue = (rtlViewPager.getItemCount() - intValue) - 1;
                    }
                    if (!layoutParams.f3279a && currentItem == intValue) {
                        return childAt;
                    }
                    i++;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            return null;
        }
    }

    static {
        try {
            Field declaredField = LayoutParams.class.getDeclaredField("position");
            f61484a = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static View m76662a(ViewPager viewPager) {
        if (viewPager == null || !(viewPager instanceof RtlViewPager)) {
            new C23374a();
            return C23374a.m76663a(viewPager);
        }
        new C23375b();
        return C23375b.m76664a(viewPager);
    }
}
