package com.bytedance.android.live.core.utils;

import android.app.Activity;
import android.app.Dialog;
import android.support.p022v4.view.ViewPager;
import android.support.p022v4.view.ViewPager.SimpleOnPageChangeListener;
import android.support.p029v7.widget.ContentFrameLayout;
import android.view.MotionEvent;
import com.bytedance.android.live.core.setting.C3338l;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashSet;
import java.util.Set;
import p346io.reactivex.p348d.C7326g;

public final class SlideFinishUtil {

    /* renamed from: a */
    public static C3338l<Boolean> f10109a = new C3338l<>("enable_slide_finish", Boolean.valueOf(false), "右滑退出页面");

    /* renamed from: b */
    static Set<Class<? extends Activity>> f10110b = new HashSet();

    public static class MFrameLayout extends ContentFrameLayout {

        /* renamed from: a */
        boolean f10111a;

        /* renamed from: b */
        boolean f10112b;

        /* renamed from: c */
        C3416z f10113c;

        public void requestDisallowInterceptTouchEvent(boolean z) {
            super.requestDisallowInterceptTouchEvent(z);
            this.f10112b = z;
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (this.f10111a) {
                return true;
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final /* synthetic */ void mo10247a(Object obj) throws Exception {
            if (!this.f10112b) {
                Object tag = getTag(R.id.dnz);
                if (tag instanceof Activity) {
                    Activity activity = (Activity) tag;
                    if (SlideFinishUtil.m12464b(activity)) {
                        activity.onBackPressed();
                        this.f10111a = true;
                    }
                } else if (tag instanceof Dialog) {
                    ((Dialog) tag).onBackPressed();
                    this.f10111a = true;
                }
            }
        }

        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.f10112b = false;
                this.f10111a = false;
            }
            if (this.f10113c == null) {
                this.f10113c = new C3416z();
                this.f10113c.f10217b.mo19325f((C7326g<? super T>) new C3359ad<Object>(this));
            }
            super.dispatchTouchEvent(motionEvent);
            this.f10113c.mo10313a(motionEvent);
            return true;
        }
    }

    public static class SlideFinishPageChangeListener extends SimpleOnPageChangeListener {

        /* renamed from: a */
        private final ViewPager f10114a;

        public SlideFinishPageChangeListener(ViewPager viewPager) {
            this.f10114a = viewPager;
        }

        public void onPageScrolled(int i, float f, int i2) {
            if (i == 0 && f == 0.0f && this.f10114a != null && this.f10114a.getParent() != null) {
                this.f10114a.getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
    }

    /* renamed from: a */
    public static void m12463a(Activity activity) {
        if (activity != null) {
            f10110b.add(activity.getClass());
        }
    }

    /* renamed from: b */
    public static boolean m12464b(Activity activity) {
        if (activity == null || !((Boolean) f10109a.mo10240a()).booleanValue()) {
            return false;
        }
        if (f10110b.contains(activity.getClass())) {
            return false;
        }
        return true;
    }
}
