package com.p280ss.android.ugc.aweme.longvideonew.feature;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.a */
public final class C32793a {

    /* renamed from: a */
    public int f85541a;

    /* renamed from: b */
    public final Context f85542b;

    /* renamed from: c */
    public final View f85543c;

    /* renamed from: d */
    private final double f85544d = 0.56d;

    /* renamed from: e */
    private int f85545e;

    /* renamed from: f */
    private int f85546f;

    /* renamed from: g */
    private int f85547g;

    /* renamed from: h */
    private final FrameLayout f85548h;

    /* renamed from: a */
    public final void mo84323a(boolean z) {
        LayoutParams layoutParams;
        if (this.f85541a != 0) {
            FrameLayout frameLayout = this.f85548h;
            if (frameLayout != null) {
                layoutParams = frameLayout.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (z) {
                    layoutParams2.bottomMargin -= this.f85541a;
                } else {
                    layoutParams2.bottomMargin += this.f85541a;
                }
                this.f85548h.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: a */
    private final void m106150a(Context context) {
        if (context != null) {
            if (VERSION.SDK_INT >= 17) {
                WindowManager windowManager = ((Activity) context).getWindowManager();
                C7573i.m23582a((Object) windowManager, "(context as Activity).windowManager");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getRealMetrics(displayMetrics);
                this.f85547g = displayMetrics.heightPixels;
                this.f85546f = displayMetrics.heightPixels + C9738o.m28717e(context);
                this.f85545e = displayMetrics.widthPixels;
                return;
            }
            this.f85547g = C9738o.m28709b(context);
            this.f85546f = this.f85547g;
            this.f85545e = C9738o.m28691a(context);
        }
    }

    public C32793a(Context context, View view, FrameLayout frameLayout) {
        this.f85542b = context;
        this.f85543c = view;
        this.f85548h = frameLayout;
        View view2 = this.f85543c;
        if (view2 != null) {
            ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {

                    /* renamed from: a */
                    final /* synthetic */ C32793a f85549a;

                    public final void onGlobalLayout() {
                        this.f85549a.f85543c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        this.f85549a.f85541a = this.f85549a.mo84322a(this.f85549a.f85542b, this.f85549a.f85543c.getWidth(), this.f85549a.f85543c.getHeight());
                        this.f85549a.mo84323a(false);
                    }

                    {
                        this.f85549a = r1;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final int mo84322a(Context context, int i, int i2) {
        double d;
        if (i == 0 || i2 == 0) {
            m106150a(context);
        } else {
            this.f85545e = i;
            this.f85547g = i2;
        }
        double d2 = (double) this.f85545e;
        double d3 = (double) this.f85547g;
        Double.isNaN(d2);
        Double.isNaN(d3);
        double d4 = d2 / d3;
        try {
            String a = C1642a.m8034a("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d4)}, 1));
            C7573i.m23582a((Object) a, "java.lang.String.format(format, *args)");
            d = Double.parseDouble(a);
        } catch (Throwable unused) {
            d = 1.0d;
        }
        if (d >= this.f85544d) {
            return 0;
        }
        return (this.f85547g - ((this.f85545e / 9) * 16)) / 2;
    }
}
