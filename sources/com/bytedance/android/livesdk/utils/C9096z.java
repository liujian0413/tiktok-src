package com.bytedance.android.livesdk.utils;

import android.os.Build.VERSION;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.view.Window;
import com.bytedance.android.live.core.utils.C3387g;

/* renamed from: com.bytedance.android.livesdk.utils.z */
public final class C9096z {
    /* renamed from: a */
    public static void m27145a(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null && C3387g.m12599a(activity)) {
            Window window = activity.getWindow();
            if (VERSION.SDK_INT >= 21 && window != null) {
                if (window.getAttributes() == null || (window.getAttributes().flags & Integer.MIN_VALUE) != Integer.MIN_VALUE) {
                    window.addFlags(Integer.MIN_VALUE);
                }
                window.setStatusBarColor(-16777216);
                window.getDecorView().setSystemUiVisibility(0);
            }
        }
    }
}
