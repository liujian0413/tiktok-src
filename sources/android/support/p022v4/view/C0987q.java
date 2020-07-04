package android.support.p022v4.view;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.PointerIcon;

/* renamed from: android.support.v4.view.q */
public final class C0987q {

    /* renamed from: a */
    public Object f3423a;

    private C0987q(Object obj) {
        this.f3423a = obj;
    }

    /* renamed from: a */
    public static C0987q m4161a(Context context, int i) {
        if (VERSION.SDK_INT >= 24) {
            return new C0987q(PointerIcon.getSystemIcon(context, 1002));
        }
        return new C0987q(null);
    }
}
