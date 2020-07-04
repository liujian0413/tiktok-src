package com.p280ss.android.ugc.aweme.discover.helper;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Message;
import android.support.p022v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.n */
public final class C26666n implements C6310a {

    /* renamed from: a */
    public int f70304a;

    /* renamed from: b */
    public boolean f70305b;

    /* renamed from: c */
    public boolean f70306c;

    /* renamed from: d */
    public Handler f70307d;

    /* renamed from: e */
    private long f70308e;

    /* renamed from: f */
    private final boolean f70309f;

    /* renamed from: g */
    private ViewPager f70310g;

    /* renamed from: h */
    private Method f70311h;

    /* renamed from: i */
    private OnTouchListener f70312i;

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.n$a */
    static class C26669a implements Runnable {

        /* renamed from: a */
        private long f70315a;

        /* renamed from: b */
        private WeakReference<C26666n> f70316b;

        public final void run() {
            if (!(this.f70316b == null || this.f70316b.get() == null)) {
                C26666n nVar = (C26666n) this.f70316b.get();
                if (nVar != null && nVar.f70307d != null && nVar.f70306c) {
                    nVar.mo68375a();
                    if (!nVar.f70306c) {
                        nVar.f70307d.removeCallbacksAndMessages(null);
                        return;
                    }
                    nVar.f70307d.postDelayed(this, this.f70315a);
                }
            }
        }

        C26669a(C26666n nVar, long j) {
            this.f70316b = new WeakReference<>(nVar);
            this.f70315a = j;
        }
    }

    public final void handleMsg(Message message) {
    }

    /* renamed from: c */
    public final void mo68377c() {
        if (this.f70306c) {
            this.f70306c = false;
            this.f70307d.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: b */
    public final void mo68376b() {
        if (!this.f70306c) {
            this.f70306c = true;
            this.f70307d.removeCallbacksAndMessages(null);
            this.f70307d.postDelayed(new C26669a(this, this.f70308e), this.f70308e);
        }
    }

    /* renamed from: a */
    public final void mo68375a() {
        int i;
        if (!this.f70306c) {
            this.f70307d.removeCallbacksAndMessages(null);
            return;
        }
        int currentItem = this.f70310g.getCurrentItem();
        if (this.f70309f) {
            i = -1;
        } else {
            i = 1;
        }
        int i2 = currentItem + i;
        if (i2 < 0) {
            i2 += this.f70304a;
        }
        if (this.f70311h != null) {
            try {
                this.f70311h.invoke(this.f70310g, new Object[]{Integer.valueOf(i2), Boolean.valueOf(true), Boolean.valueOf(true), Integer.valueOf(1)});
                return;
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
        this.f70310g.setCurrentItem(i2, true);
    }

    public C26666n(ViewPager viewPager) {
        this(viewPager, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
    }

    /* renamed from: a */
    private static boolean m87616a(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    public C26666n(ViewPager viewPager, long j) {
        this.f70308e = DouPlusShareGuideExperiment.MIN_VALID_DURATION;
        this.f70305b = true;
        this.f70312i = new OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (!C26666n.this.f70305b) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 2) {
                    C26666n.this.mo68377c();
                } else if (action == 1) {
                    C26666n.this.f70307d.postDelayed(new Runnable() {
                        public final void run() {
                            C26666n.this.mo68376b();
                        }
                    }, 2000);
                }
                return false;
            }
        };
        this.f70310g = viewPager;
        this.f70308e = j;
        this.f70307d = new C6309f(this);
        try {
            this.f70311h = ViewPager.class.getDeclaredMethod("setCurrentItemInternal", new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE});
            this.f70311h.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        viewPager.setOnTouchListener(this.f70312i);
        this.f70309f = m87616a(viewPager.getContext());
    }
}
