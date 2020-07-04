package com.bytedance.android.live.uikit.p174b;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;

/* renamed from: com.bytedance.android.live.uikit.b.a */
public final class C3510a {
    /* renamed from: a */
    private static int m12931a(Context context) {
        return context.getResources().getDimensionPixelSize(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
    }

    /* renamed from: b */
    private static View m12933b(Activity activity, int i) {
        View view = new View(activity);
        view.setLayoutParams(new LayoutParams(-1, m12931a(activity)));
        view.setBackgroundColor(i);
        return view;
    }

    /* renamed from: a */
    public static void m12932a(Activity activity, int i) {
        if (VERSION.SDK_INT >= 19) {
            activity.getWindow().addFlags(67108864);
            ((ViewGroup) activity.getWindow().getDecorView()).addView(m12933b(activity, i));
            ViewGroup viewGroup = (ViewGroup) activity.findViewById(16908290);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            viewGroup2.setFitsSystemWindows(true);
            viewGroup2.setClipToPadding(true);
        }
    }
}
