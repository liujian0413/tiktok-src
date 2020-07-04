package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a */
public final class C40744a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.a$a */
    static class C40746a extends SimpleOnPageChangeListener {

        /* renamed from: a */
        private final ViewPager f105952a;

        /* renamed from: b */
        private final ViewPagerBottomSheetBehavior<View> f105953b;

        public final void onPageSelected(int i) {
            ViewPager viewPager = this.f105952a;
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = this.f105953b;
            viewPagerBottomSheetBehavior.getClass();
            viewPager.post(C40747b.m130261a(viewPagerBottomSheetBehavior));
        }

        private C40746a(ViewPager viewPager, View view) {
            this.f105952a = viewPager;
            this.f105953b = ViewPagerBottomSheetBehavior.m130222a(view);
        }
    }

    /* renamed from: a */
    public static void m130260a(ViewPager viewPager) {
        View a = m130259a((View) viewPager);
        if (a != null) {
            viewPager.addOnPageChangeListener(new C40746a(viewPager, a));
        }
    }

    /* renamed from: a */
    private static View m130259a(View view) {
        while (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof C0355d) && (((C0355d) layoutParams).f1407a instanceof ViewPagerBottomSheetBehavior)) {
                return view;
            }
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof View)) {
                view = null;
            } else {
                view = (View) parent;
            }
        }
        return null;
    }
}
