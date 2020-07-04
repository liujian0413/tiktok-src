package com.bytedance.polaris.p634b;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.common.utility.C9738o;
import com.bytedance.polaris.depend.C12428i;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.polaris.b.g */
public final class C12352g {

    /* renamed from: a */
    private static boolean f32787a = true;

    /* renamed from: b */
    private Activity f32788b;

    /* renamed from: c */
    private int f32789c;

    /* renamed from: d */
    private int f32790d;

    /* renamed from: e */
    private View f32791e;

    /* renamed from: f */
    private boolean f32792f;

    /* renamed from: g */
    private boolean f32793g;

    /* renamed from: h */
    private boolean f32794h;

    /* renamed from: i */
    private boolean f32795i;

    /* renamed from: j */
    private boolean f32796j;

    /* renamed from: com.bytedance.polaris.b.g$a */
    public static class C12353a {

        /* renamed from: a */
        public int f32797a = C12428i.m36153c().getResources().getColor(R.color.a2l);

        /* renamed from: b */
        public boolean f32798b = false;

        /* renamed from: c */
        public boolean f32799c = false;

        /* renamed from: d */
        public boolean f32800d = false;

        /* renamed from: e */
        public boolean f32801e = false;

        /* renamed from: f */
        public boolean f32802f = true;

        /* renamed from: a */
        public final C12353a mo30195a(boolean z) {
            this.f32798b = true;
            return this;
        }

        /* renamed from: b */
        public final C12353a mo30196b(boolean z) {
            this.f32800d = z;
            return this;
        }

        /* renamed from: a */
        public final C12353a mo30194a(int i) {
            this.f32797a = C12428i.m36153c().getResources().getColor(i);
            return this;
        }
    }

    /* renamed from: c */
    private static void m35881c() {
        f32787a = true;
    }

    /* renamed from: d */
    private int m35882d() {
        if (this.f32789c != 0) {
            return this.f32789c;
        }
        this.f32789c = m35876a((Context) this.f32788b, true);
        return this.f32789c;
    }

    /* renamed from: e */
    private void m35883e() {
        if (this.f32795i) {
            if (this.f32793g) {
                m35880b(false);
            } else if (this.f32790d == R.color.a2g || this.f32790d == R.color.a2h || this.f32790d == R.color.a2j || this.f32790d == R.color.a2k) {
                m35880b(false);
            } else {
                if (this.f32790d == R.color.a2l) {
                    m35880b(true);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo30193b() {
        if (this.f32794h) {
            ViewGroup viewGroup = (ViewGroup) this.f32788b.findViewById(16908290);
            if (viewGroup != null) {
                this.f32791e = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                m35879a(this.f32796j);
            }
        }
    }

    /* renamed from: a */
    public final void mo30192a() {
        if (VERSION.SDK_INT >= 21) {
            if (f32787a) {
                m35877a(this.f32790d);
                if (!this.f32795i) {
                    m35880b(this.f32792f);
                }
                if (this.f32794h) {
                    this.f32788b.getWindow().getDecorView().setSystemUiVisibility(PreloadTask.BYTE_UNIT_NUMBER);
                }
            } else {
                this.f32788b.getWindow().clearFlags(Integer.MIN_VALUE);
            }
        }
    }

    /* renamed from: b */
    private void m35880b(boolean z) {
        m35878a(this.f32788b.getWindow(), z);
    }

    /* renamed from: a */
    private void m35877a(int i) {
        if (VERSION.SDK_INT >= 21 && f32787a) {
            this.f32790d = i;
            m35883e();
            this.f32788b.getWindow().setStatusBarColor(i);
        }
    }

    /* renamed from: a */
    private void m35879a(boolean z) {
        int i;
        if (VERSION.SDK_INT >= 21 && f32787a && this.f32791e != null) {
            View view = this.f32791e;
            if (z) {
                i = m35882d();
            } else {
                i = 0;
            }
            view.setPadding(0, i, 0, 0);
        }
    }

    public C12352g(Activity activity, C12353a aVar) {
        this.f32788b = activity;
        this.f32790d = aVar.f32797a;
        this.f32794h = aVar.f32798b;
        this.f32796j = aVar.f32799c;
        this.f32792f = aVar.f32800d;
        this.f32795i = aVar.f32801e;
        if (aVar.f32802f) {
            m35881c();
        }
    }

    /* renamed from: a */
    public static void m35878a(Window window, boolean z) {
        int i;
        if (VERSION.SDK_INT >= 23 && f32787a) {
            int systemUiVisibility = window.getDecorView().getSystemUiVisibility();
            View decorView = window.getDecorView();
            if (z) {
                i = systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT;
            } else {
                i = systemUiVisibility & -8193;
            }
            decorView.setSystemUiVisibility(i);
            if (C12348e.m35848a()) {
                C12348e.m35847a(z, window);
            }
        }
    }

    /* renamed from: a */
    public static int m35876a(Context context, boolean z) {
        int i;
        int i2;
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            i = 0;
        } else if (z) {
            i = context.getResources().getDimensionPixelSize(identifier);
        } else {
            i = (int) (context.getResources().getDimension(identifier) / context.getResources().getDisplayMetrics().density);
        }
        if (z) {
            i2 = (int) C9738o.m28708b(context, 25.0f);
        } else {
            i2 = 25;
        }
        if (i == 0) {
            return i2;
        }
        return i;
    }
}
