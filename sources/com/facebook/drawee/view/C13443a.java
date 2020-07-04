package com.facebook.drawee.view;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.facebook.drawee.view.a */
public final class C13443a {

    /* renamed from: com.facebook.drawee.view.a$a */
    public static class C13444a {

        /* renamed from: a */
        public int f35649a;

        /* renamed from: b */
        public int f35650b;
    }

    /* renamed from: a */
    private static boolean m39492a(int i) {
        return i == 0 || i == -2;
    }

    /* renamed from: a */
    public static void m39491a(C13444a aVar, float f, LayoutParams layoutParams, int i, int i2) {
        if (f > 0.0f && layoutParams != null) {
            if (m39492a(layoutParams.height)) {
                aVar.f35650b = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.f35649a) - i)) / f) + ((float) i2)), aVar.f35650b), 1073741824);
                return;
            }
            if (m39492a(layoutParams.width)) {
                aVar.f35649a = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.f35650b) - i2)) * f) + ((float) i)), aVar.f35649a), 1073741824);
            }
        }
    }
}
