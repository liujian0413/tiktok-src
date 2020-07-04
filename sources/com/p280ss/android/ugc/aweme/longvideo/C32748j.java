package com.p280ss.android.ugc.aweme.longvideo;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import java.util.Arrays;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.j */
public final class C32748j {

    /* renamed from: a */
    public int f85379a;

    /* renamed from: b */
    private final double f85380b = 0.56d;

    /* renamed from: c */
    private int f85381c;

    /* renamed from: d */
    private int f85382d;

    /* renamed from: e */
    private int f85383e;

    /* renamed from: f */
    private final LinearLayout f85384f;

    /* renamed from: a */
    public final void mo84241a(boolean z) {
        if (this.f85379a != 0) {
            LayoutParams layoutParams = this.f85384f.getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                if (z) {
                    layoutParams2.bottomMargin -= this.f85379a;
                } else {
                    layoutParams2.bottomMargin += this.f85379a;
                }
                this.f85384f.setLayoutParams(layoutParams2);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    /* renamed from: a */
    private final void m106011a(Context context) {
        if (VERSION.SDK_INT < 17) {
            this.f85383e = C9738o.m28709b(context);
            this.f85382d = this.f85383e;
            this.f85381c = C9738o.m28691a(context);
        } else if (context != null) {
            WindowManager windowManager = ((Activity) context).getWindowManager();
            C7573i.m23582a((Object) windowManager, "(context as Activity).windowManager");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            this.f85383e = displayMetrics.heightPixels;
            this.f85382d = displayMetrics.heightPixels + C9738o.m28717e(context);
            this.f85381c = displayMetrics.widthPixels;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public C32748j(final Context context, final View view, LinearLayout linearLayout) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(view, "rootView");
        C7573i.m23587b(linearLayout, "mPlayContainer");
        this.f85384f = linearLayout;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener(this) {

            /* renamed from: a */
            final /* synthetic */ C32748j f85385a;

            public final void onGlobalLayout() {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                this.f85385a.f85379a = this.f85385a.mo84240a(context, view.getWidth(), view.getHeight());
                this.f85385a.mo84241a(false);
            }

            {
                this.f85385a = r1;
            }
        });
    }

    /* renamed from: a */
    public final int mo84240a(Context context, int i, int i2) {
        double d;
        if (i == 0 || i2 == 0) {
            m106011a(context);
        } else {
            this.f85381c = i;
            this.f85383e = i2;
        }
        double d2 = (double) this.f85381c;
        double d3 = (double) this.f85383e;
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
        if (d >= this.f85380b) {
            return 0;
        }
        return (this.f85383e - ((this.f85381c / 9) * 16)) / 2;
    }
}
