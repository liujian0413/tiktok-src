package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager.LayoutParams;
import com.C1642a;
import com.google.android.gms.ads.internal.C14793ay;
import java.util.Locale;

public final class adf extends ade {
    /* renamed from: a */
    public final void mo39196a(Activity activity) {
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43765aL)).booleanValue() && C14793ay.m42898d().mo39100j().mo39163o() == null && !activity.isInMultiWindowMode()) {
            m45628a(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new adg(this, activity));
        }
    }

    /* renamed from: a */
    private static void m45628a(boolean z, Activity activity) {
        Window window = activity.getWindow();
        LayoutParams attributes = window.getAttributes();
        int i = attributes.layoutInDisplayCutoutMode;
        int i2 = z ? 1 : 2;
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: a */
    static /* synthetic */ WindowInsets m45627a(Activity activity, View view, WindowInsets windowInsets) {
        if (C14793ay.m42898d().mo39100j().mo39163o() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            if (displayCutout != null) {
                acf j = C14793ay.m42898d().mo39100j();
                String str = "";
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String a = C1642a.m8035a(Locale.US, "%d,%d,%d,%d", new Object[]{Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom)});
                    if (!TextUtils.isEmpty(str)) {
                        str = String.valueOf(str).concat("|");
                    }
                    String valueOf = String.valueOf(str);
                    String valueOf2 = String.valueOf(a);
                    str = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                }
                j.mo39154g(str);
            } else {
                C14793ay.m42898d().mo39100j().mo39154g("");
            }
        }
        m45628a(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }
}
