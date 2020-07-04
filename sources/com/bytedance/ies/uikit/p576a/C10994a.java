package com.bytedance.ies.uikit.p576a;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: com.bytedance.ies.uikit.a.a */
public final class C10994a {
    /* renamed from: a */
    public static void m32205a(Activity activity) {
        if (VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
        }
    }

    /* renamed from: a */
    public static int m32204a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: b */
    public static void m32208b(Activity activity) {
        if (VERSION.SDK_INT >= 21) {
            Window window = activity.getWindow();
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            return;
        }
        m32205a(activity);
    }

    /* renamed from: b */
    private static View m32207b(Activity activity, int i) {
        View view = new View(activity);
        view.setLayoutParams(new LayoutParams(-1, m32204a((Context) activity)));
        view.setBackgroundColor(i);
        return view;
    }

    /* renamed from: a */
    public static void m32206a(Activity activity, int i) {
        if (VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
            ((ViewGroup) activity.getWindow().getDecorView()).addView(m32207b(activity, i));
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            viewGroup2.setFitsSystemWindows(true);
            viewGroup2.setClipToPadding(true);
        }
    }
}
