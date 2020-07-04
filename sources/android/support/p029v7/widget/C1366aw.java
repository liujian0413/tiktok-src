package android.support.p029v7.widget;

import android.os.Build.VERSION;
import android.view.View;

/* renamed from: android.support.v7.widget.aw */
public final class C1366aw {
    /* renamed from: a */
    public static void m6763a(View view, CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            C1367ax.m6765a(view, charSequence);
        }
    }
}
